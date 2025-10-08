package SearchBinary;

public class peakIndexInMountainArray {
    static void main() {
        int[] arr = {1,2,3,8,4,3,2,1};
        int res = search(arr);
        System.out.println(res);



    }
        static int search(int[] arr) {
            int low = 1;
            int high = arr.length-2;
            while(low<=high){
                int mid = (low+high)/2;
                if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) return mid;
                else if(arr[mid] > arr[mid - 1] && arr[mid] < arr[mid+1]) low = mid + 1;
                else high = mid -1;
            }
            return 99;
        }
}
