package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String index() {
        return "This will have some posts";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String show(@PathVariable long id) {
        return "This will have an individual post with unique ID: " + id;
    }

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
