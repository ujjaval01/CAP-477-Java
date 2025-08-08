package oopsConcepts;

import java.util.Scanner;

class workers{
    int id;
    private String name;
    private String address;

    public int getId(){
        return id;
    }
    public void setId(int i){
        id = i;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String add){
        address = add;
    }

    public workers(){
        id = 0;
        name = "default";
        address = "default";
    }
    public workers(String n, String add){
        id = 0;
        name = n;
        address = add;
    }


    
}

public class ConstructorPractice2 {
 
    public static void main(String[] args) {
        workers wk1 = new workers();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter address: ");
        String address = sc.nextLine();
        workers wk2 = new workers(name,address);
        wk1.setId(5);
        
        System.out.println(wk1.getId());       
        System.out.println(wk1.getAddress()); 
        System.out.println(wk2.getName() + " " + wk2.getAddress());

        
    }
}
