import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class payment extends JFrame implements ActionListener {
 private JPanel panel;
 private JLabel labelCash;
 private JLabel fulfill;
 private JLabel Crd;
 private JLabel labelCN;
 private JLabel top;
 private JLabel Cnum;
 private JLabel CVV;
 private JTextField textUser;
 private JTextField textP;
 private JTextField textConfirm;
 private JTextField textEmail;
 private JButton buttonConfirm;
 private JButton buttonPrevious;
 private JButton buttonExit;
 private JLabel image;
 private JLabel image1;
 private JLabel image2;
 public payment() {
  this.initializeComponents();
  this.setTitle("Payment Page");
  this.setSize(900, 600);
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
    private void initializeComponents(){


        this.panel = new JPanel(null);
        this.top=new JLabel("Pay Your Bill");
        this.top.setBounds(420,30,300,40);
        top.setFont(new Font("Calibri",Font.BOLD,38));
        top.setForeground(Color.black);
        this.panel.add(this.top);


        this.labelCash=new JLabel("We accept only");
        this.labelCash.setBounds(410,108,250,30);
        labelCash.setFont(new Font("Calibri",Font.BOLD,30));
        labelCash.setForeground(Color.BLACK);
        this.panel.add(this.labelCash);


        ImageIcon imagemaster= new ImageIcon(".\\Images\\wao1.png");
        this.image1 = new JLabel(imagemaster);
        this.image1.setBounds(608, 100, 67, 45);
        this.panel.add(this.image1);


        ImageIcon imagevisa= new ImageIcon(".\\Images\\wao2.png");
        this.image2 = new JLabel(imagevisa);
        this.image2.setBounds(678, 100, 67,45);
        this.panel.add(this.image2);


        this. textUser=new JTextField();
        this.textUser.setBounds(550,210,200,30);
        textUser.setFont(new Font("Calibri",Font.PLAIN,20));
        textUser.setBackground(Color.WHITE);
        this.panel.add(this.textUser);


        this.fulfill=new JLabel("Please Fill up Your Card Details Below.....");
        this.fulfill.setBounds(410,148,400,50);
        fulfill.setFont(new Font("Calibri",Font.BOLD,23));
        fulfill.setForeground(Color.BLACK);
        this.panel.add(this.fulfill);


        this.textP=new JTextField();
        this.textP.setBounds(550,250,200,30);
        textP.setFont(new Font("Calibri",Font.PLAIN,20));
        textP.setBackground(Color.WHITE);
        this.panel.add(this.textP);


        this.Crd=new JLabel("Name On Card:");
        this.Crd.setBounds(410,215,200,20);
        Crd.setForeground(Color.BLACK);
        this.panel.add(this.Crd);


        Crd.setFont(new Font("Calibri",Font.BOLD,20));
        this.labelCN=new JLabel("Card Number:");
        this.labelCN.setBounds(410,255,200,20);
        labelCN.setFont(new Font("Calibri",Font.BOLD,20));
        labelCN.setForeground(Color.BLACK);
        this.panel.add(this.labelCN);


        this.textEmail=new JTextField();
        this.textEmail.setBounds(550,330,100,30);
        textEmail.setFont(new Font("Calibri",Font.PLAIN,20));
        textEmail.setBackground(Color.WHITE);
        this.panel.add(this.textEmail);


        this.Cnum=new JLabel("Valid On:");
        this.Cnum.setBounds(410,295,200,20);
        Cnum.setForeground(Color.BLACK);
        this.panel.add(this.Cnum);


        Cnum.setFont(new Font("Calibri",Font.BOLD,20));
        this.textConfirm=new JTextField();
        this.textConfirm.setBounds(550,290,100,30);
        textConfirm.setFont(new Font("Calibri",Font.PLAIN,20));
        textConfirm.setBackground(Color.WHITE);
        this.panel.add(this.textConfirm);


        this.CVV=new JLabel("CVV Code:");
        this.CVV.setBounds(410,336,200,20);
        CVV.setForeground(Color.BLACK);
        this.panel.add(this.CVV);


        CVV.setFont(new Font("Calibri",Font.BOLD,20));
        ImageIcon image= new ImageIcon(".\\Images\\mainIcon.png");
        this.image = new JLabel(image);
        this.image.setBounds(20, 20, 300, 500);
        this.panel.add(this.image);


        this.buttonConfirm=new JButton("Confirm Payment");
        this.buttonConfirm.setBounds(510,405,200,30);
        buttonConfirm.setFont(new Font("Calibri",Font.BOLD,20));
        buttonConfirm.setForeground(Color.DARK_GRAY);
        buttonConfirm.setBackground(Color.GREEN);
        buttonConfirm.addActionListener(this);
        this.panel.add(this.buttonConfirm);


        this.buttonPrevious=new JButton("Previous");
        this.buttonPrevious.setBounds(400,460,120,30);
        buttonPrevious.setFont(new Font("Calibri",Font.BOLD,20));
        buttonPrevious.setForeground(Color.DARK_GRAY);
        buttonPrevious.setBackground(Color.PINK);
        buttonPrevious.addActionListener(this);
        this.panel.add(this.buttonPrevious);


        this.buttonExit=new JButton("Exit");
        this.buttonExit.setBounds(698,460,120,30);
        buttonExit.setFont(new Font("Calibri",Font.BOLD,20));
        buttonExit.setForeground(Color.DARK_GRAY);
        buttonExit.setBackground(Color.RED);
        buttonExit.addActionListener(this);
        this.panel.add(this.buttonExit);

        this.add(this.panel);
        this.setVisible(true);
 }

    /*public static void main(String[] args) {
        new payment();
    }*/
    public void actionPerformed(ActionEvent e){
     if(e.getSource()==buttonExit){
         JOptionPane.showMessageDialog(null,"Do you want to exit?");
         new DashBoard();
         dispose();
     }
     else if (e.getSource()==buttonPrevious) {
         new customerdetails();
         dispose();
     }
     else if(e.getSource()==buttonConfirm){
         JOptionPane.showMessageDialog(null,"Your payment is Done");
         new DashBoard();
         dispose();
     }
    }

}