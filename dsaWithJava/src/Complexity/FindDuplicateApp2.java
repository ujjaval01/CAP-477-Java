package Complexity;

public class FindDuplicateApp2 {
    static void main() {
        int[] arr = {5,1,3,4,2,4};
        for(int i = 0; i< arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println("Duplicate found...");
                }
            }
        }
    }
}
