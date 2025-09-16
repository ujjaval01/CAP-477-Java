package arrays;

public class MissingNumber {
    static void main() {
        int[] arr = {1,2,3,4,6,7,8};
        long n = arr.length + 1;
        long sum = n*(n+1)/2;
        long arrSum = 0;
        for (int a: arr){
            arrSum += a;
        }
        System.out.println(sum-arrSum);

    }
}
