import java.util.Scanner;

public class CA1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Address 1:");
        String address1 = scanner.nextLine().trim();

        System.out.println("Address 2:");
        String address2 = scanner.nextLine().trim();

        if (address1.equals(address2)) {
            System.out.println("RED");
        } else if (address1.equalsIgnoreCase(address2)) {
            System.out.println("BLUE");
        } else if (address1.replace(" ", "").equalsIgnoreCase(address2.replace(" ", ""))) {
            System.out.println("YELLOW");
        } else {
            System.out.println("GREEN");
        }
    }
}
