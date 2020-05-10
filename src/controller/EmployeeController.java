package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JOptionPane;

import model.Customer;
import model.Database;
import model.Employee;
import view.NewCustomer;
import view.NewEmployee;

public class EmployeeController implements ActionListener {

	Employee model;
	NewEmployee view;
	String username;
	String password;
	boolean newEmployeeRegistered;

	// When the controller starts, we need a new model and a new view
	public EmployeeController() throws ParseException {

		view = new NewEmployee(this);

	}
	
	/**
	 * this methos is to get data from the newcustomer frame and passing newcustomerRegistered as parameter to the DB unless the action is performed
	 */

	@Override
	public void actionPerformed(ActionEvent e) {

		username = view.getTextFieldUsernameEmployee();
		password = view.getTextFieldPasswordEmployee();

		model = new Employee(username, password);

		if (e.getActionCommand().equals("Register")) {

			Database db = new Database();

			newEmployeeRegistered = db.newemployee(model); // passing the data to the method in the database class if true, return the data

			if (username.isEmpty() || password.isEmpty()) {

				JOptionPane.showMessageDialog(null, "Fiels Are Empty");
				view.dispose();

			} else {
				JOptionPane.showMessageDialog(null, "Submited");
			}

		}

	}
}
