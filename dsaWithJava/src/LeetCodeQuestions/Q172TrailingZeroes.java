package LeetCodeQuestions;

public class Q172TrailingZeroes {
    static void main() {
        int n = 125;
        int ans = trailingZeroes(n);
        System.out.println(ans);
    }
    static int trailingZeroes(int n) {
       int count = 0;
       while(n>0){
           n/=5;
           count += n;
       }
       return count;
    }
}
