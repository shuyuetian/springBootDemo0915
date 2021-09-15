package com.openlab.service;

import com.openlab.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    //查询全部
    public List<User> findAll();
    //查询一个
    public User findUserById(Long id);
    //新增
    public void addUser(User user);
    //删除
    public void deleteUser(Long id);
    //修改
    public void updateUser(Long id,User user);
    //在git上添加，用于测试pull
    public void findUserByName(String userName);

}
