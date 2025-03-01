import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class RegisterPage extends JFrame implements ActionListener  {

    JLabel Reg,name_L,email_L,phn_L,address_L,pass_L,confirmPass_L;
    JTextField nameTf,mailTf,phnTf,addressTf;
    JPasswordField pfeild,confirmPfeild;
    JButton backbtn,regbtn;
    String name;
    String pass;
    String cpass;


    public RegisterPage() {
        super("Register");

        try {
            setResizable(false);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(0, 0, 890, 650);

            //Labels
            Reg = new JLabel("Registration");
            Reg.setBounds(200, 20, 210, 40);
            Font RegFont=new Font("Times New Roman", Font.BOLD, 28);
            Reg.setFont(RegFont);


            name_L = new JLabel("Name");
            name_L.setBounds(30, 100, 190, 40);

            email_L = new JLabel("Email");
            email_L.setBounds(30, 160, 190, 40);

            phn_L = new JLabel("Phone Number");
            phn_L.setBounds(30, 220, 190, 40);

            address_L = new JLabel("Address");
            address_L.setBounds(30, 280, 190, 40);

            pass_L = new JLabel("Password");
            pass_L.setBounds(30, 340, 190, 40);

            confirmPass_L = new JLabel("Confirm Password");
            confirmPass_L.setBounds(30, 400, 190, 40);

            //Text fe\ild
            nameTf = new JTextField();
            nameTf.setBounds(220, 100, 250, 40);

            phnTf = new JTextField();
            phnTf.setBounds(220, 160, 250, 40);

            mailTf = new JTextField();
            mailTf.setBounds(220, 220, 390, 40);

            addressTf = new JTextField();
            addressTf.setBounds(220, 280, 290, 40);

            //password feild
            pfeild = new JPasswordField();
            pfeild.setBounds(220, 340, 230, 40);

            confirmPfeild=new JPasswordField();
            confirmPfeild.setBounds(220,400,230,40);

            //buttons

            backbtn = new JButton("Back");
            backbtn.setBounds(245, 540, 120, 30);
			backbtn.addActionListener(this);

            regbtn = new JButton("Register");
            regbtn.setBounds(230, 480, 150, 40);
			regbtn.addActionListener(this);

            //adding components
            add(Reg);
            add(name_L);
            add(phn_L);
            add(email_L);
            add(phn_L);
            add(address_L);
            add(pass_L);
            add(confirmPass_L);
            //adding textfeild
            add(nameTf);
            add(phnTf);
            add(mailTf);
            add(addressTf);
            add(pfeild);
            add(confirmPfeild);
            //adding button
            add(backbtn);
            add(regbtn);

            setLocationRelativeTo(null);
            setLayout(null);
            setBackground(Color.GRAY);
            setVisible(true);

        } catch (Exception e) {
            System.out.println(e);

        }
    }
    public static void main(String[] args){
        new RegisterPage();
        }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==regbtn){
            String name=nameTf.getText();
            String pass=pfeild.getText();

            if (name.isEmpty() && pass.isEmpty())
            {
                JOptionPane.showMessageDialog(null,"Please provide all data");
            }
            else {
                try
                {
                    FileWriter fw = new FileWriter("C:/Users/Lenovo/OneDrive/Desktop/Group7/CarManagementSystem/Gui/data.txt", true);
                    fw.write(nameTf.getText()+","+pfeild.getText()+"\n");
                    fw.close();

                    new LoginPage();
                    dispose();
                }
                catch(Exception ek)
                {

                }
            }
        }

		else if(e.getSource()== backbtn){
			new LoginPage();
			dispose();
		}
    }
}
