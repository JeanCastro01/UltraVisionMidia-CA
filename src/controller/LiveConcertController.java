package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JOptionPane;

import model.Database;
import model.LiveConcert;
import view.NewLiveConcert;


public class LiveConcertController implements ActionListener{
	
	
	
	NewLiveConcert view;
	LiveConcert liveconcert;
   
    
    
    // When the  controller starts, we need a new model and a new view
    public LiveConcertController() throws ParseException{
        
		
	 view = new NewLiveConcert(null);
	
		
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
     
    	String yearOfRelease = view.getFormattedTextFieldYearOfRelease();
    	String title = view.getTextFieldTitle();
    	String genre = view.getComboBoxGenre();
    	double Price = view.getComboBoxLiveConcertPrice();
    	String Type = view.getComboBoxTypeLiveConcert();
    	String Band = view.getTextFieldBand();
    	
    
        
        liveconcert = new LiveConcert (yearOfRelease, title, genre, Price, Type, Band);
        
      
        if(e.getActionCommand().equals("Register")){
        	
        	Database db = new Database();
             
            boolean liveconcertRegistered =  db.newliveconcert(liveconcert);
            
            if(liveconcertRegistered == true){
            		
            JOptionPane.showMessageDialog(null, "Submited");
             view.dispose();
             
            }

              db.newliveconcert(liveconcert);
         
            }
 
    }
}



