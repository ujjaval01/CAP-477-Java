package MultiThreadingPractice;

class Mythread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i < 100){
            System.out.println("I am thread first");
        }
    }
} class Mythread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i < 100){
            System.out.println("I am thread second");
        }
    }
}


public class ByThreadClass {
    static void main() {
        Mythread1 m1 = new Mythread1();
        m1.start();
        Mythread2 m2 = new Mythread2();
        m2.start();
    }
}
