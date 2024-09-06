import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        generatePattern(n);
    }

    private static void generatePattern(int n) {
        if (n < 6 || n % 2 != 0) {
            System.out.println("Invalid input. n should be an even number and greater than or equal to 6.");
            return;
        }

        String topAndBottom = repeatChar('C', n / 2);
        System.out.println(topAndBottom);

        for (int i = 0; i < n / 2 - 1; i++) {
            String row = repeatChar('C', 2) + repeatChar('S', n - 4) + repeatChar('C', 2);
            System.out.println(row);
        }

        String middle = repeatChar('S', n);
        System.out.println(middle);
        System.out.println(middle);

        for (int i = 0; i < n / 2 - 1; i++) {
            String row = repeatChar('K', 2) + repeatChar('S', n - 4) + repeatChar('K', 2);
            System.out.println(row);
        }

        System.out.println(repeatChar('K', n));
    }

    private static String repeatChar(char c, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(c);
        }
        return sb.toString();
    }
}