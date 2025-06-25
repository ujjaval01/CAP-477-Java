public class CompressString2 {
    public static void main(String[] args) {
        String str = "aaabbcccfddee";
        int count = 1;
        String ans = "";

        for(int i = 1; i< str.length(); i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);

            if(curr == prev){
                count++;
            }else{
                ans = ans + prev;
                if(count > 1) ans = ans+count;
                count = 1;
            }
            
        }

        ans = ans + str.charAt(str.length()-1);
        if(count>1) ans = ans + count; 
        

        System.out.println(ans);
    }
}
