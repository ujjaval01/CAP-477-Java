public class reverseString {
    public static void main(String[] args) {
        String str = "hello";
        StringBuilder rev =new StringBuilder();

        for(int i = str.length()-1; i >= 0; i--){
            rev.append(str.charAt(i));
        }
        System.out.println(rev);


    }
    
}
