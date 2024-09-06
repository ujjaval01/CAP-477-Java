import java.util.Scanner;

public class simple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        
        boolean isMeenaTurn = true;
        int chances = 10;
        
        while (chances > 0) {
            
            if (isMeenaTurn) {
                System.out.println("Enter the initial number:");
            int n = scanner.nextInt();
                n++; // Meena increases the number by 1
                if (n % 3 == 0) {
                    System.out.println("Meena wins!");
                    return;
                }
                isMeenaTurn = false;
            } else {
                n--; // Rohit decreases the number by 1
                isMeenaTurn = true;
            }
            chances--;
        }
        
        System.out.println("Rohit wins!");
    }
}
