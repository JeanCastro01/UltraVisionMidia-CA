package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JOptionPane;

import model.Database;
import model.Movie;
import model.MusicLive;
import view.NewMovie;
import view.NewMusicLive;
/**
 * this class is the Music Live controller which also implements ActionListener
 * @author jeancastro
 *
 */
public class MusicLiveController implements ActionListener {

	NewMusicLive view;
	String yearOfRelease;
	String title;
	String genre;
	double Price;
	String Type;
	String Singer;
	boolean newmusicliveRegistered;
	Database db = new Database();

	// When the controller starts, we need a new model and a new view
	public MusicLiveController() throws ParseException {

		view = new NewMusicLive(this);

	}

	/**
	 * this methos is to get data from the NewMusicLive frame and passing newmusicliveRegistered as parameter to the DB unless the action is performed
	 */

	@Override
	public void actionPerformed(ActionEvent e) {

		yearOfRelease = view.getFormattedTextFieldYearOfRelease();
		title = view.getTextFieldTitle();
		genre = view.getComboBoxGenre();
		Price = view.getComboBoxPriceNewMusicLive();
		Type = view.getComboBoxTypeMusicLive();
		Singer = view.getTextFieldSinger();

		MusicLive musiclive = new MusicLive(yearOfRelease, title, genre, Price, Type, Singer);

		if (e.getActionCommand().equals("Register")) {

			newmusicliveRegistered = db.newmusiclive(musiclive);// passing the data to the method in the database class if true, return the data

			if (yearOfRelease.isEmpty() || title.isEmpty() || genre.isEmpty() || Type.isEmpty() || Singer.isEmpty()) {

				JOptionPane.showMessageDialog(null, "Make Sure Fields Are not Empty");
				view.dispose();

			} else {
				JOptionPane.showMessageDialog(null, "Submited");
			}

		}

	}
}
