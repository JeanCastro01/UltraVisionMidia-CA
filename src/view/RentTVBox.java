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

public class RentTVBox extends JFrame {


	private JPanel contentPane;
	private JTextField tableCustomerMovie;
	private JTextField textFieldSearchRentTVBox;
	private JTable tableRentTVBox ;
	private JTable tableRentCustomerTVBox;
	private JTextField textFieldSearchCustomerRentTVBox;
	private JButton ButtonSelectRentTVbox;
	private JLabel NewLabelSearchIconRentTVBox;
	private JButton NewButtonSelecCustomerRentTVBox;
	private MaskFormatter mascara;
	private JFormattedTextField formattedTextFieldReturnDateMovie;
	private MaskFormatter mascara2;
	private JFormattedTextField formattedTextFieldRentedDate;
	private JFormattedTextField formattedTextFieldTotalValueTVBox;
	private JButton NewButtonRentTVBox;
	private JCheckBox NewCheckBoxCardTVbox;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	public RentTVBox() throws ParseException {
		
		
		JFrame rentTVbox = new JFrame();
        
		rentTVbox.setTitle("Ultra Vision Midia");
		rentTVbox.setLocationRelativeTo(null);
		rentTVbox.setResizable(false);
		
		rentTVbox.setVisible(true);
		getContentPane().setBackground(UIManager.getColor("ProgressBar.selectionForeground"));
	    rentTVbox.setSize(new Dimension(800, 700));
		getContentPane().setSize(new Dimension(800, 660));
		getContentPane().setLayout(null);
		
		
		
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
		ButtonSelectRentTVbox.setBounds(578, 299, 117, 29);
		contentPane.add(ButtonSelectRentTVbox);
		
		JPanel panelRentTVBox = new JPanel();
		panelRentTVBox.setBounds(127, 156, 566, 131);
		contentPane.add(panelRentTVBox);
		
		tableRentTVBox = new JTable();
		panelRentTVBox.add(tableRentTVBox);
		
		textFieldSearchRentTVBox = new JTextField();
		textFieldSearchRentTVBox.setBounds(470, 118, 179, 26);
		contentPane.add(textFieldSearchRentTVBox);
		textFieldSearchRentTVBox.setColumns(10);
		
		JLabel NewLabelSearchIconRentTVBox = new JLabel("Select Movie");
		NewLabelSearchIconRentTVBox.setIcon(new ImageIcon(NewLoyaltyCard.class.getResource("/imagens/search2.png")));
		NewLabelSearchIconRentTVBox.setBounds(646, 118, 39, 26);
		contentPane.add(NewLabelSearchIconRentTVBox);
		
		JLabel NewLabelSearchRentTVBox = new JLabel("Search TVBox");
		NewLabelSearchRentTVBox.setBounds(352, 123, 91, 16);
		contentPane.add(NewLabelSearchRentTVBox);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(127, 385, 566, 139);
		contentPane.add(panel_2);
		
		tableRentCustomerTVBox = new JTable();
		panel_2.add(tableRentCustomerTVBox);
		
		textFieldSearchCustomerRentTVBox = new JTextField();
		textFieldSearchCustomerRentTVBox.setBounds(470, 348, 179, 26);
		contentPane.add(textFieldSearchCustomerRentTVBox);
		textFieldSearchCustomerRentTVBox.setColumns(10);
		
		JLabel NewLabelSearchCustomerMovie = new JLabel("Search Customer");
		NewLabelSearchCustomerMovie.setBounds(332, 353, 117, 16);
		contentPane.add(NewLabelSearchCustomerMovie);
		
		JLabel NewLabeliconRentTVBox = new JLabel("");
		NewLabeliconRentTVBox.setIcon(new ImageIcon(RentMovie.class.getResource("/imagens/search2.png")));
		NewLabeliconRentTVBox.setBounds(646, 353, 61, 20);
		contentPane.add(NewLabeliconRentTVBox);
		
		NewButtonSelecCustomerRentTVBox = new JButton("Select");
		NewButtonSelecCustomerRentTVBox.setBounds(578, 536, 117, 29);
		contentPane.add(NewButtonSelecCustomerRentTVBox);
		
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
		NewButtonRentTVBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		NewButtonRentTVBox.setBounds(578, 646, 117, 29);
		contentPane.add(NewButtonRentTVBox);
		
		JLabel NewLabelSelectPaymentMovie = new JLabel("Select Payment method");
		NewLabelSelectPaymentMovie.setBounds(454, 573, 231, 16);
		contentPane.add(NewLabelSelectPaymentMovie);
		
		NewCheckBoxCardTVbox = new JCheckBox("Card");
		NewCheckBoxCardTVbox.setBounds(442, 590, 91, 23);
		contentPane.add(NewCheckBoxCardTVbox);
		
		JLabel NewLabelCustomerIcon = new JLabel("");
		NewLabelCustomerIcon.setIcon(new ImageIcon(RentMovie.class.getResource("/imagens/employee-removebg-preview.png")));
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

	public JLabel getNewLabelSearchIconRentTVBox() {
		return NewLabelSearchIconRentTVBox;
	}

	public void setNewLabelSearchIconRentTVBox(JLabel newLabelSearchIconRentTVBox) {
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

	public JFormattedTextField getFormattedTextFieldReturnDateMovie() {
		return formattedTextFieldReturnDateMovie;
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

	public JFormattedTextField getFormattedTextFieldRentedDate() {
		return formattedTextFieldRentedDate;
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

	public JCheckBox getNewCheckBoxCardTVbox() {
		return NewCheckBoxCardTVbox;
	}

	public void setNewCheckBoxCardTVbox(JCheckBox newCheckBoxCardTVbox) {
		NewCheckBoxCardTVbox = newCheckBoxCardTVbox;
	}
	
	
}
