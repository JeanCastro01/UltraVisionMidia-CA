package model;


/**
 *
 * @author jeancastro
 */
public class MusicLive extends AttributesGeneral {
    
	   private String Singer;
	   private String DataRented;
	   private String DataReturn;
	
	
       public MusicLive(String yearOfRelease, String title, String genre, boolean rent, double Price) {
		super(yearOfRelease, title, genre, rent, Price);
		
		this.Singer = Singer;
		this.DataRented = DataRented;
		this.DataReturn = DataReturn;
		
		
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
