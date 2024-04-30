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
