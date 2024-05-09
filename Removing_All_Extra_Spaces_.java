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
        for (i = 0; i < ch.length - 1; i++) {
            for (j = i; j < ch.length - 1; ) {
                if ((ch[j] == '_' && ch[j + 1] == '_') || ch[0]=='_' ) {
                    for (k = j; k < ch.length - 1; k++) {
                        ch[k] = ch[k + 1];
                    }
                    len--;
                } else j++;
            }
        }
        for (i = 0; i <len; i++) {
            System.out.print(ch[i]);
        }
    }

}

////// removeing all dublicate character

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Dublicate_Remove {
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

        int i, j, k, x;
        int len = line.length();
        char ch[] = new char[len];

        for (i = 0; i < len; i++) {
            ch[i] = line.charAt(i);

        }

        for (i = 0; i < len; i++) {
            for (j = i + 1; j < len; ) {
                if (ch[i] == ch[j]) {
                    for (k = j; k < len - 1; k++) {
                        ch[k] = ch[k + 1];
                    }
                    len--;
                } else j++;
            }
        }
        for (i = 0; i < len; i++) {
            System.out.print(ch[i]);
        }
    }

}

