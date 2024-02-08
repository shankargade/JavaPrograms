package File_Handling_Programs;

import java.io.*;

public class Serializedemo {

    // Write the data
    public static void main(String[] args) {


        FileOutputStream fileOutputStream;

        {
        /*    develop(irpass) --> 6 commits

            b1 -->branch -->monday --> -->friday -->recycle -->rebase --> PR -->conflicts -->ABC -->*/
            // SVN
            // Git -->

            try {
                fileOutputStream = new FileOutputStream("C:\\Shankar\\Serializedemo.txt");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                String str = "Utkarshaa classes";
                objectOutputStream.writeObject(str);
                objectOutputStream.close();

                FileInputStream fileInputStream = new FileInputStream("C:\\Shankar\\Serializedemo.txt");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                String readString = (String) objectInputStream.readObject();
                System.out.println(readString);
                objectInputStream.close();


            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
