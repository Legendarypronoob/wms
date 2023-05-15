import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.LayoutManager;

import javax.swing.*;
import java.awt.event.*;

public class defaultPage extends JFrame implements MouseListener{
    private JPanel mainPanel;
    private JLabel image;
    private JButton loginButton, signupButton;

    public defaultPage() {
        super("Wholesale Management System - Home");

        setSize(1000, 600);

        // disable maximize button and resizable window
        setResizable(false);
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        mainPanel = new JPanel();
        mainPanel.setLayout(null);

        loginButton = new JButton("Login");
        loginButton.setBounds(80, 400, 120, 40);
        loginButton.setBackground(Color.BLACK);
        loginButton.setForeground(Color.WHITE);
        loginButton.setBorder(BorderFactory.createEmptyBorder());
        loginButton.setContentAreaFilled(true);
        //loginButton.setOpaque(true);
        loginButton.setBorderPainted(false);
        loginButton.addActionListener(e -> {
            new LogIn();
            this.dispose();
        });
        loginButton.addMouseListener(this);

        mainPanel.add(loginButton);

        signupButton = new JButton("Signup");
        signupButton.setBounds(220, 400, 120, 40);
        signupButton.setBackground(Color.BLACK);
        signupButton.setForeground(Color.WHITE);
        signupButton.setBorder(BorderFactory.createEmptyBorder());
        signupButton.setContentAreaFilled(true);
        signupButton.addActionListener(e -> {
            new SignUp();
            this.dispose();
        });
        signupButton.addMouseListener(this);
        mainPanel.add(signupButton);

        image = new JLabel(new ImageIcon("res\\FrontPage.png"), JLabel.CENTER);
        image.setVerticalAlignment(JLabel.BOTTOM);
        image.setBounds(0, 0, 1000, 600);

        mainPanel.add(image);

        add(mainPanel);

        setVisible(true);
    }

    public void mouseClicked(MouseEvent me) {}
    public void mousePressed(MouseEvent me) {}
    public void mouseReleased(MouseEvent me) {}

    public void mouseEntered(MouseEvent me){
        if (me.getSource() == loginButton){
            //System.out.println("Login hover");
            loginButton.setBackground(new Color(40, 40, 40));
        }else if (me.getSource() == signupButton){
            //System.out.println("Signup hover");
            signupButton.setBackground(new Color(40, 40, 40));
        }
    }

    public void mouseExited(MouseEvent me) {
        if (me.getSource() == loginButton){
            //System.out.println("Login hover end");
            loginButton.setBackground(Color.BLACK);
        }else if (me.getSource() == signupButton){
            //System.out.println("Signup hover end");
            signupButton.setBackground(Color.BLACK);
        }
    }
}
