package model;

import java.text.ParseException;

import view.RentLiveConcert;

/**
 * this class extends AttributesGeneral with some attributes
 * 
 * @author jeancastro
 */
public class LiveConcert extends AttributesGeneral {

	private String Band;
	private String DateRented;
	private String DateReturn;
	private String liveConcertID;

	/**
	 * this is the constructor for the attributes which some attributs are
	 * extend from the class AttributesGeneral
	 * 
	 * @param yearOfRelease
	 *            Live Concert year of release
	 * @param title
	 *            title of the Live Concert
	 * @param genre
	 *            genre of the Live Conert
	 * @param Price
	 *            price of the Live Concert
	 * @param Type
	 *            type of the title CD,DVD,BLU_RAY
	 * @param Band
	 *            Band name for the Live Concert
	 */

	public LiveConcert(String yearOfRelease, String title, String genre, double Price, String Type, String Band) {
		super(yearOfRelease, title, genre, Price, Type);

		this.Band = Band;
		this.DateRented = DateRented;
		this.DateReturn = DateReturn;

	}

	public LiveConcert(String yearOfRelease, String title, String genre, double Price, String Type, String Band,
			String liveConcertID) {
		super(yearOfRelease, title, genre, Price, Type);

		this.Band = Band;
		this.DateRented = DateRented;
		this.DateReturn = DateReturn;
		this.liveConcertID = liveConcertID;
	}

	/**
	 * this returns the ID of the Live Concert
	 * 
	 * @return
	 */

	public String getLiveConcertID() {
		return liveConcertID;
	}

	/**
	 * this method return da Date rented for the Live Concert
	 * 
	 * @return this Live Concert's Rented Date
	 */

	public String getDateRented() {
		return DateRented;
	}

	/**
	 * this method return the Date of Rertunr for Live Concert
	 * 
	 * @return this Live Concert's date return
	 */

	public String getDateReturn() {
		return DateReturn;
	}

	/**
	 * this method return the Live Concert Band's name
	 * 
	 * @return this Band's Name
	 */
	public String getBand() {
		return Band;
	}

}