package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.JList;
import java.awt.Component;
import java.awt.Choice;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;

public class NewCustomer extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldFirstName;
	private JTextField textFieldEmail;
	private JTextField textFieldLastName;

	/**
	 * Launch the application.
	 */
//	public static void newcustomer() {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					NewCustomer frame = new NewCustomer();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	public NewCustomer() throws ParseException {
		
		
		JFrame newcustomer = new JFrame ();
		
		newcustomer.setTitle("Ulta Vision Midia");
	    newcustomer.setVisible(true);		
		
		getContentPane().setBackground(UIManager.getColor("ProgressBar.selectionForeground"));
		newcustomer.setSize(new Dimension(800, 600));
		getContentPane().setSize(new Dimension(800, 660));
		getContentPane().setLayout(null);
		
		
		
		contentPane = new JPanel();
		contentPane.setSize(new Dimension(800, 600));
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		newcustomer.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(6, 6, 788, 94);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("New Customer");
		lblNewLabel.setIcon(new ImageIcon(NewCustomer.class.getResource("/imagens/employee.png")));
		panel.add(lblNewLabel);
		
		textFieldFirstName = new JTextField();
		textFieldFirstName.setBounds(238, 120, 450, 26);
		contentPane.add(textFieldFirstName);
		textFieldFirstName.setColumns(10);
		
		textFieldLastName = new JTextField();
		textFieldLastName.setBounds(237, 168, 451, 26);
		contentPane.add(textFieldLastName);
		textFieldLastName.setColumns(10);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(238, 217, 450, 26);
		contentPane.add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"(ML) Music Live & Live Concert Videos ", "(VL) Movie", "(TV) Box Set", "(PR) Premium"}));
		comboBox.setToolTipText("MusicLive\t\nMovie\nLiveConcert\nTVBox\nPremium");
		comboBox.setMaximumRowCount(10);
		comboBox.setBounds(234, 376, 334, 27);
		contentPane.add(comboBox);
		
		JLabel NewLabelFirstName = new JLabel("First Name");
		NewLabelFirstName.setBounds(93, 125, 84, 16);
		contentPane.add(NewLabelFirstName);
		
		JLabel NewLabelLastName = new JLabel("Last Name");
		NewLabelLastName.setBounds(93, 173, 84, 16);
		contentPane.add(NewLabelLastName);
		
		JLabel NewLabelEmail = new JLabel("Email");
		NewLabelEmail.setBounds(93, 222, 61, 16);
		contentPane.add(NewLabelEmail);
		
		JLabel NewLabelTelephone = new JLabel("Telephone");
		NewLabelTelephone.setBounds(93, 272, 98, 16);
		contentPane.add(NewLabelTelephone);
		
		JLabel NewLabelCardNumber = new JLabel("Card Number");
		NewLabelCardNumber.setBounds(93, 322, 84, 16);
		contentPane.add(NewLabelCardNumber);
		
		JLabel NewLabelMemberShipPlan = new JLabel("Membership Plan");
		NewLabelMemberShipPlan.setBounds(93, 380, 116, 16);
		contentPane.add(NewLabelMemberShipPlan);
		
		JButton ButtonRegisterCustomer = new JButton("Register");
		ButtonRegisterCustomer.setBounds(238, 452, 117, 29);
		contentPane.add(ButtonRegisterCustomer);
		
		MaskFormatter mascara = new MaskFormatter("####/####/####/####");
		JFormattedTextField FormattedTextFieldCardNumber = new JFormattedTextField(mascara);
		FormattedTextFieldCardNumber.setBounds(238, 322, 197, 26);
		contentPane.add(FormattedTextFieldCardNumber);
		
		MaskFormatter mascara2 = new MaskFormatter("(+###)####/#####");
		JFormattedTextField FormattedTextFieldTelephone = new JFormattedTextField(mascara2);
		FormattedTextFieldTelephone.setBounds(238, 267, 197, 26);
		contentPane.add(FormattedTextFieldTelephone);
		
		newcustomer.validate();
		newcustomer.repaint();
	}
}
