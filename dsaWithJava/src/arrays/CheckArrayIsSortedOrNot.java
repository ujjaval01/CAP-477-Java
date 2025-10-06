package arrays;

public class CheckArrayIsSortedOrNot {
    static void main() {
        boolean flag = true;
        int[] arr = {1,2,4,4,5,8};
        for(int i = 0; i< arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                flag = false;
                break;
            }
        }
        if(flag) System.out.println("sorted");
        else System.out.println("Not sorted");
    }
}
