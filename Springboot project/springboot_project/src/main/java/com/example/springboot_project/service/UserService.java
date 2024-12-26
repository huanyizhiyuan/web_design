package com.example.springboot_project.service;
import com.example.springboot_project.model.User;
/**
 * @author huanyizhiyuan
 * @description
 * @date 2024/12/26 19:33
 */

public interface UserService {
    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User selectUserById(Integer id);
}
