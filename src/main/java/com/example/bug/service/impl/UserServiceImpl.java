package com.example.bug.service.impl;

import com.example.bug.dao.UserDao;
import com.example.bug.entity.User;
import com.example.bug.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public List<User> getAllU() {
        return userDao.getAllU();
    }
}
