package bkch;

import java.util.Scanner;

public class prblm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter: ");
        String S = scanner.nextLine();

        int operations = reduceString(S);
        System.out.println(operations);
        if (S.isEmpty()) {
            System.out.println("Empty String");
        } else {
            System.out.println(S);
        }
    }

    public static int reduceString(String S) {
        StringBuilder sb = new StringBuilder(S);
        int operations = 0;

        boolean reduced = true;
        while (reduced) {
            reduced = false;
            for (int i = 0; i < sb.length() - 1; i++) {
                if (sb.charAt(i) == sb.charAt(i + 1)) {
                    sb.delete(i, i + 2);
                    reduced = true;
                    operations++;
                    break;
                }
            }
        }

        return operations;
    }
}