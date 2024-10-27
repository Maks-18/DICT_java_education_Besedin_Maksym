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
        String userName = scanner.nextLine();

        System.out.println("What a great name you have, " + userName + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int remainder3 = scanner.nextInt(); // Залишок від ділення на 3
        int remainder5 = scanner.nextInt(); // Залишок від ділення на 5
        int remainder7 = scanner.nextInt(); // Залишок від ділення на 7

        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105; // Формула для обчислення віку

        System.out.println("Your age is " + age + "; that's a good time to start programming!");

        scanner.close();
    }
}


