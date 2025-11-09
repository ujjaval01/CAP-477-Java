package LeetCodeQuestions;

public class Q2169CountOperationstoObtainZero {
    static void main() {
        int num1 = 5, num2 = 4;
        int ans = countOperations(num1,num2);
        System.out.println(ans);

    }
    public static int countOperations(int num1, int num2) {
        return helper(num1, num2, 0);
        // This is optimized with 1ms
        // // if(num1 == num2) return 1;
        // while(num1 > 0 && num2 > 0){
        //     if(num1 >= num2){
        //         num1 = num1-num2;
        //         count++;
        //     }else{
        //         num2 = num2-num1;
        //         count++;
        //     }
        // }
        // return count;
    }

    // This is too less optimized with 6ms
    public static int helper(int num1, int num2, int count){
        if(num1 == 0 || num2 == 0){
            return count;
        }
        if(num1 >= num2){
            return helper(num1-num2, num2, count+1);
        }else{
            return helper(num1, num2-num1, count+1);
        }
    }


//    public static int countOperations(int num1, int num2) {
//        // THIS IS MORE OPTIMIZED SOLUTION WITH 0ms
//        int count = 0;
//        while (num1 != 0 && num2 != 0) {
//            if (num1 >= num2) {
//                count += num1 / num2;  // how many full subtractions can be done
//                num1 = num1 % num2;    // remainder after all those subtractions
//            } else {
//                count += num2 / num1;
//                num2 = num2 % num1;
//            }
//        }
//        return count;
//    }
}
