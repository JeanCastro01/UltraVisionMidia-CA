package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import controller.CustomerController;
import model.Database;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class TitlesAvailable extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTable tableAvailableTitles;
	private JButton ButtonMovie;
	private String titles;

	private JFrame TitlesAvailable;
	private JButton NewButtonMusicLive;
	private JButton NewButtonLiveConcert;
	private JButton NewButtonTVBox;
	private JTable table;

	public TitlesAvailable() {

		attributes();

	}

	/**
	 * Create the frame.
	 */
	public void attributes() {

		TitlesAvailable = new JFrame();

		TitlesAvailable.setTitle("Ultra Vision Midia");
		TitlesAvailable.setVisible(true);
		TitlesAvailable.setSize(new Dimension(800, 680));
		TitlesAvailable.setLocationRelativeTo(null);
		TitlesAvailable.setResizable(false);

		contentPane = new JPanel();
		contentPane.setSize(new Dimension(800, 600));
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		TitlesAvailable.setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(6, 6, 788, 94);
		contentPane.add(panel);

		JLabel NewLabelRentedTitles = new JLabel("Available Titles");
		NewLabelRentedTitles.setIcon(new ImageIcon(TitlesRented.class.getResource("/imagens/document-icon-2.png")));
		panel.add(NewLabelRentedTitles);
		contentPane.add(panel);

		ButtonMovie = new JButton("Movie");
		ButtonMovie.setBounds(226, 123, 117, 29);
		contentPane.add(ButtonMovie);
		ButtonMovie.addActionListener(this);
		ButtonMovie.setActionCommand("Movie");

		JLabel NewLabelSelectTitle = new JLabel("Select Title:");
		NewLabelSelectTitle.setBounds(127, 128, 77, 16);
		contentPane.add(NewLabelSelectTitle);

		NewButtonMusicLive = new JButton("Music Live");
		NewButtonMusicLive.setBounds(345, 123, 117, 29);
		contentPane.add(NewButtonMusicLive);
		NewButtonMusicLive.addActionListener(this);
		NewButtonMusicLive.setActionCommand("Music Live");

		NewButtonLiveConcert = new JButton("Live Concert");
		NewButtonLiveConcert.setBounds(460, 123, 117, 29);
		contentPane.add(NewButtonLiveConcert);
		NewButtonLiveConcert.addActionListener(this);
		NewButtonLiveConcert.setActionCommand("Live Concert");

		NewButtonTVBox = new JButton("TV Box");
		NewButtonTVBox.setBounds(579, 123, 117, 29);
		contentPane.add(NewButtonTVBox);
		NewButtonTVBox.addActionListener(this);
		NewButtonTVBox.setActionCommand("TV Box");

		TitlesAvailable.validate();
		TitlesAvailable.repaint();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("Movie")) {

			// Using the Database connection class
			Database jdbc = new Database();

			String[][] data = { {}, {} };
			String[] columnNames = { "Title", "Director", "Type" };

			// Gathering the data
			data = jdbc.titleavailablemovie();

			// Using a scroll pane
			JScrollPane myPane = new JScrollPane();
			myPane.setBounds(59, 164, 679, 408);
			contentPane.add(myPane);

			table = new JTable(data, columnNames);
			// table.setBounds(226, 169, 470, 389);
			contentPane.add(table);
			myPane.setViewportView(table);

		}

		else if (e.getActionCommand().equals("Music Live")) {

			// Using the Database connection class
			Database jdbc = new Database();

			String[][] data = { {}, {} };

			String[] columnNames = { "Title", "Singer", "Type" };

			// Gathering the data
			data = jdbc.titleavailablemusiclive();

			// Using a scroll pane
			JScrollPane myPane = new JScrollPane();
			myPane.setBounds(59, 164, 679, 408);
			contentPane.add(myPane);

			table = new JTable(data, columnNames);
			// table.setBounds(226, 169, 470, 389);
			contentPane.add(table);
			myPane.setViewportView(table);

		}

		else if (e.getActionCommand().equals("Live Concert")) {
			// Using the Database connection class
			Database jdbc = new Database();

			String[][] data = { {}, {} };

			String[] columnNames = { "Title", "Band", "Type" };

			// Gathering the data
			data = jdbc.titleavailableliveconcert();

			// Using a scroll pane
			JScrollPane myPane = new JScrollPane();
			myPane.setBounds(59, 164, 679, 408);
			contentPane.add(myPane);

			table = new JTable(data, columnNames);
			// table.setBounds(226, 169, 470, 389);
			contentPane.add(table);
			myPane.setViewportView(table);

		}

		else if (e.getActionCommand().equals("TV Box")) {
			Database jdbc = new Database();

			String[][] data = { {}, {} };

			String[] columnNames = { "Title", "Number of Disco", "Season", "Type" };

			// Gathering the data
			data = jdbc.titleavailabletvbox();

			// Using a scroll pane
			JScrollPane myPane = new JScrollPane();
			myPane.setBounds(59, 164, 679, 408);
			contentPane.add(myPane);

			table = new JTable(data, columnNames);
			// table.setBounds(226, 169, 470, 389);
			contentPane.add(table);
			myPane.setViewportView(table);

		}
	}
}
