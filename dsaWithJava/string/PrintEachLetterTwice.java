public class PrintEachLetterTwice {
    public static void main(String[] args) {
        String str = "ujvl";
        String ans = "";
        for(int i = 1; i < str.length(); i++){
            char next = str.charAt(i);
            char prev = str.charAt(i-1);
            if(!(next == prev)){
                ans+= prev;
                ans+= prev;
            }
        }
       
        System.out.println(ans);
    }
}
