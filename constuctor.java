class Student{
    String name;
    int age;

    public void info(){
        System.out.println(name);
        System.out.println(age);
    }

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

}


public class constuctor {
    public static void main(String[] args) {
        Student s1 = new Student("ujjaval", 22);
        s1.info();
    
    }
}
