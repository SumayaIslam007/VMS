import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class thumb_honda extends JFrame implements ActionListener {
    //JPanel panel;
    JLabel logo,carimage,model,regno,regyr,mileage,color,pickD,returnD;
    JTextField name,amount,modelTf,regTf,regYrTf,mileageTf,colorTf;
    JButton rent,suggestpic1,suggestpic2,suggestpic3,backbtn;
	JComboBox day1,day2,month1,month2,year1,year2;


    public thumb_honda(){


        super("Car Details");
        try{
            //adding panel
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLayout(null);
            //setResizable(false);
            setBounds(0,0,650,650);
            setLocationRelativeTo(null);

            //adding label
            logo=new JLabel();
            logo.setBounds(0,0,650,90);
            ImageIcon imageIcon = new ImageIcon("C:/Users/Lenovo/OneDrive/Desktop/Group7/CarManagementSystem/rent car Image/logo1.png"); // assign image to a new ImageIcon
            Image image = imageIcon.getImage(); // transform it
            Image newImg = image.getScaledInstance(logo.getWidth(), logo.getHeight(),  java.awt.Image.SCALE_SMOOTH); // scale it smoothly
            ImageIcon newImageIcon = new ImageIcon(newImg);  // assign
            logo.setIcon(newImageIcon);
            add(logo);

            carimage=new JLabel();
            carimage.setBounds(40,120,210,210);
            ImageIcon imageIcon1=new ImageIcon("C:/Users/Lenovo/OneDrive/Desktop/Group7/CarManagementSystem/rent car Image/thumb-honda-freed-6.png");
            Image image2=imageIcon1.getImage();
            Image Img2 = image2.getScaledInstance(carimage.getWidth(), carimage.getHeight(), java.awt.Image.SCALE_SMOOTH); // scale it smoothly
            ImageIcon newImageIcon2 =new ImageIcon(Img2);
            carimage.setIcon(newImageIcon2);
            add(carimage);

            //adding labels
            model=new JLabel("Model");
            model.setBounds(300,120,110,30);
            model.setBackground(Color.BLACK);
            add(model);

            regno=new JLabel("Reg No");
            regno.setBounds(300,150,110,30);
            regno.setBackground(Color.BLACK);
            add(regno);

            regyr=new JLabel("Reg Year");
            regyr.setBounds(300,180,110,30);
            regyr.setBackground(Color.BLACK);
            add(regyr);

            mileage=new JLabel("Mileage");
            mileage.setBounds(300,210,110,30);
            mileage.setBackground(Color.BLACK);
            add(mileage);

            color=new JLabel("Color");
            color.setBounds(300,240,60,30);
            color.setBackground(Color.BLACK);
            add(color);

            pickD=new JLabel("Pick-up Date");
            pickD.setBounds(300,270,110,30);
            pickD.setBackground(Color.BLACK);
            add(pickD);

            returnD=new JLabel("Return Date");
            returnD.setBounds(300,300,110,30);
            returnD.setBackground(Color.BLACK);
            add(returnD);

            //adding textfeild
            name=new JTextField("Honda");
            name.setBounds(85,340,125,30);
            name.setBackground(Color.BLACK);
            name.setForeground(Color.WHITE);
            name.setEditable(false);
            add(name);

            amount=new JTextField("35,67,750 BDT");
            amount.setBounds(85,380,120,40);
            amount.setBackground(Color.BLACK);
            amount.setForeground(Color.WHITE);
            amount.setEditable(false);
            add(amount);

            modelTf=new JTextField("2016 Honda CR-V");
            modelTf.setBounds(410,120,140,30);
            modelTf.setBackground(Color.BLACK);
            modelTf.setForeground(Color.WHITE);
            modelTf.setEditable(false);
            add(modelTf);

            regTf=new JTextField("0598");
            regTf.setBounds(410,150,140,30);
            regTf.setBackground(Color.BLACK);
            regTf.setForeground(Color.WHITE);
            regTf.setEditable(false);
            add(regTf);

            regYrTf=new JTextField("2016");
            regYrTf.setBounds(410,180,140,30);
            regYrTf.setBackground(Color.BLACK);
            regYrTf.setForeground(Color.WHITE);
            regYrTf.setEditable(false);
            add(regYrTf);

            mileageTf=new JTextField("30Km");
            mileageTf.setBounds(410,210,140,30);
            mileageTf.setBackground(Color.BLACK);
            mileageTf.setForeground(Color.WHITE);
            mileageTf.setEditable(false);
            add(mileageTf);

            colorTf=new JTextField("Light-Blue");
            colorTf.setBounds(410,240,140,30);
            colorTf.setBackground(Color.BLACK);
            colorTf.setForeground(Color.WHITE);
            colorTf.setEditable(false);
            add(colorTf);

            /*pickTf=new JTextField();
            pickTf.setBounds(410,270,140,30);
            pickTf.setBackground(Color.BLACK);
            pickTf.setForeground(Color.WHITE);
            add(pickTf);

            returnTf=new JTextField();
            returnTf.setBounds(410,300,140,30);
            returnTf.setBackground(Color.BLACK);
            returnTf.setForeground(Color.WHITE);
            add(returnTf);*/

            //adding buttons
            rent=new JButton("Rent");
            rent.setBounds(340,350,120,40);
            rent.setForeground(Color.BLACK);
            rent.setBackground(Color.MAGENTA);
            rent.addActionListener(this);
            add(rent);


            suggestpic1 = new JButton("Toyota axio ahybrid");
            suggestpic1.setBounds(20,460,170,70);
            suggestpic1.addActionListener(this);
            suggestpic1.setBackground(Color.BLACK);
            suggestpic1.setForeground(Color.WHITE);
            add(suggestpic1);

            suggestpic2 = new JButton("Suzuki");
            suggestpic2.setBounds(220,460,170,70);
            suggestpic2.setForeground(Color.WHITE);
            suggestpic2.setBackground(Color.BLACK);
            suggestpic2.addActionListener(this);
            add(suggestpic2);

            suggestpic3 = new JButton("Toyota Avalon");
            suggestpic3.setBounds(415,460,170,70);
            suggestpic3.setForeground(Color.WHITE);
            suggestpic3.setBackground(Color.BLACK);
            suggestpic3.addActionListener(this);
            add(suggestpic3);

            backbtn=new JButton("Back");
            backbtn.setBounds(237,560,135,30);
            backbtn.setForeground(Color.BLACK);
            backbtn.addActionListener(this);
            add(backbtn);
			
			//adding combobox
            String days[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
            day1=new JComboBox(days);
            day1.setBounds(410,270,40,30);
            add(day1);

            String months[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
            month1=new JComboBox(months);
            month1.setBounds(444,270,50,30);
            add(month1);

            String years[]={"2021","2022","2023"};
            year1=new JComboBox(years);
            year1.setBounds(490,270,60,30);
            add(year1);

            String days1[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
            day2=new JComboBox(days1);
            day2.setBounds(410,300,40,30);
            add(day2);

            String months1[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
            month2=new JComboBox(months1);
            month2.setBounds(444,300,50,30);
            add(month2);

            String years1[]={"2021","2022","2023"};
            year2=new JComboBox(years1);
            year2.setBounds(490,300,60,30);
            add(year2);



            setVisible(true);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }



    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == suggestpic1){
            new toyota_axio_hybrid ();
            dispose();
        }
        else if(e.getSource()==suggestpic2){
            new suzuki();
            dispose();
        }
        else if (e.getSource()==suggestpic3){
            new toyota_Avalon();
            dispose();
        }
        else if (e.getSource() == backbtn) {
            new RentCar();
            dispose();
        }
		else if(e.getSource()==rent){
            new customerdetails();
            dispose();
        }

    }

    /*public static void main(String[] args) {
        new thumb_honda();
    }*/
}
