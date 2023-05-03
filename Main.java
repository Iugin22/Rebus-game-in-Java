import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main {

    public static void login() {
        boolean loggedIn = false;
        while (!loggedIn) {
            String username = JOptionPane.showInputDialog("Introduceti username-ul: ");
            String password = JOptionPane.showInputDialog("Introduceti parola: ");
            if (username.equals("username") && password.equals("password")) {
                loggedIn = true;
            } else {
                JOptionPane.showMessageDialog(null, "Username-ul sau parola introduse sunt gresite! Incercati din nou!.");
            }
        }
    }
    public static void main(String args[]) {
        login();

        JFrame frame = new JFrame("Rebus Chooser");
        JButton rebus1Button = new JButton("Rebus 1");
        JButton rebus2Button = new JButton("Rebus 2");

        rebus1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Rebus1 rebus1 = new Rebus1();
                frame.dispose();
            }
        });

        rebus2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Rebus2 rebus2 = new Rebus2();
                frame.dispose();
            }
        });

        frame.add(rebus1Button);
        frame.add(rebus2Button);
        frame.setLayout(new FlowLayout());
        frame.setSize(300, 100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}