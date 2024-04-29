import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FIleReadWrite {
    public static void main(String[] args) {
        String s[] = new String[6];
        int i = 0, sum = 0;
        try {
            File f1 = new File("input.txt");
            FileWriter myWriter = new FileWriter("output.txt");
            Scanner out = new Scanner(f1);

            while (out.hasNextLine()) {
                String s1 = out.nextLine();
                System.out.println(s1);
                s[i++] = s1;
            }

            sum = Integer.parseInt(s[1]) + Integer.parseInt(s[3]) + Integer.parseInt(s[4]);
//System.out.println(sum);
            myWriter.write(sum + "");

            myWriter.close();
            out.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
