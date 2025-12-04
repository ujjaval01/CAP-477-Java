package LeetCodeQuestions;

public class MoveAllZerosInTheEnd {
    static void main() {
        int[] arr = {0,1,0,2,3,0,5};
        int i = 0, j = 0;
        while(i<arr.length){
            if(arr[i] == 0) i++;
            else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
                i++;
            }
        }
        for(int r: arr){
            System.out.print(r + " ");
        }
    }
}
