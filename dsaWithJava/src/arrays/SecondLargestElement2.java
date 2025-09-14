package arrays;

public class SecondLargestElement2 {
    static void main() {
        int[] arr = {8,4,9,5,9,6, 8,1,3,7};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int num: arr){
            if (num > max){
                secondMax = max;
                max = num;
            }else if(num > secondMax && num!= max){
                secondMax = num;
            }
        }
        System.out.println(secondMax);

    }
}
