package LeetCodeQuestions;

public class Q796RotateString {
    static void main() {
        String s = "abcde";
        String goal = "cdeab";
        boolean b = check(s,goal);
        System.out.println(b);
    }
    static boolean check(String s, String goal){
        if(s.length() != goal.length()) return false;
        String newString = s+s;
        return newString.contains(goal);
    }
}
