package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JOptionPane;

import model.Database;
import model.MusicLive;
import model.TVBox;
import view.NewMusicLive;
import view.NewTVBox;

public class TVBoxController implements ActionListener {

	
	
	NewTVBox view;
   
    
    
    // When the  controller starts, we need a new model and a new view
    public TVBoxController(){
        
			 try {
				view = new NewTVBox(this);
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
    	double Price = view.getComboBoxPriceNewTVBox();
    	String Type = view.getComboBoxTypeTVBox();
    	String NumberOfDisco = view.getComboBoxNumberOfDisco();
    	String Season = view.getComboBoxSeasonNewTVBox();
    	
    
        
        TVBox tvbox = new TVBox (yearOfRelease, title, genre, Price, Type, NumberOfDisco, Season);
        
      
        if(e.getActionCommand().equals("Register")){
        	
        	Database db = new Database();
             
            boolean newtvboxRegistered =  db.newtvbox(tvbox);
            
            if(newtvboxRegistered == true){
            		
            JOptionPane.showMessageDialog(null, "Submited");
             view.dispose();
             
            }

              db.newtvbox(tvbox);
         
            }
 
    }
}

