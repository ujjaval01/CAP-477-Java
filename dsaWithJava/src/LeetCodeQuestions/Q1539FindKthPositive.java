package LeetCodeQuestions;

public class Q1539FindKthPositive {
    static void main() {
        int[] arr = {2,3,5,6,8,9};
        int k = 3;
        int res = find(arr, k);
        System.out.println(res);
    }
    static int find(int[] arr, int k){
        int  l = arr.length;
        int j = 1;
        int miss = 0;
        int count = 0;
        for(int i = 1; i < arr.length + 1; i++){
            if(arr[i-1] == j) j++;
            else{
                miss = j;
                count++;
                j++;
                i--;
                if(k == count) return miss;
            }
        }
        if(k > count){
            int n = k - count;
            return arr[l - 1] + n;
        }
        return -1;
    }
}
