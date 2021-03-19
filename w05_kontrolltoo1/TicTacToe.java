/* Trips-traps-trull

* Joonista sümbolite abil ekraanile trips-traps-trulli ruudustik
* Kasutaja teatab rea ja veeru. Vastavasse kohta märgitakse kordamööda x ja 0
* Kontrollitakse käikude õigsust, teatatakse mängu lõpust.  */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class TicTacToe {

    private static String mark = "";
    private static String computerMark = "";
    private static String winner = "";
    private static int gameStepCounter = 0;

    private static List<String> row1 = new LinkedList<>(Arrays.asList("1", "2", "3"));
    private static List<String> row2 = new LinkedList<>(Arrays.asList("4", "5", "6"));
    private static List<String> row3 = new LinkedList<>(Arrays.asList("7", "8", "9"));

    public static void main (String[] args) {
        Scanner Player = new Scanner(System.in);
        askForMark(Player);
        System.out.println("------------------------------------------------------");
        System.out.println(" To play this game you need to pick a number from the ");
        System.out.println(" board, and an " + mark + " will be placed there. In order to win you ");
        System.out.println(" must place three marks in a horizontal, vertical or  ");
        System.out.println(" diagonal row.                                        ");
        System.out.println("------------------------------------------------------");
        currentBoard();
        do {
            playerChoice(Player);
            gameStepCounter += 1;
            currentBoard();
            checkForWinner();
            if (winner != "" || gameStepCounter == 9) {
                break;
            }
            computerMove();
            gameStepCounter += 1;
            currentBoard();
            checkForWinner();
        } while (winner == "" && gameStepCounter != 9);
        if (winner != "") {
            System.out.println(winner + " won the game!");
        } else {
            System.out.println("Its a tie!");
        }
    }

    public static void currentBoard() {
        System.out.println(row1);
        System.out.println(row2);
        System.out.println(row3);
    }

    public static void askForMark(Scanner Player) {
        System.out.println("Welcome to a game of TIC-TAC-TOE!");
        System.out.println("To continue please enter your preferred mark: O, X");
        while (!Player.hasNext("[XO]")) {
            System.out.println("Mark must be either O or X");
            Player.next();
        }
        mark = Player.next();
        if (mark.equals("X")) {
            computerMark = "O";
        } else {
            computerMark = "X";
        }
    }

    public static void playerChoice(Scanner Player) {
        int number;
        do {
            System.out.println("Pick a number that's on the board!");
            while (!Player.hasNextInt()) {
                System.out.println("That is not a number!");
                Player.next();
            }
            number = Player.nextInt();
        } while (!checkIfNumberExistsAndReplace(String.valueOf(number), mark));
    }

    public static void computerMove() {
        Random rand = new Random();
        int number;
        do {
            number = rand.nextInt((9 - 1) + 1) + 1;;
        } while (!checkIfNumberExistsAndReplace(String.valueOf(number), computerMark));
        System.out.println("Computer's choice:");
    }

    public static boolean checkIfNumberExistsAndReplace (String number, String mark) {
        if (row1.contains(number)) {
            row1.set(row1.indexOf(number), mark);
            return true;
        }
        if (row2.contains(number)) {
            row2.set(row2.indexOf(number), mark);
            return true;
        }
        if (row3.contains(number)) {
            row3.set(row3.indexOf(number), mark);
            return true;
        }
        return false;
    }

    public static void checkForWinner() {
        checkForWinnerDiagonal();
        checkForWinnerStraight();
        checkForWinnerTopDown();
    }

    public static void checkForWinnerTopDown() {
        for (int i = 0; i < 3; i++) {
            if (row1.get(i).equals(mark) && row2.get(i).equals(mark) && row3.get(i).equals(mark)) {
                winner = "Player";
            }
            if (row1.get(i).equals(computerMark) && row2.get(i).equals(computerMark) && row3.get(i).equals(computerMark)) {
                winner = "Computer";
            }

        }
    }

    public static void checkForWinnerDiagonal() {
        if (row2.get(1).equals(mark)) {
            if (row1.get(0).equals(mark) && row3.get(2).equals(mark))  {
                winner = "Player";
            }
            if (row1.get(2).equals(mark) && row3.get(0).equals(mark))  {
                winner = "Player";
            }
        }
        if (row2.get(1).equals(computerMark)) {
            if (row1.get(0).equals(computerMark) && row3.get(2).equals(computerMark))  {
                winner = "Computer";
            }
            if (row1.get(2).equals(computerMark) && row3.get(0).equals(computerMark))  {
                winner = "Computer";
            }
        }
    }

    public static void checkForWinnerStraight() {
        int counter = 0;
        int computerCounter = 0;
        for (String s : row1) {
            if (s == mark) {
                counter ++;
                if (counter == 3) {
                    winner = "Player";
                }
            }
            if (s == computerMark) {
                computerCounter++;
                if (computerCounter == 3) {
                    winner = "Computer";
                }
            }
        }
        counter = 0;
        computerCounter = 0;
        for (String s : row2) {
            if (s == mark) {
                counter ++;
                if (counter == 3) {
                    winner = "Player";
                }
            }
            if (s == computerMark) {
                computerCounter++;
                if (computerCounter == 3) {
                    winner = "Computer";
                }
            }
        }
        counter = 0;
        computerCounter = 0;
        for (String s : row3) {
            if (s == mark) {
                counter ++;
                if (counter == 3) {
                    winner = "Player";
                }
            }
            if (s == computerMark) {
                computerCounter++;
                if (computerCounter == 3) {
                    winner = "Computer";
                }
            }
        }
    }
}