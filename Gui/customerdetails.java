
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color; 
import java.awt.Cursor; 
import java.awt.Font;
import java.awt.Container;
 
 
public class customerdetails extends JFrame implements ActionListener
{
	private Container c;
	private JTable table;
	private ImageIcon icon;
	private Cursor cursor;
	private DefaultTableModel model;
	private JScrollPane scroll;
	private JLabel titleLabel,nLabel,phnLabel,emlLabel,adrsLabel;
	private JTextField nTf,phnTf,emlTf,adrsTf;
	private JButton insertButton,updateButton,deleteButton,clearButton,backButton;
	
	private String[] columns={"Name","phone","Email","Address"};
	private String[] rows=new String[4];
	
	
	public customerdetails()
	{
		JFrame frame1=new JFrame();
		frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame1.setBounds(60,100,900,800);
		frame1.setTitle("Car Management System");
	
		frame1.setSize(780,690);
		frame1.setLocationRelativeTo(null);
		frame1.setTitle("Car Management System");
		
		c=frame1.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.PINK);
		
		Font font=new Font("Arial",Font.BOLD,16);
	 cursor=new Cursor(Cursor.HAND_CURSOR);

		
		icon=new ImageIcon(getClass().getResource(""));
		frame1.setIconImage(icon.getImage());
		
		titleLabel=new JLabel("customer Registration");
		titleLabel.setFont(font);
		titleLabel.setBounds(140,10,250,50);
		c.add(titleLabel);
		
		nLabel=new JLabel("Name");
		nLabel.setFont(font);
		nLabel.setBounds(10,80,140,30);
		
		c.add(nLabel);
		
		nTf=new JTextField();
		nTf.setFont(font);
		nTf.setCursor(cursor);
		nTf.setToolTipText("Please input your name:");
		nTf.setBounds(110,80,200,30);
		nTf.setHorizontalAlignment(JTextField.CENTER);
		c.add(nTf);
		
		insertButton=new JButton("Insert");
		insertButton.setFont(font);
		insertButton.setCursor(cursor);
		insertButton.setBounds(400,80,100,30);
		c.add(insertButton);
		
		phnLabel=new JLabel("phone");
		phnLabel.setFont(font);
		phnLabel.setBounds(10,130,150,30);
		c.add(phnLabel);
		
		phnTf=new JTextField();
		phnTf.setFont(font);
		phnTf.setBounds(110,130,200,30);
		phnTf.setCursor(cursor);
		phnTf.setToolTipText("Please input your customer phone:");
		phnTf.setHorizontalAlignment(JTextField.CENTER);
		c.add(phnTf);
		
		updateButton=new JButton("Update");
		updateButton.setFont(font);
		updateButton.setCursor(cursor);
		updateButton.setBounds(400,130,100,30);
		c.add(updateButton);
		
		emlLabel=new JLabel("Email");
		emlLabel.setFont(font);
		emlLabel.setBounds(10,180,150,30);
		c.add(emlLabel);
		
		emlTf=new JTextField();
		emlTf.setFont(font);
		emlTf.setToolTipText("Please input your date:");
		emlTf.setCursor(cursor);
		emlTf.setBounds(110,180,200,30);
		emlTf.setHorizontalAlignment(JTextField.CENTER);
		c.add(emlTf);
		
		deleteButton=new JButton("Delete");
		deleteButton.setFont(font);
		deleteButton.setCursor(cursor);
		deleteButton.setBounds(400,180,100,30);
		c.add(deleteButton);
		
		adrsLabel=new JLabel("Address");
		adrsLabel.setFont(font);
		adrsLabel.setBounds(10,230,150,30);
		adrsLabel.setToolTipText("Please input your Address:");
		c.add(adrsLabel);
		
		adrsTf=new JTextField();
		adrsTf.setFont(font);
		adrsTf.setCursor(cursor);
		adrsTf.setBounds(110,230,200,30);
		adrsTf.setToolTipText("Please input your Address:");
		adrsTf.setHorizontalAlignment(JTextField.CENTER);
		c.add(adrsTf);
		
		clearButton=new JButton("Clear");
		clearButton.setFont(font);
		clearButton.setCursor(cursor);
		clearButton.setBounds(400,230,100,30);
		c.add(clearButton);
		
		backButton=new JButton("BACK");
		backButton.setCursor(cursor);
		backButton.setFont(font);
		backButton.setBounds(400,280,100,30);
		c.add(backButton);
		
		
		
		table=new JTable();
		
		model= new DefaultTableModel();
		model.setColumnIdentifiers(columns);
		table.setModel(model);
		table.setFont(font);
		table.setSelectionBackground(Color.GREEN);
		table.setBackground(Color.WHITE);
		table.setRowHeight(30);
		
		scroll=new JScrollPane(table);
		scroll.setBounds(10,360,740,265);
		c.add(scroll);
		
		insertButton.addActionListener(this);
		clearButton.addActionListener(this);
		deleteButton.addActionListener(this);
		updateButton.addActionListener(this);
		
		backButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				new payment();
				frame1.dispose();
			}
		});
		
		table.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent me)
			{
				int numberofRow=table.getSelectedRow();
				String name=model.getValueAt(numberofRow,0).toString();
				String phone=model.getValueAt(numberofRow,1).toString();
				String email=model.getValueAt(numberofRow,2).toString();
				String address=model.getValueAt(numberofRow,3).toString();
				
				nTf.setText(name);
				phnTf.setText(phone);
				emlTf.setText(email);
				adrsTf.setText(address);
			}
				
			
			
				
		});

		frame1.setVisible(true);
		
	}

	/*public static void main(String[] args) {
		new customerdetails()
	}*/
		
		
		public void actionPerformed(ActionEvent e)
		{
				
			if(e.getSource()==insertButton)
			{
				rows[0]=nTf.getText();
				rows[1]=phnTf.getText();
				rows[2]=emlTf.getText();
				rows[3]=adrsTf.getText();
				model.addRow(rows);
				
			}
			else if(e.getSource()==clearButton)
			{
				nTf.setText(null);
				phnTf.setText(null);
				emlTf.setText(null);
				adrsTf.setText(null);
		
			}
			else if(e.getSource()==deleteButton)
			{
				int numberofRow=table.getSelectedRow();
				if(numberofRow>=0)
				{
					model.removeRow(numberofRow);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"No row has been selected");
				}
			}
			else if(e.getSource()==updateButton){
				new payment();
				dispose();
			}
		 
		
		}
		
}	
		
		


		
		
		
		
		
		
