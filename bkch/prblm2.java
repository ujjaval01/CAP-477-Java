package bkch;

public class prblm2 {

    public static void main(String[] args) {
        
    
    int m = 5;
    int n = 5;
    for (int i = 1; i < m + 1; i++) {
    for (int j = 1; j < n + 1; j++) {
    if (i + j > n) {
    System.out.print("*");
    } else {
    System.out.print(" ");
    }
    }
    System.out.println();
    }
}
    
}
