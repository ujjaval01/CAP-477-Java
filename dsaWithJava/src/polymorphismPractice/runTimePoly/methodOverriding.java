package polymorphismPractice.runTimePoly;
/* POLYMORPHISM:- Ek hi method ya reference k alg alg behaviour hona, depending on object type and argument
 For interview:-Polymorphism is allowed us to perform a single task in different ways
 hum is program ko polymorphism se v relate kr skte hai, quki polymorphism 2 types ke hote h
  1. compile time polymorphism(method overloading)
  2. Run time polymorphism(method overriding)

  Run time polymorphism(method Overriding) me jab code compile hota h tub java Runtime me decide hota h kon sa method
  run hoga
  reallife example- tv remote on/off btn, diffrent object like lcd tv,
 */
class animal{
    void sound(){
        System.out.println("Animals sound...");
    }
     void leg() {
    // code
    }
}

class dog extends animal{
    @Override
    void sound(){
        System.out.println("dog sound like BHO BHO...");
    }
    @Override
    void leg(){
        System.out.println("Dog has 4 legs");
    }
}class cat extends animal{
    @Override
    void sound(){
        System.out.println("cat sound like MEW MEW...");
    }
}

public class methodOverriding {
    static void main() {
        animal a = new animal(); a.sound();
        animal d = new dog(); d.sound(); d.leg();
        // refrence will be super class and the obj will be created of subClass
        animal c = new cat(); c.sound();
        /* in this question we have single refrence type(animal), but object type dog or cat are diffrent(mean
        performing single task in diffrent way)
        after that, when the code will be run, accrording to object decided which method will be run in runtime
         */

    }
}
