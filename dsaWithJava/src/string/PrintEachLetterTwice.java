package string;

public class PrintEachLetterTwice {
    public static void main(String[] args) {
        // String str = "ujvl";
        // String ans = "";
        // for(int i = 1; i < str.length(); i++){
        //     char next = str.charAt(i);
        //     char prev = str.charAt(i-1);
        //     if(!(next == prev)){
        //         ans+= prev;
        //         ans+= prev;
        //         if (i == str.length()-1) {
        //             ans+= next;
        //             ans+= next;
        //         }
        //     }
        // }
       
        // System.out.println(ans);

        String str = "ujvl";
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            ans = ans.append(ch).append(ch);
        }
        System.out.println(ans);

    }
}
