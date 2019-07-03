package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Post;
import com.codeup.springblog.models.User;
import com.codeup.springblog.models.UserWithRoles;
import com.codeup.springblog.repos.PostRepository;
import com.codeup.springblog.repos.UserRepository;
import com.codeup.springblog.services.EmailService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    private PostRepository postDao;
    private UserRepository userDao;
    private EmailService emailSvc;

    public PostController(PostRepository postDao, UserRepository userDao, EmailService emailSvc) {
        this.postDao = postDao;
        this.userDao = userDao;
        this.emailSvc = emailSvc;
    }

    @GetMapping("/posts")
    public String index(Model model) {
        model.addAttribute("posts", postDao.findAll());
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String show(@PathVariable long id, Model model) {
        model.addAttribute("post", postDao.findOne(id));
        return "posts/show";
    }

    @GetMapping("/posts/create")
    public String create(Model model) {
        model.addAttribute("post", new Post());
        return "posts/create";
    }


    @PostMapping("/posts/create")
    public String insert(@ModelAttribute Post post) {
        User author = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        post.setAuthor(author);
        postDao.save(post);
        return "redirect:/posts";
    }

    @GetMapping("/posts/{id}/edit")
    public String edit(@PathVariable long id, Model model) {
        model.addAttribute("post", postDao.findOne(id));
        return "posts/edit";
    }

    @PostMapping("/posts/{id}/edit")
    public String update(
            @PathVariable long id,
            @ModelAttribute Post post) {
        Post original = postDao.findOne(id);
        post.setAuthor(original.getAuthor());
        postDao.save(post);
        return "redirect:/posts";
    }


    @PostMapping("/posts/{id}/delete")
    public String delete(@PathVariable long id) {
        postDao.delete(id);
        return "redirect:/posts";
    }

    @GetMapping("/email-test")
    @ResponseBody
    public String emailTest(){
        emailSvc.prepareAndSend(postDao.findOne(11L), "you made a post", "testing");
        return "testing email...";
    }

}
