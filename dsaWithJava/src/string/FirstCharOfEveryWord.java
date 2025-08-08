package string;

public class FirstCharOfEveryWord {
    public static void main(String[] args) {
        String str = "   M y NAME IS UJJAVAL SAINI";
        str = " " +  str;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' ' && str.charAt(i+1) != ' '){
                System.out.print(str.charAt(i+1) + " ");
            }
        }
    }

}
