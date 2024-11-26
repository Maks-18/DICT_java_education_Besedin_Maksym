package hangman;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Hangman {
    public static void main(String[] args) {
        System.out.println("HANGMAN");
        System.out.println("The game will be available soon.");

       // list random words
        String[] words = {"python", "java", "javascript", "kotlin", "C++"};

        //take random words
        Random random = new Random();
        String wordToGuess = words[random.nextInt(words.length)];
        char[] guessedWord = new char[wordToGuess.length()];
        Set<Character> guessedLetters = new HashSet<>();
        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = '-';
        }

        int attemptsLeft = 8;

        while (attemptsLeft > 0) {
            System.out.println( new String (guessedWord));
            System.out.println("Attempts left: " + attemptsLeft);
            System.out.print("Input a letter");
            Scanner scanner = new Scanner(System.in);
            char letter = scanner.next().charAt(0);

            if (guessedLetters.contains(letter)) {
                System.out.println("You've already guessed this letter");
                continue;
            }
            guessedLetters.add(letter);

            boolean found = false;
            for (int i = 0; i < wordToGuess.length(); i++ ) {
                if ((wordToGuess.charAt(i) == letter)) {
                    guessedWord[i] = letter;
                    found = true;
                }
            }


            if (! found) {
                System.out.println("That letter doesn't appear in the word");
                attemptsLeft--;
            }

            if (new String(guessedWord).equals(wordToGuess)) {
                System.out.println(" You guessed the word " + wordToGuess + "!");
                System.out.println("You sirvied!");
                return;
            }
        }

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
