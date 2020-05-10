package model;

/**
 *
 * @author jeancastro
 */
public class Employee {

	private String Username;
	private String Password;

	/**
	 * this is the constructor for the employee with attributes username and
	 * Password
	 * 
	 * @param Username
	 * @param Password
	 */

	public Employee(String Username, String Password) {
		super();
		this.Username = Username;
		this.Password = Password;
	}

	/**
	 * this method return the employee username
	 * 
	 * @return this employee's username
	 */
	public String getUsername() {
		return Username;
	}

	/**
	 * this method return the employee password
	 * 
	 * @return this employee's password
	 */
	public String getPassword() {
		return Password;
	}

}
