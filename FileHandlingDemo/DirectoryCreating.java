package FileHandlingDemo;

import java.io.File;
import java.io.IOException;

public class DirectoryCreating {
    public static void main(String[] args) throws IOException {
        {
            File dir=new File("c:\\Addy\\Adnan\\Addu");
            dir.mkdirs();
            System.out.println("Folder or directors created");
           File files= new File("c:\\Addy\\Adnan\\Addu\\test.txt");
           files.createNewFile();
           System.out.println("New  file created in Addu dir");
        }
    }
}