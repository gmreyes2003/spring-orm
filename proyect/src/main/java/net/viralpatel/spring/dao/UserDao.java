package net.viralpatel.spring.dao;

import net.viralpatel.spring.model.User;

public interface UserDao {

    public void saveOrUpdate(User user);
}
