package model;

/**
 * this class extends the class AttributesGeneral which some attributes
 * 
 * @author jeancastro
 */
public class MusicLive extends AttributesGeneral {

	private String Singer;
	private String DataRented;
	private String DataReturn;

	/**
	 * This constructor Music live with some attributes Singer, DataRented,
	 * DataReturn
	 * 
	 * @param yearOfRelease
	 *            Music Live's Year of release
	 * @param title
	 *            Music Live's title
	 * @param genre
	 *            Music Live's genre
	 * @param Price
	 *            Music Live's Price
	 * @param Type
	 *            Music Live's type (CD/DVD/BLU_RAY)
	 * @param Singer
	 *            Music Live's Singer name
	 */
	public MusicLive(String yearOfRelease, String title, String genre, double Price, String Type, String Singer) {
		super(yearOfRelease, title, genre, Price, Type);

		this.Singer = Singer;
		this.DataRented = DataRented;
		this.DataReturn = DataReturn;
		// TODO Auto-generated constructor stub
	}

	/**
	 * this method return the Music live Rented Date
	 * 
	 * @return this Music Live's rented date
	 */
	public String getDataRented() {
		return DataRented;
	}

	/**
	 * this method return the Music Live Return Date
	 * 
	 * @return this music live's return date
	 */
	public String getDataReturn() {
		return DataReturn;
	}

	public String getSinger() {
		return Singer;
	}

}
