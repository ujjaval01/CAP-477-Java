public class simpleClass {
    public String st;
    public int i;
    public float f;

    simpleClass() {
        this.st = "ujjaval";
    }

    public static void main(String args[]) {
        simpleClass sc = new simpleClass();
        String name = sc.st;

        System.out.println("Name: " + name);
        System.out.println("Default int value: " + sc.i);
        System.out.println("Default float value: " + sc.f);
    }

}
