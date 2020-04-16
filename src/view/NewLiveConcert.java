package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import controller.CustomerController;
import controller.LiveConcertController;

import javax.swing.DefaultComboBoxModel;
import model.TypeEnum;
import java.awt.List;
import java.text.ParseException;

import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NewLiveConcert extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldBand;
	private JTextField textFieldTitle;
	private JComboBox ComboBoxGenre;
	private JComboBox comboBoxTypeLiveConcert;
    private	JLabel labelTypeLiveConcert;
    private MaskFormatter mascara;
    private JFormattedTextField FormattedTextFieldYearOfRelease;
    private JComboBox comboBoxLiveConcertPrice;
    private JButton ButtonRegisterMusicLive;
    private JFrame newliveconcert;
	
    private LiveConcertController controllerInternalRef;
	
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					NewLiveConcert frame = new NewLiveConcert();
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
	public NewLiveConcert(LiveConcertController controllerInternalRef) throws ParseException {
      
		
		this.controllerInternalRef = controllerInternalRef;
		
		
		
		newliveconcert = new JFrame();
		
		newliveconcert.setTitle("Ultra Vision Midia");
		newliveconcert.setVisible(true);	
		
		
		//getContentPane().setBackground(UIManager.getColor("ProgressBar.selectionForeground"));
		newliveconcert.setSize(new Dimension(800, 600));
		//getContentPane().setSize(new Dimension(800, 660));
		//getContentPane().setLayout(null);
		
		
		
		contentPane = new JPanel();
		contentPane.setSize(new Dimension(800, 600));
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		newliveconcert.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(6, 6, 788, 94);
		contentPane.add(panel);
		
		JLabel NewLabelLiveConcert = new JLabel("New Live Concert");
		NewLabelLiveConcert.setIcon(new ImageIcon(NewLiveConcert.class.getResource("/imagens/Music Live2.png")));
		panel.add(NewLabelLiveConcert);
		
		
		textFieldBand = new JTextField();
		textFieldBand.setBounds(238, 120, 450, 26);
		contentPane.add(textFieldBand);
		textFieldBand.setColumns(10);
		
		textFieldTitle = new JTextField();
		textFieldTitle.setBounds(238, 167, 450, 26);
		contentPane.add(textFieldTitle);
		textFieldTitle.setColumns(10);
		
		JLabel textFieldBandName = new JLabel("Band Name");
		textFieldBandName.setBounds(93, 125, 110, 16);
		contentPane.add(textFieldBandName);
		
		JLabel NewLabelGenre = new JLabel("Genre");
		NewLabelGenre.setBounds(93, 222, 84, 16);
		contentPane.add(NewLabelGenre);
		
		JLabel NewLabelYearOfRelease = new JLabel("Year Of Release");
		NewLabelYearOfRelease.setBounds(93, 275, 98, 16);
		contentPane.add(NewLabelYearOfRelease);
		
		JLabel NewLabelTitle = new JLabel("Title");
		NewLabelTitle.setBounds(93, 172, 98, 16);
		contentPane.add(NewLabelTitle);
		
		JButton ButtonRegisterMusicLive = new JButton("Register");
		ButtonRegisterMusicLive.setBounds(238, 436, 117, 29);
		contentPane.add(ButtonRegisterMusicLive);
		ButtonRegisterMusicLive.addActionListener((ActionListener)controllerInternalRef);
		ButtonRegisterMusicLive.setActionCommand("Register");
		
		ComboBoxGenre = new JComboBox();
		ComboBoxGenre.setModel(new DefaultComboBoxModel(new String[] {"Rock", "Blues", "Jazz", "Reggae", "Country", "Rap", "Heavy Metal", "Electronic", "Pop", "Latin", "Folk", "Classical", "Opera"}));
		ComboBoxGenre.setBounds(238, 218, 137, 27);
		contentPane.add(ComboBoxGenre);
		
		comboBoxTypeLiveConcert = new JComboBox();
		comboBoxTypeLiveConcert.setModel(new DefaultComboBoxModel(TypeEnum.values()));
		comboBoxTypeLiveConcert.setBounds(238, 322, 137, 27);
		contentPane.add(comboBoxTypeLiveConcert);
		
		labelTypeLiveConcert = new JLabel("Type");
		labelTypeLiveConcert.setBounds(93, 326, 61, 16);
		contentPane.add(labelTypeLiveConcert);
		
	    mascara = new MaskFormatter("##/##/####");
		FormattedTextFieldYearOfRelease = new JFormattedTextField(mascara);
		FormattedTextFieldYearOfRelease.setBounds(238, 270, 137, 26);
		contentPane.add(FormattedTextFieldYearOfRelease);
		
		comboBoxLiveConcertPrice = new JComboBox();
		comboBoxLiveConcertPrice.setModel(new DefaultComboBoxModel(new String[] {"1.99", "2.99", "3.99", "4.99", "5.99", "6.99", "7.99", "8.99", "9.99", "10.99", "11.99", "12.99", "13.99", "14.99", "15.99", "16.99", "17.99", "18.99", "19.99"}));
		comboBoxLiveConcertPrice.setBounds(238, 371, 137, 27);
		contentPane.add(comboBoxLiveConcertPrice);
		
		JLabel labelPriceLiveConcert = new JLabel("Price €\n");
		labelPriceLiveConcert.setBounds(93, 382, 61, 16);
		contentPane.add(labelPriceLiveConcert);
		
		newliveconcert.validate();
		newliveconcert.repaint();
	}
	public JPanel getContentPane() {
		return contentPane;
	}



	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}



	public String getTextFieldBand() {
		return textFieldBand.getText();
	}



	public void setTextFieldBand(JTextField textFieldBand) {
		this.textFieldBand = textFieldBand;
	}



	public String getTextFieldTitle() {
		return textFieldTitle.getText();
	}



	public void setTextFieldTitle(JTextField textFieldTitle) {
		this.textFieldTitle = textFieldTitle;
	}



	public String getComboBoxGenre() {
		
		String Genre = ComboBoxGenre.getSelectedItem().toString();
		return Genre;
	}



	public void setComboBoxGenre(JComboBox comboBoxGenre) {
		ComboBoxGenre = comboBoxGenre;
	}



	public String getComboBoxTypeLiveConcert() {
		String type = comboBoxTypeLiveConcert.getSelectedItem().toString();
		return type;
	}



	public void setComboBoxTypeLiveConcert(JComboBox comboBoxTypeLiveConcert) {
		
		comboBoxTypeLiveConcert = comboBoxTypeLiveConcert;
	}



	public JLabel getLabelTypeLiveConcert() {
		return labelTypeLiveConcert;
	}



	public void setLabelTypeLiveConcert(JLabel labelTypeLiveConcert) {
		this.labelTypeLiveConcert = labelTypeLiveConcert;
	}



	public MaskFormatter getMascara() {
		return mascara;
	}



	public void setMascara(MaskFormatter mascara) {
		this.mascara = mascara;
	}



	public String getFormattedTextFieldYearOfRelease() {
		return FormattedTextFieldYearOfRelease.getText();
	}



	public void setFormattedTextFieldYearOfRelease(JFormattedTextField formattedTextFieldYearOfRelease) {
		FormattedTextFieldYearOfRelease = formattedTextFieldYearOfRelease;
	}



	public double  getComboBoxLiveConcertPrice() {
		
        String price = comboBoxLiveConcertPrice.getSelectedItem().toString();
		
		double doublePrice = Double.parseDouble(price);
		
		return doublePrice;
	}



	public void setComboBoxLiveConcertPrice(JComboBox comboBoxLiveConcertPrice) {
		this.comboBoxLiveConcertPrice = comboBoxLiveConcertPrice;
	}



	public JButton getButtonRegisterMusicLive() {
		return ButtonRegisterMusicLive;
	}



	public void setButtonRegisterMusicLive(JButton buttonRegisterMusicLive) {
		ButtonRegisterMusicLive = buttonRegisterMusicLive;
	}


}
