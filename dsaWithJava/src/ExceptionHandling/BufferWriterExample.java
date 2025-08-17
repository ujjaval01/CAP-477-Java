package ExceptionHandling;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterExample {
    public static void main(String[] args) {
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\ujjav\\Desktop\\BufferWriterExample.txt"));
            try{
                bw.write("i am the example of BufferWriter");
                bw.newLine();
                bw.write("my name is ujjaval saini");
                bw.newLine();
                bw.append("and i have done mca from LPU");
            }
            finally {
                bw.close();
            }
            System.out.println("File successfully created using BufferWriter");
        }
        catch (IOException e){
            System.out.println(e);
        }

    }
}
