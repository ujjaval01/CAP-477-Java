package wrapperClass;

public class wrapperClassEx {
    static void main(String[] args) {
        // Autoboxing- int to Integer, Boolean to boolean
        Integer a = 12;
        Integer b = new Integer(12);
        Integer c = Integer.valueOf("15");
        System.out.println(c * 4);

        /* unboxing- Integer to int, Boolean to boolean */
        int d = c;
        System.out.println(d);
    }

}
