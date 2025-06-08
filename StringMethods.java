public class StringMethods {
    public static void main(String[] args) {
        String name = "ujjaval";
        /*string methods: 
        1. equals
        2.equalsIgnoreCase
        3.length
        4.charAt(1): iska use hm tb krte hai jb hme string se ek character chye
        5.indexOf(u): '    '   '  '   '   '   ' ' ' string se char ki position jaanni ho
        6. toUprcse/lowerCase
        trim():- remove unnessasry space("    ujjaval    ")
        */

       // boolean result =  name.equalsIgnoreCase("Ujjaval");
      // int result = name.length();
      // String result = name.concat(" Saini");
      //   boolean result =  name.isEmpty();

      String result = name.replace("val", "valsaini");
        

        System.out.println(result);


    }
}
