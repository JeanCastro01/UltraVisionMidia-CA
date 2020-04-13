package model;

/**
*
* @author jeancastro
*/
public class LiveConcert extends AttributesGeneral{
   
   
	    private String Band;   
	    private String DateRented;
	    private String DateReturn;
	
	
	
	    public LiveConcert(String yearOfRelease, String title, String genre, boolean rent, double Price) {
		super(yearOfRelease, title, genre, rent, Price);
		
		
		this.Band = Band;
		this.DateRented = DateRented;
		this.DateReturn = DateRented;
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
}