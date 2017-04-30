package com.brina.service;


import com.brina.dao.CategoryDao;
import com.brina.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public List<Category> getAllCategories() {
        return categoryDao.getCategories();
    }

    @Override
    public Category getCategoryById(Integer id) {
        return categoryDao.getCategoryById(id);
    }
}
