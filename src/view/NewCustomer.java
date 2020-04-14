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
	private JComboBox comboBoxMembership;
	private JButton ButtonRegisterCustomer;
	private JFormattedTextField FormattedTextFieldCardNumber;
	private JFormattedTextField FormattedTextFieldTelephone;

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
		
		comboBoxMembership = new JComboBox();
		comboBoxMembership.setModel(new DefaultComboBoxModel(new String[] {"(ML) Music Live & Live Concert Videos ", "(VL) Movie", "(TV) Box Set", "(PR) Premium"}));
		comboBoxMembership.setToolTipText("MusicLive\t\nMovie\nLiveConcert\nTVBox\nPremium");
		comboBoxMembership.setMaximumRowCount(10);
		comboBoxMembership.setBounds(234, 376, 334, 27);
		contentPane.add(comboBoxMembership);
		
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
		
		ButtonRegisterCustomer = new JButton("Register");
		ButtonRegisterCustomer.setBounds(238, 452, 117, 29);
		contentPane.add(ButtonRegisterCustomer);
		
		MaskFormatter mascara = new MaskFormatter("####/####/####/####");
		FormattedTextFieldCardNumber = new JFormattedTextField(mascara);
		FormattedTextFieldCardNumber.setBounds(238, 322, 197, 26);
		contentPane.add(FormattedTextFieldCardNumber);
		
		MaskFormatter mascara2 = new MaskFormatter("(+###)####/#####");
	    FormattedTextFieldTelephone = new JFormattedTextField(mascara2);
		FormattedTextFieldTelephone.setBounds(238, 267, 197, 26);
		contentPane.add(FormattedTextFieldTelephone);
		
		newcustomer.validate();
		newcustomer.repaint();
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public JTextField getTextFieldFirstName() {
		return textFieldFirstName;
	}

	public void setTextFieldFirstName(JTextField textFieldFirstName) {
		this.textFieldFirstName = textFieldFirstName;
	}

	public JTextField getTextFieldEmail() {
		return textFieldEmail;
	}

	public void setTextFieldEmail(JTextField textFieldEmail) {
		this.textFieldEmail = textFieldEmail;
	}

	public JTextField getTextFieldLastName() {
		return textFieldLastName;
	}

	public void setTextFieldLastName(JTextField textFieldLastName) {
		this.textFieldLastName = textFieldLastName;
	}

	public JComboBox getComboBoxMembership() {
		return comboBoxMembership;
	}

	public void setComboBoxMembership(JComboBox comboBoxMembership) {
		this.comboBoxMembership = comboBoxMembership;
	}

	public JButton getButtonRegisterCustomer() {
		return ButtonRegisterCustomer;
	}

	public void setButtonRegisterCustomer(JButton buttonRegisterCustomer) {
		ButtonRegisterCustomer = buttonRegisterCustomer;
	}

	public JFormattedTextField getFormattedTextFieldCardNumber() {
		return FormattedTextFieldCardNumber;
	}

	public void setFormattedTextFieldCardNumber(JFormattedTextField formattedTextFieldCardNumber) {
		FormattedTextFieldCardNumber = formattedTextFieldCardNumber;
	}

	public JFormattedTextField getFormattedTextFieldTelephone() {
		return FormattedTextFieldTelephone;
	}

	public void setFormattedTextFieldTelephone(JFormattedTextField formattedTextFieldTelephone) {
		FormattedTextFieldTelephone = formattedTextFieldTelephone;
	}
	
}
