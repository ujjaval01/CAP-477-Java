package oopsConcepts;

import java.util.Scanner;

class Students{
    private int rollNo;
    String name;
    double cgpa;
    public void print(){
        System.out.println(name + " " +rollNo + " " + cgpa);
    }
    public int getRollNo(){
        return rollNo;
    }
    public void setRollNo(int x){
        rollNo = x;
    }

}
public class ClassAndMethods {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Students s1 = new Students();
//        s1.rollNo = 9;

        s1.name = "Ujvl";
        s1.cgpa = 7.6;
        s1.print();
        s1.name = "ujvl";
        s1.setRollNo(12);
        System.out.println(s1.getRollNo());

        StringBuilder sb = new StringBuilder(sc.next());
        System.out.println(sb);
    }
}
