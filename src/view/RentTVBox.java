package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;
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

import model.Database;
import model.MembershipCard;

public class RentTVBox extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField tableCustomerMovie;
	private JTextField textFieldSearchRentTVBox;
	private JTextField textFieldSearchCustomerRentTVBox;
	private JButton ButtonSelectRentTVbox;
	private JButton NewLabelSearchIconRentTVBox;
	private JButton NewButtonSelecCustomerRentTVBox;
	private MaskFormatter mascara;
	private JFormattedTextField formattedTextFieldReturnDateMovie;
	private MaskFormatter mascara2;
	private JFormattedTextField formattedTextFieldRentedDate;
	private JFormattedTextField formattedTextFieldTotalValueTVBox;
	private JButton NewButtonRentTVBox;
	private JTable tableRentTVBox;
	private JTable tableRentCustomerTVBox;
	List<String> list = new ArrayList<String>();
	private Database jbdc = new Database();
	private String selectedID;
	private String customerChoosed;
	private int current;
	boolean allSelected1 = false;
	boolean allSelected2 = false;
	private int selectedCustomerID;
	private int selectedTVBoxID;
	private int selectedTVBoxPrice;
	private JButton NewLabeliconRentTVBox;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 * 
	 * @throws ParseException
	 */
	public RentTVBox() throws ParseException {

		JFrame rentTVbox = new JFrame();

		rentTVbox.setTitle("Ultra Vision Midia");
		rentTVbox.setVisible(true);
		rentTVbox.setSize(new Dimension(800, 700));
		rentTVbox.setLocationRelativeTo(null);
		rentTVbox.setResizable(false);

		contentPane = new JPanel();
		contentPane.setSize(new Dimension(800, 800));
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		rentTVbox.setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(6, 6, 788, 94);
		contentPane.add(panel);

		JLabel NewLabelRentTVBox = new JLabel("Rent TVBox");
		NewLabelRentTVBox.setIcon(new ImageIcon(RentTVBox.class.getResource("/imagens/TVBOX2.png")));
		panel.add(NewLabelRentTVBox);

		ButtonSelectRentTVbox = new JButton("Select");
		ButtonSelectRentTVbox.setBounds(578, 307, 117, 29);
		contentPane.add(ButtonSelectRentTVbox);
		ButtonSelectRentTVbox.setActionCommand("Select1");
		ButtonSelectRentTVbox.addActionListener(this);

		textFieldSearchRentTVBox = new JTextField();
		textFieldSearchRentTVBox.setBounds(470, 118, 179, 26);
		contentPane.add(textFieldSearchRentTVBox);
		textFieldSearchRentTVBox.setColumns(10);

		NewLabelSearchIconRentTVBox = new JButton("");
		NewLabelSearchIconRentTVBox.setIcon(new ImageIcon(NewLoyaltyCard.class.getResource("/imagens/search2.png")));
		NewLabelSearchIconRentTVBox.setBounds(646, 118, 39, 26);
		contentPane.add(NewLabelSearchIconRentTVBox);
		NewLabelSearchIconRentTVBox.setActionCommand("Search1");
		NewLabelSearchIconRentTVBox.addActionListener(this);

		JLabel NewLabelSearchRentTVBox = new JLabel("Search TVBox");
		NewLabelSearchRentTVBox.setBounds(352, 123, 91, 16);
		contentPane.add(NewLabelSearchRentTVBox);

		textFieldSearchCustomerRentTVBox = new JTextField();
		textFieldSearchCustomerRentTVBox.setBounds(470, 348, 179, 26);
		contentPane.add(textFieldSearchCustomerRentTVBox);
		textFieldSearchCustomerRentTVBox.setColumns(10);

		JLabel NewLabelSearchCustomerMovie = new JLabel("Search Customer");
		NewLabelSearchCustomerMovie.setBounds(332, 353, 117, 16);
		contentPane.add(NewLabelSearchCustomerMovie);

		NewLabeliconRentTVBox = new JButton("");
		NewLabeliconRentTVBox.setIcon(new ImageIcon(RentMovie.class.getResource("/imagens/search2.png")));
		NewLabeliconRentTVBox.setBounds(646, 353, 61, 20);
		contentPane.add(NewLabeliconRentTVBox);
		NewLabeliconRentTVBox.setActionCommand("Search2");
		NewLabeliconRentTVBox.addActionListener(this);

		NewButtonSelecCustomerRentTVBox = new JButton("Select");
		NewButtonSelecCustomerRentTVBox.setBounds(578, 536, 117, 29);
		contentPane.add(NewButtonSelecCustomerRentTVBox);
		NewButtonSelecCustomerRentTVBox.setActionCommand("Select2");
		NewButtonSelecCustomerRentTVBox.addActionListener(this);

		mascara = new MaskFormatter("##/##/####");
		formattedTextFieldReturnDateMovie = new JFormattedTextField(mascara);
		formattedTextFieldReturnDateMovie.setBounds(127, 606, 130, 26);
		contentPane.add(formattedTextFieldReturnDateMovie);

		mascara2 = new MaskFormatter("##/##/####");
		formattedTextFieldRentedDate = new JFormattedTextField(mascara2);
		formattedTextFieldRentedDate.setBounds(127, 568, 130, 26);
		contentPane.add(formattedTextFieldRentedDate);

		JLabel NewLabelRentedDate = new JLabel(" Rented Date");
		NewLabelRentedDate.setBounds(277, 573, 85, 16);
		contentPane.add(NewLabelRentedDate);

		JLabel NewLabelReturnDateMovie = new JLabel("Return Date");
		NewLabelReturnDateMovie.setBounds(279, 611, 83, 16);
		contentPane.add(NewLabelReturnDateMovie);

		JLabel NewLabelTotalValueTVBox = new JLabel("Total =");
		NewLabelTotalValueTVBox.setBounds(384, 649, 46, 21);
		contentPane.add(NewLabelTotalValueTVBox);

		formattedTextFieldTotalValueTVBox = new JFormattedTextField();
		formattedTextFieldTotalValueTVBox.setBounds(442, 646, 120, 26);
		contentPane.add(formattedTextFieldTotalValueTVBox);

		NewButtonRentTVBox = new JButton("Rent");
		NewButtonRentTVBox.setBackground(Color.BLACK);
		NewButtonRentTVBox.setForeground(Color.RED);
		NewButtonRentTVBox.setBounds(578, 646, 117, 29);
		contentPane.add(NewButtonRentTVBox);
		NewButtonRentTVBox.setActionCommand("Rent");
		NewButtonRentTVBox.addActionListener(this);

		JLabel NewLabelCustomerIcon = new JLabel("");
		NewLabelCustomerIcon
				.setIcon(new ImageIcon(RentMovie.class.getResource("/imagens/employee-removebg-preview.png")));
		NewLabelCustomerIcon.setBounds(21, 415, 84, 72);
		contentPane.add(NewLabelCustomerIcon);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(RentTVBox.class.getResource("/imagens/TVBoxrent.png")));
		lblNewLabel_1.setBounds(21, 178, 94, 75);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(RentMovie.class.getResource("/imagens/main logo removed background.png")));
		lblNewLabel_2.setBounds(6, 603, 109, 67);
		contentPane.add(lblNewLabel_2);

		rentTVbox.validate();
		rentTVbox.repaint();

	}

	public void tabaleTVboxSelected(String[][] outsideData) {

		// ________LIVE CONCERT AVAILABLE TABlE___________

		// Using the Database connection class
		// Database jdbc = new Database();

		// String[][] data = outsideData;
		String[] columnNames = { "ID", "Title", "Discos", "Season", "Type", "Price" };

		// Gathering the data

		// Using a scroll pane
		JScrollPane myPane = new JScrollPane();
		myPane.setBounds(127, 143, 550, 161);
		contentPane.add(myPane);

		tableRentTVBox = new JTable(outsideData, columnNames);
		// table.setBounds(226, 169, 470, 389);
		contentPane.add(tableRentTVBox);
		myPane.setViewportView(tableRentTVBox);

	}

	public void tablecustomertvbox(String[][] outsideData2) {

		// ________ CUSTOMER LIVE CONCERT TABLE ___________

		// Database jdbc = new Database();

		String[] columnNames2 = { "ID", "FirstName", "LastName", "Email", "Tel", "Membership" };

		// // Gathering the data
		// data2 = jdbc.rentLiveConcertCustomer();

		// Using a scroll pane
		JScrollPane myPane2 = new JScrollPane();
		myPane2.setBounds(127, 372, 549, 161);
		contentPane.add(myPane2);

		tableRentCustomerTVBox = new JTable(outsideData2, columnNames2);
		// table.setBounds(226, 169, 470, 389);
		contentPane.add(tableRentCustomerTVBox);
		myPane2.setViewportView(tableRentCustomerTVBox);

	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public JTextField getTableCustomerMovie() {
		return tableCustomerMovie;
	}

	public void setTableCustomerMovie(JTextField tableCustomerMovie) {
		this.tableCustomerMovie = tableCustomerMovie;
	}

	public JTextField getTextFieldSearchRentTVBox() {
		return textFieldSearchRentTVBox;
	}

	public void setTextFieldSearchRentTVBox(JTextField textFieldSearchRentTVBox) {
		this.textFieldSearchRentTVBox = textFieldSearchRentTVBox;
	}

	public JTable getTableRentTVBox() {
		return tableRentTVBox;
	}

	public void setTableRentTVBox(JTable tableRentTVBox) {
		this.tableRentTVBox = tableRentTVBox;
	}

	public JTable getTableRentCustomerTVBox() {
		return tableRentCustomerTVBox;
	}

	public void setTableRentCustomerTVBox(JTable tableRentCustomerTVBox) {
		this.tableRentCustomerTVBox = tableRentCustomerTVBox;
	}

	public JTextField getTextFieldSearchCustomerRentTVBox() {
		return textFieldSearchCustomerRentTVBox;
	}

	public void setTextFieldSearchCustomerRentTVBox(JTextField textFieldSearchCustomerRentTVBox) {
		this.textFieldSearchCustomerRentTVBox = textFieldSearchCustomerRentTVBox;
	}

	public JButton getButtonSelectRentTVbox() {
		return ButtonSelectRentTVbox;
	}

	public void setButtonSelectRentTVbox(JButton buttonSelectRentTVbox) {
		ButtonSelectRentTVbox = buttonSelectRentTVbox;
	}

	public JButton getNewLabelSearchIconRentTVBox() {
		return NewLabelSearchIconRentTVBox;
	}

	public void setNewLabelSearchIconRentTVBox(JButton newLabelSearchIconRentTVBox) {
		NewLabelSearchIconRentTVBox = newLabelSearchIconRentTVBox;
	}

	public JButton getNewButtonSelecCustomerRentTVBox() {
		return NewButtonSelecCustomerRentTVBox;
	}

	public void setNewButtonSelecCustomerRentTVBox(JButton newButtonSelecCustomerRentTVBox) {
		NewButtonSelecCustomerRentTVBox = newButtonSelecCustomerRentTVBox;
	}

	public MaskFormatter getMascara() {
		return mascara;
	}

	public void setMascara(MaskFormatter mascara) {
		this.mascara = mascara;
	}

	public String getFormattedTextFieldReturnDateMovie() {
		return formattedTextFieldReturnDateMovie.getText();
	}

	public void setFormattedTextFieldReturnDateMovie(JFormattedTextField formattedTextFieldReturnDateMovie) {
		this.formattedTextFieldReturnDateMovie = formattedTextFieldReturnDateMovie;
	}

	public MaskFormatter getMascara2() {
		return mascara2;
	}

	public void setMascara2(MaskFormatter mascara2) {
		this.mascara2 = mascara2;
	}

	public String getFormattedTextFieldRentedDate() {
		return formattedTextFieldRentedDate.getText();
	}

	public void setFormattedTextFieldRentedDate(JFormattedTextField formattedTextFieldRentedDate) {
		this.formattedTextFieldRentedDate = formattedTextFieldRentedDate;
	}

	public JFormattedTextField getFormattedTextFieldTotalValueTVBox() {
		return formattedTextFieldTotalValueTVBox;
	}

	public void setFormattedTextFieldTotalValueTVBox(JFormattedTextField formattedTextFieldTotalValueTVBox) {
		this.formattedTextFieldTotalValueTVBox = formattedTextFieldTotalValueTVBox;
	}

	public JButton getNewButtonRentTVBox() {
		return NewButtonRentTVBox;
	}

	public void setNewButtonRentTVBox(JButton newButtonRentTVBox) {
		NewButtonRentTVBox = newButtonRentTVBox;
	}

	int initial = 0;

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Select1")) {

			if (list.size() > 4) {

				return;
			}

			selectedTVBoxID = tableRentTVBox.getSelectedRow();
			selectedID = tableRentTVBox.getValueAt(selectedTVBoxID, 0).toString();

			selectedTVBoxPrice = tableRentTVBox.getSelectedRow();
			String selectedPrice = tableRentTVBox.getValueAt(selectedTVBoxPrice, 5).toString();

			current = Integer.parseInt((String) tableRentTVBox.getValueAt(selectedTVBoxPrice, 5));
			initial += current;

			allSelected1 = true;
			list.add(selectedID);

			formattedTextFieldTotalValueTVBox.setText(String.valueOf(initial));

		}

		if (e.getActionCommand().equals("Select2")) {

			selectedCustomerID = tableRentCustomerTVBox.getSelectedRow();
			customerChoosed = tableRentCustomerTVBox.getValueAt(selectedCustomerID, 0).toString();

			allSelected2 = true;

		}

		if (e.getActionCommand().equals("Rent") && (allSelected1 == true && allSelected2 == true)) {

			jbdc.updatetableTVBox(selectedID);
			MembershipCard mCard = (jbdc.getMembershipPoints(customerChoosed));
			int newPoints = Integer.parseInt(JOptionPane.showInputDialog("Please insert the amount of points"));
			jbdc.updatePoints(customerChoosed, mCard, newPoints);

			JOptionPane.showMessageDialog(null, "Rented");

			for (int i = 0; i < list.size(); i++) {

				jbdc.selectedTVBoxCustomer(list.get(i), customerChoosed, this.getFormattedTextFieldRentedDate(),
						this.getFormattedTextFieldReturnDateMovie());
				list.remove(i);
			}

			allSelected1 = false;
			allSelected2 = false;

		}

		if (e.getActionCommand().equals("Search1")) {

			String st = textFieldSearchRentTVBox.getText();

			System.out.println(st);

			Database jdbc = new Database();
			String[][] data = jdbc.searchTVBox(st);
			tabaleTVboxSelected(data);

		}
		if (e.getActionCommand().equals("Search2")) {

			String st2 = textFieldSearchCustomerRentTVBox.getText();

			System.out.println(st2);

			Database jdbc = new Database();
			String[][] data = jdbc.searchTVBoxCustomer(st2);
			tablecustomertvbox(data);

		}

	}
}
