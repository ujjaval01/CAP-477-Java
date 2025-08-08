package string;

public class UniqueChar {
   public static void main(String[] args) {
    String str = "ujj@va| s2@/>i".toLowerCase();
    for(int i = 0; i< str.length(); i++){
        char ch = str.charAt(i);
        if (!Character.isLetterOrDigit(ch) && ch != ' ') {
        // if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9') || ch == ' ')) {
            System.out.print(ch + " ");
            }
        } 
    }
}
