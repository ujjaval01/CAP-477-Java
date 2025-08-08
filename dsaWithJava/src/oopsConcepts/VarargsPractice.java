package oopsConcepts;

public class VarargsPractice {

    static int sum(int x, int ...arr){
        int result = x;
        for(int e: arr){
            result+=e;
        }
        return result;
        
    }

    public static void main(String[] args) {
      //  System.out.println("the value of a is : " + sum());
        System.out.println("the sum of tha value of a and b is "+ sum(4,5));
        System.out.println("the sum of tha value of a ,b and c is "+ sum(4,5,6));
        
    }
}
