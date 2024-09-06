public class string {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("ujjaval");
        System.out.println("Original String : " + str);
        
        // Appending a character to
        // the given string using append() method of StringBuffer class
        str.append('a');
        System.out.println("\nAfter appending 'a' : " + str);
        
        // Insertion of a character at any index
        // using insert() method of StringBuffer class
        int index = 2;
        char ch = 'l';
        str.insert(index, ch);
        System.out.println("\nAfter inserting 'l' at index 2 : " + str);
        
        // Removing a character from the specified index
        // using deleteCharAt() method of StringBuffer class
        index = 1;
        str.deleteCharAt(index);
        System.out.println("\nAfter deleting character at index 1 : " + str);
        
        // Replacing characters in a StringBuffer object
        // using replace() method of StringBuffer class
        String oldStr = "ujjal";
        String newStr = "ravi";
        int startIndex = 0;
        int endIndex = str.length();
        str.replace(startIndex, endIndex, oldStr, newStr);
        System.out.println("\nAfter replacing \"ujjal\" with \"ravi\" : " + str);
    }
}
