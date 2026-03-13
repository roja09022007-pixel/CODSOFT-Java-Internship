import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int secretNumber = (int)(Math.random() * 100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("---- Number Guessing Game ----");
        System.out.println("Guess a number between 1 and 100");

        while (true) {

            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > secretNumber) {
                System.out.println("Your guess is too high.");
            }

            else if (guess < secretNumber) {
                System.out.println("Your guess is too low.");
            }

            else {
                System.out.println("Correct! You guessed the number.");
                System.out.println("Total attempts: " + attempts);
                break;
            }
        }

        sc.close();
    }
}