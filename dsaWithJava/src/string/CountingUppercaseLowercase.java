package string;

public class CountingUppercaseLowercase {
    public static void main(String[] args) {
        String str = "UjjAVaL";
        int uppercase = 0;
        int lowercase = 0;
        for(int i = 0; i<=str.length()-1; i++){
            char c = str.charAt(i);
            if(c >= 65 && c<= 90){
                uppercase++;
            }else{
                lowercase++;
            }
        }
        System.out.println("uppercase: " + uppercase);
        System.out.println("lowercase: " + lowercase);
    }
}
