public class question2 {
    public static void main(String[] args) {
        
        System.out.println("Pattern 1:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        
        
        System.out.println();
        int num = 2;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
            }
            System.out.println();
            num += 2;
        }
    }
}
