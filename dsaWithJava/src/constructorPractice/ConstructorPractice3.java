package constructorPractice;
import java.util.*;

class Basic {
    private int rollNo;
    private String name;
    private String subject;

    public int getRollNo(){
        return rollNo;
    }
    public void setRollNo(int r){
        this.rollNo = r;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public String getSubject(){
        return subject;
    }
    public void setSubject(String s){
        subject = s;
    }


}



public class ConstructorPractice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Basic st1 = new Basic();
        // st1.rollNo = 9;                  --> throw error due to private access modifier
        // st1.name = "Ujjaval";
        // st1.subject = "ComputerScience"

        System.out.print("Enter the Roll No of the student: ");
        int stRoll = sc.nextInt();
        st1.setRollNo(stRoll);

        System.out.print("Enter the Name of the student: ");
        String stName = sc.nextLine();
        st1.setName(stName);

        System.out.print("Enter the Subject of the student: ");
        String stSubject = sc.nextLine();
        st1.setSubject(stSubject);

        System.out.println(st1.getRollNo());
        System.out.println(st1.getName());
        System.out.println(st1.getSubject());



    }
}
