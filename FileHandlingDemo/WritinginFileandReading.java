package FileHandlingDemo;

import java.io.*;

public class WritinginFileandReading {
    public static void main(String[] args) {
        {
            File directory = new File("Addy");
            directory.mkdir();
            File file = new File("Addy\\test.txt");

            try (BufferedWriter wr = new BufferedWriter(new FileWriter(file))) {
                wr.write("Addy");
                wr.newLine();
                wr.write("Rizwan");
                wr.newLine();
                wr.write("Shoaib");
                wr.newLine();
                wr.write("Sanju");
                System.out.println("Creating a file and writing in it");
                wr.close();
            } catch (IOException e) {
                System.out.println("error occured");
            }
            try {
                BufferedReader br = new BufferedReader(new FileReader("Addy\\test.txt"));
                String line;
                while ((line = br.readLine()) != null){
                    System.out.println(line);
                }
               br.close();
            } catch (FileNotFoundException e) {
              System.out.println("FileNotFoundException");
            } catch (IOException e) {
               System.out.println("IOException");
            }
        }
    }
}