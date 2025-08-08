package string;

public class CountVowelsAndConst {
    public static void main(String[] args) {
        String str = "Ujjaval".toLowerCase();
        int vowels = 0;
        int cons = 0;
        for(int i = 0; i< str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                    vowels++;
                }else{
                    cons++;
                }
            } 
        }
        System.out.println("Vowels: " + vowels + "\nconsonants:  " + cons);
    }
}
