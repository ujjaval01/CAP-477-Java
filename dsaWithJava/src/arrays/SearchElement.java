package arrays;

public class SearchElement {
    static void main() {
        int[] arr = {10,52,7,5,77,3,65,52,48,96};
        boolean flag = false;
        int target = 96;
        int indexOf = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                flag = true;
                indexOf = i;
                break;
            }
        }
        if(flag) System.out.println("Target exists at the index of " + indexOf);
        else System.out.println("Target not found");
    }
}
