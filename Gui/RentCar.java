import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RentCar extends JFrame implements  ActionListener
{
    JLabel label1,label2;
    JButton logoutbtn,i1,i2,i3,i4,i5,i6,i7,i8,backbtn;
    public RentCar(){
        super("Rent our car");
        this.setBounds(0,0,860,510);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(true);
        this.setLocationRelativeTo(null);

    //adding label
        label1=new JLabel("Car Management System");
        label1.setBounds(50,30,230,30);
        label1.setBackground(Color.BLACK);
        label1.setForeground(Color.WHITE);
        label1.setBorder(BorderFactory.createEmptyBorder());
        Border blackBorder = BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(105, 51, 126));
        Font label1Font=new Font("Times New Roman", Font.BOLD, 20);
        label1.setFont(label1Font);
        label1.setBorder(blackBorder);
        label1.setOpaque(true);
        this.add(label1);


        label2=new JLabel("Welcome");
        label2.setBounds(460,30,270,30);
        Border blackBorder2 = BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(105, 51, 126));
        Font label2Font=new Font("Times New Roman", Font.BOLD, 20);
        label2.setFont(label2Font);
        label2.setBackground(Color.BLACK);
        label2.setForeground(Color.WHITE);
        label2.setBorder(blackBorder2);
        label2.setOpaque(true);
        this.add(label2);

    //adding button
        logoutbtn=new JButton();
        logoutbtn.setBounds(725,30,40,30);
        ImageIcon logout=new ImageIcon("C:/Users/Lenovo/OneDrive/Desktop/Group7/CarManagementSystem/rent car Image/logout.png");
        Image image1=logout.getImage();
        Image newImg1 = image1.getScaledInstance(logoutbtn.getWidth(),logoutbtn.getHeight(),  java.awt.Image.SCALE_SMOOTH); // scale it smoothly
        ImageIcon newImageIcon = new ImageIcon(newImg1);  // assign
        logoutbtn.setIcon(newImageIcon);
        logoutbtn.setBackground(Color.BLACK);
        logoutbtn.setOpaque(true);
        logoutbtn.addActionListener(this);
        this.add(logoutbtn);


        i1=new JButton("car1");
        i1.setBounds(10,90,210,150);
        ImageIcon car1=new ImageIcon("C:/Users/Lenovo/OneDrive/Desktop/Group7/CarManagementSystem/rent car Image/Toyota_Avalon_XSE_2019.png");
        Image image2=car1.getImage();
        Image newImg2 = image2.getScaledInstance(i1.getWidth(),i1.getHeight(),  java.awt.Image.SCALE_SMOOTH); // scale it smoothly
        ImageIcon newImageIcon2 = new ImageIcon(newImg2);  // assign
        i1.setIcon(newImageIcon2);
        i1.addActionListener(this);
        this.add(i1);

        i2=new JButton("car2");
        i2.setBounds(220,90,210,150);
        ImageIcon car2=new ImageIcon("C:/Users/Lenovo/OneDrive/Desktop/Group7/CarManagementSystem/rent car Image/nissan-murano.png");
        Image image3=car2.getImage();
        Image newImg3 = image3.getScaledInstance(i2.getWidth(),i2.getHeight(),  java.awt.Image.SCALE_SMOOTH); // scale it smoothly
        ImageIcon newImageIcon3 = new ImageIcon(newImg3);  // assign
        i2.setIcon(newImageIcon3);
        i2.addActionListener(this);
        this.add(i2);

        i3=new JButton("car3");
        i3.setBounds(430,90,210,150);
        ImageIcon car3=new ImageIcon("C:/Users/Lenovo/OneDrive/Desktop/Group7/CarManagementSystem/rent car Image/x-corolla-png-1.png");
        Image image4=car3.getImage();
        Image newImg4 = image4.getScaledInstance(i3.getWidth(),i3.getHeight(),  java.awt.Image.SCALE_SMOOTH); // scale it smoothly
        ImageIcon newImageIcon4 = new ImageIcon(newImg4);  // assign
        i3.setIcon(newImageIcon4);
        i3.addActionListener(this);
        this.add(i3);

        i4=new JButton("car4");
        i4.setBounds(640,90,210,150);
        ImageIcon car4=new ImageIcon("C:/Users/Lenovo/OneDrive/Desktop/Group7/CarManagementSystem/rent car Image/suzuki.jpg");
        Image image5=car4.getImage();
        Image newImg5 = image5.getScaledInstance(i4.getWidth(),i4.getHeight(),  java.awt.Image.SCALE_SMOOTH); // scale it smoothly
        ImageIcon newImageIcon5 = new ImageIcon(newImg5);  // assign
        i4.setIcon(newImageIcon5);
        i4.addActionListener(this);
        this.add(i4);

        i5=new JButton("car5");
        i5.setBounds(10,250,210,150);
        ImageIcon car5=new ImageIcon("C:/Users/Lenovo/OneDrive/Desktop/Group7/CarManagementSystem/rent car Image/thumb-honda-freed-6.png");
        Image image6=car5.getImage();
        Image newImg6 = image6.getScaledInstance(i5.getWidth(),i5.getHeight(),  java.awt.Image.SCALE_SMOOTH); // scale it smoothly
        ImageIcon newImageIcon6 = new ImageIcon(newImg6);  // assign
        i5.setIcon(newImageIcon6);
        i5.addActionListener(this);
        this.add(i5);

        i6=new JButton("car6");
        i6.setBounds(220,250,210,150);
        ImageIcon car6=new ImageIcon("C:/Users/Lenovo/OneDrive/Desktop/Group7/CarManagementSystem/rent car Image/2020-Toyota-Corolla-Axio-Hybrid.jpg");
        Image image7=car6.getImage();
        Image newImg7 = image7.getScaledInstance(i6.getWidth(),i6.getHeight(),  java.awt.Image.SCALE_SMOOTH); // scale it smoothly
        ImageIcon newImageIcon7 = new ImageIcon(newImg7);  // assign
        i6.setIcon(newImageIcon7);
        i6.addActionListener(this);
        this.add(i6);

        i7=new JButton("car7");
        i7.setBounds(430,250,210,150);
        ImageIcon car7=new ImageIcon("C:/Users/Lenovo/OneDrive/Desktop/Group7/CarManagementSystem/rent car Image/rav4.jpg");
        Image image8=car7.getImage();
        Image newImg8 = image8.getScaledInstance(i7.getWidth(),i7.getHeight(),  java.awt.Image.SCALE_SMOOTH); // scale it smoothly
        ImageIcon newImageIcon8 = new ImageIcon(newImg8);  // assign
        i7.setIcon(newImageIcon8);
        i7.addActionListener(this);
        this.add(i7);

        i8=new JButton("car8");
        i8.setBounds(640,250,210,150);
        ImageIcon car8=new ImageIcon("C:/Users/Lenovo/OneDrive/Desktop/Group7/CarManagementSystem/rent car Image/toyota.jpg");
        Image image9=car8.getImage();
        Image newImg9 = image9.getScaledInstance(i8.getWidth(),i8.getHeight(),  java.awt.Image.SCALE_SMOOTH); // scale it smoothly
        ImageIcon newImageIcon9 = new ImageIcon(newImg9);  // assign
        i8.setIcon(newImageIcon9);
        i8.addActionListener(this);
        this.add(i8);


        backbtn=new JButton("Back");
        backbtn.setBounds(370,430,120,30);
        backbtn.setBackground(Color.BLACK);
        backbtn.setForeground(Color.WHITE);
        backbtn.addActionListener(this);
        this.add(backbtn);

        this.setVisible(true);

    }

    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==logoutbtn){
            JOptionPane.showMessageDialog(this,"Are you Sure?");
            new LoginPage();
            dispose();
        }
        else if (e.getSource() == i1) {
            new toyota_Avalon();
            dispose();

        }
        else if (e.getSource() == i2) {
            new Nissan();
            dispose();

        }
        else if (e.getSource() == i3) {
            new x_corolla();
            dispose();

        }
        else if (e.getSource() == i4) {
            new suzuki();
            dispose();

        }
        else if (e.getSource() == i5) {
            new thumb_honda();
            dispose();

        }
        else if (e.getSource() == i6) {
            new toyota_axio_hybrid();
            dispose();

        }
        else if (e.getSource() == i7) {
            new rav4();
            dispose();

        }
        else if (e.getSource() == i8) {
            new Toyota();
            dispose();
        }
        else if (e.getSource()==backbtn) {
            new DashBoard();
            dispose();

        }
        else{}
    }
    /*public static void main(String[] args) {
        new RentCar();
    }*/

}

