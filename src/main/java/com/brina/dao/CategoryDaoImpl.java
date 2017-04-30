package com.brina.dao;


import com.brina.model.Category;
import com.brina.model.User;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class CategoryDaoImpl implements CategoryDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Category> getCategories() {
        String hql = "from Category";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        return query.list();
    }

    @Override
    public Category getCategoryById(Integer id) {
//        String hql = "from Category where id = ?";
        return (Category) sessionFactory.getCurrentSession().get(Category.class, id);
    }
}
