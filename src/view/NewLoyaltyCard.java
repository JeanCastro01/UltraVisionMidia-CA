package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import model.Database;

import javax.swing.JTable;
import javax.swing.JComboBox;

public class NewLoyaltyCard extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JButton ButtonCreateLoyaltyCard;
	private JLabel NewLabelSearchIcon;
	private JTable table;
	private JTable tableCustomerLoyaltyCard;
	private JButton btnNewButton;
	private JFrame loyaltyCard;

	/**
	 * Create the frame.
	 */
	public NewLoyaltyCard() {

		loyaltyCard = new JFrame();

		loyaltyCard.setTitle("Ultra Vision Midia");
		loyaltyCard.setVisible(true);
		loyaltyCard.setSize(new Dimension(800, 600));
		loyaltyCard.setLocationRelativeTo(null);
		loyaltyCard.setResizable(false);

		contentPane = new JPanel();
		contentPane.setSize(new Dimension(800, 600));
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		loyaltyCard.setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(6, 6, 788, 94);
		contentPane.add(panel);

		JLabel NewLabelEmployee = new JLabel("Loyalty Card Points");
		NewLabelEmployee.setIcon(new ImageIcon(NewLoyaltyCard.class.getResource("/imagens/card2.png")));
		panel.add(NewLabelEmployee);
		contentPane.add(panel);

		textField = new JTextField();
		textField.setBounds(392, 118, 179, 26);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel NewLabelSearchCustomer = new JLabel("Please enter Customer Email");
		NewLabelSearchCustomer.setBounds(195, 123, 185, 16);
		contentPane.add(NewLabelSearchCustomer);

		btnNewButton = new JButton("Search");
		btnNewButton.setBounds(572, 118, 117, 29);
		contentPane.add(btnNewButton);
		btnNewButton.setActionCommand("Search");
		btnNewButton.addActionListener(this);

		loyaltyCard.validate();
		loyaltyCard.repaint();
	}

	public void tablecustomerloyaltyCard(String[][] outsideData2) {

		// ________ CUSTOMER LIVE CONCERT TABLE ___________

		// Database jdbc = new Database();

		String[] columnNames2 = { "Customer ID", "Email", "LoyaltyCard ID", "Points" };

		// // Gathering the data
		// data2 = jdbc.rentLiveConcertCustomer();

		// Using a scroll pane
		JScrollPane myPane2 = new JScrollPane();
		myPane2.setBounds(127, 143, 550, 161);
		contentPane.add(myPane2);

		table = new JTable(outsideData2, columnNames2);
		// table.setBounds(226, 169, 470, 389);
		contentPane.add(table);
		myPane2.setViewportView(table);

	}

	public JTable getTableCustomerLoyaltyCard() {
		return getTableCustomerLoyaltyCard();
	}

	public JTextField getTextField() {
		return textField;
	}

	public JButton getButtonCreateLoyaltyCard() {
		return ButtonCreateLoyaltyCard;
	}

	public JLabel getNewLabelSearchIcon() {
		return NewLabelSearchIcon;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("Search")) {

			Database jdbc = new Database();

			String email = textField.getText();

			int cust_id = 0;
			try {
				cust_id = jdbc.getCustomerIO(email);
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}

			String[][] data = null;
			try {
				data = jdbc.cardPoints(cust_id, email);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			tablecustomerloyaltyCard(data);

		}
	}
}
