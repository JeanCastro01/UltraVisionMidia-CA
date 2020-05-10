package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JOptionPane;

import model.Customer;
import model.Database;
import model.Movie;
import view.Dashboard;
import view.NewCustomer;
import view.NewMovie;
/**
 * this class is the Movie controller which also implements ActionListener
 * @author jeancastro
 *
 */
public class MovieController implements ActionListener {

	NewMovie view;
	String yearOfRelease;
	String title;
	String genre;
	double Price;
	String Type;
	String Director;
	boolean newmovieRegistered;
	Database db = new Database();

	// When the controller starts, we need a new model and a new view
	public MovieController() throws ParseException {

		view = new NewMovie(this);

	}
	
	/**
	 * this methos is to get data from the NewMovie frame and passing newmovieRegistered as parameter to the DB unless the action is performed
	 */


	@Override
	public void actionPerformed(ActionEvent e) {

		title = view.getTextFieldTitle();
		genre = view.getComboBoxGenre();
		yearOfRelease = view.getFormattedTextFieldYearOfRelease();
		Director = view.getTextFieldDirector();
		Type = view.getComboBoxTypeMovie();
		double Price = view.getComboBoxPriceNewMovie();

		Movie movie = new Movie(yearOfRelease, title, genre, Price, Type, Director);

		if (e.getActionCommand().equals("Register")) {

			newmovieRegistered = db.newmovie(movie); // passing the data to the method in the database class if true, return the data

			if (title.isEmpty() || genre.isEmpty() || yearOfRelease.isEmpty() || Director.isEmpty() || Type.isEmpty()) {

				JOptionPane.showMessageDialog(null, "Make Sure Fields Are not Empty");
				view.dispose();

			} else {
				JOptionPane.showMessageDialog(null, "Submited");
			}

		}

	}
}
