package oopsConcepts;

import java.util.Scanner;

class rectangle{
    int l,w;
    public int area(int l,int w){
        return l *w;
    }
    public int perimeter(int l,int w){
        return 2 *(l + w);
    }
}


public class ClassPractice3 {
    public static void main(String[] args) {
        rectangle ra = new rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the ractangle: ");
        int l = sc.nextInt();
        System.out.print("Enter the width of the ractangle: ");
        int w = sc.nextInt();
        System.out.println("The area of the ractange is: " + ra.area(l, w));        
        System.out.println("The perimeter of the ractange is: " +ra.perimeter(l, w));        

    }
}
