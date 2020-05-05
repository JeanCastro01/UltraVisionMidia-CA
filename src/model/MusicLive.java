package model;

/**
 *
 * @author jeancastro
 */
public class MusicLive extends AttributesGeneral {

	private String Singer;
	private String DataRented;
	private String DataReturn;

	public MusicLive(String yearOfRelease, String title, String genre, double Price, String Type, String Singer) {
		super(yearOfRelease, title, genre, Price, Type);

		this.Singer = Singer;
		this.DataRented = DataRented;
		this.DataReturn = DataReturn;
		// TODO Auto-generated constructor stub
	}

	public String getDataRented() {
		return DataRented;
	}

	public void setDataRented(String dataRented) {
		DataRented = dataRented;
	}

	public String getDataReturn() {
		return DataReturn;
	}

	public void setDataReturn(String dataReturn) {
		DataReturn = dataReturn;
	}

	public String getSinger() {
		return Singer;
	}

	public void setSinger(String singer) {
		Singer = singer;
	}

}
