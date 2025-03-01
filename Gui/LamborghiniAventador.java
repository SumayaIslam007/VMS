import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LamborghiniAventador extends JFrame implements ActionListener
{
	//ImageIcon logo,image1,sugpic1,sugpic2,sugpic3;
	JLabel imageLabel,sugpic1Label,sugpic2Label,sugpic3Label,modelLabel,refnoLabel,regyearLabel,mileageLabel,colorLabel;
	JTextField nameTF,amountTF,modelTF,refnoTF,regyearTF,mileageTF,colorTF;
	JButton paybtn,backbtn,sug1btn,sug2btn,sug3btn;
	JPanel panel;
	Color myColor;
	Font myFont;
	
	public LamborghiniAventador ()
	{
		super("Buy Page");
		this.setSize(1300,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myColor = new Color (210,230,135);
		myFont = new Font ("Bahnschrift SemiBold Condensed", Font.BOLD,60);		
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(myColor);
		
		imageLabel = new JLabel();
		imageLabel.setBounds(290, 120, 300, 300);
		ImageIcon car2=new ImageIcon("C:/Users/Lenovo/OneDrive/Desktop/Group7/CarManagementSystem/buy images/LamborghiniAventador.png");
        Image image2=car2.getImage();
        Image newImg2 = image2.getScaledInstance(imageLabel.getWidth(),imageLabel.getHeight(),  java.awt.Image.SCALE_SMOOTH); // scale it smoothly
        ImageIcon newImageIcon2 = new ImageIcon(newImg2);  // assign
        imageLabel.setIcon(newImageIcon2);
		//carbtn2.addMouseListener(this);
		//carbtn2.addActionListener(this);
		panel.add(imageLabel);
		
		nameTF = new JTextField("Aventador");
		nameTF.setBounds(175, 330, 100, 30);
		nameTF.setBackground(Color.WHITE);
		panel.add(nameTF);
		
		amountTF = new JTextField("$507,000");
		amountTF.setBounds(175, 370, 100, 30);
		amountTF.setBackground(Color.WHITE);
		panel.add(amountTF);
		
		modelTF = new JTextField("Lamborghini Aventador");
		modelTF.setBounds(930, 130, 130, 30);
		modelTF.setBackground(Color.WHITE);
		panel.add(modelTF);
		
		modelLabel = new JLabel("Model");
		modelLabel.setBounds(830, 130, 120, 30);
		//modelLabel.setBackground(Color.BLACK);
		//modelLabel.setOpaque(true);
		modelLabel.setForeground(Color.BLACK);
		modelLabel.setFont(new Font("Bahnschrift SemiBold Condensed", Font.BOLD, 20));;
		panel.add(modelLabel);
		
		refnoLabel = new JLabel("Ref No");
		refnoLabel.setBounds(830, 170, 120, 30);
		//refnoLabel.setBackground(Color.BLACK);
		//refnoLabel.setOpaque(true);
		refnoLabel.setForeground(Color.BLACK);
		refnoLabel.setFont(new Font("Bahnschrift SemiBold Condensed", Font.BOLD, 20));;
		panel.add(refnoLabel);
		
		refnoTF = new JTextField("3874676172");
		refnoTF.setBounds(930, 170, 130, 30);
		refnoTF.setBackground(Color.WHITE);
		panel.add(refnoTF);
		
		regyearLabel = new JLabel("Reg Year");
		regyearLabel.setBounds(830, 210, 120, 30);
		//regyearLabel.setBackground(Color.BLACK);
		//regyearLabel.setOpaque(true);
		regyearLabel.setForeground(Color.BLACK);
		regyearLabel.setFont(new Font("Bahnschrift SemiBold Condensed", Font.BOLD, 20));;
		panel.add(regyearLabel);
		
		regyearTF = new JTextField("2011");
		regyearTF.setBounds(930, 210, 130, 30);
		regyearTF.setBackground(Color.WHITE);
		panel.add(regyearTF);
		
		mileageLabel = new JLabel("Mileage");
		mileageLabel.setBounds(830, 250, 120, 30);
		//mileageLabel.setBackground(Color.BLACK);
		//mileageLabel.setOpaque(true);
		mileageLabel.setForeground(Color.BLACK);
		mileageLabel.setFont(new Font("Bahnschrift SemiBold Condensed", Font.BOLD, 20));;
		panel.add(mileageLabel);
		
		mileageTF = new JTextField("7.69 miles");
		mileageTF.setBounds(930, 250, 130, 30);
		mileageTF.setBackground(Color.WHITE);
		panel.add(mileageTF);
		
		colorLabel = new JLabel("Color");
		colorLabel.setBounds(830, 290, 120, 30);
		//colorLabel.setBackground(Color.BLACK);
		//colorLabel.setOpaque(true);
		colorLabel.setForeground(Color.BLACK);
		colorLabel.setFont(new Font("Bahnschrift SemiBold Condensed", Font.BOLD, 20));;
		panel.add(colorLabel);
		
		colorTF = new JTextField("Black");
		colorTF.setBounds(930, 290, 130, 30);
		colorTF.setBackground(Color.WHITE);
		panel.add(colorTF);
		
		paybtn = new JButton("Pay");
		paybtn.setBounds(920, 350, 80, 30);
		/*paybtn.addMouseListener(this);
		paybtn.addActionListener(this);*/
		panel.add(paybtn);
		
		backbtn = new JButton("Back");
		backbtn.setBounds(610, 600, 80, 30);
		//backbtn.addMouseListener(this);
		backbtn.addActionListener(this);
		panel.add(backbtn);
		
		sug1btn = new JButton("Sug Btn 1");
		sug1btn.setBounds(300, 450, 100, 40);
		//sug1btn.addMouseListener(this);
		sug1btn.addActionListener(this);
		panel.add(sug1btn);
		
		sug2btn = new JButton("Sug Btn 2");
		sug2btn.setBounds(400, 450, 100, 40);
		//sug2btn.addMouseListener(this);
		sug2btn.addActionListener(this);
		panel.add(sug2btn);
		
		sug3btn = new JButton("Sug Btn 3");
		sug3btn.setBounds(500, 450, 100, 40);
		//sug3btn.addMouseListener(this);
		sug3btn.addActionListener(this);
		panel.add(sug3btn);
		
		
		this.add(panel);
		this.setVisible(true);

	}
	/*public static void main(String[] args){
		new LamborghiniAventador();
		}*/
		
		public void actionPerformed(ActionEvent e) 
	{
        if(e.getSource() == sug1btn)
		{
            new LamborghiniAventador();
            dispose();
			LamborghiniAventador la1= new LamborghiniAventador();
		    la1.setVisible(true);
        }
		else if (e.getSource()== sug2btn)
		{
            new LamborghiniUrus();
            dispose();
			LamborghiniUrus lu1= new LamborghiniUrus();
		    lu1.setVisible(true);
        }
		else if (e.getSource()== sug3btn)
		{
            new NissanQashqai();
            dispose();
			NissanQashqai n1= new NissanQashqai();
		    n1.setVisible(true);
        }
		else if (e.getSource()== backbtn)
		{
            new Carselection();
            dispose();
			Carselection cs1= new Carselection();
		    cs1.setVisible(true);
        }
	}
	
}