package hangman;

import java.util.Scanner;

public class Hangman {
    public static void main (String[] args){
        System.out.println("HANGMAN");
        System.out.println("The game will be available soon");

        //Встановити слово, яке потрібно вгадати
        String wordToGuess = "java";

        //Запитати гравця слово
        System.out.println("what kind of word did i guess?");
        Scanner scanner = new Scanner(System.in);
        String userGuess = scanner.nextLine();

        //Перевірка, чи правильна відповідь
        if (userGuess.equals(wordToGuess)) {
            System.out.print("You win");
        } else {
            System.out.println("You died");

        }
    }
}