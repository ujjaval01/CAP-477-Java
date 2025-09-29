package SortSelection;

class GfG {
    public static void sortArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            int minIndex = i;
            for(int j = i+1; j<n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }






    static void main() {
        int[] arr = {64,22,25,12,18};
        System.out.print("Original array: ");
        for(int e: arr){
            System.out.print(e + " ");
        }
        System.out.println();

        sortArray(arr);
        System.out.print("Sorted array: ");
        for(int e: arr){
            System.out.print(e + " ");
        }

    }
}