package inheritancePractice;

class Phone{
    void showTime(){
        System.out.println("time is showing...");
    }
    void on(){
        System.out.println("turning on...");
    }
}
class SmartPhone extends Phone{
    void music(){
        System.out.println("music playing...");
    }
    void video(){
        System.out.println("video playing...");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Phone p = new SmartPhone();
        p.on();
        p.showTime();

    }
}
