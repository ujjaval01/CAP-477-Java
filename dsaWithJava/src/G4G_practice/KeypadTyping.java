package G4G_practice;

import static G4G_practice.Solution.printNumber;

public class KeypadTyping {
    static void main() {
        System.out.println(printNumber("u", 1));

    }

}


// User function Template for Java
class Solution {
    // Function to find matching decimal representation of a string as on the keypad.
    public static String printNumber(String s, int n) {
        // Your code here

        int res = 0;
        for(int i = 0; i <n; i++){
            char ch = s.charAt(i);
            if(ch < 96 || ch > 100){
                res = res*10 + 2;
            }else if(ch >= 100 || ch <= 102){
                res = res*10 + 3;
            }else if(ch >= 103 || ch <= 105){
                res = res*10 + 4;
            }else if(ch >= 106 || ch <= 108){
                res = res*10 + 5;
            }else if(ch >= 109 || ch <= 111){
                res = res*10 + 6;
            }else if(ch >= 112 || ch <= 115){
                res = res*10 + 7;
            }else if(ch >= 116 || ch <= 118){
                res = res*10 + 8;
            }else if(ch >= 119 || ch <= 122){
                res = res*10 + 9;
            }
        }
        return String.valueOf(res);
    }
}