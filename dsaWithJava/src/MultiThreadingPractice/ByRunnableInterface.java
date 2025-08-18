package MultiThreadingPractice;
class thread implements Runnable{
    @Override
    public void run(){
        int i = 0;
        while (i <= 10){
            System.out.println("i am the first example of runnable thread");
            i++;
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
class thread2 implements Runnable{
    @Override
    public void run(){
        int i = 0;
        while (i<= 10){
            System.out.println("i am the second example of runnable thread");
        i++;
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }
}class thread3 implements Runnable{
    @Override
    public void run(){
        int i = 0;
        while (i <= 10){
            System.out.println("i am the third example of runnable thread");
        i++;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


public class ByRunnableInterface {
    static void main() {

        Thread t3 = new Thread(new thread3());
        Thread t1 = new Thread(new thread());
        Thread t2 = new Thread(new thread2());
        t3.start();
        t1.start();  // the right method is start
        t2.start();    // but we can also use run method for calling the run method of the class


    }


}
