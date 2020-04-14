package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;

public class RentMovie extends JFrame {

	private JPanel contentPane;
	private JTextField tableCustomerMovie;
	private JTextField textFieldSearchMovie;
	private JTable tableCustomerMovietable ;
	private JTable table;
	private JTextField textFieldSearchCustomerMovie;
	private JButton ButtonSelectMovie;
	private JLabel NewLabelSearchIcon;
	private JButton NewButtonSelecCustomerMovie;
	private MaskFormatter mascara;
	private JFormattedTextField formattedTextFieldReturnDateMovie;
	private MaskFormatter mascara2;
	private JFormattedTextField formattedTextFieldRentedDate;
	private JButton NewButtonRentMovie;
	private JFormattedTextField formattedTextFieldTotalValueMovie;
	private JCheckBox NewCheckBoxCardMovie;
	
	
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					NewMovie frame = new NewMovie();
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
	public RentMovie() throws ParseException {
		
		
		JFrame rentmovie = new JFrame();
        
		rentmovie.setTitle("Ultra Vision Midia");
		
		
		rentmovie.setVisible(true);
		getContentPane().setBackground(UIManager.getColor("ProgressBar.selectionForeground"));
	    rentmovie.setSize(new Dimension(800, 700));
		getContentPane().setSize(new Dimension(800, 660));
		getContentPane().setLayout(null);
		
		
		
		contentPane = new JPanel();
		contentPane.setSize(new Dimension(800, 800));
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		rentmovie.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(6, 6, 788, 94);
		contentPane.add(panel);
		
		JLabel NewLabelRentMovie = new JLabel("Rent Movie");
		NewLabelRentMovie.setIcon(new ImageIcon(NewMovie.class.getResource("/imagens/movie2.png")));
		panel.add(NewLabelRentMovie);
		
		
		ButtonSelectMovie = new JButton("Select");
		ButtonSelectMovie.setBounds(578, 299, 117, 29);
		contentPane.add(ButtonSelectMovie);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(127, 156, 566, 131);
		contentPane.add(panel_1);
		
		tableCustomerMovietable = new JTable();
		panel_1.add(tableCustomerMovietable);
		
		textFieldSearchMovie = new JTextField();
		textFieldSearchMovie.setBounds(470, 118, 179, 26);
		contentPane.add(textFieldSearchMovie);
		textFieldSearchMovie.setColumns(10);
		
		NewLabelSearchIcon = new JLabel("Select Movie");
		NewLabelSearchIcon.setIcon(new ImageIcon(NewLoyaltyCard.class.getResource("/imagens/search2.png")));
		NewLabelSearchIcon.setBounds(646, 118, 39, 26);
		contentPane.add(NewLabelSearchIcon);
		
		JLabel NewLabelSearchMovie = new JLabel("Seearch Movie");
		NewLabelSearchMovie.setBounds(352, 123, 91, 16);
		contentPane.add(NewLabelSearchMovie);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(127, 385, 566, 139);
		contentPane.add(panel_2);
		
		table = new JTable();
		panel_2.add(table);
		
		textFieldSearchCustomerMovie = new JTextField();
		textFieldSearchCustomerMovie.setBounds(470, 348, 179, 26);
		contentPane.add(textFieldSearchCustomerMovie);
		textFieldSearchCustomerMovie.setColumns(10);
		
		JLabel NewLabelSearchCustomerMovie = new JLabel("Search Customer");
		NewLabelSearchCustomerMovie.setBounds(332, 353, 117, 16);
		contentPane.add(NewLabelSearchCustomerMovie);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(RentMovie.class.getResource("/imagens/search2.png")));
		lblNewLabel.setBounds(646, 353, 61, 20);
		contentPane.add(lblNewLabel);
		
		NewButtonSelecCustomerMovie = new JButton("Select");
		NewButtonSelecCustomerMovie.setBounds(578, 536, 117, 29);
		contentPane.add(NewButtonSelecCustomerMovie);
		
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
		
		JLabel NewLabelTotalValueMovie = new JLabel("Total =");
		NewLabelTotalValueMovie.setBounds(384, 649, 46, 21);
		contentPane.add(NewLabelTotalValueMovie);
		
		
		formattedTextFieldTotalValueMovie = new JFormattedTextField();
		formattedTextFieldTotalValueMovie.setBounds(442, 646, 120, 26);
		contentPane.add(formattedTextFieldTotalValueMovie);
		
		NewButtonRentMovie = new JButton("Rent");
		NewButtonRentMovie.setBackground(Color.BLACK);
		NewButtonRentMovie.setForeground(Color.RED);
		NewButtonRentMovie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		NewButtonRentMovie.setBounds(578, 646, 117, 29);
		contentPane.add(NewButtonRentMovie);
		
		JLabel NewLabelSelectPaymentMovie = new JLabel("Select Payment method");
		NewLabelSelectPaymentMovie.setBounds(454, 573, 231, 16);
		contentPane.add(NewLabelSelectPaymentMovie);
		
		NewCheckBoxCardMovie = new JCheckBox("Card");
		NewCheckBoxCardMovie.setBounds(442, 590, 91, 23);
		contentPane.add(NewCheckBoxCardMovie);
		
		JLabel NewLabelCustomerIcon = new JLabel("");
		NewLabelCustomerIcon.setIcon(new ImageIcon(RentMovie.class.getResource("/imagens/employee-removebg-preview.png")));
		NewLabelCustomerIcon.setBounds(21, 415, 84, 72);
		contentPane.add(NewLabelCustomerIcon);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(RentMovie.class.getResource("/imagens/homepage2-removebg-preview.png")));
		lblNewLabel_1.setBounds(21, 178, 94, 75);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(RentMovie.class.getResource("/imagens/main logo removed background.png")));
		lblNewLabel_2.setBounds(6, 603, 109, 67);
		contentPane.add(lblNewLabel_2);
		
		rentmovie.validate();
		rentmovie.repaint();

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

	public JTextField getTextFieldSearchMovie() {
		return textFieldSearchMovie;
	}

	public void setTextFieldSearchMovie(JTextField textFieldSearchMovie) {
		this.textFieldSearchMovie = textFieldSearchMovie;
	}

	public JTable getTableCustomerMovietable() {
		return tableCustomerMovietable;
	}

	public void setTableCustomerMovietable(JTable tableCustomerMovietable) {
		this.tableCustomerMovietable = tableCustomerMovietable;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JTextField getTextFieldSearchCustomerMovie() {
		return textFieldSearchCustomerMovie;
	}

	public void setTextFieldSearchCustomerMovie(JTextField textFieldSearchCustomerMovie) {
		this.textFieldSearchCustomerMovie = textFieldSearchCustomerMovie;
	}

	public JButton getButtonSelectMovie() {
		return ButtonSelectMovie;
	}

	public void setButtonSelectMovie(JButton buttonSelectMovie) {
		ButtonSelectMovie = buttonSelectMovie;
	}

	public JLabel getNewLabelSearchIcon() {
		return NewLabelSearchIcon;
	}

	public void setNewLabelSearchIcon(JLabel newLabelSearchIcon) {
		NewLabelSearchIcon = newLabelSearchIcon;
	}

	public JButton getNewButtonSelecCustomerMovie() {
		return NewButtonSelecCustomerMovie;
	}

	public void setNewButtonSelecCustomerMovie(JButton newButtonSelecCustomerMovie) {
		NewButtonSelecCustomerMovie = newButtonSelecCustomerMovie;
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

	public JButton getNewButtonRentMovie() {
		return NewButtonRentMovie;
	}

	public void setNewButtonRentMovie(JButton newButtonRentMovie) {
		NewButtonRentMovie = newButtonRentMovie;
	}

	public JFormattedTextField getFormattedTextFieldTotalValueMovie() {
		return formattedTextFieldTotalValueMovie;
	}

	public void setFormattedTextFieldTotalValueMovie(JFormattedTextField formattedTextFieldTotalValueMovie) {
		this.formattedTextFieldTotalValueMovie = formattedTextFieldTotalValueMovie;
	}

	public JCheckBox getNewCheckBoxCardMovie() {
		return NewCheckBoxCardMovie;
	}

	public void setNewCheckBoxCardMovie(JCheckBox newCheckBoxCardMovie) {
		NewCheckBoxCardMovie = newCheckBoxCardMovie;
	}
	
}
