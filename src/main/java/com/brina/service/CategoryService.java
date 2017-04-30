package com.brina.service;

import com.brina.model.Category;

import java.util.List;

public interface CategoryService {

    List<Category> getAllCategories();

    Category getCategoryById(Integer id);
}
