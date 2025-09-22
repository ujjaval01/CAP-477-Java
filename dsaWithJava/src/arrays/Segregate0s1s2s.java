package arrays;

public class Segregate0s1s2s {

    // two pass solution

    static void main(String[] args) {
        int[] arr = {1,1,0,1,0,2,0,2,2,2};
        int zeros = 0;
        int ones = 0;
        int twos = 0;
        for (int a : arr) {
            if (a == 0) zeros++;
            else if (a == 1)  ones++;
            else twos++;
        }
        System.out.println(zeros + " " + ones + " " + twos);
        for (int i = 0; i < zeros; i++){
            arr[i] = 0;
        }
        for(int i = zeros; i< zeros+ones; i++){
            arr[i] = 1;
        }
        for(int i = zeros+ones; i< arr.length; i++){
            arr[i] = 2;
        }
        for (int b : arr) {
            System.out.print(b + " ");
        }

    }
}
