package LeetCodeQuestions;

public class Q3658L {
    static void main() {
        int n = 4;
        int res = gcdOfOddEvenSums(n);
        System.out.println(res);
    }

    public static int gcd(int a, int b){
        if(b > a){
            gcd(b,a);
        }
        while (b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int gcdOfOddEvenSums(int n) {
        int sumOdd = 0;
        int sumEven = 0;
        for(int i = 1; i <= n*2; i++){
            if(i%2 == 0){
                sumEven = sumEven + i;
//                System.out.println("even " + sumEven);
            }
            else{
                sumOdd = sumOdd + i;
//                System.out.println("odd " +  sumOdd);
            }
        }
//        System.out.println(sumEven);
//        System.out.println(sumOdd);
        return gcd(sumOdd, sumEven);
    }
}
