package MultiThreadingPractice;

class th1 extends Thread{
    public th1(String name){
        super(name);
    }
    @Override
    public void run(){
        int i = 0;
        while (i<= 10){
            System.out.println("i am thread class");
            i++;
        }
    }
}class th12 extends Thread{
    public th12(String name){
        super(name);
    }
    @Override
    public void run(){
        int i = 0;
        while (i<= 10){
            System.out.println("i am thread class");
            i++;
        }
    }
}


public class threadConstructor {
    static void main() {
        th1 t1 = new th1("ujvl");
        t1.start();
        th1 t12 = new th1("ujvl");
        t12.start();
//        t1.setPriority();
        System.out.println("id is: " + t1.getId());
        System.out.println("name is: " + t1.getName());
        System.out.println("id is: " + t12.getId());
        System.out.println("name is: " + t12.getName());
    }

}
