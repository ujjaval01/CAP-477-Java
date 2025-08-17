package staticAndInstanceBlockPractice;

class example{
    static {                    // static block need static keyword to declare
                                // run only once when the class load in the string time
        System.out.println("i am static method");
    }

    {                          // instance block no need to write any keyword to declare instance block
                                // execute every time when the object created.
        System.out.println("i am the instance block");
    }

}

public class StaticAndInstanceBlock {
    public static void main(String[] args) {
        example e = new example();
        example f = new example();


/*   OUTPUT
i am static method
i am the instance block
i am the instance block
*/


    }
}
