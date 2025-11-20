package oopsConcepts;

import java.util.Scanner;

class Students{
    private int rollNo;
    String name;
    double cgpa;
    // using getter setter methods to access private data members
    public int getRollNo(){
        return rollNo;
    }
    public void setRollNo(int x){
        rollNo = x;
    }
//    print the above data members
    public void print(){
        System.out.println(name + " " +rollNo + " " + cgpa);
    }

}
public class ClassAndMethods {
    static void main() {
        Scanner sc = new Scanner(System.in);
//        creating object of the outer class to access the data member inside the inner or main class
        Students s1 = new Students();
//        s1.rollNo = 9;

        s1.name = "Ujvl";
        s1.cgpa = 7.6;
        s1.print();
        s1.name = "ujvl";
        s1.setRollNo(12);
        System.out.println(s1.getRollNo());
// taking input in stringbuilder
        StringBuilder sb = new StringBuilder(sc.next());
        System.out.println(sb);
    }
}
