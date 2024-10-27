package ChatBot;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        String botName = "Star"; // Ім'я бота
        int birthYear = 2024;     // Рік створення бота

        System.out.println("Hello! My name is " + botName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name:");

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine(); // Отримуємо ім'я користувача

        System.out.println("What a great name you have, " + userName + "!");
        scanner.close();
    }
}

