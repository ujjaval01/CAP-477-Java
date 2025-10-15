package SearchBinary;
/* LC - 74. Search a 2D Matrix
Given a strictly sorted 2D matrix mat[][] of size n x m and a number x. Find whether the number x is present in the matrix or not.
Note: In a strictly sorted matrix, each row is sorted in strictly increasing order, and the first element of the ith row (i!=0) is
greater than the last element of the (i-1)th row.
Examples:
Input: mat[][] = [[1, 5, 9], [14, 20, 21], [30, 34, 43]], x = 14
Output: true
Explanation: 14 is present in the matrix, so output is true.
Input: mat[][] = [[1, 5, 9, 11], [14, 20, 21, 26], [30, 34, 43, 50]], x = 42
Output: false
Explanation: 42 is not present in the matrix.
*/
public class searchAnElementInSortedMatrix {
    static void main(String[] args) {
        int[][] arr =  {{1, 5, 9}, {14, 20, 21}, {30, 34, 43}};
        int tar = 34;  // present
//        int tar = 3;  // not present
        boolean found = searchMatrix(arr, tar);
        System.out.println(found);

    }
    static boolean searchMatrix(int[][] arr, int tar) {
        // code here
        int rows = arr.length;
        int cols = arr[0].length;
        int low = 0;
        int high = rows*cols - 1;
        while(low<=high){
            int mid = (low + high)/2;
            int midRow = mid/cols;
            int midCol = mid%cols;
            if(arr[midRow][midCol] == tar) return true;
            else if(arr[midRow][midCol] > tar) high = mid -1;
            else low = mid+ 1;
        }
        return false;

    }
}
