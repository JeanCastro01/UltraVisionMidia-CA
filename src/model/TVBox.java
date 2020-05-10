package model;

/**
 * this class extends the class AttributesGeneral with some attributes
 * 
 * @author jeancastro
 */
public class TVBox extends AttributesGeneral {

	private String Season;
	private String NumberOfDisco;
	private String DateRented;
	private String DateReturn;

	/**
	 * this constructor for TVBox with some attributes, season, number of
	 * discos, daterented, datereturn
	 * 
	 * @param yearOfRelease
	 *            TvBox's year of release
	 * @param title
	 *            TVBox's title
	 * @param genre
	 *            TVBox' genre
	 * @param Price
	 *            TVBox's price
	 * @param Type
	 *            TVBox's type (CD/DVD/BLU_RAY
	 * @param NumberOfDisco
	 *            TVBox's the number of discos
	 * @param Season
	 *            TVBox's the number of seasons
	 */

	public TVBox(String yearOfRelease, String title, String genre, double Price, String Type, String NumberOfDisco,
			String Season) {
		super(yearOfRelease, title, genre, Price, Type);

		this.NumberOfDisco = NumberOfDisco;
		this.Season = Season;
		this.DateRented = DateRented;
		this.DateReturn = DateReturn;

		// TODO Auto-generated constructor stu

	}
	/**
	 * this method return tvbox rented date
	 * @return this tvbox's date rented
	 */

	public String getDateRented() {
		return DateRented;
	}
    /**
     * this method return tvbox date return
     * @return this tvbox's date return
     */
	public String getDateReturn() {
		return DateReturn;
	}
	
	/**
	 * this method return tvbox number of seasons
	 * @return this season's number
	 */

	public String getSeason() {
		return Season;
	}
	
	/**
	 * this method return tvbox number of discos
	 * @return this tvbox's number os discos
	 */

	public String getNumberOfDisco() {
		return NumberOfDisco;
	}

}
