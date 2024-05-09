import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Remove {
    public static void main(String[] args) {

        System.out.println("2nd");
        try {
            Scanner sc = new Scanner(new File("src/Input.txt"));
            FileWriter w = new FileWriter("src/Output.txt");
            String line1 = sc.nextLine();
            removeDuplicate(line1);

        } catch (Exception e) {
            System.err.println("Error");
        }
    }

    public static void removeDuplicate(String line) {

        int i, j ,k;
        char ch[] = new char[line.length()];
        int len = line.length();

        for (i = 0; i < line.length(); i++) {
            ch[i] = line.charAt(i);
        }
        String s = "";
        for (i = 0; i < ch.length - 1; i++) {
            for (j = i; j < ch.length - 1; j++) {
                if (ch[j] == '_' && ch[j + 1] == '_') {
                    for (k = j; k < ch.length - 1; k++) {
                        ch[k] = ch[k + 1];
                    }
                    len--;
                }
            }
        }
        for (i = 0; i <len; i++) {
            System.out.print(ch[i]);
        }
    }

}
