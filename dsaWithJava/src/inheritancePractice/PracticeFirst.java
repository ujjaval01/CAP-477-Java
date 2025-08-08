package inheritancePractice;

class Animals{
    String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
}

class Dog extends Animals{
    public void barking(){
        System.out.println("i am dog");
    }

}

public class PracticeFirst {
   public static void main(String[] args) {

    Animals a = new Animals();
    Dog d = new Dog();
    d.setName("dog");
    d.barking();
    System.out.println(d.getName());


   } 
}
