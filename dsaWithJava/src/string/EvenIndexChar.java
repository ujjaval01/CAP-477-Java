package string;

public class EvenIndexChar {
    public static void main(String[] args) {
        String str = "Ujjaval saini";
        for(int i = 0; i < str.length(); i++){
            if (i % 2 == 0 ) {
                System.out.println(str.charAt(i) + " -> "+ i);
            }
        }
    }
}
