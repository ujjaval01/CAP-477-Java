import java.util.Scanner;;

public class ScannerClass {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter your course: ");
            String course = sc.nextLine();
            System.out
                    .println("My name is " + name + " and my age is " + age + " and currently i am doing " + course + ".");
        }
    }

}
