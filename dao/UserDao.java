package com.openlab.dao;

import com.openlab.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Long> {
    //通过名字查找
    public User findByName(String name);
    //通过名字和年龄查找
    public User findByNameAndAge(String name,Integer age);
}
