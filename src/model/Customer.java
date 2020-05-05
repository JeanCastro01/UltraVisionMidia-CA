package model;

import java.util.ArrayList;

/**
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

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public ArrayList<String> getListoftitles() {
		return listoftitles;
	}

	public void setListoftitles(ArrayList<String> selectedID) {
		this.listoftitles = selectedID;
	}

	public String getMembership() {
		return Membership;
	}

	public void setMembership(String membership) {
		Membership = membership;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getTel() {
		return Tel;
	}

	public void setTel(String Tel) {
		Email = Tel;
	}

	public String getCardNumber() {
		return CardNumber;
	}

	public void setCardNumber(String cardNumber) {
		CardNumber = cardNumber;
	}

}
