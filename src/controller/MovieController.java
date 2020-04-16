package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JOptionPane;

import model.Customer;
import model.Database;
import model.Movie;
import view.Dashboard;
import view.NewCustomer;
import view.NewMovie;

public class MovieController implements ActionListener {
	
	
	NewMovie view;
   
    
    
    // When the  controller starts, we need a new model and a new view
    public MovieController(){
        
			 try {
				view = new NewMovie(this);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
     
    	String yearOfRelease = view.getFormattedTextFieldYearOfRelease();
    	String title = view.getTextFieldTitle();
    	String genre = view.getComboBoxGenre();
    	double Price = view.getComboBoxPriceNewMovie();
    	String Type = view.getComboBoxTypeMovie();
    	String Director = view.getTextFieldDirector();
    	
    
        
        Movie movie = new Movie (yearOfRelease, title,  genre, Price,  Type,  Director);
        
      
        if(e.getActionCommand().equals("Register")){
        	
        	Database db = new Database();
             
            boolean newmovieRegistered =  db.newmovie(movie);
            
            if(newmovieRegistered == true){
            		
            JOptionPane.showMessageDialog(null, "Submited");
             view.dispose();
             
            }

              db.newmovie(movie);
         
            }
 
    }
}


