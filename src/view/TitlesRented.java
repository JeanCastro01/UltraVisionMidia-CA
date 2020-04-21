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
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.FontUIResource;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class TitlesRented extends JFrame {

	private JPanel contentPane;
	private JTable tableRentedTitles;
	private JButton ButtonDelete;
	private JComboBox comboBox;
	



	/**
	 * Create the frame.
	 */
	public TitlesRented() {
		
		JFrame TitleRented = new JFrame();
        
		TitleRented.setTitle("Ultra Vision Midia");
		TitleRented.setVisible(true);
		
		
		
		
		TitleRented.setSize(new Dimension(800, 600));
		
		
		contentPane = new JPanel();
		contentPane.setSize(new Dimension(800, 600));
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		TitleRented.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(6, 6, 788, 94);
		contentPane.add(panel);
		
		JLabel NewLabelRentedTitles = new JLabel("Rented Titles");
		NewLabelRentedTitles.setIcon(new ImageIcon(TitlesRented.class.getResource("/imagens/document-icon-2.png")));
		panel.add(NewLabelRentedTitles);
		contentPane.add(panel);
		
	
		
		ButtonDelete = new JButton("Delete");
		ButtonDelete.setBounds(572, 506, 117, 29);
		contentPane.add(ButtonDelete);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(127, 156, 566, 330);
		contentPane.add(panel_1);
		
		tableRentedTitles = new JTable();
		panel_1.add(tableRentedTitles);
		
	
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"(ML) Music Live ", "(ML) Live Concert Videos ", "(VL) Movie", "(TV) Box Set"}));
		comboBox.setBounds(467, 117, 222, 27);
		contentPane.add(comboBox);
		
		JLabel NewLabelSelectTitle = new JLabel("Select Title");
		NewLabelSelectTitle.setBounds(378, 123, 77, 16);
		contentPane.add(NewLabelSelectTitle);
		
		TitleRented.validate();
		TitleRented.repaint();
	}
}
