package com.brina.controller;

import com.brina.model.Category;
import com.brina.service.CategoryService;
import com.brina.service.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/category")
    public String getCategoryById(@RequestParam(value="id", required = true) Integer id) {

        categoryService.getCategoryById(id);

        return "category";
    }

}
