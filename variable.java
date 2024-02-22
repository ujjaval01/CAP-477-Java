public class variable {

    static int var1 = 15; // static variable

    void method() {
        int var1 = 16; // local variable
    }

    public static void main(String args[]) {
        // int var1 = 10; //main variable or instant variable
        System.out.println(var1);

        // widening variable..(converting lower dataType in a higher data type)
        int a = 5;
        float b = a;
        System.out.println("widening " + b);

        // narrowing typecasting(reducing higher dataType into a lower dataType)
        float j = 10.9f;
        // int k = j; //compileTime Error
        int k = (int) j;
        System.out.println("Narrow " + k);

        // adding Lower Type
        byte l = 10;
        byte m = 20;
        // byte c = l+m; //compileTime error
        byte c = (byte) (l + m);
        System.out.println("lower to higher " + c);

        String sc = "ujjaval";
        System.out.println(sc + " " + "saini");
    }

}
