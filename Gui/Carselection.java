import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Carselection extends JFrame implements ActionListener

{
	ImageIcon image1,image2,image3,image4,image5,image6,image7,image8,image9,image10;
	JLabel carselLabel,welLabel;//image1Label,image2Label,image3Label,image4Label,image5Label,image6Label,image7Label,image8Label,image9Label,image10Label;
	JButton carbtn1,carbtn2,carbtn3,carbtn4,carbtn5,carbtn6,carbtn7,carbtn8,carbtn9,carbtn10,backbtn;
	JPanel panel;
	Color myColor;
	Font myFont;
	
	public Carselection ()
	{
		super("Car Management System");
		this.setSize(1920,1080);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myColor = new Color (210,230,135);
		myFont = new Font ("Bahnschrift SemiBold Condensed", Font.BOLD,30);		
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(myColor);
		
	    carselLabel =new JLabel ("Car Management System");
		carselLabel.setBounds (520,25,625,40);
		carselLabel.setForeground(Color.BLACK);
		carselLabel.setFont(myFont);
		panel.add(carselLabel);
		
		welLabel =new JLabel ("Welcome");
		welLabel.setBounds (1060,25,625,40);
		welLabel.setForeground(Color.BLACK);
		welLabel.setFont(myFont);
		panel.add(welLabel);
		
		carbtn1 = new JButton();
		carbtn1.setBounds(40, 120, 200, 200);
		ImageIcon car1=new ImageIcon("C:/Users/Lenovo/OneDrive/Desktop/Group7/CarManagementSystem/buy images/KoenigseggRegera.png");
        Image image1=car1.getImage();
        Image newImg1 = image1.getScaledInstance(carbtn1.getWidth(),carbtn1.getHeight(),  java.awt.Image.SCALE_SMOOTH); // scale it smoothly
        ImageIcon newImageIcon1 = new ImageIcon(newImg1);  // assign
        carbtn1.setIcon(newImageIcon1);
		carbtn1.addActionListener(this);
		panel.add(carbtn1);
		
		carbtn2 = new JButton();
		carbtn2.setBounds(290, 120, 200, 200);
		ImageIcon car2=new ImageIcon("C:/Users/Lenovo/OneDrive/Desktop/Group7/CarManagementSystem/buy images/ChevroletCamaro.png");
        Image image2=car2.getImage();
        Image newImg2 = image2.getScaledInstance(carbtn2.getWidth(),carbtn2.getHeight(),  java.awt.Image.SCALE_SMOOTH); // scale it smoothly
        ImageIcon newImageIcon2 = new ImageIcon(newImg2);  // assign
        carbtn2.setIcon(newImageIcon2);
		//carbtn2.addMouseListener(this);
		carbtn2.addActionListener(this);
		panel.add(carbtn2);
		
		carbtn3 = new JButton(image3);
		carbtn3.setBounds(540, 120, 200, 200);
		ImageIcon car3=new ImageIcon("C:/Users/Lenovo/OneDrive/Desktop/Group7/CarManagementSystem/buy images/HondaCRV.png");
        Image image3=car3.getImage();
        Image newImg3 = image3.getScaledInstance(carbtn3.getWidth(),carbtn3.getHeight(),  java.awt.Image.SCALE_SMOOTH); // scale it smoothly
        ImageIcon newImageIcon3 = new ImageIcon(newImg3);  // assign
        carbtn3.setIcon(newImageIcon3);
		//carbtn3.addMouseListener(this);
		carbtn3.addActionListener(this);
		panel.add(carbtn3);
		
		carbtn4 = new JButton(image4);
		carbtn4.setBounds(790, 120, 200, 200);
		ImageIcon car4=new ImageIcon("C:/Users/Lenovo/OneDrive/Desktop/Group7/CarManagementSystem/buy images/JeepCherokee.png");
        Image image4=car4.getImage();
        Image newImg4 = image4.getScaledInstance(carbtn4.getWidth(),carbtn4.getHeight(),  java.awt.Image.SCALE_SMOOTH); // scale it smoothly
        ImageIcon newImageIcon4 = new ImageIcon(newImg4);  // assign
        carbtn4.setIcon(newImageIcon4);
		//carbtn4.addMouseListener(this);
		carbtn4.addActionListener(this);
		panel.add(carbtn4);
		
		carbtn5 = new JButton(image5);
		carbtn5.setBounds(1040, 120, 200, 200);
		ImageIcon car5=new ImageIcon("C:/Users/Lenovo/OneDrive/Desktop/Group7/CarManagementSystem/buy images/LamborghiniAventador.png");
        Image image5=car5.getImage();
        Image newImg5 = image5.getScaledInstance(carbtn5.getWidth(),carbtn5.getHeight(),  java.awt.Image.SCALE_SMOOTH); // scale it smoothly
        ImageIcon newImageIcon5 = new ImageIcon(newImg5);  // assign
        carbtn5.setIcon(newImageIcon5);
		//carbtn5.addMouseListener(this);
		carbtn5.addActionListener(this);
		panel.add(carbtn5);
		
		carbtn6 = new JButton(image6);
		carbtn6.setBounds(40, 350, 200, 200);
		ImageIcon car6=new ImageIcon("C:/Users/Lenovo/OneDrive/Desktop/Group7/CarManagementSystem/buy images/LamborghiniUrus.png");
        Image image6=car6.getImage();
        Image newImg6 = image6.getScaledInstance(carbtn6.getWidth(),carbtn6.getHeight(),  java.awt.Image.SCALE_SMOOTH); // scale it smoothly
        ImageIcon newImageIcon6 = new ImageIcon(newImg6);  // assign
        carbtn6.setIcon(newImageIcon6);
		//carbtn6.addMouseListener(this);
		carbtn6.addActionListener(this);
		panel.add(carbtn6);
		
		carbtn7 = new JButton(image7);
		carbtn7.setBounds(290, 350, 200, 200);
		ImageIcon car7=new ImageIcon("C:/Users/Lenovo/OneDrive/Desktop/Group7/CarManagementSystem/buy images/NissanQashqai.png");
        Image image7=car7.getImage();
        Image newImg7 = image7.getScaledInstance(carbtn7.getWidth(),carbtn7.getHeight(),  java.awt.Image.SCALE_SMOOTH); // scale it smoothly
        ImageIcon newImageIcon7 = new ImageIcon(newImg7);  // assign
        carbtn7.setIcon(newImageIcon7);
		//carbtn7.addMouseListener(this);
		carbtn7.addActionListener(this);
		panel.add(carbtn7);
		
		carbtn8 = new JButton(image8);
		carbtn8.setBounds(540, 350, 200, 200);
		ImageIcon car8=new ImageIcon("C:/Users/Lenovo/OneDrive/Desktop/Group7/CarManagementSystem/buy images/RenaultClio.png");
        Image image8=car8.getImage();
        Image newImg8 = image8.getScaledInstance(carbtn8.getWidth(),carbtn8.getHeight(),  java.awt.Image.SCALE_SMOOTH); // scale it smoothly
        ImageIcon newImageIcon8 = new ImageIcon(newImg8);  // assign
        carbtn8.setIcon(newImageIcon8);
		//carbtn8.addMouseListener(this);
		carbtn8.addActionListener(this);
		panel.add(carbtn8);
		
		carbtn9 = new JButton(image9);
		carbtn9.setBounds(790, 350, 200, 200);
		ImageIcon car9=new ImageIcon("C:/Users/Lenovo/OneDrive/Desktop/Group7/CarManagementSystem/buy images/ToyotaCrownAthlete.png");
        Image image9=car9.getImage();
        Image newImg9 = image9.getScaledInstance(carbtn9.getWidth(),carbtn9.getHeight(),  java.awt.Image.SCALE_SMOOTH); // scale it smoothly
        ImageIcon newImageIcon9 = new ImageIcon(newImg9);  // assign
        carbtn9.setIcon(newImageIcon9);
		//carbtn9.addMouseListener(this);
		carbtn9.addActionListener(this);
		panel.add(carbtn9);
		
		carbtn10 = new JButton(image10);
		carbtn10.setBounds(1040, 350, 200, 200);
		ImageIcon car10=new ImageIcon("C:/Users/Lenovo/OneDrive/Desktop/Group7/CarManagementSystem/buy images/VolkswagenPolo.png");
        Image image10=car10.getImage();
        Image newImg10 = image10.getScaledInstance(carbtn10.getWidth(),carbtn10.getHeight(),  java.awt.Image.SCALE_SMOOTH); // scale it smoothly
        ImageIcon newImageIcon10 = new ImageIcon(newImg10);  // assign
        carbtn10.setIcon(newImageIcon10);
		//carbtn10.addMouseListener(this);
		carbtn10.addActionListener(this);
		panel.add(carbtn10);
		
		//nextbtn = new JButton("Next");
		//nextbtn.setBounds(975, 590, 75, 40);
		//nextbtn11.addMouseListener(this);
		//nextbtn11.addActionListener(this);
		//panel.add(nextbtn);
		
		backbtn = new JButton("Back");
		backbtn.setBounds(650, 590, 75, 40);
		//backbtn12.addMouseListener(this);
		backbtn.addActionListener(this);
		panel.add(backbtn);
		
		
		this.add(panel);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) 
	{
        if(e.getSource() == carbtn1)
		{
            new KoenigseggRegera();
            dispose();
			KoenigseggRegera k1 =new KoenigseggRegera ();
			k1.setVisible(true);
        }
        else if(e.getSource()== carbtn2)
		{
            new ChevroletCamaro();
            dispose();
			ChevroletCamaro c1 =new ChevroletCamaro ();
			c1.setVisible (true);
        }
        else if (e.getSource()== carbtn3)
		{
            new HondaCRV();
            dispose();
			HondaCRV h1= new HondaCRV();
		    h1.setVisible(true);
        }
		else if (e.getSource()== carbtn4)
		{
            new JeepCherokee();
            dispose();
			JeepCherokee j1= new JeepCherokee();
		    j1.setVisible(true);
        }
		else if (e.getSource()== carbtn5)
		{
            new LamborghiniAventador();
            dispose();
			LamborghiniAventador la1= new LamborghiniAventador();
		    la1.setVisible(true);
        }
		else if (e.getSource()== carbtn6)
		{
            new LamborghiniUrus();
            dispose();
			LamborghiniUrus lu1= new LamborghiniUrus();
		    lu1.setVisible(true);
        }
		else if (e.getSource()== carbtn7)
		{
            new NissanQashqai();
            dispose();
			NissanQashqai n1= new NissanQashqai();
		    n1.setVisible(true);
        }
		else if (e.getSource()== carbtn8)
		{
            new RenaultClio();
            dispose();
			RenaultClio r1= new RenaultClio();
		    r1.setVisible(true);
        }
		else if (e.getSource()== carbtn9)
		{
            new ToyotaCrownAthlete();
            dispose();
			ToyotaCrownAthlete t1= new ToyotaCrownAthlete();
		    t1.setVisible(true);
        }
		else if (e.getSource()== carbtn10)
		{
            new VolkswagenPolo();
            dispose();
			VolkswagenPolo v1= new VolkswagenPolo();
		    v1.setVisible(true);
        }
		else if(e.getSource()==backbtn)
		{ 
	        new DashBoard();
			dispose();
		}
	
    }
	/*public static void main(String[] args){
		new Carselection();
}*/
}
