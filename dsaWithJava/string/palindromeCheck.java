public class palindromeCheck {
    public static void main(String[] args) {
        // String str = "MADAM";
        // String rev = "";
        // for(int i = str.length()-1; i >= 0; i--){
        //     rev+= str.charAt(i);
        // }
        // if (str.equals(rev)) {
        //     System.out.println("The String is Palindrome");
        // }else{
        //     System.out.println("The String is not Palindrome");
        // }

         StringBuilder sb = new StringBuilder("MADAM");
         StringBuilder rev = sb.reverse();
         if (sb.equals(rev)) {
             System.out.println("The String is Palindrome");
         }else{
             System.out.println("The String is not Palindrome");
         }

       
        
    }
}
