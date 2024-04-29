import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculatorhalf {
    JFrame frame;
    JTextField leftnum, rightnum, resultnum;
    JButton plus, minus;
    Font f;

    public Calculatorhalf() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(600, 200, 500, 400);
        f = new Font("Arial", Font.BOLD, 24);

        leftnum = new JTextField();
        leftnum.setBounds(100, 50, 100, 50);
        leftnum.setFont(f);
        frame.add(leftnum);

        rightnum = new JTextField();
        rightnum.setBounds(310, 50, 100, 50);
        rightnum.setFont(f);
        frame.add(rightnum);

        plus = new JButton("+");
        plus.setBounds(100, 110, 100, 50);
        plus.setFont(f);
        frame.add(plus);

        minus = new JButton("-");
        minus.setBounds(310, 110, 100, 50);
        minus.setFont(f);
        frame.add(minus);

        resultnum = new JTextField("");
        resultnum.setBounds(200, 220, 100, 50);
        resultnum.setBackground(Color.PINK);
        resultnum.setFont(f);
        frame.add(resultnum);


        plus.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                int a, b, r;
                a = Integer.parseInt(leftnum.getText());
                b = Integer.parseInt(rightnum.getText());
                r = a + b;
                resultnum.setText(r + "");

            }

        });

        minus.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                int a, b, r;
                a = Integer.parseInt(leftnum.getText());
                b = Integer.parseInt(rightnum.getText());
                r = a - b;
                resultnum.setText(r + "");

            }
        });


        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Calculatorhalf();
        //frame.setBackground(Color.BLUE);

    }
}

class Main {
    public static void main(String[] args) {
        new Calculatorhalf();
    }
}

