package org.example;

public class Admin extends User {
    public Admin(String username) {
        super(username);
    }

    @Override
    public void login() {
        System.out.println("Admin " + username + " logged in with full access.");
    }
}

