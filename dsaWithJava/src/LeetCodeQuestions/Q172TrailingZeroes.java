package LeetCodeQuestions;

public class Q172TrealingZeros {
    static void main() {
        int n = 125;
        int ans = trailingZeroes(n);
        System.out.println(ans);


    }
    static int trailingZeroes(int n) {
       int count = 0;
       while(n>0){
           n = n/5;
           count = count + n;
       }

       return count;
    }

}
