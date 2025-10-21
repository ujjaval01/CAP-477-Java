package string;

public class SwapFirstAndLstWordAndRevMidWord {
    static void main() {
        String s = "I LOVE YOU VANSHIKA";
               //   1   2   3     4
        String[] words = s.split(" ");
        String temp = words[0];
        words[0] = words[words.length-1];
        words[words.length-1] = temp;

        int mid = (words.length-1)/2;
        String midWord = words[mid];
        StringBuilder sb = new StringBuilder(midWord);
        sb.reverse();

        words[mid] = sb.toString();


        for(String ele: words){
            System.out.print(ele + " ");
        }

    }
}
