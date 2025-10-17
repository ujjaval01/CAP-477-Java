package SearchBinary;

public class SearchElementInSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 5, 9}, {14, 20, 21}, {30, 34, 43}};
        int tar = 34;  // present
        // int tar = 3;   // not present

        boolean found = searchMatrix(arr, tar);
        System.out.println(found);
    }

    static boolean searchMatrix(int[][] arr, int target) {
        int n = arr.length;
        int m = arr[0].length;

        int row = 0;       // start from first row
        int col = m - 1;   // start from last column (top-right corner)

        while (row < n && col >= 0) {
            if (arr[row][col] == target) {
                return true;
            } else if (arr[row][col] > target) {
                col--;     // move left
            } else {
                row++;     // move down
            }
        }
        return false;
    }
}
