package hangman;

import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        System.out.println("HANGMAN");

       // list random words
        String[] words = {"python", "java", "javascript", "kotlin"};

        //take random words
        Random random = new Random();
        String wordToGuess = words[random.nextInt(words.length)];

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
