public class question1 {
    public static void main(String[] args) {
       
        System.out.println("Sequence i):");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " ");
        }
        System.out.println(); 
        
        
        System.out.println("Sequence ii):");
        int num = 0;
        while (num <= 14) {
            System.out.println(num + " ");
            num += 2;
        }
        System.out.println(); 
        
        
        System.out.println("C:");
        int num2 = 0;
        do {
            System.out.println(num2 + " ");
            num2 += 2;
        } while (num2 <= 14);
        System.out.println(); 
    }
}
