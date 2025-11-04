package LeetCodeQuestions;

public class Q28FindTheIndexOfTheFirstOccurrenceInString {
    static void main() {
        String s = "leetcode";
        String t = "code";
        System.out.println(checkFirstOcc(s,t));

    }
    public static int checkFirstOcc(String s, String t){
        return s.indexOf(t);
//        int i = 0, j = 0;
//        while(i<s.length()){
//            if(s.charAt(i) == t.charAt(j)){
//                i++;
//                j++;
//                if(j == t.length()) return i - j;
//            }
//            else{
//                i = i - j + 1;
//                j = 0;
//            }
//        }
//        return -1;
    }
}
