package org.example;

public final class Guest extends User {
    public Guest(String username) {
        super(username);
    }

    @Override
    public void login() {
        System.out.println("Guest " + username + " logged in with limited access.");
    }
}
