package classPractice;

import java.util.Scanner;

class employee{
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
}



public class ClassPractice2 {
    public static void main(String[] args) {
        employee ujvll = new employee();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String enterName = sc.nextLine();
        ujvll.setName(enterName);
        ujvll.salary = 55;

        System.out.println(ujvll.getSalary());
        System.out.println(ujvll.getName());

        
    }
}
