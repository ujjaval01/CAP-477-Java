package oopsConcepts;

import java.util.ArrayList;
import java.util.Arrays;

class Arraylist{
    int[] arr;
    int idx = 0;
    int size = 0;
    Arraylist(int capacity){
        arr = new int[capacity];
    }
    // Add ele....
    void add(int ele){
        if(idx == arr.length){
            int[] arr2 = new int[arr.length*2];
            for(int i = 0; i<arr.length; i++){
                arr2[i] = arr[i];
            }
            arr = arr2;
        }
        arr[idx] = ele;
        idx++;
        size++;
    }
    // Add ele in particular index....
    void add(int idx, int ele){
        arr[idx] = ele;
    }
    // Remove last element....
    void removeLast(){
        idx--;
        size--;
    }
    // Remove first element....
    void removeFirst(){
        int i = 0, j = 1;
        while(i<= idx){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j++;
        }
        removeLast();
    }
    // Get element....
    int get(int idx){
        return arr[idx];
    }
    // Get last ele...
    int getLast(){
        return arr[size-1];
    }
    // Get first ele...
    int getFirst(){
        return arr[0];
    }
//    //Sort array ele...
//    public static void sort(int[] arr){
//        int n = arr.length;
//        if(n == 1) return;
//        int[] a = new int[n/2];
//        int[] b = new int[n-n/2];
//        int idx = 0;
//        for(int i = 0; i<a.length; i++) a[i] = arr[idx++];
//        for(int i = 0; i<b.length; i++) b[i] = arr[idx++];
//        sort(a);
//        sort(b);
//        merge(a,b,arr);
//    }
//    private static void merge(int[] a, int[] b, int[] c) {
//        int i = 0, j = 0, k = 0;
//        while(i<a.length && j < b.length){
//            if(a[i] <= b[j]) c[k++] = a[i++];
//            else  c[k++] = b[j++];
//        }
//        while (i<a.length) c[k++] = a[i++];
//        while (j<b.length) c[k++] = b[j++];
//    }

    // Display ele....
    void display(){
        for (int i = 0; i< size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


}

public class OwnArrayList {
    static void main() {
        Arraylist arr = new Arraylist(3);
        ArrayList<Integer> al = new ArrayList<>();
//        al.

        arr.add(10); arr.add(20); arr.add(30); arr.add(40); arr.add(10); arr.add(20); arr.add(30); arr.add(40);
//        arr.add(1, 90);
        System.out.println("Size: " + arr.size);
        arr.display();
//        arr.removeLast();
//        arr.display();
//        arr.removeFirst();
//        arr.display();
//        System.out.println(arr.get(2));
//        System.out.println(arr.getFirst());
//        System.out.println(arr.getLast());
//        arr.sort();
//        arr.display();



    }
}
