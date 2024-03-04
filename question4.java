import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();

        
        if (number < 0) {
            System.out.println("Enter a positive number.");
            return;
        }

        long factorial = 1;
        if (number != 0) {
            for (int i = number; i >= 1; i--) {
                factorial *= i;
            }
        }

        
        if (number == 0) {
            System.out.println("Factorial of 0 is 1.");
        } else {
            System.out.print("Factorial of " + number + " = " + number);
            for (int i = number - 1; i >= 1; i--) {
                System.out.print(" x " + i);
            }
            System.out.println(" = " + factorial + ".");
        }

        scanner.close();
    }
}
