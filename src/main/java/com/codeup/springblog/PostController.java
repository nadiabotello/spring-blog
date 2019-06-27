package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

//    @GetMapping("/post")
//    public String show(Model model) {
//
//        Post testPost = new Post("Test post", "I'm going to lap some water out of my master's cup meow push your water glass on the floor peer out window, chatter at birds, lure them to mouth and touch my tail, i shred your hand purrrr mice. Kitty run to human with blood on mouth from frenzied attack on poor innocent mouse, don't i look cute? roll on the floor purring your whiskers off and sleep on my human's head and the fat cat sat on the mat bat away with paws russian blue.");
//
//        model.addAttribute("title", testPost.getTitle());
//        model.addAttribute("body", testPost.getBody());
//
//        return "posts/show";
//    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String create() {
        return "This will have a form for creating a post.";
    }

//    @RequestMapping(path = "/posts/create", method = RequestMethod.POST)
    @PostMapping("/posts/create")
    @ResponseBody
    public void insert(){

    }

}
