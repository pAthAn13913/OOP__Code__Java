import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class InFileNumber {
    public static void main(String[] args) {
        try {
            FileWriter myWrite = new FileWriter("src//b.txt");
            Scanner sc = new Scanner(new File("src//a.txt"));

            String line1 = sc.nextLine();

            String result = "";

            for (int i = 0; i < line1.length(); i++) {
                char c = line1.charAt(i);
                if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' ||
                    c == '5' || c == '6' || c == '7' || c == '8' || c == '9' ) {

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

// Another type

// import java.io.File;
// import java.io.FileWriter;
// import java.util.Scanner;

// public class Forexample{
//     public static void main(String[] args) {
//         try {
//             FileWriter myWrite = new FileWriter("src//b.txt");
//             Scanner sc = new Scanner(new File("src//a.txt"));

//             String line1 = sc.nextLine();
//             char ch []= new char[20];

//             String result = "";

//             for (int i = 0; i < line1.length(); i++) {
//                 char c = line1.charAt(i);
//                 ch[i]=c;
//             }

//             result=ch[4]+""+ch[5]+""+ch[9]+""+ch[13]+"";
//             myWrite.write(result);
//             myWrite.close();
//             sc.close();

//         } catch (Exception e) {
//             System.err.println("WRONG");
//         }
//     }
// }
