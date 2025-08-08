package oopsConcepts;

public class FunctionPractice {

    // static int change(int a){
    //     System.out.println("change funtion" + a);
    //     a = 8;
    //     return a;
    // }

    static void change(int arr[]){
        int l = arr.length;
        int arr2[] = new int[l];
        for(int i =0 ; i<l; i++){
            arr2[i] = arr[i] + 1;
        }
        for(int element: arr2){
            System.out.println(element);
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        change(arr);
        

       

        // change(x);
        
    }
}
