import javax.swing.*;
import java.awt.*;

public class My_Application {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MY_APP");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.orange);
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.yellow);

        JLabel label = new JLabel("pAthAn");
        JTextField tf = new JTextField(15);
        panel1.add(label);
        panel1.add(tf);
        frame.add(panel1);

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        panel2.add(button1);
        panel2.add(button2);
        panel2.add(button3);
        frame.add(panel2);


        frame.setLayout(new FlowLayout());

        frame.setVisible(true);
    }
}
