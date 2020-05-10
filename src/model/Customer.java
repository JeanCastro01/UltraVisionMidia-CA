package model;

import java.util.ArrayList;

/**
 * this method is for the customer attributes
 * 
 * @author jeancastro
 */
public class Customer {

	private String Firstname;
	private String Lastname;
	private String Email;
	private String Tel;
	private String Membership;
	private String CardNumber;
	ArrayList<String> listoftitles = new ArrayList<String>(3);
	private String customerID;

	/**
	 * this constructor for the customer with
	 * firstname,lastname,email,tel,membership,cardnumber,customerID,listoftitles
	 * attributes
	 * 
	 * @param firstname
	 *            Customer's First name
	 * @param lastname
	 *            customer's last name
	 * @param email
	 *            customer's email
	 * @param Membership
	 *            membership's plan (LIVE CONCERT/MUSIC LIVE/TV BOX/ MOVIE)
	 * @param Tel
	 *            customer's telephone
	 * @param CardNumber
	 *            customer's card number
	 */

	public Customer(String firstname, String lastname, String email, String Membership, String Tel, String CardNumber) {
		super();
		this.Firstname = firstname;
		this.Lastname = lastname;
		this.Email = email;
		this.Tel = Tel;
		this.Membership = Membership;
		this.CardNumber = CardNumber;
		this.listoftitles = listoftitles;

	}

	public Customer(String firstname, String lastname, String email, String Membership, String Tel, String CardNumber,
			String customerID) {
		super();
		this.Firstname = firstname;
		this.Lastname = lastname;
		this.Email = email;
		this.Tel = Tel;
		this.Membership = Membership;
		this.CardNumber = CardNumber;
		this.listoftitles = listoftitles;
		this.customerID = customerID;
	}

	/**
	 * this method return the customer ID
	 * 
	 * @return this customer's ID
	 */
	public String getCustomerID() {
		return customerID;
	}

	/**
	 * this method return list of titles retend by the customer
	 * 
	 * @return this customer's list of titles
	 */
	public ArrayList<String> getListoftitles() {
		return listoftitles;
	}

	/**
	 * this method return the customer membership plan (LIVE CONCERT/MUSIC
	 * LIVE/TV BOX/ MOVIE)
	 * 
	 * @return this membership's plan
	 */
	public String getMembership() {
		return Membership;
	}

	/**
	 * this method return the customer first name
	 * 
	 * @return this customer's first name
	 */
	public String getFirstname() {
		return Firstname;
	}

	/**
	 * this method return customer last name
	 * 
	 * @return this customer's last name
	 */
	public String getLastname() {
		return Lastname;
	}

	/**
	 * this method return the customer email
	 * 
	 * @return this customer's email
	 */

	public String getEmail() {
		return Email;
	}

	/**
	 * this method return the customer telephone number
	 * 
	 * @return this customer's telphone number
	 */

	public String getTel() {
		return Tel;
	}

	/**
	 * this method retunr the customer card number
	 * 
	 * @return this customer's card number
	 */

	public String getCardNumber() {
		return CardNumber;
	}

}
