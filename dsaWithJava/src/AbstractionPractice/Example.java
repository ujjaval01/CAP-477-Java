package AbstractionPractice;

/*
is program me ek khaas baat h, like hmne ek super class bnayi h cls1 k naam se jiske andr 2 abstract methods h
agr hum is class ko kisi aur class se inherit(extend) krte h to hum direct nhi kar skte, agr krna hi h to fir
hmare pass 2 options hote h
1. ya to us class ko hi abstract bna do jisse inherit kar rhe h
2. ya fir super class ke methods ko abstract bna ke(jo class inherit kregi) unko implement krna pdega

in these two, i thing is mandatory for archiving abstraction

 */

abstract class cls1{
    abstract public void meth1();
    abstract public void meth2(int a, int b);
}

class cls2 extends cls1{
    @Override
    public void meth1(){
        System.out.println("hello");
    }
    public void meth2(int a, int b){
        System.out.println(a+b);
    }
}

class cls3 extends cls1{
    public void show(){
        System.out.println("show method");
    }

    @Override
    public void meth1() {

    }

    @Override
    public void meth2(int a, int b) {

    }
}

public class Example{
    public static void main(String[] args) {
        cls2 c = new cls2();
        c.meth2(5,8);


    }
}
























































