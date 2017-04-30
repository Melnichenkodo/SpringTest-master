package com.brina.dao;


import com.brina.model.Category;

import java.util.List;

public interface CategoryDao {

    List<Category> getCategories();

    Category getCategoryById(Integer id);
}
