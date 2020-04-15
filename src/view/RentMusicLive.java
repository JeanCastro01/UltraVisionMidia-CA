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

public class RentMusicLive extends JFrame {

	private JPanel contentPane;
	private JTextField tableCustomerMovie;
	private JTextField textFieldSearchMusicLive;
	private JTable tableRentMusicLive ;
	private JTable tableRentCustomerMusicLive;
	private JTextField textFieldSearchCustomerMusicLive;
	private JButton ButtonSelectMusicLive;
	private JLabel NewLabelSearchIconRentMusicLive;
	private JButton NewButtonSelecCustomerMusicLive;
	private MaskFormatter mascara;
	private JFormattedTextField formattedTextFieldReturnDateMusicLive;
	private MaskFormatter mascara2;
	private JFormattedTextField formattedTextFieldRentedDateMusicLive;
	private JFormattedTextField formattedTextFieldTotalValueMusicLive;
	private JButton NewButtonRentMusicLive;
	private JCheckBox NewCheckBoxCardMusicLive;

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
	public RentMusicLive() throws ParseException {
		
		
		JFrame rentmusiclive = new JFrame();
        
		rentmusiclive.setTitle("Ultra Vision Midia");
		
		
		rentmusiclive.setVisible(true);
		getContentPane().setBackground(UIManager.getColor("ProgressBar.selectionForeground"));
	    rentmusiclive.setSize(new Dimension(800, 700));
		getContentPane().setSize(new Dimension(800, 660));
		getContentPane().setLayout(null);
		
		
		
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
		ButtonSelectMusicLive.setBounds(578, 299, 117, 29);
		contentPane.add(ButtonSelectMusicLive);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(127, 156, 566, 131);
		contentPane.add(panel_1);
		
		tableRentMusicLive = new JTable();
		panel_1.add(tableRentMusicLive);
		
		textFieldSearchMusicLive = new JTextField();
		textFieldSearchMusicLive.setBounds(470, 118, 179, 26);
		contentPane.add(textFieldSearchMusicLive);
		textFieldSearchMusicLive.setColumns(10);
		
		NewLabelSearchIconRentMusicLive = new JLabel("Select Movie");
		NewLabelSearchIconRentMusicLive.setIcon(new ImageIcon(NewLoyaltyCard.class.getResource("/imagens/search2.png")));
		NewLabelSearchIconRentMusicLive.setBounds(646, 118, 39, 26);
		contentPane.add(NewLabelSearchIconRentMusicLive);
		
		JLabel NewLabelSearchMovie = new JLabel("Search Music Live");
		NewLabelSearchMovie.setBounds(332, 123, 111, 16);
		contentPane.add(NewLabelSearchMovie);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(127, 385, 566, 139);
		contentPane.add(panel_2);
		
		tableRentCustomerMusicLive = new JTable();
		panel_2.add(tableRentCustomerMusicLive);
		
		textFieldSearchCustomerMusicLive = new JTextField();
		textFieldSearchCustomerMusicLive.setBounds(470, 348, 179, 26);
		contentPane.add(textFieldSearchCustomerMusicLive);
		textFieldSearchCustomerMusicLive.setColumns(10);
		
		JLabel NewLabelSearchCustomerMovie = new JLabel("Search Customer");
		NewLabelSearchCustomerMovie.setBounds(332, 353, 117, 16);
		contentPane.add(NewLabelSearchCustomerMovie);
		
		JLabel NewLabelSearchIconCustomerMusicLive = new JLabel("");
		NewLabelSearchIconCustomerMusicLive.setIcon(new ImageIcon(RentMovie.class.getResource("/imagens/search2.png")));
		NewLabelSearchIconCustomerMusicLive.setBounds(646, 353, 61, 20);
		contentPane.add(NewLabelSearchIconCustomerMusicLive);
		
		NewButtonSelecCustomerMusicLive = new JButton("Select");
		NewButtonSelecCustomerMusicLive.setBounds(578, 536, 117, 29);
		contentPane.add(NewButtonSelecCustomerMusicLive);
		
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
		NewButtonRentMusicLive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		NewButtonRentMusicLive.setBounds(578, 646, 117, 29);
		contentPane.add(NewButtonRentMusicLive);
		
		JLabel NewLabelSelectPaymentMovie = new JLabel("Select Payment method");
		NewLabelSelectPaymentMovie.setBounds(454, 573, 231, 16);
		contentPane.add(NewLabelSelectPaymentMovie);
		
		NewCheckBoxCardMusicLive = new JCheckBox("Card");
		NewCheckBoxCardMusicLive.setBounds(442, 590, 91, 23);
		contentPane.add(NewCheckBoxCardMusicLive);
		
		JLabel NewLabelCustomerIcon = new JLabel("");
		NewLabelCustomerIcon.setIcon(new ImageIcon(RentMovie.class.getResource("/imagens/employee-removebg-preview.png")));
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

	public JTextField getTextFieldSearchMusicLive() {
		return textFieldSearchMusicLive;
	}

	public void setTextFieldSearchMusicLive(JTextField textFieldSearchMusicLive) {
		this.textFieldSearchMusicLive = textFieldSearchMusicLive;
	}

	public JTable getTableRentMusicLive() {
		return tableRentMusicLive;
	}

	public void setTableRentMusicLive(JTable tableRentMusicLive) {
		this.tableRentMusicLive = tableRentMusicLive;
	}

	public JTable getTableRentCustomerMusicLive() {
		return tableRentCustomerMusicLive;
	}

	public void setTableRentCustomerMusicLive(JTable tableRentCustomerMusicLive) {
		this.tableRentCustomerMusicLive = tableRentCustomerMusicLive;
	}

	public JTextField getTextFieldSearchCustomerMusicLive() {
		return textFieldSearchCustomerMusicLive;
	}

	public void setTextFieldSearchCustomerMusicLive(JTextField textFieldSearchCustomerMusicLive) {
		this.textFieldSearchCustomerMusicLive = textFieldSearchCustomerMusicLive;
	}

	public JButton getButtonSelectMusicLive() {
		return ButtonSelectMusicLive;
	}

	public void setButtonSelectMusicLive(JButton buttonSelectMusicLive) {
		ButtonSelectMusicLive = buttonSelectMusicLive;
	}

	public JLabel getNewLabelSearchIconRentMusicLive() {
		return NewLabelSearchIconRentMusicLive;
	}

	public void setNewLabelSearchIconRentMusicLive(JLabel newLabelSearchIconRentMusicLive) {
		NewLabelSearchIconRentMusicLive = newLabelSearchIconRentMusicLive;
	}

	public JButton getNewButtonSelecCustomerMusicLive() {
		return NewButtonSelecCustomerMusicLive;
	}

	public void setNewButtonSelecCustomerMusicLive(JButton newButtonSelecCustomerMusicLive) {
		NewButtonSelecCustomerMusicLive = newButtonSelecCustomerMusicLive;
	}

	public MaskFormatter getMascara() {
		return mascara;
	}

	public void setMascara(MaskFormatter mascara) {
		this.mascara = mascara;
	}

	public JFormattedTextField getFormattedTextFieldReturnDateMusicLive() {
		return formattedTextFieldReturnDateMusicLive;
	}

	public void setFormattedTextFieldReturnDateMusicLive(JFormattedTextField formattedTextFieldReturnDateMusicLive) {
		this.formattedTextFieldReturnDateMusicLive = formattedTextFieldReturnDateMusicLive;
	}

	public MaskFormatter getMascara2() {
		return mascara2;
	}

	public void setMascara2(MaskFormatter mascara2) {
		this.mascara2 = mascara2;
	}

	public JFormattedTextField getFormattedTextFieldRentedDateMusicLive() {
		return formattedTextFieldRentedDateMusicLive;
	}

	public void setFormattedTextFieldRentedDateMusicLive(JFormattedTextField formattedTextFieldRentedDateMusicLive) {
		this.formattedTextFieldRentedDateMusicLive = formattedTextFieldRentedDateMusicLive;
	}

	public JFormattedTextField getFormattedTextFieldTotalValueMusicLive() {
		return formattedTextFieldTotalValueMusicLive;
	}

	public void setFormattedTextFieldTotalValueMusicLive(JFormattedTextField formattedTextFieldTotalValueMusicLive) {
		this.formattedTextFieldTotalValueMusicLive = formattedTextFieldTotalValueMusicLive;
	}

	public JButton getNewButtonRentMusicLive() {
		return NewButtonRentMusicLive;
	}

	public void setNewButtonRentMusicLive(JButton newButtonRentMusicLive) {
		NewButtonRentMusicLive = newButtonRentMusicLive;
	}

	public JCheckBox getNewCheckBoxCardMusicLive() {
		return NewCheckBoxCardMusicLive;
	}

	public void setNewCheckBoxCardMusicLive(JCheckBox newCheckBoxCardMusicLive) {
		NewCheckBoxCardMusicLive = newCheckBoxCardMusicLive;
	}
	
}
