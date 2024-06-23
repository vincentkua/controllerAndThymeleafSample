package com.example.demo.controllers;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "")
public class PageController {

    @GetMapping(value = "/")
    public String homepage(Model model) {
        return "home";
    }

    @GetMapping(value = "/page1")
    public String showPage1(Model model) {
        model.addAttribute("variable1", "hello peter!");
        List<String> animals = new LinkedList<>();
        animals.add("dog");
        animals.add("cat");
        animals.add("lion");
        model.addAttribute("animals", animals);
        List<String> images = new LinkedList<>();
        images.add("one");
        images.add("two");
        images.add("three");
        model.addAttribute("images", images);

        return "page1";
    }

}
