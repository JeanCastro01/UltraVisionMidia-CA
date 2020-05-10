package view;

import java.awt.Color;
import java.awt.Dimension;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import model.Database;
import model.MembershipCard;

/**
 * this class is to rent MusicLive wich the employee will be able to select
 * the customer and the titles that will be rented which also implements Actions
 * listener
 * 
 * @author jeancastro
 *
 */
public class RentMusicLive extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField tableCustomerMovie;
	private JTextField textFieldSearchMusicLive;
	private JTextField textFieldSearchCustomerMusicLive;
	private JButton ButtonSelectMusicLive;
	private JButton NewLabelSearchIconRentMusicLive;
	private JButton NewButtonSelecCustomerMusicLive;
	private MaskFormatter mascara;
	private JFormattedTextField formattedTextFieldReturnDateMusicLive;
	private MaskFormatter mascara2;
	private JFormattedTextField formattedTextFieldRentedDateMusicLive;
	private JFormattedTextField formattedTextFieldTotalValueMusicLive;
	private JButton NewButtonRentMusicLive;

	private JTable tableRentMusicLive;
	private JTable tableRentCustomerMusicLive;
	private int selectedLiveConcertID;
	private String selectedID;
	private int selectedPriceLiveConcert;
	private int current;
	List<String> list = new ArrayList<String>();
	private Database jbdc = new Database();
	boolean allSelected1 = false;
	boolean allSelected2 = false;
	private int selectedCustomerID;
	private String customerChoosed;
	private JLabel NewLabelSearchCustomerMovie;
	private JButton NewLabelSearchIconCustomerMusicLive;
	private String selectedPrice;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 * 
	 * @throws ParseException
	 */
	public RentMusicLive() throws ParseException {

		JFrame rentmusiclive = new JFrame();

		rentmusiclive.setTitle("Ultra Vision Midia");
		rentmusiclive.setVisible(true);
		rentmusiclive.setSize(new Dimension(800, 700));
		rentmusiclive.setLocationRelativeTo(null);
		rentmusiclive.setResizable(false);

		contentPane = new JPanel();
		contentPane.setSize(new Dimension(800, 800));
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		rentmusiclive.setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(6, 6, 788, 94);
		contentPane.add(panel);

		JLabel NewLabelMusicLive = new JLabel("Rent Music Live");
		NewLabelMusicLive.setIcon(new ImageIcon(RentMusicLive.class.getResource("/imagens/Music Live2.png")));
		panel.add(NewLabelMusicLive);

		ButtonSelectMusicLive = new JButton("Select");
		ButtonSelectMusicLive.setBounds(578, 302, 117, 29);
		contentPane.add(ButtonSelectMusicLive);
		ButtonSelectMusicLive.setActionCommand("Select1");
		ButtonSelectMusicLive.addActionListener(this);

		textFieldSearchMusicLive = new JTextField();
		textFieldSearchMusicLive.setBounds(470, 118, 179, 26);
		contentPane.add(textFieldSearchMusicLive);
		textFieldSearchMusicLive.setColumns(10);

		NewLabelSearchIconRentMusicLive = new JButton("");
		NewLabelSearchIconRentMusicLive
				.setIcon(new ImageIcon(NewLoyaltyCard.class.getResource("/imagens/search2.png")));
		NewLabelSearchIconRentMusicLive.setBounds(646, 118, 39, 26);
		contentPane.add(NewLabelSearchIconRentMusicLive);
		NewLabelSearchIconRentMusicLive.setActionCommand("Search1");
		NewLabelSearchIconRentMusicLive.addActionListener(this);

		JLabel NewLabelSearchMovie = new JLabel("Search Music Live");
		NewLabelSearchMovie.setBounds(332, 123, 111, 16);
		contentPane.add(NewLabelSearchMovie);

		textFieldSearchCustomerMusicLive = new JTextField();
		textFieldSearchCustomerMusicLive.setBounds(470, 348, 179, 26);
		contentPane.add(textFieldSearchCustomerMusicLive);
		textFieldSearchCustomerMusicLive.setColumns(10);

		NewLabelSearchCustomerMovie = new JLabel("Search Customer");
		NewLabelSearchCustomerMovie.setBounds(332, 353, 117, 16);
		contentPane.add(NewLabelSearchCustomerMovie);

		NewLabelSearchIconCustomerMusicLive = new JButton("");
		NewLabelSearchIconCustomerMusicLive.setIcon(new ImageIcon(RentMovie.class.getResource("/imagens/search2.png")));
		NewLabelSearchIconCustomerMusicLive.setBounds(646, 353, 61, 20);
		contentPane.add(NewLabelSearchIconCustomerMusicLive);
		NewLabelSearchIconCustomerMusicLive.setActionCommand("Search2");
		NewLabelSearchIconCustomerMusicLive.addActionListener(this);

		NewButtonSelecCustomerMusicLive = new JButton("Select");
		NewButtonSelecCustomerMusicLive.setBounds(578, 540, 117, 29);
		contentPane.add(NewButtonSelecCustomerMusicLive);
		NewButtonSelecCustomerMusicLive.setActionCommand("Select2");
		NewButtonSelecCustomerMusicLive.addActionListener(this);

		mascara = new MaskFormatter("##/##/####");
		formattedTextFieldReturnDateMusicLive = new JFormattedTextField(mascara);
		formattedTextFieldReturnDateMusicLive.setBounds(127, 606, 130, 26);
		contentPane.add(formattedTextFieldReturnDateMusicLive);

		mascara2 = new MaskFormatter("##/##/####");
		formattedTextFieldRentedDateMusicLive = new JFormattedTextField(mascara2);
		formattedTextFieldRentedDateMusicLive.setBounds(127, 568, 130, 26);
		contentPane.add(formattedTextFieldRentedDateMusicLive);

		JLabel NewLabelRentedDate = new JLabel(" Rented Date");
		NewLabelRentedDate.setBounds(277, 573, 85, 16);
		contentPane.add(NewLabelRentedDate);

		JLabel NewLabelReturnDateMovie = new JLabel("Return Date");
		NewLabelReturnDateMovie.setBounds(279, 611, 83, 16);
		contentPane.add(NewLabelReturnDateMovie);

		JLabel NewLabelTotalValueMovie = new JLabel("Total =");
		NewLabelTotalValueMovie.setBounds(384, 649, 46, 21);
		contentPane.add(NewLabelTotalValueMovie);

		formattedTextFieldTotalValueMusicLive = new JFormattedTextField();
		formattedTextFieldTotalValueMusicLive.setBounds(442, 646, 120, 26);
		contentPane.add(formattedTextFieldTotalValueMusicLive);

		NewButtonRentMusicLive = new JButton("Rent");
		NewButtonRentMusicLive.setBackground(Color.BLACK);
		NewButtonRentMusicLive.setForeground(Color.RED);
		NewButtonRentMusicLive.setBounds(578, 646, 117, 29);
		contentPane.add(NewButtonRentMusicLive);
		NewButtonRentMusicLive.setActionCommand("Rent");
		NewButtonRentMusicLive.addActionListener(this);

		JLabel NewLabelCustomerIcon = new JLabel("");
		NewLabelCustomerIcon
				.setIcon(new ImageIcon(RentMovie.class.getResource("/imagens/employee-removebg-preview.png")));
		NewLabelCustomerIcon.setBounds(21, 415, 84, 72);
		contentPane.add(NewLabelCustomerIcon);

		JLabel NewLabelSinger = new JLabel("");
		NewLabelSinger.setIcon(new ImageIcon(RentMusicLive.class.getResource("/imagens/musiclive rent.png")));
		NewLabelSinger.setBounds(24, 176, 91, 94);
		contentPane.add(NewLabelSinger);

		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(RentMovie.class.getResource("/imagens/main logo removed background.png")));
		lblNewLabel_2.setBounds(6, 603, 109, 67);
		contentPane.add(lblNewLabel_2);

		rentmusiclive.validate();
		rentmusiclive.repaint();

	}

	/**
	 * this method is to creat the table passing the data collected from the
	 * database Music Live table using outsidedata as parameter
	 * 
	 * @param outsideData
	 */

	public void tabaleMusicliveSelected(String[][] outsideData) {

		// ________LIVE CONCERT AVAILABLE TABlE___________

		String[] columnNames = { "ID", "Title", "Singer", "Type", "Price" };

		// Gathering the data

		// Using a scroll pane
		JScrollPane myPane = new JScrollPane();
		myPane.setBounds(127, 143, 550, 161);
		contentPane.add(myPane);

		tableRentMusicLive = new JTable(outsideData, columnNames);
		contentPane.add(tableRentMusicLive);
		myPane.setViewportView(tableRentMusicLive);

	}

	/**
	 * this method is to creat the table passing the data collected from the
	 * Customer table using outisdedata as parameter
	 * 
	 * @param outsideData
	 */

	public void tablecustomerMusiclive(String[][] outsideData2) {

		// ________ CUSTOMER LIVE CONCERT TABLE ___________

		// Database jdbc = new Database();

		String[] columnNames2 = { "ID", "FirstName", "LastName", "Email", "Tel", "Membership" };

		// // Gathering the data
		// data2 = jdbc.rentLiveConcertCustomer();

		// Using a scroll pane
		JScrollPane myPane2 = new JScrollPane();
		myPane2.setBounds(127, 372, 549, 161);
		contentPane.add(myPane2);

		tableRentCustomerMusicLive = new JTable(outsideData2, columnNames2);
		// table.setBounds(226, 169, 470, 389);
		contentPane.add(tableRentCustomerMusicLive);
		myPane2.setViewportView(tableRentCustomerMusicLive);

	}

	public String getFormattedTextFieldReturnDateMusicLive() {
		return formattedTextFieldReturnDateMusicLive.getText();
	}

	public String getFormattedTextFieldRentedDateMusicLive() {
		return formattedTextFieldRentedDateMusicLive.getText();
	}

	int initial = 0;

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("Select1")) {

			if (list.size() > 4) {

				return;
			}

			selectedLiveConcertID = tableRentMusicLive.getSelectedRow();
			selectedID = tableRentMusicLive.getValueAt(selectedLiveConcertID, 0).toString();

			selectedPriceLiveConcert = tableRentMusicLive.getSelectedRow();
			String selectedPrice = tableRentMusicLive.getValueAt(selectedPriceLiveConcert, 4).toString();

			current = Integer.parseInt((String) tableRentMusicLive.getValueAt(selectedPriceLiveConcert, 4));
			initial += current;

			allSelected1 = true;
			list.add(selectedID);

			formattedTextFieldTotalValueMusicLive.setText(String.valueOf(initial));

		}

		if (e.getActionCommand().equals("Select2")) {

			selectedCustomerID = tableRentCustomerMusicLive.getSelectedRow();
			customerChoosed = tableRentCustomerMusicLive.getValueAt(selectedCustomerID, 0).toString();

			allSelected2 = true;

		}

		if (e.getActionCommand().equals("Rent") && (allSelected1 == true && allSelected2 == true)) {

			jbdc.updatetableMusicLive(selectedID);
			MembershipCard mCard = (jbdc.getMembershipPoints(customerChoosed));
			int newPoints = Integer.parseInt(JOptionPane.showInputDialog("Please insert the amount of points"));
			jbdc.updatePoints(customerChoosed, mCard, newPoints);

			JOptionPane.showMessageDialog(null, "Rented");

			for (int i = 0; i < list.size(); i++) {

				jbdc.selectedMusicliveCustomer(list.get(i), customerChoosed,
						this.getFormattedTextFieldRentedDateMusicLive(),
						this.getFormattedTextFieldReturnDateMusicLive());

				list.remove(i);
			}

			allSelected1 = false;
			allSelected2 = false;

		}

		if (e.getActionCommand().equals("Search1")) {

			String st = textFieldSearchMusicLive.getText();

			System.out.println(st);

			Database jdbc = new Database();
			String[][] data = jdbc.searchMusicLive(st);
			tabaleMusicliveSelected(data);

		}
		if (e.getActionCommand().equals("Search2")) {

			String st2 = textFieldSearchCustomerMusicLive.getText();

			System.out.println(st2);

			Database jdbc = new Database();
			String[][] data = jdbc.searchMusicliveCustomer(st2);
			tablecustomerMusiclive(data);

		}

	}
}