package arrays;

public class MaxElement {
    static void main() {
        int[] arr = {5,8,4,7,9,11,2,3};
        int max = Integer.MIN_VALUE;
        for(int e: arr){
            if (e > max){
                max = e;
            }
        }
        System.out.println(max);
    }
}
