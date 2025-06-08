import java.util.Scanner;
public class NestedLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sy = "";
        System.out.print("enter the row number: ");
        int r = sc.nextInt();
        System.out.print("Enter column number: ");
        int c = sc.nextInt();
        System.out.print("enter the symbol: ");
        sy = sc.next();
        for(int i = 1; i<= r; i++){
              System.out.println();
            for(int j = 1; j<=c; j++){
                System.out.print(sy);
            } 
        }

    }
}
