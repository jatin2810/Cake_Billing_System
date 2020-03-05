package CustomerBilling;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CustomerBilling extends JFrame {

	private JPanel contentPane;
	private JTextField customer_name;
	private JTextField customer_id;
	private JTextField address;
	private JTextField phone_number;
	private JTextField email;
	private JTextField pincode;
	private JTextField black_forrest;
	private JTextField pineapple;
	private JTextField chocolate;
	private JTextField red_velvet;
	private JTextField kitkat;
	private JTextField vanilla;
	private JTextField blueberry;
	private JTextField special_chocolate;
	private JTextField id_type;
	private JTextField tax;
	private JTextField sub_total;
	private JTextField total;
	
	String iTax,iSubTotal,iTotal;
	double [] itemcost= new double[20];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerBilling frame = new CustomerBilling();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CustomerBilling() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent arg0) {
				
				customer_id.setText(null);
//				customer_id.setEnabled(false);
				int id=2015+(int)(Math.random()*17328);
				String cId="";
				cId+=id+1560;
				customer_id.setText(cId);
				
				
				tax.setEnabled(false);
				sub_total.setEnabled(false);
				total.setEnabled(false);
				
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new MatteBorder(14, 14, 14, 14, (Color) Color.WHITE));
		panel.setBounds(0, 0, 1360, 740);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) Color.GRAY));
		panel_1.setBounds(31, 27, 392, 518);
		panel.add(panel_1);
		
		customer_name = new JTextField();
		customer_name.setBounds(188, 88, 172, 22);
		panel_1.add(customer_name);
		customer_name.setColumns(10);
		
		JLabel lblCustomerName = new JLabel("Customer Name");
		lblCustomerName.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblCustomerName.setBounds(27, 90, 149, 16);
		panel_1.add(lblCustomerName);
		
		customer_id = new JTextField();
		customer_id.setColumns(10);
		customer_id.setBounds(188, 40, 172, 22);
		panel_1.add(customer_id);
		
		JLabel lblCustomerId = new JLabel("Customer ID");
		lblCustomerId.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblCustomerId.setBounds(27, 42, 149, 16);
		panel_1.add(lblCustomerId);
		
		address = new JTextField();
		address.setColumns(10);
		address.setBounds(188, 134, 172, 22);
		panel_1.add(address);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblAddress.setBounds(27, 136, 149, 16);
		panel_1.add(lblAddress);
		
		phone_number = new JTextField();
		phone_number.setColumns(10);
		phone_number.setBounds(188, 185, 172, 22);
		panel_1.add(phone_number);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblPhoneNumber.setBounds(27, 187, 149, 16);
		panel_1.add(lblPhoneNumber);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(188, 235, 172, 22);
		panel_1.add(email);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblEmail.setBounds(27, 237, 149, 16);
		panel_1.add(lblEmail);
		
		pincode = new JTextField();
		pincode.setColumns(10);
		pincode.setBounds(188, 286, 172, 22);
		panel_1.add(pincode);
		
		JLabel lblTypeOfId = new JLabel("Pincode");
		lblTypeOfId.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblTypeOfId.setBounds(27, 288, 149, 16);
		panel_1.add(lblTypeOfId);
		
		JLabel label = new JLabel("Type of ID");
		label.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		label.setBounds(27, 335, 149, 16);
		panel_1.add(label);
		
		id_type = new JTextField();
		id_type.setColumns(10);
		id_type.setBounds(188, 333, 172, 22);
		panel_1.add(id_type);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBorder(new MatteBorder(10, 10, 10, 10, (Color) Color.GRAY));
		panel_2.setBounds(473, 24, 392, 665);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JCheckBox chk1 = new JCheckBox("Black Forrest@ Rs.150");
		chk1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chk1.isSelected())
				{
					black_forrest.setEnabled(true);
					black_forrest.setText("");
					black_forrest.requestFocus();

				}
				else
				{
					black_forrest.setEnabled(false);
					black_forrest.setText("0");
				}
			}
		});
		chk1.setBounds(35, 23, 241, 25);
		chk1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		chk1.setBackground(Color.LIGHT_GRAY);
		panel_2.add(chk1);
		
		black_forrest = new JTextField();
		black_forrest.setBounds(323, 26, 36, 22);
		black_forrest.setHorizontalAlignment(SwingConstants.CENTER);
		black_forrest.setText("0");
		black_forrest.setColumns(10);
		panel_2.add(black_forrest);
		
		JCheckBox chk2 = new JCheckBox("Pineapple Cake@Rs 250");
		chk2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chk2.isSelected())
				{
					pineapple.setEnabled(true);
					pineapple.setText("");
					pineapple.requestFocus();

				}
				else
				{
					pineapple.setEnabled(false);
					pineapple.setText("0");
				}
				
			}
		});
		chk2.setBounds(35, 71, 252, 25);
		chk2.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		chk2.setBackground(Color.LIGHT_GRAY);
		panel_2.add(chk2);
		
		pineapple = new JTextField();
		pineapple.setBounds(323, 74, 36, 22);
		pineapple.setHorizontalAlignment(SwingConstants.CENTER);
		pineapple.setText("0");
		pineapple.setColumns(10);
		panel_2.add(pineapple);
		
		JCheckBox chk3 = new JCheckBox("Chocolate Cake@Rs.200");
		chk3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chk3.isSelected())
				{
					chocolate.setEnabled(true);
					chocolate.setText("");
					chocolate.requestFocus();

				}
				else
				{
					chocolate.setEnabled(false);
					chocolate.setText("0");
				}
			}
		});
		chk3.setBounds(35, 121, 241, 25);
		chk3.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		chk3.setBackground(Color.LIGHT_GRAY);
		panel_2.add(chk3);
		
		chocolate = new JTextField();
		chocolate.setBounds(323, 124, 36, 22);
		chocolate.setHorizontalAlignment(SwingConstants.CENTER);
		chocolate.setText("0");
		chocolate.setColumns(10);
		panel_2.add(chocolate);
		
		JCheckBox chk4 = new JCheckBox("Red Velvet Cake@Rs.250");
		chk4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chk4.isSelected())
				{
					red_velvet.setEnabled(true);
					red_velvet.setText("");
					red_velvet.requestFocus();

				}
				else
				{
					red_velvet.setEnabled(false);
					red_velvet.setText("0");
				}
				
			}
		});
		chk4.setBounds(35, 175, 280, 25);
		chk4.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		chk4.setBackground(Color.LIGHT_GRAY);
		panel_2.add(chk4);
		
		red_velvet = new JTextField();
		red_velvet.setBounds(323, 178, 36, 22);
		red_velvet.setHorizontalAlignment(SwingConstants.CENTER);
		red_velvet.setText("0");
		red_velvet.setColumns(10);
		panel_2.add(red_velvet);
		
		JCheckBox chk5 = new JCheckBox("Crunchy Kit kat cake@Rs.300");
		chk5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chk5.isSelected())
				{
					kitkat.setEnabled(true);
					kitkat.setText("");
					kitkat.requestFocus();

				}
				else
				{
					kitkat.setEnabled(false);
					kitkat.setText("0");
				}
			}
		});
		chk5.setBounds(35, 236, 280, 25);
		chk5.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		chk5.setBackground(Color.LIGHT_GRAY);
		panel_2.add(chk5);
		
		kitkat = new JTextField();
		kitkat.setBounds(323, 237, 36, 22);
		kitkat.setHorizontalAlignment(SwingConstants.CENTER);
		kitkat.setText("0");
		kitkat.setColumns(10);
		panel_2.add(kitkat);
		
		JCheckBox chk6 = new JCheckBox("Vanilla Fruit cake@Rs.200");
		chk6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chk6.isSelected())
				{
					vanilla.setEnabled(true);
					vanilla.setText("");
					vanilla.requestFocus();

				}
				else
				{
					vanilla.setEnabled(false);
					vanilla.setText("0");
				}
			}
		});
		chk6.setBounds(35, 296, 265, 25);
		chk6.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		chk6.setBackground(Color.LIGHT_GRAY);
		panel_2.add(chk6);
		
		vanilla = new JTextField();
		vanilla.setBounds(323, 297, 36, 22);
		vanilla.setHorizontalAlignment(SwingConstants.CENTER);
		vanilla.setText("0");
		vanilla.setColumns(10);
		panel_2.add(vanilla);
		
		JCheckBox chk7 = new JCheckBox("Blueberry Cake@Rs.350");
		chk7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chk7.isSelected())
				{
					blueberry.setEnabled(true);
					blueberry.setText("");
					blueberry.requestFocus();

				}
				else
				{
					blueberry.setEnabled(false);
					blueberry.setText("0");
				}
			}
		});
		chk7.setBounds(35, 358, 265, 25);
		chk7.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		chk7.setBackground(Color.LIGHT_GRAY);
		panel_2.add(chk7);
		
		blueberry = new JTextField();
		blueberry.setBounds(323, 359, 36, 22);
		blueberry.setHorizontalAlignment(SwingConstants.CENTER);
		blueberry.setText("0");
		blueberry.setColumns(10);
		panel_2.add(blueberry);
		
		JCheckBox chk8 = new JCheckBox("Special Choco Cake@Rs 400");
		chk8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chk8.isSelected())
				{
					special_chocolate.setEnabled(true);
					special_chocolate.setText("");
					special_chocolate.requestFocus();

				}
				else
				{
					special_chocolate.setEnabled(false);
					special_chocolate.setText("0");
				}
			}
		});
		chk8.setBounds(35, 422, 280, 25);
		chk8.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		chk8.setBackground(Color.LIGHT_GRAY);
		panel_2.add(chk8);
		
		special_chocolate = new JTextField();
		special_chocolate.setBounds(323, 423, 36, 22);
		special_chocolate.setHorizontalAlignment(SwingConstants.CENTER);
		special_chocolate.setText("0");
		special_chocolate.setColumns(10);
		panel_2.add(special_chocolate);
		
		tax = new JTextField();
		tax.setBounds(187, 517, 172, 22);
		tax.setColumns(10);
		panel_2.add(tax);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setBounds(26, 519, 149, 16);
		lblTax.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		panel_2.add(lblTax);
		
		sub_total = new JTextField();
		sub_total.setBounds(187, 552, 172, 22);
		sub_total.setColumns(10);
		panel_2.add(sub_total);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setBounds(26, 554, 149, 16);
		lblSubTotal.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		panel_2.add(lblSubTotal);
		
		total = new JTextField();
		total.setBounds(187, 599, 172, 22);
		total.setColumns(10);
		panel_2.add(total);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(26, 601, 149, 16);
		lblTotal.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		panel_2.add(lblTotal);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_3.setLayout(null);
		panel_3.setBorder(new MatteBorder(10, 10, 10, 10, (Color) Color.GRAY));
		panel_3.setBounds(912, 27, 392, 518);
		panel.add(panel_3);
		
		JTextArea jtxtReceipt = new JTextArea();
		jtxtReceipt.setBounds(12, 13, 368, 492);
		panel_3.add(jtxtReceipt);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.LIGHT_GRAY);
		panel_4.setLayout(null);
		panel_4.setBorder(new MatteBorder(10, 10, 10, 10, (Color) Color.GRAY));
		panel_4.setBounds(912, 558, 392, 131);
		panel.add(panel_4);
		
		JButton btn_reset = new JButton("Reset");
		btn_reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				 
				 
//				black_forrest.setEnabled(false);
//				pineapple.setEnabled(false);
//				chocolate.setEnabled(false);
//				red_velvet.setEnabled(false);
//				kitkat.setEnabled(false);
//				vanilla.setEnabled(false);
//			    blueberry.setEnabled(false);
//				special_chocolate.setEnabled(false);
//				
				
				black_forrest.setText("0");
				pineapple.setText("0");
				chocolate.setText("0");
				red_velvet.setText("0");
				kitkat.setText("0");
				vanilla.setText("0");
			    blueberry.setText("0");
				special_chocolate.setText("0");
				
				tax.setText("0");
				sub_total.setText("0");
				total.setText("0");
				
			
				
				chk1.setSelected(false);
				chk2.setSelected(false);
				chk3.setSelected(false);
				chk4.setSelected(false);
				chk5.setSelected(false);
				chk6.setSelected(false);
				chk7.setSelected(false);
				chk8.setSelected(false);
				
				customer_id.setText(null);
				customer_id.setEnabled(false);
				int id=2015+(int)(Math.random()*17328);
				String cId="";
				cId+=id+1560;
				
				customer_id.setText(cId);
				customer_name.setText(null);
				
				 address.setText(null);
				 phone_number.setText(null);
				 email.setText(null);
				 pincode.setText(null);
				 id_type.setText(null);
				 jtxtReceipt.setText(null);
			}
		});
		btn_reset.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		btn_reset.setBounds(51, 43, 117, 46);
		panel_4.add(btn_reset);
		
		JButton btn_exit = new JButton("Exit");
		btn_exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String ObjButtons[] = {"Yes","No"};
		        int PromptResult = JOptionPane.showOptionDialog(null,"Are you sure you want to exit?","Customer Billing System",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,ObjButtons,ObjButtons[1]);
		        if(PromptResult==JOptionPane.YES_OPTION)
		        {
		            System.exit(0);
		        }
			}
		});
		btn_exit.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		btn_exit.setBounds(231, 43, 117, 46);
		panel_4.add(btn_exit);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.LIGHT_GRAY);
		panel_5.setLayout(null);
		panel_5.setBorder(new MatteBorder(10, 10, 10, 10, (Color) Color.GRAY));
		panel_5.setBounds(31, 558, 392, 131);
		panel.add(panel_5);
		
		JButton btn_print = new JButton("Print");
		btn_print.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					jtxtReceipt.print();
				}
				catch(java.awt.print.PrinterException e)
				{
					System.err.format("No printer found",e.getMessage()); 
				}
			}
		});
		btn_print.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		btn_print.setBounds(214, 44, 117, 46);
		panel_5.add(btn_print);
		
		JButton btn_total = new JButton("Total");
		btn_total.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				itemcost[0]=Double.parseDouble(black_forrest.getText())*150;
				itemcost[1]=Double.parseDouble(pineapple.getText())*250;
				itemcost[2]=Double.parseDouble(chocolate.getText())*200;
				itemcost[3]=Double.parseDouble(red_velvet.getText())*250;
				itemcost[4]=Double.parseDouble(kitkat.getText())*300;
				itemcost[5]=Double.parseDouble(vanilla.getText())*200;
				itemcost[6]=Double.parseDouble(blueberry.getText())*350;
				itemcost[7]=Double.parseDouble(special_chocolate.getText())*400;
				
				
				itemcost[8]=itemcost[0]+itemcost[1]+itemcost[2]+itemcost[3];
				
				itemcost[9]=itemcost[4]+itemcost[5]+itemcost[6]+itemcost[7];
				
				itemcost[10]=itemcost[8]+itemcost[9];
				
				iTax=String.format("Rs % .2f",itemcost[10]/100);
				iSubTotal=String.format("Rs % .2f", itemcost[10]);
				iTotal=String.format("Rs % .2f", itemcost[10]+(itemcost[10]/100));
				
				tax.setText(iTax);
				sub_total.setText(iSubTotal);
				total.setText(iTotal);
				
				
				//=============================================================
				jtxtReceipt.setEnabled(true);
				
				int refs = 1325+(int)(Math.random()*4238);
				
				//Calendar timer = new Calendar.getInstance();
				
				jtxtReceipt.append("\t Customer Billing System\n"
						+"Reference:\t"+refs+
						"\n=======================================\t"+
						"\n Customer Id :\t\t"+customer_id.getText() +
						"\n Customer Name \t\t "+customer_name.getText() +
						
						"\n Black Forrest :\t\t"+black_forrest.getText()+
						"\n Pineapple Cake :\t"+pineapple.getText()+
						"\n Chocolate Cake :\t"+chocolate.getText()+
						"\n Red Velvet Cake :\t"+red_velvet.getText()+
						"\n Crunchy kit kat cake :\t"+kitkat.getText()+
						"\n Vanilla Cake :\t\t"+vanilla.getText()+
						"\n Blueberry Cake :\t"+blueberry.getText()+
						"\n Special Chocolate :\t"+special_chocolate.getText()+
						
						"\n ========================================\t"+
						
						"\n Tax :\t\t"+ iTax +
						"\n SubTotal :\t\t"+iSubTotal+
						"\n Total :\t\t"+iTotal+
						
						"\n==========================================\t"+
						"\n\n Thank you for shopping :)"
						+ "\n Have a nice day!!"
						
						
						);
				
			}
		});
		btn_total.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		btn_total.setBounds(49, 44, 117, 46);
		panel_5.add(btn_total);
	}
}
