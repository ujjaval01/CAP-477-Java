package arrays;

public class RotateArrayOnePositionOptimized {
    static void main() {

    }
}

class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) return;

        k = k % n; // agar k > n ho to handle kare

        // Step 1: Reverse full array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse first k elements
        reverse(arr, 0, k - 1);

        // Step 3: Reverse remaining elements
        reverse(arr, k, n - 1);
    }

    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

