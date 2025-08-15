package oopsConcepts;

import java.util.Scanner;

class students{
    private int rollNo;
    private String name;
    private String fatherName;

    public int getRollNo(){
        return rollNo;
    }
    public void setRollNo(int r){
        rollNo = r;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public String getFatherName(){
        return fatherName;
    }
    public void setFatherName(String fn){
        fatherName = fn;
    }

    public students(){
        rollNo = 55;
        name = "Ujjaval";
        fatherName = "Jaykumar";
    }
    public students(int rNo, String myName){
        rollNo = rNo;
        name = myName;
        fatherName = "Jaykumar";
    }

}

public class ConstructorPractice {
    public static void main(String[] args) {

        students st1 = new students();
        Scanner sc = new Scanner(System.in);
        String pass = "saini123";
        System.out.print("Enter the password: ");
        String cnfmPass = sc.nextLine();
        if(pass.equals(cnfmPass)){
            System.out.print("Enter the Roll No of the student: ");
            int stRollNo = sc.nextInt();
            System.out.print("Enter the Name of the student: ");
            String stName = sc.nextLine();
            System.out.print("Enter the Fathers Name of the student: ");
            String stFatherName = sc.nextLine();
            st1.setRollNo(stRollNo);
            st1.setName(stName);
            st1.setFatherName(stFatherName);   
        }
        else{
            System.out.println("You entering the wrong password, and you are getting the default output");
        }
        System.out.println(st1.getRollNo());
        System.out.println(st1.getName());
        System.out.println(st1.getFatherName());

        
    }
}
