public class wrapperClass {
    public static void main(String[] args) {
        int i = 10;
        @SuppressWarnings("removal")
        Integer in = new Integer(i); // boxing and wrapping
        int j = in.intValue(); // unboxing
        System.out.println(in);
        System.out.println(j);

    }
}