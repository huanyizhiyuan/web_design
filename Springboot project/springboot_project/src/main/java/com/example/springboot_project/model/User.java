package com.example.springboot_project.model;

/**
 * @author huanyizhiyuan
 * @description
 * @date 2024/12/26 18:54
 */

// 使用 getter 和 setter 快速生成。
public class User {
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
