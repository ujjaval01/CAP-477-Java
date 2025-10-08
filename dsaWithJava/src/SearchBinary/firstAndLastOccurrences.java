package SearchBinary;

import java.util.ArrayList;

public class firstAndLastOccurrences {
    static void main() {
        int[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int k = 5;
        ArrayList<Integer> integers = find(arr, k);
        System.out.println(integers);

    }


    // User function Template for Java
    static ArrayList<Integer> find(int[] arr, int k) {
        // code here
        int n = arr.length;

        //first occurrence.....
        int low = 0;
        int high = n-1;
        int idx1 = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == k){
                idx1 = mid;
                high = mid-1;
            }
            else if(arr[mid] > k) high = mid-1;
            else low = mid + 1;
        }

        //last occurrrence
        low = 0;
        high = n-1;
        int idx2 = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == k){
                idx2 = mid;
                low = mid+1;
            }
            else if(arr[mid] > k) high = mid-1;
            else low = mid + 1;
        }
        ArrayList<Integer> res = new ArrayList<>();
        res.add(idx1);
        res.add(idx2);
        return res;

    }


}
