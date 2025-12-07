package LeetCodeQuestions;

public class Q1523CountOddNumbersInAnIntervalRange {
    public static int countOdds(int low, int high) {
        if(low %2 == 0 && high %2 == 0){
            return (high - low)/2;
        }else{
            return (high - low)/2 + 1;
        }
    }
    static void main() {
        int low = 2;
        int high = 11;
        System.out.println(countOdds(low,high));
    }
}
