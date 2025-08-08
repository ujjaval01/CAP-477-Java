package oopsConcepts;

class Employee{
    int id;
    String name;
    int salary;
    void Info(){
        System.out.println("The id of the " + name + " is " + id + ".");
    }

    void setSalary(){
        salary = 15000;
    }

    int getSalary(){
        return salary;
    }

}


public class ClassPractice {
    public static void main(String[] args) {
        Employee ujvl = new Employee();
        Employee aadi = new Employee();
        ujvl.id = 11;
        ujvl.name = "Android Developer";
       // ujvl.salary = 15000;
        ujvl.setSalary();
        ujvl.Info();
        aadi.id = 15;
       // aadi.salary = 14000;
        aadi.name = "Web Developer";
        aadi.Info();
        System.out.println(ujvl.getSalary());

       
       
        
    }
}
