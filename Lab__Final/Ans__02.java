import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class Vowel {
    public static void main(String[] args) {
        try {
            FileWriter myWrite = new FileWriter("b.txt");
            Scanner sc = new Scanner(new File("a.txt"));

            String line1 = sc.nextLine();
            String result = "";

            for (int i = 0; i < line1.length(); i++) {
                char c = line1.charAt(i);
                 if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ) {

                    result += c;
                }
            }
            myWrite.write(result);
            myWrite.close();
            sc.close();

        } catch (Exception e) {
            System.err.println("WRONG");
        }
    }
}


