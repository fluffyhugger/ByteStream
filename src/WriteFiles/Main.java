package WriteFiles;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args){
        try {
            FileOutputStream output = new FileOutputStream("data.dat");
            String s = "Hello World";
            byte[] b = s.getBytes();
            output.write(b);
        }catch (FileNotFoundException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,ex);
        }catch (IOException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,ex);
        }
        try {
            FileInputStream input = new FileInputStream("data.dat");
            int value;
            while ((value = input.read()) != -1){
                System.out.print((char) value);
            }
        input.close();
        }catch (FileNotFoundException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,ex);
        }catch (IOException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
}
