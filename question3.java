import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

    
        System.out.print("Enter a letter: ");
        char letter = scanner.next().charAt(0);

      
        int count = 0;
        while (count < n) {
            System.out.print(letter);
            count++;
        }

        scanner.close();
    }
}
