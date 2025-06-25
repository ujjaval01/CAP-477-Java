public class LongestPalindromeBruteForce {
    public static void main(String[] args) {
        String str = "abc";
        String longest = "";
        if(str.length() == 1) {
            System.out.println(str.charAt(0) +" is the longest palindrome.");
        }else{
            for(int i = 0; i< str.length(); i++){
            // char ch = str.charAt(i);
                for(int j = i+1; j<str.length(); j++){
                    String sub = str.substring(i,j);

                    boolean isPalindrome = true;
                    int left = 0;
                    int right = sub.length()-1;
                    while (left < right) {
                        if(sub.charAt(left) != sub.charAt(right)){
                            isPalindrome = false;
                            break;
                        }
                        left++;
                        right--;
                    }
                    if (isPalindrome && sub.length() > longest.length()) {
                        longest = sub;
                    }
                    
                }
                
            }
            if (!longest.isEmpty()) {
                System.out.println(longest + " is a longest substring");
            }else{
                System.out.println("No substring found..");
            }
            
        }
        

    }
}
