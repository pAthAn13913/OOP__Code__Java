import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class  ExamGui{
    public static void main(String[] args) {
        JFrame frame = new JFrame("exam");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        frame.setBounds( 300,200,400, 400);
        JTextField tf = new JTextField();
        tf.setBounds( 50,50,100, 50);
        JButton b1= new JButton("Convart");
        b1.setBounds( 50,150,100, 50);
        JTextField tf2 = new JTextField();
        tf2.setBounds( 50,250,100, 50);
        frame.add(tf);
        frame.add(b1);
        frame.add(tf2);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s1= tf.getText();
                String s2="";
                int result=0;
                for(int i=0;i<s1.length();i++){
                    char c=s1.charAt(i);
                    if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' ||
                            c == '5' || c == '6' || c == '7' || c == '8' || c == '9' ) {

                        result ++;
                    }

                }
                tf2.setText(result+"");
            }
        });
        frame.setVisible(true);
    }
}
