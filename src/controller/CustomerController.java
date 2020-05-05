package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JOptionPane;
import model.Customer;
import model.Database;
import view.Dashboard;
import view.NewCustomer;

public class CustomerController implements ActionListener {

	Customer model;
	NewCustomer view;

	// When the controller starts, we need a new model and a new view
	public CustomerController() throws ParseException {

		view = new NewCustomer(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String firstname = view.getTextFieldFirstName();
		String lastname = view.getTextFieldLastName();
		String email = view.getTextFieldEmail();
		String tel = view.getFormattedTextFieldTelephone();
		String membership = view.getComboBoxMembership();
		String cardnumber = view.getFormattedTextFieldCardNumber();

		model = new Customer(firstname, lastname, email, membership, tel, cardnumber);

		if (e.getActionCommand().equals("Register")) {

			Database db = new Database();

			boolean newcustomerRegistered = db.newcustomer(model);
			
			if (newcustomerRegistered==false) {
				
				db.newcustomerCard(model);

				
				
				JOptionPane.showMessageDialog(null, "Submited");

				view.dispose();
			}

		}

	}
}
