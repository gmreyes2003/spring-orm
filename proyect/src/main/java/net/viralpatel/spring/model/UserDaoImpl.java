package net.viralpatel.spring.model;

import net.viralpatel.spring.dao.UserDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void saveOrUpdate(User user) {
        getSession().saveOrUpdate(user);
    }
}
