package com.example.mapdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model; // ✅これだけ


import com.example.mapdemo.entity.BlogPost;
import com.example.mapdemo.service.BlogService;


@Controller
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("posts", blogService.findAll());
        return "index";
    }

    @PostMapping("/post")
    public String create(@RequestParam String title, @RequestParam String content) {
        BlogPost post = new BlogPost();
        post.setTitle(title);
        post.setContent(content);
        blogService.save(post);
        return "redirect:/";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam int id) {
        blogService.delete(id);
        return "redirect:/";
    }
}

