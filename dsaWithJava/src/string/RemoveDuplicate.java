package string;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "Ujjaval".toLowerCase();
        String ans = "";
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);           
            if(ans.indexOf(ch) == -1){
                ans+=ch;
            }
        }
        System.out.println("Original String is: "+ str);
        System.out.println("After removing duplicates new string is: "+ans);
    }
}
