package com.example.krishna.databinding.model;

/**
 * Created by krishna on March 23, 2017
 */

public class Login {
    private String username, password;

    public Login() {
        username = "asd";
        password = "dsa";
    }

    public String getUsername() {
        return username;
    }

    public Login setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Login setPassword(String password) {
        this.password = password;
        return this;
    }
}
