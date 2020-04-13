package model;

/**
*
* @author jeancastro
*/
public abstract class AttributesGeneral {
   
   
        private String YearOfRelease;
        private String Title;
        private String Genre;
        private boolean Rent;
        private double Price;
   
   
	public AttributesGeneral(String yearOfRelease, String title, String genre, boolean rent, double Price) {
		super();
		this.YearOfRelease = yearOfRelease;
		this.Title = title;
		this.Genre = genre;
		this.Rent = rent =false;
		this.Price = Price;
	}


	public double getPrice() {
		return Price;
	}


	public void setPrice(double price) {
		Price = price;
	}


	public String getYearOfRelease() {
		return YearOfRelease;
	}


	public void setYearOfRelease(String yearOfRelease) {
		YearOfRelease = yearOfRelease;
	}


	public String getTitle() {
		return Title;
	}


	public void setTitle(String title) {
		Title = title;
	}


	public String getGenre() {
		return Genre;
	}


	public void setGenre(String genre) {
		Genre = genre;
	}


	public boolean isRent() {
		return Rent;
	}


	public void setRent(boolean rent) {
		Rent = rent;
	}

}

