public class Main{
    static void main() {
       String s = "Greek6".toLowerCase();
       for(int i = 0; i <s.length(); i++){
           char ch = s.charAt(i);
           if(ch >= 'a' && ch<= 'z'){

           }else{
               if(s.length() == s.charAt(s.length()-1)){
                   System.out.println(s.length());
               }else{
                   System.out.println("kuch b");
               }
           }


       }


    }
}