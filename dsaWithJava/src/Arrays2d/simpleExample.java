package Arrays2d;

import java.util.Scanner;

public class simpleExample {
    static void main() {// 0 1 2
//        int[][] arr = {   {1,2,3},  //0
//                          {4,5,6},  //1
//                          {7,8,9}}; //2
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows value: ");
        int rows = sc.nextInt();
        System.out.print("Enter cols value: ");
        int cols = sc.nextInt();
        int[][] nums = new int[rows][cols];

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
//                System.out.print("Enter " + i + "," + j + " element: ");
                nums[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }



    }
}
