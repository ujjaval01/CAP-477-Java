package FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:\\Users\\ujjav\\Desktop\\newFile.txt");
            try{
                int i;
                while ((i = fr.read()) != -1){
                    System.out.print((char)i);
                }
            } finally {
                fr.close();
            }
            System.out.println("\nfile read successfully");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
