package com.brina.dao;

import com.brina.model.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import javax.transaction.Transactional;
import java.sql.*;


@Repository
@Transactional
public class UserDaoImpl implements UserDao {

    private final DataSource dataSource;

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    public UserDaoImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public User findUser(User user) {
        String hql = "from User where name = :name";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setString("name", user.getName());
        return (User) query.uniqueResult();
    }

//    @Override
//    public User addUser(User user) {
//        Connection connection=null;
//
//        String query = "INSERT INTO USERS(USERNAME, PASSWORD) VALUES(?, ?)";
//
//        try {
//            connection = dataSource.getConnection();
//            PreparedStatement statement = connection.prepareStatement(query);
//            statement.setString(1, user.getName());
//            statement.setString(2, user.getPassword());
//            statement.executeUpdate();
//            return user;
//        } catch (SQLException e){
//            e.printStackTrace();
//        } finally {
//            try {
//                connection.close();
//            }catch (SQLException e) {
//                e.printStackTrace();
//            }
//
//        }
//        return null;
//    }

    @Override
    public User addUser(User user) {
        Integer userId = (Integer) sessionFactory.getCurrentSession().save(user);
        return (User) sessionFactory.getCurrentSession().get(User.class, userId);
    }
}


