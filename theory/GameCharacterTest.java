package org.example;

public class GameCharacterTest {
    public static void main(String[] args) {
        GameCharacter charac = new GameCharacter();
        charac.add("Sword", 1, 100);
        charac.add("Gun", 2, 50);
        charac.print();
        // GameItem [name=Sword, type=1, price=100]
        // GameItem [name=Gun, type=2, price=50]
        // 150
    }
}
