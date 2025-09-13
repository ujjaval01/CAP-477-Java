package arrays;

public class TwoSum {
    static void main() {
        int[] arr = {1,5,8,-3};
        int targetSum = 2;
        for (int i = 0; i< arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == targetSum){
                    System.out.println("Sum found:- " + arr[i] + " + " + arr[j] + " = " + targetSum);
                }
            }
        }
    }
}
