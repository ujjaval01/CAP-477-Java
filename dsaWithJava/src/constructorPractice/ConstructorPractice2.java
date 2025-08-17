package constructorPractice;

import java.util.Scanner;

class workers{
    int id;
    private String name;
    private String address;

    workers(){
        id = 0;
        name = "Default";
        address = "Default";
    }
    workers(int id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

public class ConstructorPractice2 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your id: ");
        int id = sc.nextInt();
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your address: ");
        String address = sc.nextLine();

        workers wk1 = new workers();
//        workers wk2 = new workers(id, name, address);
        System.out.println(wk1.getAddress());
        System.out.println(wk1.getId());




    }
}
