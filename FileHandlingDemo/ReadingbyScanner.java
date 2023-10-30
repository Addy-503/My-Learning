package FileHandlingDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingbyScanner {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Addy\\test.txt"));
            String line;
            while (sc.hasNext()){
               line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
    } catch (FileNotFoundException e) {
           System.out.println("FileNotFoundException");
        }


    }
    }
