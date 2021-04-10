package com.lxp.listview_demo;

public class User {

    private String mName;
    private int mAge;

    public User(String name, int age) {
        this.mName = name;
        this.mAge = age;
    }

    public String getName() {
        return this.mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public int getAge() {
        return this.mAge;
    }

    public void setAge(int age) {
        this.mAge = age;
    }
}
