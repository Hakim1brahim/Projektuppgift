package se.abdilhakim.Dice;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String nameOne = getInput("Ange namn för player1:");

        String nameTwo = getInput("Ange namn för player2:");

        Player2 player2 = new Player2(nameOne);
        Player1 player1 = new Player1(nameTwo);


            System.out.println("Spelet börjar nu!");

            System.out.println(Player1.getName() + " är redo att kasta tärningen. Tryck Enter för att kasta.");
            scanner.nextLine();
            player1.rollDiceTwice();


            System.out.println(Player2.getName() + " är redo att kasta tärningen. Tryck Enter för att kasta.");
            scanner.nextLine();
            player2.rollDiceTwice();


        System.out.println(Player1.getName() + " fick totalt " + player1.getScore() + " poäng.");
        System.out.println(Player2.getName() + " fick totalt " + player2.getScore() + " poäng.");

        if (player1.getScore() > player2.getScore()) {
            System.out.println(Player1.getName() + " vinner!");
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println(Player2.getName() + " vinner!");
        } else {
            System.out.println("Det blev oavgjort!");
        }

        System.out.println("Spelet är över!");
    }

    public static String getInput(String promptUser) {
        System.out.print(promptUser);
        return scanner.nextLine();

    }
}



