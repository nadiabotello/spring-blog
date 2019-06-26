package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String posts() {
        return "This will have some posts";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String postsID(@PathVariable int id) {
        return "This will have an individual post with unique ID: " + id;
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String postsCreate() {
        return "This will have a form for creating a post.";
    }

    @RequestMapping(path = "/posts/create", method = RequestMethod.POST)
    @ResponseBody
    public String addPost(){
        return "This is where you will create the post";
    }

}
