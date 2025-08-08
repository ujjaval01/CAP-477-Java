package string;

// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.
public class ValidPalindrome {
    @SuppressWarnings("unlikely-arg-type")
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama".toLowerCase();

        StringBuilder newString = new StringBuilder();
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <='z'){
                newString.append(ch);
            }
        }
        StringBuilder rev = new StringBuilder(newString.reverse());
        if ((newString.toString()).equals(rev.toString())) {
            System.out.println(newString + " is a palindrome");
        }else{
            System.out.println(newString + " is not a palindrome");
        }
        
    }

    

}
