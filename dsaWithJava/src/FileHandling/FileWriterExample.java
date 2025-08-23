package FileHandling;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("C:\\Users\\ujjav\\Desktop\\newFile.txt", true);
            try{
                writer.write("This file is created using the file Handling");
            }
            finally {
                writer.close();
            }
            System.out.println("The data successfully written in the file..");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
