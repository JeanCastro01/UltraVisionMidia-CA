package model;


/**
 *
 * @author jeancastro
 */
public class TVBox extends AttributesGeneral{
    
	
	

	    private String Season;
        private String NumberOfDisco;
          
         public TVBox(String yearOfRelease, String title, String genre, boolean rent, double Price) {
		 super(yearOfRelease, title, genre, rent, Price);
		 
		 this.NumberOfDisco = NumberOfDisco;
		 this.Season = Season;
		
	}



	public String getSeason() {
		return Season;
	}



	public void setSeason(String season) {
		Season = season;
	}



	public String getNumberOfDisco() {
		return NumberOfDisco;
	}



	public void setNumberOfDisco(String numberOfDisco) {
		NumberOfDisco = numberOfDisco;
	}
    
    
    
    
    
}

