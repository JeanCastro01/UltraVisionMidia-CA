package model;

/**
*
* @author jeancastro
*/
public class Movie extends AttributesGeneral {
   
	   private String Director;
	   private String DateRented;
	   private String DateReturn;
   
        public Movie(String yearOfRelease, String title, String genre, boolean rent, double Price) {
		super(yearOfRelease, title, genre, rent, Price);
		
		
		this.Director = Director;
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





public String getDirector() {
	return Director;
}

public void setDirector(String director) {
	Director = director;
}
   
}
