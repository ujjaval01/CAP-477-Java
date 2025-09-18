package arrays;

public class Wave {
    static void main() {
        int[] arr = {2,4,7,8,9,10};    // 2 1 4 3 5
        for(int i = 1; i < arr.length; i++){
            int temp = arr[i-1];
            arr[i-1] = arr[i];
            arr[i] = temp;
            i++;

        }
        for(int a:arr){
            System.out.print(a +" ");
        }
    }
}
