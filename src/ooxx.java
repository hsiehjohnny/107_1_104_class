import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ooxx extends JFrame {
    private Container cp;
    private JLabel jlb1 = new JLabel("GAME");
    private int x = 0;
    private JPanel jp1 = new JPanel(new GridLayout(3, 3, 3, 3));
    private JButton jbt = new JButton("");
    private JButton jbt1 = new JButton("");
    private JButton jbt2 = new JButton("");
    private JButton jbt3 = new JButton("");
    private JButton jbt4 = new JButton("");
    private JButton jbt5 = new JButton("");
    private JButton jbt6 = new JButton("");
    private JButton jbt7 = new JButton("");
    private JButton jbt8 = new JButton("");


    public ooxx(game g2) {

        init(g2);
    }

    private void init(game g2) {
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setBounds(100, 200, 800, 600);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                game g = new game();
                g.setVisible(true);
            }
        });
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout(3, 3));
        cp.add(jlb1, BorderLayout.NORTH);
        jlb1.setOpaque(true);
        jlb1.setBackground(new Color(250, 100, 60));
        jlb1.setFont(new Font(null, Font.BOLD, 25));
        cp.add(jp1, BorderLayout.CENTER);
        jp1.add(jbt);
        jp1.add(jbt1);
        jp1.add(jbt2);
        jp1.add(jbt3);
        jp1.add(jbt4);
        jp1.add(jbt5);
        jp1.add(jbt6);
        jp1.add(jbt7);
        jp1.add(jbt8);
        jbt.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton t = (JButton) e.getSource();
                if (x % 2 == 0) {
                    t.setText("O");
                    t.setFont(new Font(null, Font.PLAIN, 24));
                } else {
                    t.setText("X");
                    t.setFont(new Font(null, Font.PLAIN, 24));
                }
                t.setEnabled(false);
                x++;
                check();
            }
        });
        jbt1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton t = (JButton) e.getSource();
                if (x % 2 == 0) {
                    t.setText("O");
                    t.setFont(new Font(null, Font.PLAIN, 24));
                } else {
                    t.setText("X");
                    t.setFont(new Font(null, Font.PLAIN, 24));
                }
                t.setEnabled(false);
                x++;
                check();
            }
        });
        jbt2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton t = (JButton) e.getSource();
                if (x % 2 == 0) {
                    t.setText("O");
                    t.setFont(new Font(null, Font.PLAIN, 24));
                } else {
                    t.setText("X");
                    t.setFont(new Font(null, Font.PLAIN, 24));
                }
                t.setEnabled(false);
                x++;
                check();
            }
        });
        jbt3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton t = (JButton) e.getSource();
                if (x % 2 == 0) {
                    t.setText("O");
                    t.setFont(new Font(null, Font.PLAIN, 24));
                } else {
                    t.setText("X");
                    t.setFont(new Font(null, Font.PLAIN, 24));
                }
                t.setEnabled(false);
                x++;
                check();
            }
        });
        jbt4.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton t = (JButton) e.getSource();
                if (x % 2 == 0) {
                    t.setText("O");
                    t.setFont(new Font(null, Font.PLAIN, 24));
                } else {
                    t.setText("X");
                    t.setFont(new Font(null, Font.PLAIN, 24));
                }
                t.setEnabled(false);
                x++;
                check();
            }
        });
        jbt5.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton t = (JButton) e.getSource();
                if (x % 2 == 0) {
                    t.setText("O");
                    t.setFont(new Font(null, Font.PLAIN, 24));
                } else {
                    t.setText("X");
                    t.setFont(new Font(null, Font.PLAIN, 24));
                }
                t.setEnabled(false);
                x++;
                check();
            }
        });
        jbt6.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton t = (JButton) e.getSource();
                if (x % 2 == 0) {
                    t.setText("O");
                    t.setFont(new Font(null, Font.PLAIN, 24));
                } else {
                    t.setText("X");
                    t.setFont(new Font(null, Font.PLAIN, 24));
                }
                t.setEnabled(false);
                x++;
                check();
            }
        });
        jbt7.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton t = (JButton) e.getSource();
                if (x % 2 == 0) {
                    t.setText("O");
                    t.setFont(new Font(null, Font.PLAIN, 24));
                } else {
                    t.setText("X");
                    t.setFont(new Font(null, Font.PLAIN, 24));
                }
                t.setEnabled(false);
                x++;
                check();
            }
        });
        jbt8.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton t = (JButton) e.getSource();
                if (x % 2 == 0) {
                    t.setText("O");
                    t.setFont(new Font(null, Font.PLAIN, 24));
                } else {
                    t.setText("X");
                    t.setFont(new Font(null, Font.PLAIN, 24));
                }
                t.setEnabled(false);
                x++;
                check();
            }
        });
    }
    private void check() {
        if (jbt.getText().equals(jbt1.getText()) && jbt1.getText().equals(jbt2.getText()) && !jbt.getText().equals("")) {
            if (jbt.getText().equals("O")) {
                jlb1.setText("O player win!");
            } else {
                jlb1.setText("X  player win!");
            }
        } else if (jbt3.getText().equals(jbt4.getText()) && jbt4.getText().equals(jbt5.getText()) && !jbt3.getText().equals("")) {
            if (jbt3.getText().equals("O")) {
                jlb1.setText("O  player win!");
            } else {
                jlb1.setText("X  player win!");
            }
        }else if (jbt6.getText().equals(jbt7.getText()) && jbt7.getText().equals(jbt8.getText()) && !jbt6.getText().equals("")) {
            if (jbt6.getText().equals("O")) {
                jlb1.setText("O  player win!");
            } else {
                jlb1.setText("X  player win!");
            }
        }else if (jbt.getText().equals(jbt3.getText()) && jbt3.getText().equals(jbt6.getText()) && !jbt.getText().equals("")) {
            if (jbt.getText().equals("O")) {
                jlb1.setText("O  player win!");
            } else {
                jlb1.setText("X  player win!");
            }
        }else if (jbt1.getText().equals(jbt4.getText()) && jbt4.getText().equals(jbt7.getText()) && !jbt1.getText().equals("")) {
            if (jbt1.getText().equals("O")) {
                jlb1.setText("O  player win!");
            } else {
                jlb1.setText("X  player win!");
            }
        }else if (jbt2.getText().equals(jbt5.getText()) && jbt5.getText().equals(jbt8.getText()) && !jbt2.getText().equals("")) {
            if (jbt2.getText().equals("O")) {
                jlb1.setText("O  player win!");
            } else {
                jlb1.setText("X  player win!");
            }


        }else if (jbt.getText().equals(jbt4.getText()) && jbt4.getText().equals(jbt8.getText()) && !jbt.getText().equals("")) {
            if (jbt.getText().equals("O")) {
                jlb1.setText("O  player win!");
            } else {
                jlb1.setText("X  player win!");
            }
        }else if (jbt2.getText().equals(jbt4.getText()) && jbt4.getText().equals(jbt6.getText()) && !jbt2.getText().equals("")) {
            if (jbt2.getText().equals("O")) {
                jlb1.setText("O  player win!");
            } else {
                jlb1.setText("X  player win!");
            }
        }
    }
}


