package model;

/**
 *
 * @author jeancastro
 */
public class Employee {

	private String Username;
	private String Password;

	public Employee(String Username, String Password) {
		super();
		this.Username = Username;
		this.Password = Password;
	}

	public String getUsername() {
		return Username;
	}

	public String getPassword() {
		return Password;
	}

}
