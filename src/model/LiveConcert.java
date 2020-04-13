package model;

/**
*
* @author jeancastro
*/
public class LiveConcert extends AttributesGeneral{
   
   
	    private String Band;   
	
	
	
	    public LiveConcert(String yearOfRelease, String title, String genre, boolean rent, double Price) {
		super(yearOfRelease, title, genre, rent, Price);
		
		
		this.Band = Band;
	}





	public String getBand() {
		return Band;
	}


	public void setBand(String Band) {
		Band = Band;
	
       }
}