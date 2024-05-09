import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Finding_Max_Min_InFile {
    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(new File("src/Input.txt"));
            FileWriter w = new FileWriter("src/Output.txt");

            double num[] = new double[6];
            double max1 = 0, max2 = 0;
            int i = 0;

            while (sc.hasNext()) {
                num[i++] = sc.nextDouble();
            }

            for (i = 0; i < 2; i++) {
                max1 = num[i];
                if (num[i] < num[i + 1]) max1 = num[i + 1];
                else max1 = num[i];
            }

            for (i = 3; i < 5; i++) {
                max2 = num[i];
                if (num[i] < num[i + 1]) max2 = num[i + 1];
                else max2 = num[i];
            }

            w.write((int)max1 + "\n");
            w.write(max2 + "\n");

            sc.close();
            w.close();

        } catch (Exception e) {
            System.err.println("error");
        }

    }
}
