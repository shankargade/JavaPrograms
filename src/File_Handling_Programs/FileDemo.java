package File_Handling_Programs;

import java.io.*;
import java.sql.SQLOutput;

public class FileDemo {
    public static void main(String[] args) {
        // We can create file if it not exists
        // Serialization
        // ObjectOutputStream
        // What we have do write employee data to file
// Write a program accept some strings from console and store it in file and display the same strings on
        // on console by reading the file


        try {
            File file = new File("C:\\Shankar\\demo.txt");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            String str = "Hello to All";
            byte byteArry [] = str.getBytes();
            fileOutputStream.write(byteArry);
            fileOutputStream.close();
            System.out.println("data written successfully");
            FileInputStream fileInputStream = new FileInputStream(file);
            while (0 !=fileInputStream.available())
            {
                int c = fileInputStream.read();
                System.out.print((char) c);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
