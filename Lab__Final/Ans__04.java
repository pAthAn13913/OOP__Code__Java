import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ok {
    public static void main(String[] args) {
        JFrame frame = new JFrame("exam");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        frame.setBounds( 300,200,400, 400);
        JTextField tf = new JTextField();
        tf.setBounds( 50,50,100, 50);
        JButton b1= new JButton("Convart");
        b1.setBounds( 50,150,100, 50);
        frame.add(tf);
        frame.add(b1);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s1= tf.getText();
                String s2="";
                for(int i=0;i<s1.length();i++){
                    char c=s1.charAt(i);
                 if(Character.isUpperCase(c)){                                      //__only actionListener for qus 04
                     s2+=Character.toLowerCase(c);
                 }
                 else if(Character.isLowerCase(c)){
                     s2+=Character.toUpperCase(c);
                 }
                 else s2+=c;

                }
                tf.setText(s2);
            }
        });
        frame.setVisible(true);
    }
}
