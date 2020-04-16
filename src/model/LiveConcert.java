package model;

/**
*
* @author jeancastro
*/
public class LiveConcert extends AttributesGeneral{
   
	private String Band;   
    private String DateRented;
    private String DateReturn;

	 
	  
	
	
	    public LiveConcert(String yearOfRelease, String title, String genre, double Price, String Type, String Band) {
		super(yearOfRelease, title, genre, Price, Type);
		

		this.Band = Band;
	    this.DateRented = DateRented;
	    this.DateReturn = DateReturn;
	    
		
		
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