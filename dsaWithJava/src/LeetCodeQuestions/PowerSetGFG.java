package LeetCodeQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PowerSetGFG {
    static void main() {
        String s = "abc";
        System.out.println(subset(s));

    }
    public static List<String> subset(String s){
        List<String> list = new ArrayList<>();
        helper("", s, 0, list);
        Collections.sort(list);  // for lexicographical
        return list;
    }
    public static void helper(String ans, String s, int idx, List<String> list){
        if(idx == s.length()){
            if(ans.length()!= 0) list.add(ans);
            return;
        }
        char ch = s.charAt(idx);
        helper(ans+ch, s, idx+1, list); // pick
        helper(ans, s, idx+1, list);  // skip
    }
}
