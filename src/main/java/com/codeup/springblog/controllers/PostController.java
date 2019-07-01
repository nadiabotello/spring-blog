package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Post;
import com.codeup.springblog.models.User;
import com.codeup.springblog.repos.PostRepository;
import com.codeup.springblog.repos.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    private final PostRepository postDao;
    private final UserRepository userDao;

    public PostController(PostRepository postDao, UserRepository userDao) {
        this.postDao = postDao;
        this.userDao = userDao;
    }

    @GetMapping("/posts")
    public String index(Model model) {
        model.addAttribute("posts", postDao.findAll());
        return "posts/index";
    }

    @GetMapping("/posts/create")
    public String create() {
        return "/posts/create";
    }

    @PostMapping("/posts/create")
    public String insert(
            @RequestParam String title,
            @RequestParam String body) {
        User user = userDao.findOne(1L);
        Post postToInsert = new Post(title, body);
        postDao.save(postToInsert).setUser(user);
        return "redirect:/posts/index";
    }

    @GetMapping("/posts/{id}")
    public String delete(@PathVariable long id, Model model){
        model.addAttribute("posts", postDao.findOne(id));
//        postDao.delete(id);
        return "/posts/show";
    }

}
