package oopsConcepts;

public class fabonaciSeries1 {

    static void fabo(int n){
        int first =0;
        int second = 1;
        int next;
        for(int i =0; i<=n; i++){
            System.out.print(first + " ");
            next = second + first;
            first = second;
            second = next;
        }

    }
    public static void main(String[] args) {
        fabo(5);
        
    }
}
