package LeetCodeQuestions;

import javax.print.*;
import java.io.*;

public class PrintText {
    public static void main(String[] args) throws Exception {

        // Step 1: Printable content create karo
        String message = "Hello World from Java!";
        InputStream textStream = new ByteArrayInputStream(message.getBytes());

        // Step 2: Document flavor define karo (plain text)
        DocFlavor flavor = DocFlavor.INPUT_STREAM.AUTOSENSE;

        // Step 3: Default printer lo
        PrintService service = PrintServiceLookup.lookupDefaultPrintService();

        if (service == null) {
            System.out.println("No printer found!");
            return;
        }

        // Step 4: Print job banao
        DocPrintJob job = service.createPrintJob();

        // Step 5: Document create karo
        Doc doc = new SimpleDoc(textStream, flavor, null);

        // Step 6: Print job execute karo
        job.print(doc, null);

        System.out.println("Print job sent successfully to printer: " + service.getName());
    }
}
