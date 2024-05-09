import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Using_split {
    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(new File("src/Input.txt"));
            FileWriter w = new FileWriter("src/Output.txt");

            double max1 = 0, max2 = 0;
            int i = 0;

            String line1 = sc.nextLine();
            String line2 = sc.nextLine();

            String line1_Parts[] = line1.split(" ");           // return string array....and we want what kind of part....this kind puting in (...)
            String line2_Parts[] = line2.split(" ");


            for (i = 0; i < line1_Parts.length - 1; i++) {
                max1 = Double.parseDouble(line1_Parts[i]);
                if (Double.parseDouble(line1_Parts[i]) < Double.parseDouble(line1_Parts[i + 1]))
                    max1 = Double.parseDouble(line1_Parts[i]);
                else max1 = Double.parseDouble(line1_Parts[i]);
            }

            for (i = 0; i < line2_Parts.length - 1; i++) {
                max2 = Double.parseDouble(line2_Parts[i]);
                if (Double.parseDouble(line2_Parts[i]) < Double.parseDouble(line2_Parts[i + 1]))
                    max2 = Double.parseDouble(line2_Parts[i + 1]);
                else max2 = Double.parseDouble(line2_Parts[i]);
            }
            System.out.println(max1);
            System.out.println(max2);

            w.write((int)max1 + "\n");
            w.write(max2 + "\n");

            sc.close();
            w.close();

        } catch (Exception e) {
            System.err.println("error");
        }

    }
}
