package se.abdilhakim.Dice;

import java.util.Random;

public class Player1 {
    private static String name;
    private Random random;
    private int totalPoints;

    public Player1(String name) {
        this.name = name;
        this.random = new Random();
        this.totalPoints = 0;
    }

    public static String getName() {
        return name;
    }

    public int getScore() { // Ändrat metodnamn här
        return totalPoints;
    }

    public void rollDiceTwice() {
        for (int i = 1; i <= 2; i++) {
            int diceValue = random.nextInt(6) + 1;
            System.out.println(name + " kastade tärning " + i + " och fick " + diceValue);
            totalPoints += diceValue;
        }
    }
}