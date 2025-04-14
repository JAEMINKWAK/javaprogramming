package org.example;

public class User {
    protected String username;

    public User(String username) {
        this.username = username;
    }

    public void login() {
        System.out.println("User " + username + " logged in.");
    }

    @Override
    public String toString() {
        return "Username: " + username;
    }
}
