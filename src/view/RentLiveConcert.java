package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Date;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import model.Customer;
import model.Database;
import model.LiveConcert;
import model.MembershipCard;

public class RentLiveConcert extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField tableCustomerMovie;
	private JTextField textFieldSearchRentLiveConcert;
	private JTextField textFieldSearchCustomerRentLiveConcert;
	private JButton ButtonSelectRentLiveConcert;
	private JButton NewButtonSelectCustomerRentLiveConcert;
	private JFormattedTextField formattedTextFieldReturnDateMovie;
	private JFormattedTextField formattedTextFieldRentedDate;
	private JFormattedTextField formattedTextFieldTotalValueLiveConcert;
	private JButton NewButtonRentLiveConcert;
	private JTable tableRentLiveConcert;
	private JTable tableRentCustomerLiveConcert;
	private Object selectedcustomer;
	private int selectedLiveConcertID;
	private int selectedCustomerID;
	private Database jbdc = new Database();
	private String selectedID;
	private String customerChoosed;
	boolean allSelected1 = false;
	boolean allSelected2 = false;
	List<String> list = new ArrayList<String>();
	private int selectedPriceLiveConcert;
	private int current;
	private JButton NewLabelSearchIconRentLiveConcert;
	private JButton NewLabelSearchIconRentCostumer;

	public RentLiveConcert() throws ParseException {

		attributes();

	}

	/**
	 * Create the frame.
	 * 
	 * @return
	 * @throws ParseException
	 */
	public void attributes() throws ParseException {

		JFrame rentliveconcert = new JFrame();

		rentliveconcert.setTitle("Ultra Vision Midia");
		rentliveconcert.setVisible(true);
		rentliveconcert.setSize(new Dimension(800, 700));
		rentliveconcert.setLocationRelativeTo(null);
		rentliveconcert.setResizable(false);

		contentPane = new JPanel();
		contentPane.setSize(new Dimension(800, 800));
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		rentliveconcert.setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(6, 6, 788, 94);
		contentPane.add(panel);

		JLabel NewLabelRentLiveConcert = new JLabel("Rent Live Concert");
		NewLabelRentLiveConcert.setIcon(new ImageIcon(RentLiveConcert.class.getResource("/imagens/Music Live2.png")));
		panel.add(NewLabelRentLiveConcert);

		ButtonSelectRentLiveConcert = new JButton("Select");
		ButtonSelectRentLiveConcert.setBounds(559, 307, 117, 29);
		contentPane.add(ButtonSelectRentLiveConcert);
		ButtonSelectRentLiveConcert.setActionCommand("Select1");
		ButtonSelectRentLiveConcert.addActionListener(this);

		textFieldSearchRentLiveConcert = new JTextField();
		textFieldSearchRentLiveConcert.setBounds(470, 125, 179, 26);
		contentPane.add(textFieldSearchRentLiveConcert);
		textFieldSearchRentLiveConcert.setColumns(10);

		NewLabelSearchIconRentLiveConcert = new JButton("");
		NewLabelSearchIconRentLiveConcert
				.setIcon(new ImageIcon(NewLoyaltyCard.class.getResource("/imagens/search2.png")));
		NewLabelSearchIconRentLiveConcert.setBounds(646, 125, 61, 20);
		contentPane.add(NewLabelSearchIconRentLiveConcert);
		NewLabelSearchIconRentLiveConcert.setActionCommand("Search1");
		NewLabelSearchIconRentLiveConcert.addActionListener(this);

		JLabel NewLabelSearchLiveConcert = new JLabel("Search Live Concert");
		NewLabelSearchLiveConcert.setBounds(305, 123, 110, 16);
		contentPane.add(NewLabelSearchLiveConcert);

		textFieldSearchCustomerRentLiveConcert = new JTextField();
		textFieldSearchCustomerRentLiveConcert.setBounds(470, 348, 179, 26);
		contentPane.add(textFieldSearchCustomerRentLiveConcert);
		textFieldSearchCustomerRentLiveConcert.setColumns(10);

		JLabel NewLabelSearchCustomerMovie = new JLabel("Search Customer");
		NewLabelSearchCustomerMovie.setBounds(332, 353, 117, 16);
		contentPane.add(NewLabelSearchCustomerMovie);

		NewLabelSearchIconRentCostumer = new JButton("");
		NewLabelSearchIconRentCostumer.setIcon(new ImageIcon(RentMovie.class.getResource("/imagens/search2.png")));
		NewLabelSearchIconRentCostumer.setBounds(646, 353, 61, 20);
		contentPane.add(NewLabelSearchIconRentCostumer);
		NewLabelSearchIconRentCostumer.setActionCommand("Search2");
		NewLabelSearchIconRentCostumer.addActionListener(this);

		NewButtonSelectCustomerRentLiveConcert = new JButton("Select");
		NewButtonSelectCustomerRentLiveConcert.setBounds(578, 536, 117, 29);
		contentPane.add(NewButtonSelectCustomerRentLiveConcert);
		NewButtonSelectCustomerRentLiveConcert.setActionCommand("Select2");
		NewButtonSelectCustomerRentLiveConcert.addActionListener(this);

		MaskFormatter mascara = new MaskFormatter("##/##/####");
		formattedTextFieldReturnDateMovie = new JFormattedTextField(mascara);
		formattedTextFieldReturnDateMovie.setBounds(127, 606, 130, 26);
		contentPane.add(formattedTextFieldReturnDateMovie);

		MaskFormatter mascara2 = new MaskFormatter("##/##/####");
		formattedTextFieldRentedDate = new JFormattedTextField(mascara2);
		formattedTextFieldRentedDate.setBounds(127, 568, 130, 26);
		contentPane.add(formattedTextFieldRentedDate);

		JLabel NewLabelRentedDateLiveConcert = new JLabel(" Rented Date");
		NewLabelRentedDateLiveConcert.setBounds(277, 573, 85, 16);
		contentPane.add(NewLabelRentedDateLiveConcert);

		JLabel NewLabelReturnDateLiveConcert = new JLabel("Return Date");
		NewLabelReturnDateLiveConcert.setBounds(279, 611, 83, 16);
		contentPane.add(NewLabelReturnDateLiveConcert);

		JLabel NewLabelTotalValueLiveConcert = new JLabel("Total =");
		NewLabelTotalValueLiveConcert.setBounds(384, 649, 46, 21);
		contentPane.add(NewLabelTotalValueLiveConcert);

		formattedTextFieldTotalValueLiveConcert = new JFormattedTextField();
		formattedTextFieldTotalValueLiveConcert.setBounds(442, 646, 120, 26);
		contentPane.add(formattedTextFieldTotalValueLiveConcert);

		NewButtonRentLiveConcert = new JButton("Rent");
		NewButtonRentLiveConcert.setBackground(Color.BLACK);
		NewButtonRentLiveConcert.setForeground(Color.RED);
		NewButtonRentLiveConcert.setBounds(578, 646, 117, 29);
		contentPane.add(NewButtonRentLiveConcert);
		NewButtonRentLiveConcert.setActionCommand("Rent");
		NewButtonRentLiveConcert.addActionListener(this);

		JLabel NewLabelCustomerIcon = new JLabel("");
		NewLabelCustomerIcon
				.setIcon(new ImageIcon(RentMovie.class.getResource("/imagens/employee-removebg-preview.png")));
		NewLabelCustomerIcon.setBounds(21, 415, 84, 72);
		contentPane.add(NewLabelCustomerIcon);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(RentLiveConcert.class.getResource("/imagens/musiclive rent.png")));
		lblNewLabel_1.setBounds(21, 178, 94, 75);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(RentMovie.class.getResource("/imagens/main logo removed background.png")));
		lblNewLabel_2.setBounds(6, 603, 109, 67);
		contentPane.add(lblNewLabel_2);

		rentliveconcert.validate();
		rentliveconcert.repaint();

	}

	public void tabaleliveconcertSelected(String[][] outsideData) {

		// ________LIVE CONCERT AVAILABLE TABlE___________

		String[] columnNames = { "ID", "Title", "Band", "Type", "Price" };

		// Gathering the data

		// Using a scroll pane
		JScrollPane myPane = new JScrollPane();
		myPane.setBounds(127, 143, 550, 161);
		contentPane.add(myPane);

		tableRentLiveConcert = new JTable(outsideData, columnNames);
		contentPane.add(tableRentLiveConcert);
		myPane.setViewportView(tableRentLiveConcert);

	}

	public void tablecustomerliveconcert(String[][] outsideData2) {

		// ________ CUSTOMER LIVE CONCERT TABLE ___________

		String[] columnNames2 = { "ID", "FirstName", "LastName", "Email", "Tel", "Membership" };

		// Using a scroll pane
		JScrollPane myPane2 = new JScrollPane();
		myPane2.setBounds(127, 372, 549, 161);
		contentPane.add(myPane2);

		tableRentCustomerLiveConcert = new JTable(outsideData2, columnNames2);
		contentPane.add(tableRentCustomerLiveConcert);
		myPane2.setViewportView(tableRentCustomerLiveConcert);

	}

	public JTextField getTableCustomerMovie() {
		return tableCustomerMovie;
	}

	public JTextField getTextFieldSearchRentLiveConcert() {
		return textFieldSearchRentLiveConcert;
	}

	public void setTextFieldSearchRentLiveConcert(JTextField textFieldSearchRentLiveConcert) {
		this.textFieldSearchRentLiveConcert = textFieldSearchRentLiveConcert;
	}

	public JTable getTableRentLiveConcert() {
		return tableRentLiveConcert;
	}

	public void setTableRentLiveConcert(JTable tableRentLiveConcert) {
		this.tableRentLiveConcert = tableRentLiveConcert;
	}

	public JTable getTableRentCustomerLiveConcert() {
		return tableRentCustomerLiveConcert;
	}

	public void setTableRentCustomerLiveConcert(JTable tableRentCustomerLiveConcert) {
		this.tableRentCustomerLiveConcert = tableRentCustomerLiveConcert;
	}

	public JTextField getTextFieldSearchCustomerRentLiveConcert() {
		return textFieldSearchCustomerRentLiveConcert;
	}

	public void setTextFieldSearchCustomerRentLiveConcert(JTextField textFieldSearchCustomerRentLiveConcert) {
		this.textFieldSearchCustomerRentLiveConcert = textFieldSearchCustomerRentLiveConcert;
	}

	public JButton getButtonSelectRentLiveConcert() {

		return ButtonSelectRentLiveConcert;
	}

	public Object getNewButtonSelectCustomerRentLiveConcert() {

		selectedcustomer = NewButtonSelectCustomerRentLiveConcert.getSelectedObjects();

		return selectedcustomer;
	}

	public String getFormattedTextFieldReturnDateMovie() {

		// enteredDate = (Date)formattedTextFieldReturnDateMovie.getValue();

		return formattedTextFieldReturnDateMovie.getText();

	}

	public String getFormattedTextFieldRentedDate() {

		return formattedTextFieldRentedDate.getText();

	}

	public JFormattedTextField getFormattedTextFieldTotalValueLiveConcert() {
		return formattedTextFieldTotalValueLiveConcert;
	}

	public void setFormattedTextFieldTotalValueLiveConcert(
			JFormattedTextField formattedTextFieldTotalValueLiveConcert) {
		this.formattedTextFieldTotalValueLiveConcert = formattedTextFieldTotalValueLiveConcert;
	}

	public Object getNewButtonRentLiveConcert() {

		return NewButtonRentLiveConcert;
	}

	int initial = 0;

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("Select1")) {

			if (list.size() > 4) {

				return;
			}

			selectedLiveConcertID = tableRentLiveConcert.getSelectedRow();
			selectedID = tableRentLiveConcert.getValueAt(selectedLiveConcertID, 0).toString();

			selectedPriceLiveConcert = tableRentLiveConcert.getSelectedRow();
			String selectedPrice = tableRentLiveConcert.getValueAt(selectedPriceLiveConcert, 4).toString();

			current = Integer.parseInt((String) tableRentLiveConcert.getValueAt(selectedPriceLiveConcert, 4));
			initial += current;

			allSelected1 = true;
			list.add(selectedID);

			formattedTextFieldTotalValueLiveConcert.setText(String.valueOf(initial));

		}

		if (e.getActionCommand().equals("Select2")) {

			selectedCustomerID = tableRentCustomerLiveConcert.getSelectedRow();
			customerChoosed = tableRentCustomerLiveConcert.getValueAt(selectedCustomerID, 0).toString();

			allSelected2 = true;

		}

		if (e.getActionCommand().equals("Rent") && (allSelected1 == true && allSelected2 == true)) {

			jbdc.updatetableliveconcert(selectedID);
			MembershipCard mCard = (jbdc.getMembershipPoints(customerChoosed));
			int newPoints = Integer.parseInt(JOptionPane.showInputDialog("Please insert the amount of points"));
			jbdc.updatePoints(customerChoosed, mCard, newPoints);
		

			JOptionPane.showMessageDialog(null, "Rented");

			for (int i = 0; i < list.size(); i++) {

				jbdc.selectedLiveConcertCustomer(list.get(i), customerChoosed, this.getFormattedTextFieldRentedDate(),
						this.getFormattedTextFieldReturnDateMovie());
				list.remove(i);
			}

			allSelected1 = false;
			allSelected2 = false;

		}

		if (e.getActionCommand().equals("Search1")) {

			String st = textFieldSearchRentLiveConcert.getText();

			System.out.println(st);

			Database jdbc = new Database();
			String[][] data = jdbc.searchLiveConcert(st);
			tabaleliveconcertSelected(data);

			textFieldSearchRentLiveConcert.setText("   ");

		}
		if (e.getActionCommand().equals("Search2")) {

			String st2 = textFieldSearchCustomerRentLiveConcert.getText();

			System.out.println(st2);

			Database jdbc = new Database();
			String[][] data = jdbc.searchtLiveConcertCustomer(st2);
			tablecustomerliveconcert(data);

		}

	}
}
