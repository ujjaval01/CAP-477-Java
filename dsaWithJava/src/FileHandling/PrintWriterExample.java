package FileHandling;

import java.io.PrintWriter;

public class PrintWriterExample {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("C:\\Users\\ujjav\\Desktop\\PrintWriterExample.txt");
            try{
                pw.println("i am the example of PrintWriter");

            }finally {
                pw.close();
            }
            System.out.println("file created successfully using printWriter");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
