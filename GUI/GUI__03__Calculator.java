
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator extends JFrame {

    JFrame frame;
    Container c;
    JTextField tf1, tf2, tf3;
    JButton one, two, three, four, five, six, seven, eight, nin, zeto, plus, minus, multi, div, clear, point, delet, percent, equal;
    Font f1, f2;
    double forPlus, forMinus, forMulti, forDiv, forPercent, flag;

    Calculator() {

        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 480, 450);
        f1 = new Font("Arial", Font.BOLD, 20);
        f2 = new Font("Arial", Font.BOLD, 22);
        c = frame.getContentPane();
        c.setBackground(Color.darkGray);

        tf1 = new JTextField();
        tf1.setBounds(100, 10, 260, 50);
        frame.add(tf1);
        tf2 = new JTextField();
        tf2.setBounds(5, 190, 80, 50);
        //frame.add(tf2);
        tf3 = new JTextField();
        tf3.setBounds(5, 250, 80, 50);
        //frame.add(tf3);

        clear = new JButton("AC");
        clear.setBounds(100, 70, 60, 50);
        frame.add(clear);
        clear.setBackground(Color.orange);
        delet = new JButton("D");
        delet.setBounds(170, 70, 60, 50);
        frame.add(delet);
        percent = new JButton("%");
        percent.setBounds(240, 70, 60, 50);
        frame.add(percent);
        div = new JButton("/");
        div.setBounds(310, 70, 50, 50);
        frame.add(div);

        seven = new JButton("7");
        seven.setBounds(100, 130, 50, 50);
        frame.add(seven);
        eight = new JButton("8");
        eight.setBounds(170, 130, 50, 50);
        frame.add(eight);
        nin = new JButton("9");
        nin.setBounds(240, 130, 50, 50);
        frame.add(nin);
        multi = new JButton("X");
        multi.setBounds(310, 130, 50, 50);
        frame.add(multi);

        four = new JButton("4");
        four.setBounds(100, 190, 50, 50);
        frame.add(four);
        five = new JButton("5");
        five.setBounds(170, 190, 50, 50);
        frame.add(five);
        six = new JButton("6");
        six.setBounds(240, 190, 50, 50);
        frame.add(six);
        minus = new JButton("-");
        minus.setBounds(310, 190, 50, 50);
        frame.add(minus);

        one = new JButton("1");
        one.setBounds(100, 250, 50, 50);
        frame.add(one);
        two = new JButton("2");
        two.setBounds(170, 250, 50, 50);
        frame.add(two);
        three = new JButton("3");
        three.setBounds(240, 250, 50, 50);
        frame.add(three);
        plus = new JButton("+");
        plus.setBounds(310, 250, 50, 50);
        frame.add(plus);

        zeto = new JButton("0");
        zeto.setBounds(100, 310, 50, 50);
        frame.add(zeto);
        point = new JButton(".");
        point.setBounds(170, 310, 50, 50);
        frame.add(point);
        equal = new JButton(" = ");
        equal.setBounds(240, 310, 120, 50);
        frame.add(equal);

        tf1.setFont(f1);
        point.setFont(f2);
        minus.setFont(f1);

        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tf1.setText(tf1.getText() + "1");
                tf3.setText(tf3.getText() + "1");
            }
        });
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tf1.setText(tf1.getText() + "2");
                tf3.setText(tf3.getText() + "2");
            }
        });
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tf1.setText(tf1.getText() + "3");
                tf3.setText(tf3.getText() + "3");
            }
        });
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tf1.setText(tf1.getText() + "4");
                tf3.setText(tf3.getText() + "4");
            }
        });
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tf1.setText(tf1.getText() + "5");
                tf3.setText(tf3.getText() + "5");
            }
        });
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tf1.setText(tf1.getText() + "6");
                tf3.setText(tf3.getText() + "6");
            }
        });
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tf1.setText(tf1.getText() + "7");
                tf3.setText(tf3.getText() + "7");
            }
        });
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tf1.setText(tf1.getText() + "8");
                tf3.setText(tf3.getText() + "8");
            }
        });
        nin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tf1.setText(tf1.getText() + "9");
                tf3.setText(tf3.getText() + "9");
            }
        });
        zeto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tf1.setText(tf1.getText() + "0");
                tf3.setText(tf3.getText() + "0");
            }
        });
        point.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tf1.setText(tf1.getText() + ".");
                tf3.setText(tf3.getText() + ".");
            }
        });
        delet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentString1 = tf1.getText();
                String newString1 = currentString1.substring(0, currentString1.length() - 1);
                tf1.setText(newString1);
                String currentString2 = tf3.getText();
                String newString2 = currentString2.substring(0, currentString2.length() - 1);
                tf3.setText(newString2);
            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText("");
                tf2.setText("");
                tf3.setText("");
            }
        });
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flag = 1;
                forPlus = Double.parseDouble(tf1.getText());
                tf3.setText("");
                tf2.setText(forPlus + "");
                tf1.setText(tf1.getText() + "+");
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flag = -1;
                forMinus = Double.parseDouble(tf1.getText());
                tf3.setText("");
                tf2.setText(forMinus + "");
                tf1.setText(tf1.getText() + "-");
            }
        });
        multi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flag = 2;
                forMulti = Double.parseDouble(tf1.getText());
                tf3.setText("");
                tf2.setText(forMulti + "");
                tf1.setText(tf1.getText() + "*");
            }
        });
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flag = -2;
                forDiv = Double.parseDouble(tf1.getText());
                tf3.setText("");
                tf2.setText(forDiv + "");
                tf1.setText(tf1.getText() + "/");
            }
        });
        percent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (flag == 0) {
                    forPercent = Double.parseDouble(tf1.getText()) / 100.0;
                    tf1.setText(forPercent + "");
                } else {

                    flag = 5;
                    tf1.setText(tf1.getText() + "%");
                    forPercent = (Double.parseDouble(tf2.getText()) * Double.parseDouble(tf3.getText())) / 100.0;
                }
            }
        });
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (flag == 1) {

                    double result = forPlus + Double.parseDouble(tf3.getText());
                    if (result == (int) result) {
                        tf2.setText((int) result + "");
                        tf1.setText((int) result + "");
                        flag = 0;
                    } else {

                        tf2.setText(result + "");
                        tf1.setText(result + "");
                        flag = 0;
                    }
                } else if (flag == -1) {

                    double result = forMinus - Double.parseDouble(tf3.getText());
                    if (result == (int) result) {
                        tf2.setText((int) result + "");
                        tf1.setText((int) result + "");
                        flag = 0;
                    } else {

                        tf2.setText(result + "");
                        tf1.setText(result + "");
                        flag = 0;
                    }
                } else if (flag == 2) {

                    double result = forMulti * Double.parseDouble(tf3.getText());
                    if (result == (int) result) {
                        tf2.setText((int) result + "");
                        tf1.setText((int) result + "");
                        flag = 0;
                    } else {

                        tf2.setText(result + "");
                        tf1.setText(result + "");
                        flag = 0;
                    }
                } else if (flag == -2) {

                    double result = forDiv / Double.parseDouble(tf3.getText());
                    if (result == (int) result) {
                        tf2.setText((int) result + "");
                        tf1.setText((int) result + "");
                        flag = 0;
                    } else {

                        tf2.setText(result + "");
                        tf1.setText(result + "");
                        flag = 0;
                    }
                } else if (flag == 5) {

                    if (forPercent == (int) forPercent) {
                        tf2.setText((int) forPercent + "");
                        tf1.setText((int) forPercent + "");
                        flag = 0;
                    } else {

                        tf2.setText(forPercent + "");
                        tf1.setText(forPercent + "");
                        flag = 0;
                    }
                }
            }
        });

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
    }
}

class Main {
    public static void main(String[] args) {
        new Calculator();
    }
}
