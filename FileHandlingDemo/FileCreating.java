package FileHandlingDemo;

import java.io.File;
import java.io.IOException;

public class FileCreating {
    public static void main(String[] args) throws IOException {
      //  To create a file in the project ,we have to write the below code or we can give path by using backward slash "\\".

        {
            File newfile = new File("C:\\Testing\\test.txt");

            newfile.createNewFile();
            System.out.println("File created in a project");

        }

    }
}