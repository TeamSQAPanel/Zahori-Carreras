package com.grupocarreras.zahori.app.model;

import java.util.Map;

import com.grupocarreras.zahori.app.data.Static;

public class Login {

    private String username;
    private String password;

    public Login(Map<String, String> testData) {
        this.username = testData.get(Static.USUARIO);
        this.password = testData.get(Static.PASSWORD);
    }

    @Override
    public String toString() {
        return "Login [username=" + username + "]";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
