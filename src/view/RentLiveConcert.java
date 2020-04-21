package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

public class RentLiveConcert extends JFrame {


	private JPanel contentPane;
	private JTextField tableCustomerMovie;
	private JTextField textFieldSearchRentLiveConcert;
	private JTable tableRentLiveConcert ;
	private JTable tableRentCustomerLiveConcert;
	private JTextField textFieldSearchCustomerRentLiveConcert;
	private JButton ButtonSelectRentLiveConcert;
	private JButton NewButtonSelectCustomerRentLiveConcert ;
	private JFormattedTextField formattedTextFieldReturnDateMovie;
	private JFormattedTextField formattedTextFieldRentedDate;
	private JFormattedTextField formattedTextFieldTotalValueLiveConcert;
	private JButton NewButtonRentLiveConcert;
	private JCheckBox NewCheckBoxCardLiveConcert ;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	public RentLiveConcert() throws ParseException {
		
		
		JFrame rentliveconcert = new JFrame();
        
		rentliveconcert.setTitle("Ultra Vision Midia");
		rentliveconcert.setLocationRelativeTo(null);
		rentliveconcert.setResizable(false);
		
		
		rentliveconcert.setVisible(true);
		getContentPane().setBackground(UIManager.getColor("ProgressBar.selectionForeground"));
	    rentliveconcert.setSize(new Dimension(800, 700));
		getContentPane().setSize(new Dimension(800, 660));
		getContentPane().setLayout(null);
		
		
		
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
		ButtonSelectRentLiveConcert.setBounds(578, 299, 117, 29);
		contentPane.add(ButtonSelectRentLiveConcert);
		
		JPanel panelRentLiveConcert = new JPanel();
		panelRentLiveConcert.setBounds(127, 156, 566, 131);
		contentPane.add(panelRentLiveConcert);
		
		tableRentLiveConcert = new JTable();
		panelRentLiveConcert.add(tableRentLiveConcert);
		
		textFieldSearchRentLiveConcert = new JTextField();
		textFieldSearchRentLiveConcert.setBounds(470, 118, 179, 26);
		contentPane.add(textFieldSearchRentLiveConcert);
		textFieldSearchRentLiveConcert.setColumns(10);
		
		JLabel NewLabelSearchIconRentLiveConcert = new JLabel("Select Movie");
		NewLabelSearchIconRentLiveConcert.setIcon(new ImageIcon(NewLoyaltyCard.class.getResource("/imagens/search2.png")));
		NewLabelSearchIconRentLiveConcert.setBounds(646, 118, 39, 26);
		contentPane.add(NewLabelSearchIconRentLiveConcert);
		
		JLabel NewLabelSearchLiveConcert = new JLabel("Search Live Concert");
		NewLabelSearchLiveConcert.setBounds(352, 123, 91, 16);
		contentPane.add(NewLabelSearchLiveConcert);
		
		JPanel panelRentCustomerLiveConcert = new JPanel();
		panelRentCustomerLiveConcert.setBounds(127, 385, 566, 139);
		contentPane.add(panelRentCustomerLiveConcert);
		
		tableRentCustomerLiveConcert = new JTable();
		panelRentCustomerLiveConcert.add(tableRentCustomerLiveConcert);
		
		textFieldSearchCustomerRentLiveConcert = new JTextField();
		textFieldSearchCustomerRentLiveConcert.setBounds(470, 348, 179, 26);
		contentPane.add(textFieldSearchCustomerRentLiveConcert);
		textFieldSearchCustomerRentLiveConcert.setColumns(10);
		
		JLabel NewLabelSearchCustomerMovie = new JLabel("Search Customer");
		NewLabelSearchCustomerMovie.setBounds(332, 353, 117, 16);
		contentPane.add(NewLabelSearchCustomerMovie);
		
		JLabel NewLabelSearchIconRentCostumer = new JLabel("");
		NewLabelSearchIconRentCostumer.setIcon(new ImageIcon(RentMovie.class.getResource("/imagens/search2.png")));
		NewLabelSearchIconRentCostumer.setBounds(646, 353, 61, 20);
		contentPane.add(NewLabelSearchIconRentCostumer);
		
		NewButtonSelectCustomerRentLiveConcert = new JButton("Select");
		NewButtonSelectCustomerRentLiveConcert.setBounds(578, 536, 117, 29);
		contentPane.add(NewButtonSelectCustomerRentLiveConcert);
		
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
		NewButtonRentLiveConcert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		NewButtonRentLiveConcert.setBounds(578, 646, 117, 29);
		contentPane.add(NewButtonRentLiveConcert);
		
		JLabel NewLabelSelectPaymentMovie = new JLabel("Select Payment method");
		NewLabelSelectPaymentMovie.setBounds(454, 573, 231, 16);
		contentPane.add(NewLabelSelectPaymentMovie);
		
		NewCheckBoxCardLiveConcert = new JCheckBox("Card");
		NewCheckBoxCardLiveConcert.setBounds(442, 590, 91, 23);
		contentPane.add(NewCheckBoxCardLiveConcert);
		
		JLabel NewLabelCustomerIcon = new JLabel("");
		NewLabelCustomerIcon.setIcon(new ImageIcon(RentMovie.class.getResource("/imagens/employee-removebg-preview.png")));
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

	public void setButtonSelectRentLiveConcert(JButton buttonSelectRentLiveConcert) {
		ButtonSelectRentLiveConcert = buttonSelectRentLiveConcert;
	}

	public JButton getNewButtonSelectCustomerRentLiveConcert() {
		return NewButtonSelectCustomerRentLiveConcert;
	}

	public void setNewButtonSelectCustomerRentLiveConcert(JButton newButtonSelectCustomerRentLiveConcert) {
		NewButtonSelectCustomerRentLiveConcert = newButtonSelectCustomerRentLiveConcert;
	}

	public JFormattedTextField getFormattedTextFieldReturnDateMovie() {
		return formattedTextFieldReturnDateMovie;
	}

	public void setFormattedTextFieldReturnDateMovie(JFormattedTextField formattedTextFieldReturnDateMovie) {
		this.formattedTextFieldReturnDateMovie = formattedTextFieldReturnDateMovie;
	}

	public JFormattedTextField getFormattedTextFieldRentedDate() {
		return formattedTextFieldRentedDate;
	}

	public void setFormattedTextFieldRentedDate(JFormattedTextField formattedTextFieldRentedDate) {
		this.formattedTextFieldRentedDate = formattedTextFieldRentedDate;
	}

	public JFormattedTextField getFormattedTextFieldTotalValueLiveConcert() {
		return formattedTextFieldTotalValueLiveConcert;
	}

	public void setFormattedTextFieldTotalValueLiveConcert(JFormattedTextField formattedTextFieldTotalValueLiveConcert) {
		this.formattedTextFieldTotalValueLiveConcert = formattedTextFieldTotalValueLiveConcert;
	}

	public JButton getNewButtonRentLiveConcert() {
		return NewButtonRentLiveConcert;
	}

	public void setNewButtonRentLiveConcert(JButton newButtonRentLiveConcert) {
		NewButtonRentLiveConcert = newButtonRentLiveConcert;
	}

	public JCheckBox getNewCheckBoxCardLiveConcert() {
		return NewCheckBoxCardLiveConcert;
	}

	public void setNewCheckBoxCardLiveConcert(JCheckBox newCheckBoxCardLiveConcert) {
		NewCheckBoxCardLiveConcert = newCheckBoxCardLiveConcert;
	}
	
	
}

