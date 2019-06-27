package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.ArrayList;

@Controller
public class PostController {


    private final PostRepository postDao;

    public PostController(PostRepository postDao) {
        this.postDao = postDao;
    }


    @GetMapping("/posts")
    public String index(Model model) {
        model.addAttribute("posts", postDao.findAll());
        return "posts/index";
    }

//    @GetMapping("/posts/{id}")
//    public String show(@PathVariable long id, Model model) {
//
//        Post post = new Post("Test post", "I'm going to lap some water out of my master's cup meow push your water glass on the floor peer out window, chatter at birds, lure them to mouth and touch my tail, i shred your hand purrrr mice. Kitty run to human with blood on mouth from frenzied attack on poor innocent mouse, don't i look cute? roll on the floor purring your whiskers off and sleep on my human's head and the fat cat sat on the mat bat away with paws russian blue.");
//
//        model.addAttribute("post.title", post.getTitle());
//        model.addAttribute("post.body", post.getBody());
//
//        return "show";
//    }



    @GetMapping("/posts/create")
    public String create() {
        return "/posts/create";
    }

    @PostMapping("/posts/create")
    public String insert(
            @RequestParam String title,
            @RequestParam String body) {
        Post postToInsert = new Post(title, body);
        postDao.save(postToInsert);
        return "redirect:/posts/index";
    }

    @GetMapping("/posts/{id}")
    public String delete(@PathVariable int id, Model model){
        model.addAttribute("posts", postDao.findOne(id));
//        postDao.delete(id);
        return "/posts/show";
    }

}
