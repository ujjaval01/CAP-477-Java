package arrays;

public class MissingNumber {
    static void main() {
        int[] arr = {3,0,1,4};
        int n = arr.length;
        int actualSum = n * (n+1)/2;
        int sum = 0;
        for(int e: arr){
            sum+=e;
        }
        int missing = actualSum - sum;
        System.out.println("Missing element is: " + missing);



//        long n = arr.length + 1;;
//        for(int i = 0; i<arr.length; i++){
//            if(arr[i] == 0){
//                 n = arr.length;
//                 break;
//            }
//        }
//        long sum = n*(n+1)/2;
//        long arrSum = 0;
//        for (int a: arr){
//            arrSum += a;
//        }
//        System.out.println(sum-arrSum);

    }
}
