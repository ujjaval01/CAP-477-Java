package arrays;

public class SearchElement {
    static void main() {
        int[] arr = {10,52,7,5,77,3,65,52,48,96};
        Boolean flag = false;
        int target = 52;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                flag = true;
                break;
            }
        }
        if(flag == true) System.out.println("Target exists");
        else System.out.println("Target not found");
    }
}
