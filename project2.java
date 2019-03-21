/**
 * Hilmi Demirhan
 * CS 55 Java Programming
 * Project 2
 * This program lets playing Rock, Scissors, Paper Game
 *
 */

package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       do {
           determineWinner(userChoice(),computerChoice());

       }while (playAgain());

    }
    public static char userChoice() {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your choice: rock, scissors, paper");
        String userSelection = input.nextLine();

        userSelection = userSelection.toLowerCase();

        char selection = 'a';

        if (userSelection.equals("rock")) {

            selection = 'r';


        } else if (userSelection.equals("scissors")){
            selection = 's';

        } else if (userSelection.equals("paper")){
            selection = 'p';
        } else {
            System.out.println("Make correct selection");
        }

        return selection;

    }

    public static char computerChoice() {
        Random randonNumber = new Random();
        int randomSelection = randonNumber.nextInt(3) + 1;

        char compSelection = 'a';

        if (randomSelection == 1) {
            compSelection = 'r';

        } else if (randomSelection == 2) {
            compSelection = 's';

        } else if (randomSelection == 3) {
            compSelection = 'p';
        }

        return compSelection;

    }

    public static void determineWinner(char userSelect, char compSelect) {

        if (userSelect == 'r' && compSelect == 'r') {
            System.out.println("There is no winner");
        } else if (userSelect == 'r' && compSelect == 's') {
            System.out.println("You won!!! The rock smashes the scissors");
        } else if (userSelect == 'r' && compSelect == 'p') {
            System.out.println("Computer won!!! Paper wraps rock");
        }

        else if (userSelect == 's' && compSelect == 'r') {
            System.out.println("Computer won!!! The rock smashes the scissors");
        } else if (userSelect == 's' && compSelect == 's') {
            System.out.println("There is no winner");
        } else if (userSelect == 's' && compSelect == 'p') {
            System.out.println("You won!!! Scissors cuts paper");
        }

        else if (userSelect == 'p' && compSelect == 'r') {
            System.out.println("You won!!! Paper wraps rock");
        } else if (userSelect == 'p' && compSelect == 's') {
            System.out.println("Computer won!!! Scissors cuts paper" );
        } else if (userSelect == 'p' && compSelect == 'p') {
            System.out.println("There is no winner");
        }

    }

    public static boolean playAgain () {

        boolean pa ;

        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to play again? Please type Yes or No");
        String newGame = input.next();
        newGame = newGame.toLowerCase();

        if (newGame.equals("yes") || newGame.equals("y")) {

            pa = true;

        } else {
            System.out.println("Bye bye!");
            pa = false;

        }

        return pa;

    }
}
