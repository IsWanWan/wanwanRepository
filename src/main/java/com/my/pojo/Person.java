package com.my.pojo;

/**
 * Created by wanwan on 16/7/16.
 */
public class Person {



    private String username;

    private String password;

    private  int age;

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
    }

    public Person(String username, String password, int age) {
        this.username = username;
        this.age = age;
        this.password = password;
    }
}
