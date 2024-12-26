package com.example.springboot_project.mapper;

import com.example.springboot_project.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author huanyizhiyuan
 * @description
 * @date 2024/12/26 19:09
 */

/*
    标记这个接口为MyBatis的Mapper接口。
    如果在启动类或配置类中使用了@MapperScan，可以省略这个注解@Mapper。
 */

//@Mapper
public interface UserMapper {
    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User selectUserById(Integer id);
}
