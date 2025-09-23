package string;

/*Given a string s consisting of lowercase english letters, arrange all its letters in lexicographical order using Counting Sort.

Examples:

Input: s = "edsab"
Output: abdes
Explanation: In lexicographical order, s will be abdes.
Input: s = "geeksforgeeks"
Output: eeeefggkkorss
Explanation:In lexicographical order, s will be eeeefggkkorss.
Constraints:
1 ≤ s.size() ≤ 105

class Solution {
    public static String countSort(String s) {
        // code here
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i <sb.length() -1 ; i++){
            for(int j = 0; j< sb.length()-1; j++){
                char c = sb.charAt(j);
                char d = sb.charAt(j+1);
                if(c > d){
                 char t = c;
                 c = d;
                 d = t;
                }
            }
        }
        String str = String.valueOf(sb);
        return str;
    }
}

*/

public class gfgQuestion {
}
