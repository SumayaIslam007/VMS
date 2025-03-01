import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class LoginPage extends JFrame implements ActionListener {

    JLabel welcome_L,image_L,userName_L,password_L;
    JTextField username_Tf;
    JPasswordField passwordField;
    JButton btnLogin,btnRegister;


    public LoginPage(){
        super("Login");
        try{

            setResizable(false);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(null);
            setBounds(0,0,740,660);
            setLocationRelativeTo(null);

            //labels
            welcome_L = new JLabel("Welcome to Car Management System");
            welcome_L.setBounds(220,50,340,60);
            Font welcome_LFont=new Font("Times New Roman", Font.BOLD, 20);
            welcome_L.setFont(welcome_LFont);


            image_L = new JLabel();
            image_L.setBounds(20,160,350,420);
            //image_L.setBackground(Color.GRAY);
           // image_L.setOpaque(true);
            ImageIcon imageIcon = new ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Desktop\\Car company management\\Image\\logo2.png"); // assign image to a new ImageIcon
            Image image = imageIcon.getImage(); // transform it
            Image newImg = image.getScaledInstance(image_L.getWidth(), image_L.getHeight(),  java.awt.Image.SCALE_SMOOTH); // scale it smoothly
            ImageIcon newImageIcon = new ImageIcon(newImg);  // assign
            image_L.setIcon(newImageIcon);

            userName_L = new JLabel("Username");
            userName_L.setBounds(410,210,130,40);

            password_L = new JLabel("password");
            password_L.setBounds(410,270,130,40);

            //Text field
            username_Tf = new JTextField();
            username_Tf.setBounds(540,210,170,40);

            //password field
            passwordField = new JPasswordField();
            passwordField.setBounds(540,270,170,40);

            //buttons
            btnLogin = new JButton("Login");
            btnLogin.setBounds(490,370,130,40);

            btnRegister = new JButton("Register");
            btnRegister.setBounds(490,480,130,30);

            //adding action listener
            btnLogin.addActionListener(this);
            btnRegister.addActionListener(this);
            //adding components
            add(welcome_L);
            add(image_L);
            add(userName_L);
            add(password_L);
            add(username_Tf);
            add(passwordField);
            add(btnLogin);
            add(btnRegister);

            setVisible(true);
        }
        catch (Exception e) {
            System.out.println(e);

        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnLogin)
        {
            boolean m = false;
            try{
                String u = username_Tf.getText();
                String p = passwordField.getText();

                FileReader fr = new FileReader("C:/Users/Lenovo/OneDrive/Desktop/Group7/CarManagementSystem/Gui/data.txt");
                BufferedReader br = new BufferedReader(fr);

                String line;

                while((line = br.readLine())!=null)
                {
                    if(line.equals(u+","+p))
                    {
                        m=true;
                        break;
                    }
                }
                fr.close();
            }
            catch(Exception ei)
            {
                System.out.println(ei);
            }
            if(m)
            {
                new DashBoard();
                setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Wrong");
            }
        }
        else if (e.getSource()==btnRegister){
            new RegisterPage();
            dispose();
        }
    }

    public static void main(String[] args) {
        new LoginPage();
    }
}