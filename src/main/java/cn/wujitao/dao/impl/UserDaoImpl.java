package cn.wujitao.dao.impl;

import cn.wujitao.dao.UserDao;

public class UserDaoImpl implements UserDao {

    private String name;
    private int age;

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

    @Override
    public String toString() {
        return "UserDaoImpl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void save() {
        System.out.println("save running.");
    }
}
