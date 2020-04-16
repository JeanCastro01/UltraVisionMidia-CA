package model;


/**
 *
 * @author jeancastro
 */
public class TVBox extends AttributesGeneral{
	
	
	

	private String Season;
    private String NumberOfDisco;
    private String DateRented;
    private String DateReturn;
	
	

	    public TVBox(String yearOfRelease, String title, String genre, double Price, String Type, String NumberOfDisco, String Season) {
		super(yearOfRelease, title, genre, Price, Type);
		
		 this.NumberOfDisco = NumberOfDisco;
		 this.Season = Season;
		 this.DateRented = DateRented;
		 this.DateReturn = DateReturn;
		 
		// TODO Auto-generated constructor stu


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

