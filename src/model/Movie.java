package model;

/**
*
* @author jeancastro
*/
public class Movie extends AttributesGeneral {
   
	   private String Director;
   
        public Movie(String yearOfRelease, String title, String genre, boolean rent, double Price) {
		super(yearOfRelease, title, genre, rent, Price);
		
		
		this.Director = Director;
		
	}

	
   


public String getDirector() {
	return Director;
}

public void setDirector(String director) {
	Director = director;
}
   
}
