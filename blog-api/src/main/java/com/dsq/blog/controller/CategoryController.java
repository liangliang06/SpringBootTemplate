package com.dsq.blog.controller;

import com.dsq.blog.service.CategoryService;
import com.dsq.blog.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("categorys")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public Result categorices(){
        return categoryService.findAll();
    }
}