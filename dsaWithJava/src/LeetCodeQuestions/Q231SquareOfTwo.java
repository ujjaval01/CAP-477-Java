package LeetCodeQuestions;

public class Q231SquareOfTwo {
    public static void main(String[] args){
        int n = 64;
        boolean b = check(n);
        System.out.println(b);

    }
    static boolean check(int n){
        if(n <= 0) return false;
        int i = 1;
        while(i<n){
            i = i*2;
        }
        return i == n;


//        if(n == 0) return true;
//        if(n == 2) return true;
//        if(n%2 != 0) return false;
//        for(int i = 2; i<= n; i*=2){  //  i = 2,4,8,16
//            int j = i*2; //               j = 4,8,16
//                           //           i = i*2-> 2*2 = 4, 4*2 = 8, 8*2 = 16
//            if(j==n) return true;//       4, 8 , 16,
//        }
//        return false;
    }
}
