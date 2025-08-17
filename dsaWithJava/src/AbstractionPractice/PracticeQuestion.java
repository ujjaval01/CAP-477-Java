package AbstractionPractice;

abstract class Employee{
    String name;
    int id;
    abstract public double calculateSalary();

    Employee(String name, int id){
        this.name = name;
        this.id = id;
    }
    void displayDetails(){
        System.out.println("the name of the employee is: " + name);
        System.out.println("the id of the employee is: " + id);
    }
}

class fullTimeEmployee extends Employee{
    double monthlySalary;

    fullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }
    @Override
    public double calculateSalary(){
        return monthlySalary;
    }

}

class partTimeEmployee extends Employee{
    int hoursWork;
    int hoursRate;

    partTimeEmployee(String name, int id, int hoursWork, int hoursRate){
        super(name, id);
        this.hoursRate = hoursRate;
        this.hoursWork = hoursWork;
    }
    @Override
    public double calculateSalary(){
        return hoursRate * hoursWork;
    }
}

public class PracticeQuestion {
    static void main() {
        Employee[] employees = new Employee[3];
        employees[0] = new fullTimeEmployee("Ujvl", 9, 450000);
        employees[1] = new partTimeEmployee("Aman", 10, 9, 1000);
        for (Employee e: employees){
            if(e == null){
                continue;
            }
            e.displayDetails();
            System.out.println("Salary: " + e.calculateSalary());
            System.out.println("------------------------------------------");

        }
    }


}
