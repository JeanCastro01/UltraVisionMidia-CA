package model;

/**
 * this class is responsable for some attributes that is being extended in other
 * classes
 * 
 * @author jeancastro
 */
public abstract class AttributesGeneral {

	private String YearOfRelease;
	private String Title;
	private String Genre;
	private boolean Rent;
	private double Price;
	private String Type;

	/**
	 * this constructor for the attributesgeneral, year of release, title,
	 * genre, rent, price, type
	 * 
	 * @param yearOfRelease
	 *            Title's year of release
	 * @param title
	 *            for the title's
	 * @param genre
	 *            Genre's titles
	 * @param Price
	 *            Price's titles
	 * @param Type
	 *            Type's titles (CD/DVD/BLU_RAY)
	 */

	public AttributesGeneral(String yearOfRelease, String title, String genre, double Price, String Type) {
		super();
		this.YearOfRelease = yearOfRelease;
		this.Title = title;
		this.Genre = genre;
		this.Rent = false;
		this.Price = Price;
		this.Type = Type;
	}

	/**
	 * this method return the title price
	 * 
	 * @return title's price
	 */
	public double getPrice() {
		return Price;
	}

	/**
	 * this method return the title year of release
	 * 
	 * @return this title's year of release
	 */
	public String getYearOfRelease() {
		return YearOfRelease;
	}

	/**
	 * this method return the title name
	 * 
	 * @return this title's name
	 */

	public String getTitle() {
		return Title;
	}

	/**
	 * this method return the title genre
	 * 
	 * @return this title's genre
	 */

	public String getGenre() {
		return Genre;
	}

	/**
	 * this method return if the title is available or rented
	 * 
	 * @return this title's rented or not
	 */

	public boolean isRent() {
		return Rent;
	}

	/**
	 * this method return the title type
	 * 
	 * @return this title type
	 */
	public String getType() {
		return Type;
	}

}
