
                                        // this and super keyword
package inheritancePractice;
class SuperClass{
    SuperClass(){
        System.out.println("I am the superClass default Constructor");
//        this(15);   // we can set the value of the parameterized const also
    }
    SuperClass(int x){
//        this();    // we can call the default constructor through to this keyword
        System.out.println("I am the superClass Constructor value of " + x);
    }
}

class ChildClass extends SuperClass{
    ChildClass(){
        System.out.println("I am the ChildClass default Constructor");
    }
    ChildClass(int x, int y){
        super(x);        // calling the there super class(SuperClass) constructor which has the value of x
        System.out.println("I am the ChildClass Constructor value of " + y);
    }
}


class DerivedOfChild extends ChildClass{
    DerivedOfChild(){
        System.out.println("I am the DerivedOfChildClass default Constructor");
    }

    DerivedOfChild(int x, int y, int z){
        super(x,y);       // calling the there super class(ChildClass) constructor which has the value of x and y
        System.out.println("I am the DerivedOfChildClass Constructor value of " + z);
    }

}


public class MethodOverloadingInConstructorInInheritance {
    public static void main(String[] args) {
       DerivedOfChild d = new DerivedOfChild(10,11,12);
//        DerivedOfChild d = new DerivedOfChild();


    }
}
