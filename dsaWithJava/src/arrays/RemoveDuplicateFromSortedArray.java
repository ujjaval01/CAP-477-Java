package arrays;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 3, 4};

        int length = removeDuplicates(arr);

        System.out.println("After removing duplicates:");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nNew length: " + length);
    }

    static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;

        int i = 0; // points to last unique element

        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) { // new unique element found
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1; // new array length
    }
}
