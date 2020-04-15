package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import model.Customer;
import model.Database;
import view.Dashboard;
import view.NewCustomer;

public class CustomerController implements ActionListener  {
	
    Customer model;
    NewCustomer view;
    
    
    // When the  controller starts, we need a new model and a new view
    public CustomerController(){
        view = new NewCustomer(this); 
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    
        model = new Customer(" ", " ", " ", " ", " ", " ");

     
        String firstname = view.getTextFieldFirstName();
        String lastname = view.getTextFieldLastName();
        String email = view.getTextFieldEmail();
        String tel = view.getFormattedTextFieldTelephone();
        Object membership = view.getComboBoxMembership();
        String cardnumber = view.getFormattedTextFieldCardNumber();
        
     
       
        // Create an instance of the user class with the data collated
       newcustomer newcustomerRegistered = new newcustomer (firstname,lastname,email, tel, membership, cardnumber);
        
      
        if(e.getActionCommand().equals("Register")){

         Database.newcustomer(newcustomerRegistered);
         JOptionPane.showMessageDialog(null, "Submited");
         new Dashboard();
         
                view.dispose();
            }

       
    }
}




