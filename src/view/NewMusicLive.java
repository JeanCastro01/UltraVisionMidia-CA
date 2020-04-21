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
import controller.MusicLiveController;

import javax.swing.DefaultComboBoxModel;
import model.TypeEnum;
import javax.swing.JFormattedTextField;

public class NewMusicLive extends JFrame {

	private JPanel contentPane;
	
	private JTextField textFieldSinger;
	private JTextField textFieldTitle;
	private JButton ButtonRegisterMusicLive;
	private JComboBox ComboBoxGenre;
	private JComboBox comboBoxTypeMusicLive;
	private MaskFormatter mascara;
	private JFormattedTextField FormattedTextFieldYearOfRelease;
	private JComboBox comboBoxPriceNewMusicLive;
	
	 private MusicLiveController controllerInternalRef;
	    
	    public NewMusicLive (MusicLiveController controller) throws ParseException{
	        
	        // Putting the reference of the controller in the local reference
	        this.controllerInternalRef = controller;
	        
	        // We encapsulated the building process of the window
	        attributesSetter();
	      
	     
	    }
	    

private void attributesSetter() throws ParseException  {
			
		
	 JFrame newmusiclive = new JFrame();
		
        
		newmusiclive.setTitle("Ultra Vision Midia");
		newmusiclive.setVisible(true);
		newmusiclive.setSize(new Dimension(800, 600));
		newmusiclive.setLocationRelativeTo(null);
		newmusiclive.setResizable(false);
		
		
		
		
		contentPane = new JPanel();
		contentPane.setSize(new Dimension(800, 600));
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		newmusiclive.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(6, 6, 788, 94);
		contentPane.add(panel);
		
		JLabel NewLabelMusicLive = new JLabel("New Music Live");
		NewLabelMusicLive.setIcon(new ImageIcon(NewMusicLive.class.getResource("/imagens/Music Live2.png")));
		panel.add(NewLabelMusicLive);
		
		textFieldSinger = new JTextField();
		textFieldSinger.setBounds(238, 120, 450, 26);
		contentPane.add(textFieldSinger);
		textFieldSinger.setColumns(10);
		
		textFieldTitle = new JTextField();
		textFieldTitle.setBounds(238, 176, 450, 26);
		contentPane.add(textFieldTitle);
		textFieldTitle.setColumns(10);
		
		JLabel NewLabelSinger = new JLabel("Singer Name");
		NewLabelSinger.setBounds(93, 125, 84, 16);
		contentPane.add(NewLabelSinger);
		
		JLabel NewLabelGenre = new JLabel("Genre");
		NewLabelGenre.setBounds(93, 229, 84, 16);
		contentPane.add(NewLabelGenre);
		
		JLabel NewLabelYearOfRelease = new JLabel("Year Of Release");
		NewLabelYearOfRelease.setBounds(93, 280, 98, 16);
		contentPane.add(NewLabelYearOfRelease);
		
		JLabel NewLabelTitle = new JLabel("Title");
		NewLabelTitle.setBounds(93, 181, 98, 16);
		contentPane.add(NewLabelTitle);
		
		ButtonRegisterMusicLive = new JButton("Register");
		ButtonRegisterMusicLive.setBounds(238, 450, 117, 29);
		contentPane.add(ButtonRegisterMusicLive);
		ButtonRegisterMusicLive.addActionListener((ActionListener) controllerInternalRef);
        ButtonRegisterMusicLive.setActionCommand("Register");
		
		ComboBoxGenre = new JComboBox();
		ComboBoxGenre.setModel(new DefaultComboBoxModel(new String[] {"Rock", "Blues", "Jazz", "Reggae", "Country", "Rap", "Heavy Metal", "Electronic", "Pop", "Latin", "Folk", "Classical", "Opera"}));
		ComboBoxGenre.setBounds(238, 225, 137, 27);
		contentPane.add(ComboBoxGenre);
		
		comboBoxTypeMusicLive = new JComboBox();
		comboBoxTypeMusicLive.setModel(new DefaultComboBoxModel(TypeEnum.values()));
		comboBoxTypeMusicLive.setBounds(238, 327, 137, 27);
		contentPane.add(comboBoxTypeMusicLive);
		
		JLabel NewLabelTypeMusicLive = new JLabel("Type");
		NewLabelTypeMusicLive.setBounds(93, 331, 61, 16);
		contentPane.add(NewLabelTypeMusicLive);
		
		MaskFormatter mascara = new MaskFormatter("####");
		FormattedTextFieldYearOfRelease = new JFormattedTextField(mascara);
		FormattedTextFieldYearOfRelease.setBounds(238, 275, 137, 26);
		contentPane.add(FormattedTextFieldYearOfRelease);
		
		comboBoxPriceNewMusicLive = new JComboBox();
		comboBoxPriceNewMusicLive.setModel(new DefaultComboBoxModel(new String[] {"1.99", "2.99", "3.99", "4.99", "5.99", "6.99", "7.99", "8.99", "9.99", "10.99", "11.99", "12.99", "13.99", "14.99", "15.99", "16.99", "17.99", "18.99", "19.99"}));
		comboBoxPriceNewMusicLive.setBounds(241, 391, 134, 27);
		contentPane.add(comboBoxPriceNewMusicLive);
		
		JLabel NewLabelPriceMusicLive = new JLabel("Price €\n");
		NewLabelPriceMusicLive.setBounds(93, 395, 61, 16);
		contentPane.add(NewLabelPriceMusicLive);
		
		newmusiclive.validate();
		newmusiclive.repaint();
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public String getTextFieldSinger() {
		return textFieldSinger.getText();
	}

	public void setTextFieldSinger(JTextField textFieldSinger) {
		this.textFieldSinger = textFieldSinger;
	}

	public String getTextFieldTitle() {
		return textFieldTitle.getText();
	}

	public void setTextFieldTitle(JTextField textFieldTitle) {
		this.textFieldTitle = textFieldTitle;
	}

	public JButton getButtonRegisterMusicLive() {
		return ButtonRegisterMusicLive;
	}

	public void setButtonRegisterMusicLive(JButton buttonRegisterMusicLive) {
		ButtonRegisterMusicLive = buttonRegisterMusicLive;
	}

	public String getComboBoxGenre() {
		
		String Genre = ComboBoxGenre.getSelectedItem().toString();
		return Genre;
	}

	public void setComboBoxGenre(JComboBox comboBoxGenre) {
		ComboBoxGenre = comboBoxGenre;
	}

	public String getComboBoxTypeMusicLive() {
		
		String Type = comboBoxTypeMusicLive.getSelectedItem().toString();
		return Type;
	}

	public void setComboBoxTypeMusicLive(JComboBox comboBoxTypeMusicLive) {
		this.comboBoxTypeMusicLive = comboBoxTypeMusicLive;
	}

	public MaskFormatter getMascara() {
		return mascara;
	}

	public void setMascara(MaskFormatter mascara) {
		this.mascara = mascara;
	}

	public String getFormattedTextFieldYearOfRelease() {
		String yearOfRelease = FormattedTextFieldYearOfRelease.getText();
		return yearOfRelease;
	}

	public void setFormattedTextFieldYearOfRelease(JFormattedTextField formattedTextFieldYearOfRelease) {
		FormattedTextFieldYearOfRelease = formattedTextFieldYearOfRelease;
	}

	public double getComboBoxPriceNewMusicLive() {
		
		String pricenewmusiclive = comboBoxPriceNewMusicLive.getSelectedItem().toString();
		double doubleprice = Double.parseDouble(pricenewmusiclive);
		return doubleprice;
	}

	public void setComboBoxPriceNewMusicLive(JComboBox comboBoxPriceNewMusicLive) {
		this.comboBoxPriceNewMusicLive = comboBoxPriceNewMusicLive;
	}
	

}
