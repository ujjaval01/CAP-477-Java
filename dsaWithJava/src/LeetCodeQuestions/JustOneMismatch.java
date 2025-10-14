package LeetCodeQuestions;
/*Given a string S and array of strings, find whether the array
 contains a string with one character different from the given string.
Example 1:
Input :
N = 4
arr[] = {"bana","apple","banaba","bonanzo"}
S = "banana"
Output :
True
Explanation:
banana and banaba has only one character
different.
Example 2:
Input:
N = 4
arr[] = {"bana","apple","banaba","bonanzo"}
S = "apple"
Output :
False
Explanation:
No string in arr differ by one
character from S
*/

public class JustOneMismatch {
    static void main() {
        String[] arr = {"bana","apple","banana","bonanzo"};
        String s = "banana";
        boolean b = found(arr, s);
        System.out.println(b);
    }
    static boolean found(String[] arr, String s){
        int count = 0;
        int k =0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i].length() == s.length()){
                for(int j = 0; j<s.length(); j++){
                    char ch1 = s.charAt(j);
                    char ch2 = arr[i].charAt(j);
                    if(ch2 != ch1){
                        count++;
                    }
                }
            }
        }
        if(count == 1) return true;
        else return false;
    }
}
