import java.io.FileWriter;
import java.io.IOException;

class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("output.txt");
            myWriter.write("hello everyone");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

///

import java.util.*; // Scanner 
import java.io.*;   // File, PrintWriter

class WriteToFile {
    public static void main(String[] args) {
      PrintWriter myWriter;
        try {
            myWriter = new PrintWriter(new File("output.txt"));
            myWriter.print("hello everyone");
            myWriter.println("hello everyone");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
