package ChatBot;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        String botName = "Star";
        int birthYear = 2024;

        System.out.println("Hello! My name is " + botName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name:");

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        System.out.println("What a great name you have, " + userName + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();

        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");

        System.out.println("Now I will prove to you that I can count to any number you want!");
        System.out.println("Enter a positive number:");

        int userInp = scanner.nextInt(); // Зчитуємо число, до якого потрібно рахувати

        for (int i = 0; i <= userInp; i++) {
            System.out.println(i + "!");
        }

        // Додаємо тест
        System.out.println("Let's test your programming knowledge.");

        while (true) {
            System.out.println("Which language is primarily used for Android development?");
            System.out.println("1. Swift");
            System.out.println("2. Kotlin");
            System.out.println("3. JavaScript");
            System.out.println("4. Ruby");

            int answer = scanner.nextInt();

            if (answer == 2) {
                System.out.println("Congratulations, that's the correct answer!");
                break;
            } else {
                System.out.println("Please, try again.");
            }
        }

        System.out.println("Goodbye, have a nice day!");
        scanner.close();
    }
}




