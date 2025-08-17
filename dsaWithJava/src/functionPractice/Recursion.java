package functionPractice;

public class Recursion {

    static int fact(int n){
        if( n == 1 || n == 0){
            return 1;
        }
        else{
            // return n * fact(n-1);
            int mul = 1;
            for(int i = 1; i<= n; i++){
                mul*=i;
            }
            return mul;
        }
    }

 public static void main(String[] args) {
    System.out.println("fact of 5 is: " + fact(5));
    
 }   
}
