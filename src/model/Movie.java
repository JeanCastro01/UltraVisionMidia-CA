package model;

/**
*
* @author jeancastro
*/
public class Movie extends AttributesGeneral {
	
	
	   private String Director;
	   private String DateRented;
	   private String DateReturn;
	
	
	

   
	   public Movie(String yearOfRelease, String title, String genre, double Price, String Type, String Director) {
		super(yearOfRelease, title, genre, Price, Type);
		
		this.Director = Director;
		this.DateRented = DateRented;
		this.DateReturn = DateReturn;

		
		
		
	}





	public String getDirector() {
		return Director;
	}





	public void setDirector(String director) {
		Director = director;
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
	   

}
   

