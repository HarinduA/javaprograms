import java.util.Random;
import java.util.Scanner;

public class question8 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        
        int randomNumber = random.nextInt(20) + 1;
        int guess;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've picked a number between 1 and 20. Can you guess it?");
        
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
            }
        } while (guess != randomNumber);

        scanner.close();
    }
}
