package com.example.springboot_project.service;
import com.example.springboot_project.model.User;
import com.example.springboot_project.mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author huanyizhiyuan
 * @description
 * @date 2024/12/26 19:37
 */

@Service
public class UserServiceImplementation implements UserService {
    /**
     * 注入mapper到service层
     */
    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectUserById(Integer id) {
        return userMapper.selectUserById(id);
    }
}
