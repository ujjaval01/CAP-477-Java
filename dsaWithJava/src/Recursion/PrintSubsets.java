package Recursion;

public class PrintSubsets {
    static void main() {
        String s = "abc";
        subsets("", s, 0);
    }
    public static void subsets(String ans, String s, int idx){
        if(idx == s.length()){
            System.out.print(ans + " ");
            return;
        }
        char ch = s.charAt(idx);
        subsets(ans+ch, s, idx+1); // pick
        subsets(ans, s, idx+1);  // skip
    }
}
