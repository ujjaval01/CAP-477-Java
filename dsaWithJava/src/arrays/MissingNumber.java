package arrays;

public class MissingNumber {
    static void main() {
        int[] arr = {3,0,1};
        long n = arr.length + 1;;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 0){
                 n = arr.length;
                 break;
            }
        }
        long sum = n*(n+1)/2;
        long arrSum = 0;
        for (int a: arr){
            arrSum += a;
        }
        System.out.println(sum-arrSum);

    }
}
