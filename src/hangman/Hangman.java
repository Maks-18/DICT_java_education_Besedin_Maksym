package hangman;

import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        System.out.println("HANGMAN");

       // list random words
        String[] words = {"python", "java", "javascript", "kotlin", "C++", "C#"};

        //take random words
        Random random = new Random();
        String wordToGuess = words[random.nextInt(words.length)];

        // create a hint
        String hint = wordToGuess.substring(0,2) + "-".repeat(wordToGuess.length() -2);
        System.out.println(" Guess the word " + hint + ":");

        //ask player about word
        System.out.println("Guess the word:");
        Scanner scanner = new Scanner(System.in);
        String userGuess = scanner.nextLine();

        //Check if the answer is correct
        if (userGuess.equals(wordToGuess)) {
            System.out.println("You win!");
        } else {
            System.out.println("You died :(");
        }
    }
}
