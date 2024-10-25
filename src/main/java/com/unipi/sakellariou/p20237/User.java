package com.unipi.sakellariou.p20237;

public class User {
    private int user_id;
    private String username;
    private String email;
    private String password;
    private String salt;
    private String name;
    private String surname;
    private String role;


    public User(int userId, String username, String email, String password, String salt, String name, String surname, String role) {
        this.user_id = userId;
        this.username = username;
        this.email = email;
        this.password = password;
        this.salt = salt;
        this.name = name;
        this.surname = surname;
        this.role = role;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

