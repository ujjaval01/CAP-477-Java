package Recursion;

public class CountAndSay {
    static void main() {
        int n = 6;
        String ans = countAndSay(n);
        System.out.println(ans);
    }

    private static String countAndSay(int n) {
        if(n == 1) return "1";
        String s = countAndSay(n-1);
        StringBuilder ans = new StringBuilder();
        int i = 0, j = 0;
        while(j<s.length()){
            if(s.charAt(i) == s.charAt(j)) j++;
            else{
                int freq = j - i;
                ans.append(freq);
                ans.append(s.charAt(i));
                i = j;
            }
        }
        int freq = j - i;
        ans.append(freq);
        ans.append(s.charAt(i));
        return ans.toString();
    }
}
