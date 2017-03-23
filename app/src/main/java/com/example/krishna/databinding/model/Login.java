package com.example.krishna.databinding.model;

import android.databinding.ObservableInt;
import android.text.TextUtils;
import android.view.View;

/**
 * Created by krishna on March 23, 2017
 */

public class Login {
    private String username, password;
    private ObservableInt show;

    public Login() {
        username = "asd";
        password = "dsa";
        show = new ObservableInt(View.GONE);
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

    public boolean isAllFieldsValid() {
        return !TextUtils.isEmpty(username.trim()) && !TextUtils.isEmpty(password.trim());
    }

    public ObservableInt getShow() {
        return show;
    }

    public Login setShow(ObservableInt show) {
        this.show = show;
        return this;
    }
}
