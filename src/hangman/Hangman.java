package hangman;

import java.util.*;

public class Hangman {

    public static void main(String[] args) {
        System.out.println("HANGMAN");

        Scanner scanner = new Scanner(System.in);

        // Меню гри
        while (true) {
            System.out.println("Type \"play\" to play the game, \"exit\" to quit:");
            String command = scanner.nextLine();

            if (command.equals("play")) {
                playGame(scanner); // Запуск гри
            } else if (command.equals("exit")) {
                System.out.println("Have a nice day!");
                break; // Вихід із програми
            } else {
                System.out.println("Invalid input, please try again");
            }
        }
        scanner.close(); // Закрити Scanner, коли програма завершується
    }

    // Метод для гри
    public static void playGame(Scanner scanner) {
        // Список випадкових слів
        String[] words = {"python", "java", "javascript", "kotlin", "C++"};
        Random random = new Random();
        String wordToGuess = words[random.nextInt(words.length)];
        char[] guessedWord = new char[wordToGuess.length()];
        Arrays.fill(guessedWord, '-'); // Заповнення символами '-'
        Set<Character> guessedLetters = new HashSet<>();
        int attemptsLeft = 8;

        while (attemptsLeft > 0) {
            System.out.println("\n" + new String(guessedWord)); // Показати поточний стан слова
            System.out.println("Attempts left: " + attemptsLeft);
            System.out.print("Input a letter: ");
            String input = scanner.nextLine();

            // Перевірка введення
            if (input.length() != 1) {
                System.out.println("You should input a single letter");
                continue;
            }

            char letter = input.charAt(0);

            if (!Character.isLowerCase(letter)) {
                System.out.println("Please enter a lowercase English letter");
                continue;
            }

            if (guessedLetters.contains(letter)) {
                System.out.println("You've already guessed this letter");
                continue;
            }

            guessedLetters.add(letter);

            boolean found = false;
            for (int i = 0; i < wordToGuess.length(); i++) {
                if (wordToGuess.charAt(i) == letter) {
                    guessedWord[i] = letter;
                    found = true;
                }
            }

            if (!found) {
                System.out.println("That letter doesn't appear in the word");
                attemptsLeft--;
            }

            if (new String(guessedWord).equals(wordToGuess)) {
                System.out.println("You guessed the word " + wordToGuess + "!");
                System.out.println("You survived!");
                return; // Завершити метод і повернутись у меню
            }
        }

        System.out.println("You lost! The word was " + wordToGuess);
    }
}

