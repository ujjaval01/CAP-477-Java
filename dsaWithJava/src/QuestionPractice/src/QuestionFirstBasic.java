package QuestionPractice.src;

class Student{
    String name;
    int RollNo;
    float marks;

    public void DisplayDetails(){
        System.out.println("The name of the student is " + name + "\nand the roll no is " + RollNo + "\nand the obtained total marks " + marks);
    }
}


public class QuestionFirstBasic {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.RollNo = 11;
        st1.name = "Ujvl";
        st1.marks = 470;

        Student st2 = new Student();
        st2.RollNo = 21;
        st2.name = "Aadi";
        st2.marks = 410;

        //calling the display function
        st1.DisplayDetails();
        st2.DisplayDetails();

    }
}
