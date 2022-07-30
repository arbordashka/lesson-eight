import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JPanel {
        JTextField txt1 = null;
        int res = 0;
        int res1 = 0;
        String op = "";

 public Calculator()
        {
            //Здравствуйте, Виталий! Я скопировала этот код из гугла, но честно разобралась, как он работает

                setLayout(null);

                final TextField txt1 = new TextField();
                txt1.setBounds(10, 10, 265, 30);

                JButton b1 = new JButton("1");
                b1.setBounds(10, 50, 50, 50);

                JButton b2 = new JButton("2");
                b2.setBounds(70, 50, 50, 50);

                JButton b3 = new JButton("3");
                b3.setBounds(130, 50, 50, 50);

                JButton b4 = new JButton("4");
                b4.setBounds(10, 110, 50, 50);

                JButton b5 = new JButton("5");
                b5.setBounds(70, 110, 50, 50);

                JButton b6 = new JButton("6");
                b6.setBounds(130, 110, 50, 50);

                JButton b7 = new JButton("7");
                b7.setBounds(10, 170, 50, 50);

                JButton b8 = new JButton("8");
                b8.setBounds(70, 170, 50, 50);

                JButton b9 = new JButton("9");
                b9.setBounds(130, 170, 50, 50);

                JButton b0 = new JButton("0");
                b0.setBounds(70, 230, 50, 50);

                JButton bPlus = new JButton("+");
                bPlus.setBounds(210, 50, 50, 50);

                JButton bMinus = new JButton("-");
                bMinus.setBounds(210, 110, 50, 50);

                JButton bMulti = new JButton("*");
                bMulti.setBounds(210, 170, 50, 50);

                JButton bDivision = new JButton("/");
                bDivision.setBounds(210, 230, 50, 50);

                JButton bRes = new JButton("=");
                bRes.setBounds(10, 300, 250, 50);

                add(txt1);
                add(b0);
                add(b1);
                add(b2);
                add(b3);
                add(b4);
                add(b5);
                add(b6);
                add(b7);
                add(b8);
                add(b9);
                add(bRes);
                add(bPlus);
                add(bMinus);
                add(bMulti);
                add(bDivision);

            b1.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 1);
                    if (res==0) {
                        res = Integer.valueOf(txt1.getText());
                    } else {
                        res1 = Integer.valueOf(txt1.getText());
                    }
                }
            });

            b2.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 2);
                    if (res==0) {
                        res = Integer.valueOf(txt1.getText());
                    } else {
                        res1 = Integer.valueOf(txt1.getText());
                    }
                }
            });

            b3.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 3);
                    if (res==0) {
                        res = Integer.valueOf(txt1.getText());
                    } else {
                        res1 = Integer.valueOf(txt1.getText());
                    }
                }
            });

            b4.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 4);
                    if (res==0)
                    {
                        res = Integer.valueOf(txt1.getText());
                    } else {
                        res1 = Integer.valueOf(txt1.getText());
                    }
                }
            });

            b5.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 5);
                    if (res==0) {
                        res = Integer.valueOf(txt1.getText());
                    } else {
                        res1 = Integer.valueOf(txt1.getText());
                    }
                }
            });

            b6.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 6);
                    if (res==0) {
                        res = Integer.valueOf(txt1.getText());
                    } else {
                        res1 = Integer.valueOf(txt1.getText());
                    }
                }
            });

            b7.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 7);
                    if (res==0) {
                        res = Integer.valueOf(txt1.getText());
                    } else {
                        res1 = Integer.valueOf(txt1.getText());
                    }
                }
            });

            b8.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 8);
                    if (res==0) {
                        res = Integer.valueOf(txt1.getText());
                    } else {
                        res1 = Integer.valueOf(txt1.getText());
                    }
                }
            });

            b9.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 9);
                    if (res==0) {
                        res = Integer.valueOf(txt1.getText());
                    } else {
                        res1 = Integer.valueOf(txt1.getText());
                    }
                }
            });

            b0.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    txt1.setText(txt1.getText() + 0);
                    if (res==0) {
                        res = Integer.valueOf(txt1.getText());
                    } else {
                        res1 = Integer.valueOf(txt1.getText());
                    }
                }
            });

            bPlus.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    res = Integer.valueOf(txt1.getText());
                    txt1.setText("");
                    op = "+";
                }
            });

            bMinus.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    res = Integer.valueOf(txt1.getText());
                    txt1.setText("");
                    op = "-";
                }
            });

            bMulti.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    res = Integer.valueOf(txt1.getText());
                    txt1.setText("");
                    op = "*";
                }
            });

            bDivision.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg1)
                {
                    res = Integer.valueOf(txt1.getText());
                    txt1.setText("");
                    op = "/";
                }
            });



            bRes.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent arg0)
                    {
                        int numb1 = Integer.valueOf(res);
                        int numb2 = Integer.valueOf(res1);
                        String strOperation = op;

                        Calculation mc = new Calculation();
                        String strRes = String.valueOf(mc.calc(numb1, strOperation, numb2 ));
                        txt1.setText(strRes);
                    }
                });
            }
        }



