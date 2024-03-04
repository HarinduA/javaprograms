import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        
        System.out.println("Fibonacci series up to the " + n + "th term:");
        int firstTerm = 1;
        int secondTerm = 1;
        System.out.print(firstTerm + ", " + secondTerm);
        for (int i = 3; i <= n; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(", " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        scanner.close();
    }
}
