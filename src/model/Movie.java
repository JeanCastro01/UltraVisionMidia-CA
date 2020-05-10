package model;

/**
 * this method extends the class AttributesGeneral wich some attributes
 * @author jeancastro
 */
public class Movie extends AttributesGeneral {

	private String Director;
	private String DateRented;
	private String DateReturn;
	
	/**
	 * Construsctor with attributes for the Movie
	 * 
	 * @param yearOfRelease
	 *            Movie's year of release
	 * @param title
	 *            Movie's title
	 * @param genre
	 *            Movie's Genre
	 * @param Price
	 *            Movie's Price
	 * @param Type
	 *            Movie's Type ( CD/DVD/BLU_RAY)
	 * @param Director
	 *            Movie's Director name
	 */

	public Movie(String yearOfRelease, String title, String genre, double Price, String Type, String Director) {
		super(yearOfRelease, title, genre, Price, Type);

		this.Director = Director;
		this.DateRented = DateRented;
		this.DateReturn = DateReturn;

	}

	/**
	 * this method return the Movie's Director name
	 * @return this Movie's Director name
	 */
	public String getDirector() {
		return Director;
	}

	/**
	 * this method return the Movie's Rented Date
	 * @return this Movie's Rented Date
	 */
	public String getDateRented() {
		return DateRented;
	}

/**
 * This method return the Movie's Return Date
 * @return this Movie's Return Date
 */
	public String getDateReturn() {
		return DateReturn;
	}

	

}
