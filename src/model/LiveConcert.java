package model;

import java.text.ParseException;

import view.RentLiveConcert;

/**
*
* @author jeancastro
*/
public class LiveConcert extends AttributesGeneral{
   
	private String Band;   
    private String DateRented;
    private String DateReturn;
    private String liveConcertID;

	 
	  
	
	
	    public LiveConcert(String yearOfRelease, String title, String genre, double Price, String Type, String Band) {
		super(yearOfRelease, title, genre, Price, Type);
		

		this.Band = Band;
	    this.DateRented = DateRented;
	    this.DateReturn = DateReturn;
	    
		
		
	}
	    
	    public LiveConcert(String yearOfRelease, String title, String genre, double Price, String Type, String Band, String liveConcertID) {
			super(yearOfRelease, title, genre, Price, Type);
			

			this.Band = Band;
		    this.DateRented = DateRented;
		    this.DateReturn = DateReturn;
		    this.liveConcertID = liveConcertID;
	    }


	public String getLiveConcertID() {
			return liveConcertID;
		}

	public String getDateRented() {
			return DateRented;
		}





		public void setDateRented(String dateRented) {
			DateRented = dateRented;
		}





		public String getDateReturn() {
			return DateReturn;
		}





		public void setDateReturn(String dateReturn) {
			DateReturn = dateReturn;
		}





	public String getBand() {
		return Band;
	}


	public void setBand(String Band) {
		Band = Band;
	
       }
	
	
	public void registerLiveConcert (LiveConcert liveconcert) {
		
		
		
		
	}
}