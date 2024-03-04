import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int MAX_ATTEMPTS = 4;
        final int PASSCODE = 486251;
        int attempts = 0;

        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Enter the passcode: ");
            int passAttempt = input.nextInt();
            if (passAttempt == PASSCODE) {
                System.out.println("Correct passcode.");
                return; 
            } else {
                System.out.println("Incorrect passcode. Please try again.");
                attempts++;
            }
        }

        System.out.println("You have exceeded the maximum number of attempts. Access denied.");
        input.close();
    }
}
