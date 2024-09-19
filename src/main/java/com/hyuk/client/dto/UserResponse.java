package com.hyuk.client.dto;

public class UserResponse {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public UserResponse setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public UserResponse setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return "UserResponse{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
