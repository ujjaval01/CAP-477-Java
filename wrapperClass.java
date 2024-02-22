public class wrapperClass {
    public static void main(String[] args) {
        int i = 10;
        Integer in = new Integer(i); // boxing and wrapping
        int j = in.intValue();
        System.out.println(in);
        System.out.println(j);

    }
}