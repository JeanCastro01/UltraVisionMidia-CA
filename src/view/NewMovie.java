package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
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
import javax.swing.DefaultComboBoxModel;
import model.TypeEnum;
import javax.swing.JFormattedTextField;

public class NewMovie extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldDirector;
	private JTextField textFieldTitle;
	private JButton ButtonRegisterMusicLive;
	private JComboBox ComboBoxGenre;
	private JComboBox comboBoxTypeMovie;
	private MaskFormatter mascara;
	private JFormattedTextField FormattedTextFieldYearOfRelease;
	private JComboBox comboBoxPriceNewMovie;

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
	public NewMovie() throws ParseException {
		
		
		JFrame newmovie = new JFrame();
        
		newmovie.setTitle("Ultra Vision Midia");
		
		
		newmovie.setVisible(true);
		getContentPane().setBackground(UIManager.getColor("ProgressBar.selectionForeground"));
		newmovie.setSize(new Dimension(800, 600));
		getContentPane().setSize(new Dimension(800, 660));
		getContentPane().setLayout(null);
		
		
		
		contentPane = new JPanel();
		contentPane.setSize(new Dimension(800, 600));
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		newmovie.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(6, 6, 788, 94);
		contentPane.add(panel);
		
		JLabel NewLabelMusicLive = new JLabel("New Movie");
		NewLabelMusicLive.setIcon(new ImageIcon(NewMovie.class.getResource("/imagens/movie2.png")));
		panel.add(NewLabelMusicLive);
		
		textFieldDirector = new JTextField();
		textFieldDirector.setBounds(238, 120, 450, 26);
		contentPane.add(textFieldDirector);
		textFieldDirector.setColumns(10);
		
		textFieldTitle = new JTextField();
		textFieldTitle.setBounds(238, 169, 450, 26);
		contentPane.add(textFieldTitle);
		textFieldTitle.setColumns(10);
		
		JLabel textFieldDirector = new JLabel("Director Name");
		textFieldDirector.setBounds(93, 125, 110, 16);
		contentPane.add(textFieldDirector);
		
		JLabel NewLabelGenre = new JLabel("Genre");
		NewLabelGenre.setBounds(93, 225, 84, 16);
		contentPane.add(NewLabelGenre);
		
		JLabel NewLabelYearOfRelease = new JLabel("Year Of Release");
		NewLabelYearOfRelease.setBounds(93, 274, 98, 16);
		contentPane.add(NewLabelYearOfRelease);
		
		JLabel NewLabelTitle = new JLabel("Title");
		NewLabelTitle.setBounds(93, 174, 98, 16);
		contentPane.add(NewLabelTitle);
		
		ButtonRegisterMusicLive = new JButton("Register");
		ButtonRegisterMusicLive.setBounds(238, 440, 117, 29);
		contentPane.add(ButtonRegisterMusicLive);
		
		ComboBoxGenre = new JComboBox();
		ComboBoxGenre.setModel(new DefaultComboBoxModel(new String[] {"​Action ", "Animation ", "Comedy ", "Crime ", "Drama ", "Experimental ", "Fantasy ", "Historical ", "Horror ", "Romance ", "Science Fiction ", "Thriller ", "Western ", "Other "}));
		ComboBoxGenre.setBounds(238, 221, 157, 27);
		contentPane.add(ComboBoxGenre);
		
		comboBoxTypeMovie = new JComboBox();
		comboBoxTypeMovie.setModel(new DefaultComboBoxModel(TypeEnum.values()));
		comboBoxTypeMovie.setBounds(238, 323, 137, 27);
		contentPane.add(comboBoxTypeMovie);
		
		JLabel NewLabelTypeLiveConcert = new JLabel("Type");
		NewLabelTypeLiveConcert.setBounds(93, 327, 61, 16);
		contentPane.add(NewLabelTypeLiveConcert);
		
		mascara = new MaskFormatter("##/##/####");
		FormattedTextFieldYearOfRelease = new JFormattedTextField(mascara);
		FormattedTextFieldYearOfRelease.setBounds(238, 269, 117, 26);
		contentPane.add(FormattedTextFieldYearOfRelease);
		
		comboBoxPriceNewMovie = new JComboBox();
		comboBoxPriceNewMovie.setModel(new DefaultComboBoxModel(new String[] {"1.99", "2.99", "3.99", "4.99", "5.99", "6.99", "7.99", "8.99", "9.99", "10.99", "11.99", "12.99", "13.99", "14.99", "15.99", "16.99", "17.99", "18.99", "19.99"}));
		comboBoxPriceNewMovie.setBounds(238, 376, 137, 27);
		contentPane.add(comboBoxPriceNewMovie);
		
		JLabel labelPriceNewMovie = new JLabel("Price €\n");
		labelPriceNewMovie.setBounds(93, 380, 61, 16);
		contentPane.add(labelPriceNewMovie);
		
		newmovie.validate();
		newmovie.repaint();
	}
}
