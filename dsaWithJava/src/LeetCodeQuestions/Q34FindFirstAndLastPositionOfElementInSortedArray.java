package LeetCodeQuestions;

public class Q34FindFirstAndLastPositionOfElementInSortedArray {
    static void main() {
        int[] arr = {1,2,3,3,3,4,5,5,6,7,7};
        int tar = 3;
        int[] res = searchRange(arr, tar);
        for(int i: res){
            System.out.print(i + " ");
        }
    }
    public static int[] searchRange(int[] arr, int tar) {
        int[] res = {-1, -1};
        res[0] = firstOcc(arr, tar);
        res[1] = lastOcc(arr, tar);
        return res;
    }

    private static int firstOcc(int[] arr, int tar) {
        int l = 0, r = arr.length - 1;
        int ans = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == tar) {
                ans = mid;
                r = mid - 1; // left search
            } else if (arr[mid] < tar) {
                l = mid + 1;
            } else {
                r = mid - 1;
             }
        }
        return ans;
    }

    private static int lastOcc(int[] arr, int tar) {
        int l = 0, r = arr.length - 1;
        int ans = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == tar) {
                ans = mid;
                l = mid + 1; // right search
            } else if (arr[mid] < tar) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
}
