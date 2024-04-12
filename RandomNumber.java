package randomnumber;
import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalAttempts = 0;
        int roundsWon = 0;
        boolean playAgain = true;
        System.out.println("Welcome to My Number Game");
        while (playAgain) {
            int randomNumber = random.nextInt(100) + 1;
            int attempts = 0;
            boolean guessedCorrectly = false;
            System.out.println("I have chosen a number between 1 and 100. Try to guess it.");
            while (!guessedCorrectly && attempts < 5) { 
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;
                totalAttempts++;
                if (guess == randomNumber) {
                    System.out.println("Congratulations! this is correct number" + attempts + " attempts.");
                    guessedCorrectly = true;
                    roundsWon++;
                } else if (guess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }
            System.out.println("Score for this round: " + (5 - attempts) + "/5");
            System.out.println("Total Attempts: " + totalAttempts);
            System.out.println("Rounds Won: " + roundsWon);
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            playAgain = playAgainInput.equals("yes") || playAgainInput.equals("y");
        }
        System.out.println("Thank you");
        scanner.close();
    }
}
