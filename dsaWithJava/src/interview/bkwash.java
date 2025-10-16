package interview;

public class bkwash {
    static void main() {
        String s = "38293367";
        String res = findMax(s);
        System.out.println(res);
    }
    static String findMax(String s) {
        // code here
        // 49 - 59
        //  0 - 9
        // N = "38293367"
        int max = 0;    //9
        int idx = -1;
        StringBuilder n = new StringBuilder(s);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            for(int j = 0; j<s.length(); j++){
                char ch = s.charAt(j);   // 3
                if((int)ch > 0){
                    max = (ch);

                }
            }
            sb.insert(i, max);
            max = 0;
            n.deleteCharAt(i);


        }
        return "saini";
    }
}
