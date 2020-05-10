package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JOptionPane;

import model.Database;
import model.MusicLive;
import model.TVBox;
import view.NewMusicLive;
import view.NewTVBox;
/**
 * this class is the TVBox controller which also implements ActionListener
 * @author jeancastro
 *
 */
public class TVBoxController implements ActionListener {

	NewTVBox view;
	String yearOfRelease;
	String title;
	String genre;
	double Price;
	String Type;
	String NumberOfDisco;
	String Season;
	boolean newtvboxRegistered;
	Database db = new Database();

	// When the controller starts, we need a new model and a new view
	public TVBoxController() throws ParseException {

		view = new NewTVBox(this);

	}
	
	
	/**
	 * this methos is to get data from the NewTVBox frame and passing tvbox as parameter to the DB unless the action is performed
	 */


	@Override
	public void actionPerformed(ActionEvent e) {

		yearOfRelease = view.getFormattedTextFieldYearOfRelease();
		title = view.getTextFieldTitle();
		genre = view.getComboBoxGenre();
		Price = view.getComboBoxPriceNewTVBox();
		Type = view.getComboBoxTypeTVBox();
		NumberOfDisco = view.getComboBoxNumberOfDisco();
		Season = view.getComboBoxSeasonNewTVBox();

		TVBox tvbox = new TVBox(yearOfRelease, title, genre, Price, Type, NumberOfDisco, Season);

		if (e.getActionCommand().equals("Register")) {

			newtvboxRegistered = db.newtvbox(tvbox); // passing the data to the method in the database class if true, return the data

			if (yearOfRelease.isEmpty() || title.isEmpty() || genre.isEmpty() || Type.isEmpty()
					|| NumberOfDisco.isEmpty() || Season.isEmpty()) {

				JOptionPane.showMessageDialog(null, "Make Sure Fields Are Not Empty");
				view.dispose();

			} else {
				JOptionPane.showMessageDialog(null, "Submited");
			}

		}

	}
}
