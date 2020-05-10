package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JOptionPane;

import model.Database;
import model.LiveConcert;
import view.NewLiveConcert;
/**
 * this class is the live concert controller which also implements the ActionListener
 * @author jeancastro
 *
 */
public class LiveConcertController implements ActionListener {

	NewLiveConcert view;
	boolean allTrue = false;
	boolean allFalse = false;
	String yearOfRelease;
	String title;
	String genre;
	double Price;
	String Type;
	String Band;
	boolean liveconcertRegistered;

	// When the controller starts, we need a new model and a new view
	public LiveConcertController() throws ParseException {

		view = new NewLiveConcert(this);

	}
	/**
	 * this methos is to get data from the NewLiveConcert frame and passing liveconcertRegistered as parameter to the DB unless the action is performed
	 */

	@Override
	public void actionPerformed(ActionEvent e) {

		yearOfRelease = view.getFormattedTextFieldYearOfRelease();
		title = view.getTextFieldTitle();
		genre = view.getComboBoxGenre();
		Price = view.getComboBoxLiveConcertPrice();
		Type = view.getComboBoxTypeLiveConcert();
		Band = view.getTextFieldBand();

		LiveConcert liveconcert = new LiveConcert(yearOfRelease, title, genre, Price, Type, Band);

		if (e.getActionCommand().equals("Register")) {

			Database db = new Database();

			
			liveconcertRegistered = db.newliveconcert(liveconcert); // passing the data to the method in the database class if true, return the data

			if (yearOfRelease.isEmpty() || title.isEmpty() || genre.isEmpty() || Type.isEmpty() || Band.isEmpty()) {

				JOptionPane.showMessageDialog(null, "Make sure Fields are not empty");

			}

			else {

				JOptionPane.showMessageDialog(null, "Submited");
				view.dispose();

			}

		}

	}
}
