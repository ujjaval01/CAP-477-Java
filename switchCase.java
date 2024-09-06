import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 to 3:");
        String input = sc.nextLine();

        // Using Switch Case Statement
        switch (input) {
            case "a":
                System.out.println("You Entered 1");
                break;

            case "b":
                System.out.println("You Entered 2");
                break;

            case "c":
                System.out.println("You Entered 3 ");
                for (int i = 0; i < 5; i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
                break;
            default:
                System.out.println("You Entered something else");
        }// End of the Switch Case
    }// End of the Main Method
}// End of the Class
