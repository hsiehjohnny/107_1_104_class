import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Login extends JFrame {
    private String idt = Integer.toString(106021383);
    private String idpw = Integer.toString(23323456);
    private JLabel id = new JLabel("ID:");
    private JLabel PW = new JLabel("PW:");
    public JTextField jtf = new JTextField("");
    private JPasswordField jpw = new JPasswordField("");
    private JButton key = new JButton("key");
    private JButton lg = new JButton("Login");
    private JButton e = new JButton("Exit");

    public Login(String pw) {
        abc(pw);
    }

    private void abc(String pw) {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 400, 300);
        this.setLayout(null);
        id.setBounds(50, 60, 60, 40);
        this.add(id);
        jtf.setBounds(120, 60, 100, 50);
        this.add(jtf);
        PW.setBounds(50, 110, 60, 40);
        this.add(PW);
        jpw.setBounds(120, 110, 100, 50);
        this.add(jpw);
        jpw.setText(pw);
        key.setBounds(20, 160, 100, 60);
        this.add(key);
        lg.setBounds(120, 160, 100, 60);
        this.add(lg);
        lg.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jtf.getText().equals(idt) && jpw.getText().equals(idpw)) {
                    game g = new game();
                    g.setVisible(true);
                    Login.this.dispose();
                }
            }
        });
        e.setBounds(220, 160, 100, 60);
        this.add(e);
        key.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                keyboard key = new keyboard(Login.this);
                key.setVisible(true);
            }
        });
    }
    public void setPassword(String str){
        jpw.setText(str);
    }

}
