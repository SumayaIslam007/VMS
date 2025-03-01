import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class DashBoard extends JFrame implements ActionListener {

    JLabel image1, dashbLabel;
    JButton buybtn, rentbtn,backbtn;
    // JPanel panel;
    Color myColor;
    Font myFont;

    public DashBoard() {
        super("Dashboard");
        try {
            this.setBounds(0, 0, 730, 460);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(null);
            this.setLocationRelativeTo(null);

            myColor = new Color(210, 230, 135);
            myFont = new Font("Bahnschrift SemiBold Condensed", Font.BOLD, 25);

            image1 = new JLabel();
            image1.setBounds(0, 0, 710, 430);
            ImageIcon imageIcon = new ImageIcon("C:/Users/Lenovo/OneDrive/Desktop/Group7/CarManagementSystem/rent car Image/cars1_png.png"); // assign image to a new ImageIcon
            Image image = imageIcon.getImage(); // transform it
            Image newImg = image.getScaledInstance(image1.getWidth(), image1.getHeight(), java.awt.Image.SCALE_SMOOTH); // scale it smoothly
            ImageIcon newImageIcon = new ImageIcon(newImg);  // assign
            image1.setIcon(newImageIcon);
            add(image1);

            dashbLabel = new JLabel("Dashboard");
            dashbLabel.setBounds(300, 90, 135, 40);
            dashbLabel.setFont(myFont);
            this.add(dashbLabel);

            buybtn = new JButton("Buy");
            buybtn.setBounds(120, 160, 180, 80);
            buybtn.setBackground(myColor);
            buybtn.setFont(myFont);
            //buybtn.addMouseListener(this);
            buybtn.addActionListener(this);
            this.add(buybtn);

            rentbtn = new JButton("Rent");
            rentbtn.setBounds(380, 160, 180, 80);
            rentbtn.setBackground(myColor);
            rentbtn.setFont(myFont);
            //rentbtn.addMouseListener(this);
            rentbtn.addActionListener(this);
            this.add(rentbtn);

            backbtn=new JButton("Back");
            backbtn.setBounds(300,260,80,30);
            backbtn.addActionListener(this);
            this.add(backbtn);
			
			
			this.setResizable(true);
		    this.setVisible(true);



        } catch (Exception e) {
            System.out.println(e);
        }
    }

        /*public static void main (String[]args){
            new DashBoard();
        }*/

        public void actionPerformed (ActionEvent ae){
            if (ae.getSource() == buybtn) {
                new Carselection();
                dispose();
            } else if (ae.getSource() == rentbtn) {
                new RentCar();
                dispose();
            }
            else if (ae.getSource()==backbtn) {
                new LoginPage();
                dispose();

            } else {
            }
        }
    }

