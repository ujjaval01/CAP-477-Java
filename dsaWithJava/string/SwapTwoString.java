public class SwapTwoString {
    public static void main(String[] args) {
        String str1 = "ujvl";  //ln- 4
        String str2 = "vnsi";  //ln- 4
        
        // String temp = str1;
        // str1 = str2;
        // str2 = temp;

        str1 = str1 + str2;   // ujvlvnsi -> ln- 8
        str2 = str1.substring(0, str1.length() - str2.length());
        // strt printing index 0 to 4 ( 8 - 4 ).. -> ujvl, which storing ujvl in str2
        str1 =  str1.substring(str2.length());
        // strt printing index 4 to end tk -> vnsi, which storing vnsi in the str1
        
        System.out.println("after swaping: ");



        System.out.println(str1+ "\n" + str2);

    }
}
