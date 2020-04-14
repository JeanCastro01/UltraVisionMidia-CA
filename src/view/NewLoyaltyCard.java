package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JComboBox;

public class NewLoyaltyCard extends JFrame {

	private JPanel contentPane;
	private JTable tableCustomerLoyaltyCard;
	private JTextField textField;
	private JButton ButtonCreateLoyaltyCard;
	private JLabel NewLabelSearchIcon;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					NewLoyaltyCard frame = new NewLoyaltyCard();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public NewLoyaltyCard() {
		
		JFrame loyaltyCard = new JFrame();
        
		loyaltyCard.setTitle("Ultra Vision Midia");
		loyaltyCard.setVisible(true);
		
		
		
		getContentPane().setBackground(UIManager.getColor("ProgressBar.selectionForeground"));
		loyaltyCard.setSize(new Dimension(800, 600));
		getContentPane().setSize(new Dimension(800, 660));
		getContentPane().setLayout(null);
		
		
		
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
		
		JLabel NewLabelEmployee = new JLabel("New Loyalty Card");
		NewLabelEmployee.setIcon(new ImageIcon(NewLoyaltyCard.class.getResource("/imagens/card2.png")));
		panel.add(NewLabelEmployee);
		
	
		
		JButton ButtonCreateLoyaltyCard = new JButton("Create");
		ButtonCreateLoyaltyCard.setBounds(572, 438, 117, 29);
		contentPane.add(ButtonCreateLoyaltyCard);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(127, 156, 562, 271);
		contentPane.add(panel_1);
		
		tableCustomerLoyaltyCard = new JTable();
		panel_1.add(tableCustomerLoyaltyCard);
		
		textField = new JTextField();
		textField.setBounds(470, 118, 179, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel NewLabelSearchIcon = new JLabel("");
		NewLabelSearchIcon.setIcon(new ImageIcon(NewLoyaltyCard.class.getResource("/imagens/search2.png")));
		NewLabelSearchIcon.setBounds(646, 118, 39, 26);
		contentPane.add(NewLabelSearchIcon);
		
		JLabel NewLabelSearchCustomer = new JLabel("Search Customer");
		NewLabelSearchCustomer.setBounds(333, 123, 111, 16);
		contentPane.add(NewLabelSearchCustomer);
		
		loyaltyCard.validate();
		loyaltyCard.repaint();
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public JTable getTableCustomerLoyaltyCard() {
		return tableCustomerLoyaltyCard;
	}

	public void setTableCustomerLoyaltyCard(JTable tableCustomerLoyaltyCard) {
		this.tableCustomerLoyaltyCard = tableCustomerLoyaltyCard;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JButton getButtonCreateLoyaltyCard() {
		return ButtonCreateLoyaltyCard;
	}

	public void setButtonCreateLoyaltyCard(JButton buttonCreateLoyaltyCard) {
		ButtonCreateLoyaltyCard = buttonCreateLoyaltyCard;
	}

	public JLabel getNewLabelSearchIcon() {
		return NewLabelSearchIcon;
	}

	public void setNewLabelSearchIcon(JLabel newLabelSearchIcon) {
		NewLabelSearchIcon = newLabelSearchIcon;
	}
	
}
