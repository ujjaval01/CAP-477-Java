package arrays;

public class Segregate0sAnd1sOptimized {
    static void main() {
        int[] arr = {1,1,0,0,0,1,1,0,0,0};
        int n = arr.length;
        int i =0;
        int j = n-1;
        while(i<j){
            if(arr[i] == 0) i++;
            else if (arr[j] == 1) j--;
            else if(arr[i] != 0 && arr[j] != 1){
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
        for(int a: arr){
            System.out.print(a + " ");
        }

    }
}
