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

	// When the controller starts, we need a new model and a new view
	public EmployeeController() throws ParseException {

		view = new NewEmployee(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String username = view.getTextFieldUsernameEmployee();
		String password = view.getTextFieldPasswordEmployee();


		model = new Employee(username, password);

		if (e.getActionCommand().equals("Register")) {

			Database db = new Database();

			boolean newEmployeeRegistered = db.newemployee(model);
			
			if (newEmployeeRegistered==false) {

				JOptionPane.showMessageDialog(null, "Submited");
				view.dispose();

			}
			else if (newEmployeeRegistered ==true){
				JOptionPane.showMessageDialog(null, "Fiels Are Empty");
			}

		}

	}
}


