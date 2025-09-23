package Complexity;

public class FindDuplicateApp3 {
    static void main() {
        int[] arr = {5,1,3,4,2,4};
        int n = arr.length -1;
        int arrSum = 0;
        for(int s: arr){
            arrSum = arrSum+s;
        }

        int sum1toN = (n * (n + 1)) / 2;
        int duplicate = arrSum - sum1toN;
        System.out.println(duplicate);


    }
}
