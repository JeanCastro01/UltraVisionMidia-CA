package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.text.ParseException;

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

import controller.MovieController;
import controller.TVBoxController;

import javax.swing.DefaultComboBoxModel;
import model.TypeEnum;
import javax.swing.JFormattedTextField;

public class NewTVBox extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldTitle;
	private JButton ButtonRegisterTVBox;
	private JComboBox ComboBoxGenre;
	private JComboBox comboBoxSeasonNewTVBox;
	private JComboBox comboBoxTypeTVBox;
	private MaskFormatter mascara;
	private JFormattedTextField FormattedTextFieldYearOfRelease;
	private JComboBox comboBoxNumberOfDisco;
	private JComboBox comboBoxPriceNewTVBox;
	private JFrame newtvbox;
	
	
	private TVBoxController controllerInternalRef;
	
	


	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	public NewTVBox(TVBoxController controllerInternalRef) throws ParseException {
		
		newtvbox = new JFrame();
	    
		newtvbox.setTitle("Ultra Vision Midia");
		newtvbox.setVisible(true);
		
		
		
		//getContentPane().setBackground(UIManager.getColor("ProgressBar.selectionForeground"));
		newtvbox.setSize(new Dimension(800, 600));
		//getContentPane().setSize(new Dimension(800, 660));
		//getContentPane().setLayout(null);
		
		
		
		contentPane = new JPanel();
		contentPane.setSize(new Dimension(800, 600));
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		newtvbox.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(6, 6, 788, 94);
		contentPane.add(panel);
		
		JLabel NewLabelTVBox = new JLabel("New TVBox");
		NewLabelTVBox.setIcon(new ImageIcon(NewTVBox.class.getResource("/imagens/TVBOX2.png")));
		panel.add(NewLabelTVBox);
		
		textFieldTitle = new JTextField();
		textFieldTitle.setBounds(238, 112, 450, 26);
		contentPane.add(textFieldTitle);
		textFieldTitle.setColumns(10);
		
		JLabel textFieldNumberOfDisco = new JLabel("Number of Disco");
		textFieldNumberOfDisco.setBounds(93, 172, 110, 16);
		contentPane.add(textFieldNumberOfDisco);
		
		JLabel NewLabelGenre = new JLabel("Genre");
		NewLabelGenre.setBounds(93, 225, 84, 16);
		contentPane.add(NewLabelGenre);
		
		JLabel NewLabelYearOfRelease = new JLabel("Year Of Release");
		NewLabelYearOfRelease.setBounds(93, 276, 98, 16);
		contentPane.add(NewLabelYearOfRelease);
		
		JLabel NewLabelTitle = new JLabel("Title");
		NewLabelTitle.setBounds(93, 117, 98, 16);
		contentPane.add(NewLabelTitle);
		
		ButtonRegisterTVBox = new JButton("Register");
		ButtonRegisterTVBox.setBounds(238, 511, 117, 29);
		contentPane.add(ButtonRegisterTVBox);
		ButtonRegisterTVBox.addActionListener((ActionListener) controllerInternalRef);
        ButtonRegisterTVBox.setActionCommand("Register");
		
		ComboBoxGenre = new JComboBox();
		ComboBoxGenre.setModel(new DefaultComboBoxModel(new String[] {"​Action ", "Animation ", "Comedy ", "Crime ", "Drama ", "Experimental ", "Fantasy ", "Historical ", "Horror ", "Romance ", "Science Fiction ", "Thriller ", "Western ", "Other "}));
		ComboBoxGenre.setToolTipText("Select Genre");
		ComboBoxGenre.setBounds(238, 221, 137, 27);
		contentPane.add(ComboBoxGenre);
		
		comboBoxSeasonNewTVBox = new JComboBox();
		comboBoxSeasonNewTVBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50"}));
		comboBoxSeasonNewTVBox.setBounds(238, 320, 137, 27);
		contentPane.add(comboBoxSeasonNewTVBox);
		
		JLabel lblSeason = new JLabel("Season");
		lblSeason.setBounds(93, 324, 61, 16);
		contentPane.add(lblSeason);
		
		comboBoxTypeTVBox = new JComboBox();
		comboBoxTypeTVBox.setModel(new DefaultComboBoxModel(TypeEnum.values()));
		comboBoxTypeTVBox.setBounds(238, 375, 137, 27);
		contentPane.add(comboBoxTypeTVBox);
		
		JLabel NewLabelTypeTVBox = new JLabel("Type");
		NewLabelTypeTVBox.setBounds(93, 379, 61, 16);
		contentPane.add(NewLabelTypeTVBox);
		
		MaskFormatter mascara = new MaskFormatter("##/##/####");
		JFormattedTextField FormattedTextFieldYearOfRelease = new JFormattedTextField(mascara);
		FormattedTextFieldYearOfRelease.setBounds(238, 271, 137, 26);
		contentPane.add(FormattedTextFieldYearOfRelease);
		
		comboBoxNumberOfDisco = new JComboBox();
		comboBoxNumberOfDisco.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50"}));
		comboBoxNumberOfDisco.setBounds(238, 168, 137, 27);
		contentPane.add(comboBoxNumberOfDisco);
		
		comboBoxPriceNewTVBox = new JComboBox();
		comboBoxPriceNewTVBox.setModel(new DefaultComboBoxModel(new String[] {"1.99", "2.99", "3.99", "4.99", "5.99", "6.99", "7.99", "8.99", "9.99", "10.99", "11.99", "12.99", "13.99", "14.99", "15.99", "16.99", "17.99", "18.99", "19.99"}));
		comboBoxPriceNewTVBox.setBounds(238, 429, 137, 27);
		contentPane.add(comboBoxPriceNewTVBox);
		
		JLabel NewLabelPriceTVBox = new JLabel("Price €\n");
		NewLabelPriceTVBox.setBounds(93, 433, 61, 16);
		contentPane.add(NewLabelPriceTVBox);
		
		
		
		newtvbox.validate();
		newtvbox.repaint();
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public String getTextFieldTitle() {
		return textFieldTitle.getText();
	}

	public void setTextFieldTitle(JTextField textFieldTitle) {
		this.textFieldTitle = textFieldTitle;
	}

	public JButton getButtonRegisterTVbox() {
		return ButtonRegisterTVBox;
	}

	public void setButtonRegisterTVBox(JButton buttonRegisterMusicLive) {
		ButtonRegisterTVBox = buttonRegisterMusicLive;
	}

	public String getComboBoxGenre() {
		String Genre = ComboBoxGenre.getSelectedItem().toString();
		return Genre;
	}

	public void setComboBoxGenre(JComboBox comboBoxGenre) {
		ComboBoxGenre = comboBoxGenre;
	}

	public String getComboBoxSeasonNewTVBox() {
		String season = comboBoxSeasonNewTVBox.getSelectedItem().toString();
		return season;
	}

	public void setComboBoxSeasonNewTVBox(JComboBox comboBoxSeasonNewTVBox) {
		this.comboBoxSeasonNewTVBox = comboBoxSeasonNewTVBox;
	}

	public String getComboBoxTypeTVBox() {
		
		String type = comboBoxTypeTVBox.getSelectedItem().toString();
		return type;
	}

	public void setComboBoxTypeTVBox(JComboBox comboBoxTypeTVBox) {
		this.comboBoxTypeTVBox = comboBoxTypeTVBox;
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

	public String getComboBoxNumberOfDisco() {
		
		String number = comboBoxNumberOfDisco.getSelectedItem().toString();
		return number;
	}

	public void setComboBoxNumberOfDisco(JComboBox comboBoxNumberOfDisco) {
		this.comboBoxNumberOfDisco = comboBoxNumberOfDisco;
	}

	public double getComboBoxPriceNewTVBox() {
		
        String price = comboBoxPriceNewTVBox.getSelectedItem().toString();
		
		double doublePrice = Double.parseDouble(price);
		
		return doublePrice;
	}

	public void setComboBoxPriceNewTVBox(JComboBox comboBoxPriceNewTVBox) {
		this.comboBoxPriceNewTVBox = comboBoxPriceNewTVBox;
	}
	
}
