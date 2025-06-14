public class practice {
    public static void main(String[] args) {
        int num = 371;
        int arm = 0, digit,temp;
        temp = num;
        while (num > 0) {
            digit = num % 10;
            num = num /10;
            arm = arm + digit*digit*digit;
        
        }
        if (arm == temp) {
            System.out.println("armstrong");
        }else{
            System.out.println("not armstrong");
        }
    }
}
