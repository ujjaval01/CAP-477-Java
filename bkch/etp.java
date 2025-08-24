import java.util.Scanner;
public class etp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if((year == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year + " Leap year");
        }
        else{
            System.out.println(year + " Not a leap year");
        }
        
    }
}