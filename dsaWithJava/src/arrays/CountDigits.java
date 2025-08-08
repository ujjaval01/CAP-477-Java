class CountDigit{
    public static void main(String[] args) {
      int num = 1234;
      int digit = 0;
      while(num>0){
          num = num /10;
          digit ++;
      }
        System.out.println("the digit in the number is " + digit);
    }
}