package com.example.intellijgit.week1;

public class User {
    private String name;
    private String phone;
    private int age;

    public User(String name, String phone, int age) {
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return this.age > 18;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                '}';
    }
}
