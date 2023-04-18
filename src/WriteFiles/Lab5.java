package WriteFiles;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab5 {
    public static void main(String[] args) {
        Student s = new Student("1", "Henry");
        try {
            FileOutputStream file = new FileOutputStream("data.dat");
            ObjectOutputStream output = new ObjectOutputStream(file);
            output.writeObject(s);
            output.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lab5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lab5.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            FileInputStream file = new FileInputStream("data.dat");
            ObjectInputStream input = new ObjectInputStream(file);
            Student st = (Student) input.readObject();
            System.out.println(st);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lab5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Lab5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
