public class string {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("ujjaval");
        System.out.println("Original String : " + str);
        
        // Appending a character
        str.append('a');
        System.out.println("\nAfter appending 'a' : " + str);
        
        // Inserting a character at index 2
        int index = 2;
        char ch = 'l';
        str.insert(index, ch);
        System.out.println("\nAfter inserting 'l' at index 2 : " + str);
        
        // Deleting character at index 1
        index = 1;
        str.deleteCharAt(index);
        System.out.println("\nAfter deleting character at index 1 : " + str);
        
        // Replacing full string with "ravi"
        str.replace(0, str.length(), "ravi");
        System.out.println("\nAfter replacing content with \"ravi\" : " + str);
    }
}
// Output:
// Original String : ujjaval    
// After appending 'a' : ujjavala
// After inserting 'l' at index 2 : ujljavala
// After deleting character at index 1 : ujjavala
// After replacing content with "ravi" : ravi
// Note: The output may vary based on the initial string and operations performed.
// StringBuffer is mutable, meaning it can be modified without creating a new object.
// StringBuffer is synchronized, making it thread-safe.
// This is useful for performance when making multiple modifications to a string.
