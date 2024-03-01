import java.util.*;
public class loops{
    public static void main(String[] args) {
        try (//printing a table of any number 
        Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int j = sc.nextInt();

            // //for loop
            // //int j = 5;
            // for(int i = 1; i<=10; i++){
            //     System.out.println(j+ "*" +  i + " = " +j*i);
            // }

            //while loop

        //     int i=1;
        //     while(i<=10){
        //         System.out.println(j+ "*" +  i + " = " +j*i);
        //         i++;
        //     }
        // }

        //Do While loop
        //  int i = 2;
        // do{
        //     System.out.println(j+ "*" +  i + " = " +j*i);
        //     i++;
        // }while(i<=3);


        //sum of natural/odd/even number using for loop

        int sum =0;
        for(int i = 1; i<=j; i++){
            if(i%2==0){
                
            }else{
                sum = sum+i;
            }
        }
        System.out.println(sum);




    }
}
}