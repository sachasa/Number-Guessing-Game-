import java.util.Scanner;
import java.util.Random;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();
            
            int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
            int numberOfTries = 0;
            boolean hasGuessedCorrectly = false;
            
            System.out.println("Welcome to 'Guess the Number'!");
            System.out.println("I have selected a number between 1 and 100. Try to guess it!");
            
            while (!hasGuessedCorrectly) {
                System.out.print("Enter your guess: ");
                int playerGuess = scanner.nextInt();
                numberOfTries++;
                
                if (playerGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (playerGuess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You've guessed the number.");
                    System.out.println("It took you " + numberOfTries + " tries.");
                    hasGuessedCorrectly = true;
                }
            }
        }
    }
}

