public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "Ujjava l Sain i";
        String ans = "";
        for(int i = 0; i< str.length(); i++){
            if(str.charAt(i) != ' '){
                ans+= str.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
