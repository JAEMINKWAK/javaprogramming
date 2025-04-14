package org.example;

public class Main {
    public static void main(String[] args) {
        User admin = new Admin("정근");
        User guest = new Guest("재민");

        User[] users = {admin, guest};

        for (User user : users) {
            System.out.println(user.toString());
            user.login();

            if (user instanceof Admin) {
                System.out.println("This user is an Admin.");
            } else if (user instanceof Guest) {
                System.out.println("This user is a Guest.");
            }

            System.out.println();
        }
    }
}
