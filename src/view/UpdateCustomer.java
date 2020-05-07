package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import controller.CustomerController;

import model.Database;

import javax.swing.JTable;

public class UpdateCustomer extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textFieldFirstName;
	private JTextField textFieldEmail;
	private JTextField textFieldLastName;
	private JComboBox comboBoxMembership;
	private JButton ButtonRegisterCustomer;
	private JFormattedTextField FormattedTextFieldCardNumber;
	private JFormattedTextField FormattedTextFieldTelephone;
	private JButton NewButtonSelect;
	private JButton NewButtonSearch;
	private int selectedcustomerID;
	private String selectedID;
	Database db = new Database();
	private int selectedcustomerFirstName;
	private String selectedfirstname;
	private int selectedcustomerLastName;
	private String selectedLastName;
	private int selectedcustomerEmail;
	private String selectedEmail;
	private int selectedcustomerTel;
	private String selectedTel;
	private int selectedcustomerMembership;
	private String selectedMembership;
	private int selectedcustomerCard;
	private String selectedCard;
	private JTextField textField;
	private JTable table;
	private JTextField TextFieldCardNumber;
	private JTextField TextFieldTelephone;

	public UpdateCustomer() throws ParseException {

		attributesSetter();

	}

	private void attributesSetter() throws ParseException {

		JFrame newcustomer = new JFrame();

		newcustomer.setTitle("Ulta Vision Midia");
		newcustomer.setVisible(true);
		newcustomer.setSize(new Dimension(800, 600));
		newcustomer.setLocationRelativeTo(null);
		newcustomer.setResizable(false);

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

		JLabel lblNewLabel = new JLabel("Update Customer");
		lblNewLabel.setIcon(new ImageIcon(NewCustomer.class.getResource("/imagens/employee.png")));
		panel.add(lblNewLabel);

		textFieldFirstName = new JTextField();
		textFieldFirstName.setBounds(238, 275, 450, 26);
		contentPane.add(textFieldFirstName);
		textFieldFirstName.setColumns(10);

		textFieldLastName = new JTextField();
		textFieldLastName.setBounds(237, 316, 451, 26);
		contentPane.add(textFieldLastName);
		textFieldLastName.setColumns(10);

		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(238, 354, 450, 26);
		contentPane.add(textFieldEmail);
		textFieldEmail.setColumns(10);

		comboBoxMembership = new JComboBox();
		comboBoxMembership.setModel(new DefaultComboBoxModel<>(new String[] { "(ML) Music Live & Live Concert Videos ",
				"(VL) Movie", "(TV) Box Set", "(PR) Premium" }));
		comboBoxMembership.setToolTipText("MusicLive\t\nMovie\nLiveConcert\nTVBox\nPremium");
		comboBoxMembership.setMaximumRowCount(10);
		comboBoxMembership.setBounds(234, 484, 334, 27);
		contentPane.add(comboBoxMembership);

		JLabel NewLabelFirstName = new JLabel("First Name");
		NewLabelFirstName.setBounds(93, 280, 84, 16);
		contentPane.add(NewLabelFirstName);

		JLabel NewLabelLastName = new JLabel("Last Name");
		NewLabelLastName.setBounds(93, 321, 84, 16);
		contentPane.add(NewLabelLastName);

		JLabel NewLabelEmail = new JLabel("Email");
		NewLabelEmail.setBounds(96, 359, 61, 16);
		contentPane.add(NewLabelEmail);

		JLabel NewLabelTelephone = new JLabel("Telephone");
		NewLabelTelephone.setBounds(93, 402, 98, 16);
		contentPane.add(NewLabelTelephone);

		JLabel NewLabelCardNumber = new JLabel("Card Number");
		NewLabelCardNumber.setBounds(93, 445, 84, 16);
		contentPane.add(NewLabelCardNumber);

		JLabel NewLabelMemberShipPlan = new JLabel("Membership Plan");
		NewLabelMemberShipPlan.setBounds(93, 488, 116, 16);
		contentPane.add(NewLabelMemberShipPlan);

		ButtonRegisterCustomer = new JButton("Update");
		ButtonRegisterCustomer.setBounds(238, 528, 117, 29);
		contentPane.add(ButtonRegisterCustomer);
		ButtonRegisterCustomer.setActionCommand("Update");
		ButtonRegisterCustomer.addActionListener(this);

		TextFieldCardNumber = new JFormattedTextField();
		TextFieldCardNumber.setBounds(238, 440, 197, 26);
		contentPane.add(TextFieldCardNumber);

		TextFieldTelephone = new JFormattedTextField();
		TextFieldTelephone.setBounds(238, 397, 197, 26);
		contentPane.add(TextFieldTelephone);

		JLabel lblPleaseEnterEmail = new JLabel("Please Enter email ");
		lblPleaseEnterEmail.setBounds(93, 108, 151, 16);
		contentPane.add(lblPleaseEnterEmail);

		textField = new JTextField();
		textField.setBounds(238, 103, 163, 26);
		contentPane.add(textField);
		textField.setColumns(10);

		NewButtonSearch = new JButton("Search");
		NewButtonSearch.setBounds(413, 103, 117, 29);
		contentPane.add(NewButtonSearch);
		NewButtonSearch.setActionCommand("Search");
		NewButtonSearch.addActionListener(this);

		NewButtonSelect = new JButton("Select");
		NewButtonSelect.setBounds(563, 244, 117, 29);
		contentPane.add(NewButtonSelect);
		NewButtonSelect.setActionCommand("Select1");
		NewButtonSelect.addActionListener(this);

		newcustomer.validate();
		newcustomer.repaint();
	}



	public void tablecustomer(String[][] outsideData2) {

		// ________ CUSTOMER UPDATE TABLE ___________

		String[] columnNames2 = { "ID", "FirstName", "LastName", "Email", "Tel", "Membership", "Card Number" };

		// Using a scroll pane
		JScrollPane myPane2 = new JScrollPane();
		myPane2.setBounds(89, 141, 591, 102);
		contentPane.add(myPane2);

		table = new JTable(outsideData2, columnNames2);
		contentPane.add(table);
		myPane2.setViewportView(table);

	}
	
	
	public String getTextFieldCardNumber() {
		return TextFieldCardNumber.getText();
	}

	public void setTextFieldCardNumber(JTextField textFieldCardNumber) {
		TextFieldCardNumber = textFieldCardNumber;
	}

	public String getTextFieldTelephone() {
		return TextFieldTelephone.getText();
	}

	public void setTextFieldTelephone(JTextField textFieldTelephone) {
		TextFieldTelephone = textFieldTelephone;
	}
	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public String getTextFieldFirstName() {
		return textFieldFirstName.getText();
	}

	public void setTextFieldFirstName(JTextField textFieldFirstName) {
		this.textFieldFirstName = textFieldFirstName;
	}

	public String getTextFieldEmail() {
		return textFieldEmail.getText();
	}

	public void setTextFieldEmail(JTextField textFieldEmail) {
		this.textFieldEmail = textFieldEmail;
	}

	public String getTextFieldLastName() {
		return textFieldLastName.getText();
	}

	public void setTextFieldLastName(JTextField textFieldLastName) {
		this.textFieldLastName = textFieldLastName;
	}

	public String getComboBoxMembership() {
		String membership = comboBoxMembership.getSelectedItem().toString();
		return membership;
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


	boolean allSelected1 = false;
	boolean allSelected2 = false;
	
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("Search")) {

			String st = textField.getText();
			
			if(st.isEmpty()) {
				
                 
				JOptionPane.showMessageDialog(null, "Field Empty");
				this.dispose();
			}

			System.out.println(st);

			Database jdbc = new Database();
			String[][] data = jdbc.searchcustomerupdate(st);
			tablecustomer(data);
		}

		if (e.getActionCommand().equals("Select1")) {

			System.out.println("Clikado");

			selectedcustomerID = table.getSelectedRow();
			selectedID = table.getValueAt(selectedcustomerID, 0).toString();

			selectedcustomerFirstName = table.getSelectedRow();
			selectedfirstname = table.getValueAt(selectedcustomerFirstName, 1).toString();

			selectedcustomerLastName = table.getSelectedRow();
			selectedLastName = table.getValueAt(selectedcustomerLastName, 2).toString();

			selectedcustomerEmail = table.getSelectedRow();
			selectedEmail = table.getValueAt(selectedcustomerEmail, 3).toString();

			selectedcustomerTel = table.getSelectedRow();
			selectedTel = table.getValueAt(selectedcustomerTel, 4).toString();

			selectedcustomerCard = table.getSelectedRow();
			selectedCard = table.getValueAt(selectedcustomerCard, 6).toString();

			selectedcustomerMembership = table.getSelectedRow();
			selectedMembership = table.getValueAt(selectedcustomerMembership, 5).toString();
			
			allSelected1 = true;
	

			this.textFieldFirstName.setText(selectedfirstname);
			this.textFieldLastName.setText(selectedLastName);
			this.textFieldEmail.setText(selectedEmail);
			this.TextFieldTelephone.setText(selectedTel);
			this.TextFieldCardNumber.setText(selectedCard);


		}
	

		if (e.getActionCommand().equals("Update") && (allSelected1 = true)){
			
	

			db.updatecustomerdetails(selectedID, this.getTextFieldFirstName(), this.getTextFieldLastName(),
					this.getTextFieldEmail(), this.getTextFieldTelephone(),
					this.getTextFieldCardNumber(), this.getComboBoxMembership());
			
			

		}

	}
}
