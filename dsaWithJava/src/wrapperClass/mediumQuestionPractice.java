package wrapperClass;
/*🔹 Medium-Level Question

👉 Question:
Write a Java program that takes an array of String numbers:

String[] arr = {"10", "20", "30", "40", "50"};


Convert them into an array of Integer objects using wrapper classes, and then calculate the sum of all elements.*/
public class mediumQuestionPractice {
    static void main() {
        Integer sum = 0;
        int[] arr = {10, 20, 30, 40, 50};
        Integer len = new Integer(arr.length);  // convert the length in integer

        Integer[] intArr = new Integer[len];
        for(int i = 0; i< arr.length; i++){
            intArr[i] = Integer.valueOf(arr[i]);
        }
        for (Integer num: intArr){
            sum+=num;
        }
        System.out.println(sum);




    }
}
