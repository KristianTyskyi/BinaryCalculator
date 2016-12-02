import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ItemListener;
import java.lang.*;

public class Calculator extends JFrame implements ItemListener {
    Choice os, so;
    JButton brez;
    JTextField t1, t2;
    JLabel l1, l2;
    Listener list = new Listener();
    Long value;
    String name="",name2="";


    public Calculator(String s) {
        super(s);

        Image img = new ImageIcon(Calculator.class.getResource("32.png")).getImage();
        this.setIconImage(img);

        setLayout(new FlowLayout());
        brez = new JButton("Перевести");
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        l1 = new JLabel("Введіть число:                                                                             ");
        l2 = new JLabel("Ваш результат:                                            ");
        Choice os = new Choice();
        Choice so = new Choice();
        os.addItem("()");
        os.addItem("2");
        os.addItem("8");
        os.addItem("10");
        os.addItem("16");
        os.addItemListener(this);
        so.addItem("()");
        so.addItem("2");
        so.addItem("8");
        so.addItem("10");
        so.addItem("16");
        so.addItemListener(this);
        add(l1);
        add(l2);
        add(t1);
        add(os);
        add(so);
        add(t2);
        add(brez);
        brez.addActionListener(list);
        t2.setEditable(false);

        so.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent ie) {
                if(so.getSelectedItem() == "2"){
                    name2 = "2";
                }
                if(so.getSelectedItem() == "10"){
                    name2 = "10";
                }
                if(so.getSelectedItem() == "8"){
                    name2 = "8";
                }
                if(so.getSelectedItem() == "16"){
                    name2 = "16";
                }
            }
        });

        os.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent ie) {
               if(os.getSelectedItem() == "10"){
                   name = "10";
               }
                if(os.getSelectedItem() == "2"){
                    name = "2";
                }
                if(os.getSelectedItem() == "8"){
                    name = "8";
                }
                if(os.getSelectedItem() == "16"){
                    name = "16";
                }

            }
        });

    }

    public Calculator() {
    }


    public void itemStateChanged(ItemEvent e) {

    }
    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource() == brez) {
                    if (name == "10") {
                        if(name2 == "2"){
                            value = Long.valueOf(t1.getText());
                            t2.setText(Long.toBinaryString(value)); // 10-2


                        }
                        if (name2 == "8") {
                            value = Long.valueOf(t1.getText());
                            t2.setText(Long.toOctalString(value)); // 10-8
                        }
                        if(name2 == "16"){
                            value = Long.valueOf(t1.getText());
                            t2.setText(Long.toHexString(value).toUpperCase());//10-16
                        }
                        if(name2 == "10"){
                            value = Long.valueOf(t1.getText());
                            t2.setText(Long.toString(value));//10-10
                        }

                    }
                    if(name == "2"){
                        if(name2 == "10"){
                            value = Long.valueOf(t1.getText(), 2);
                            t2.setText(Long.toString(value));

                        }
                        if(name2 == "8"){
                            value = Long.valueOf(t1.getText(), 2);
                            t2.setText(Long.toOctalString(value));

                        }
                        if(name2 == "16"){
                            value = Long.valueOf(t1.getText(), 2);
                            t2.setText(Long.toHexString(value).toUpperCase());

                        }
                        if(name2 == "2"){
                            value = Long.valueOf(t1.getText(), 2);
                            t2.setText(Long.toBinaryString(value));

                        }
                    }
                    if(name == "8"){
                        if(name2 == "10"){
                            value = Long.valueOf(t1.getText(),8);
                            t2.setText(Long.toString(value));//8-10
                        }
                        if(name2 == "2"){
                            value = Long.valueOf(t1.getText(),8);
                            t2.setText(Long.toBinaryString(value));

                        }
                        if(name2 == "16"){
                            value = Long.valueOf(t1.getText(),8);
                            t2.setText(Long.toHexString(value).toUpperCase());
                        }
                        if(name2 == "8"){
                            value = Long.valueOf(t1.getText(), 8);
                            t2.setText(Long.toOctalString(value));

                        }
                    }
                    if(name == "16"){
                        if(name2 == "10"){
                            value = Long.valueOf(t1.getText(),16);
                            t2.setText(Long.toString(value));//16-10
                        }
                        if(name2 == "8"){
                            value = Long.valueOf(t1.getText(),16);

                            t2.setText(Long.toOctalString(value));
                        }
                        if(name2 == "2"){
                            value = Long.valueOf(t1.getText(),16);

                            t2.setText(Long.toBinaryString(value));
                        }
                        if(name2 == "16"){
                            value = Long.valueOf(t1.getText(),16);
                            t2.setText(Long.toHexString(value).toUpperCase());

                        }
                    }

                }
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Ви допустили помилку при введенні,\n перевірте все і спробуйте ще раз!");
                t2.setText(null);
            }



        }


    }





}
