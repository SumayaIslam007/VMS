import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Nissan extends JFrame implements ActionListener {
    //JPanel panel;
    JLabel logo, carimage, model, regno, regyr, mileage, color, pickD, returnD;
    JTextField name, amount, modelTf, regTf, regYrTf, mileageTf, colorTf, pickTf, returnTf;
    JButton rent, suggestpic1, suggestpic2, suggestpic3, backbtn;

    public Nissan() {


        super("Car Details");
        try {
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLayout(null);
            //setResizable(false);
            setBounds(0, 0, 650, 650);
            setLocationRelativeTo(null);

            //adding label
            logo = new JLabel();
            logo.setBounds(0, 0, 650, 90);
            logo.setBackground(Color.GRAY);
            logo.setOpaque(true);
            ImageIcon imageIcon = new ImageIcon("C:/Users/Lenovo/OneDrive/Desktop/Group7/CarManagementSystem/rent car Image/logo1.png"); // assign image to a new ImageIcon
            Image image = imageIcon.getImage(); // transform it
            Image newImg = image.getScaledInstance(logo.getWidth(), logo.getHeight(), java.awt.Image.SCALE_SMOOTH); // scale it smoothly
            ImageIcon newImageIcon = new ImageIcon(newImg);  // assign
            logo.setIcon(newImageIcon);
            add(logo);

            carimage = new JLabel();
            carimage.setBounds(40, 120, 210, 210);
//            carimage.setBackground(Color.BLUE);
            ImageIcon imageIcon2 = new ImageIcon("C:/Users/Lenovo/OneDrive/Desktop/Group7/CarManagementSystem/rent car Image/nissan-murano.png");
            Image image2 = imageIcon2.getImage();
            Image Img2 = image2.getScaledInstance(carimage.getWidth(), carimage.getHeight(), java.awt.Image.SCALE_SMOOTH); // scale it smoothly
            ImageIcon newImageIcon2 = new ImageIcon(Img2);
            carimage.setIcon(newImageIcon2);
            carimage.setBackground(Color.BLACK);
//            carimage.setOpaque(true);
//            validate();
            add(carimage);

            //adding labels
            model = new JLabel("Model");
            model.setBounds(300, 120, 110, 30);
            model.setBackground(Color.BLACK);
            add(model);

            regno = new JLabel("Reg No");
            regno.setBounds(300, 150, 110, 30);
            regno.setBackground(Color.BLACK);
            add(regno);

            regyr = new JLabel("Reg Year");
            regyr.setBounds(300, 180, 110, 30);
            regyr.setBackground(Color.BLACK);
            add(regyr);

            mileage = new JLabel("Mileage");
            mileage.setBounds(300, 210, 110, 30);
            mileage.setBackground(Color.BLACK);
            add(mileage);

            color = new JLabel("Color");
            color.setBounds(300, 240, 60, 30);
            color.setBackground(Color.BLACK);
            add(color);

            pickD = new JLabel("Pick-up Date");
            pickD.setBounds(300, 270, 110, 30);
            pickD.setBackground(Color.BLACK);
            add(pickD);

            returnD = new JLabel("Return Date");
            returnD.setBounds(300, 300, 110, 30);
            returnD.setBackground(Color.BLACK);
            add(returnD);

            //adding textfeild
            name = new JTextField("Nissan");
            name.setBounds(85, 340, 125, 30);
            name.setBackground(Color.black);
            name.setForeground(Color.WHITE);
            name.setEditable(false);
            add(name);

            amount = new JTextField("30,21,800 BDT");
            amount.setBounds(85, 380, 120, 40);
            amount.setBackground(Color.BLACK);
            amount.setForeground(Color.WHITE);
            amount.setEditable(false);
            add(amount);

            modelTf = new JTextField("Nissan Rogue Front");
            modelTf.setBounds(410, 120, 140, 30);
            modelTf.setBackground(Color.BLACK);
            modelTf.setForeground(Color.WHITE);
            modelTf.setEditable(false);
            add(modelTf);

            regTf = new JTextField("7549");
            regTf.setBounds(410, 150, 140, 30);
            regTf.setBackground(Color.BLACK);
            regTf.setForeground(Color.WHITE);
            regTf.setEditable(false);
            add(regTf);

            regYrTf = new JTextField("2019");
            regYrTf.setBounds(410, 180, 140, 30);
            regYrTf.setBackground(Color.BLACK);
            regYrTf.setForeground(Color.WHITE);
            regYrTf.setEditable(false);
            add(regYrTf);

            mileageTf = new JTextField("20Km");
            mileageTf.setBounds(410, 210, 140, 30);
            mileageTf.setBackground(Color.BLACK);
            mileageTf.setForeground(Color.WHITE);
            mileageTf.setEditable(false);
            add(mileageTf);

            colorTf = new JTextField("Brown");
            colorTf.setBounds(410, 240, 140, 30);
            colorTf.setBackground(Color.BLACK);
            colorTf.setForeground(Color.WHITE);
            colorTf.setEditable(false);
            add(colorTf);

            pickTf = new JTextField();
            pickTf.setBounds(410, 270, 140, 30);
            pickTf.setBackground(Color.BLACK);
            pickTf.setForeground(Color.WHITE);
            add(pickTf);

            returnTf = new JTextField();
            returnTf.setBounds(410, 300, 140, 30);
            returnTf.setBackground(Color.BLACK);
            returnTf.setForeground(Color.WHITE);
            add(returnTf);

            //adding buttons
            rent = new JButton("Rent");
            rent.setBounds(340, 350, 120, 40);
            rent.addActionListener(this);
            rent.setForeground(Color.BLACK);
            rent.setBackground(Color.MAGENTA);
            rent.addActionListener(this);
            add(rent);


            suggestpic1 = new JButton("Thumb Honda");
            suggestpic1.setBounds(20, 460, 170, 70);
            suggestpic1.addActionListener(this);
            suggestpic1.setBackground(Color.BLACK);
            suggestpic1.setForeground(Color.WHITE);
            add(suggestpic1);

            suggestpic2 = new JButton("Axio Hybrid");
            suggestpic2.setBounds(220, 460, 170, 70);
            suggestpic2.setForeground(Color.WHITE);
            suggestpic2.setBackground(Color.BLACK);
            suggestpic2.addActionListener(this);
            add(suggestpic2);

            suggestpic3 = new JButton("Suzuki");
            suggestpic3.setBounds(415, 460, 170, 70);
            suggestpic3.setForeground(Color.WHITE);
            suggestpic3.setBackground(Color.BLACK);
            suggestpic3.addActionListener(this);
            add(suggestpic3);

            backbtn = new JButton("Back");
            backbtn.setBounds(237, 560, 135, 30);
            backbtn.setForeground(Color.BLACK);
            //backbtn.setBackground(Color.YELLOW);
            backbtn.addActionListener(this);
            add(backbtn);


            setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == suggestpic1) {
            new thumb_honda();
            dispose();
        } else if (e.getSource() == suggestpic2) {
            new toyota_axio_hybrid();
            dispose();
        } else if (e.getSource() == suggestpic3) {
            new suzuki();
            dispose();
        } else if (e.getSource() == backbtn) {
            new RentCar();
            dispose();
        }
        else if(e.getSource()==rent){
            new customerdetails();
            dispose();
        }

    }

    /*public static void main(String[] args) {
        new Nissan();
    }*/
}