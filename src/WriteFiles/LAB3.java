package WriteFiles;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB3 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileOutputStream file = new FileOutputStream("data.dat");
            DataOutputStream output = new DataOutputStream(file);
            output.writeUTF("Jim Henry");
            output.writeInt(30);
            output.writeDouble(3.14);
            output.writeChar('A');
            output.writeChar('B');
        }catch (FileNotFoundException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,ex);
        }catch (IOException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,ex);
        }
        try {
            FileInputStream file = new FileInputStream("data.dat");
            DataInputStream input = new DataInputStream(file);

            System.out.println(input.readUTF());
            System.out.println(input.readInt());
            System.out.println(input.readDouble());
            System.out.println(input.readChar());
            System.out.println(input.readChar());
        }catch (FileNotFoundException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,ex);
        }catch (IOException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
}
