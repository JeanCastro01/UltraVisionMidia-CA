package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JOptionPane;

import model.Database;
import model.Movie;
import model.MusicLive;
import view.NewMovie;
import view.NewMusicLive;

public class MusicLiveController implements ActionListener {
	
	NewMusicLive view;
   
    
    
    // When the  controller starts, we need a new model and a new view
    public MusicLiveController() throws ParseException{
        
		
				view = new NewMusicLive(this);
	
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
     
    	
    	String yearOfRelease = view.getFormattedTextFieldYearOfRelease();
    	String title = view.getTextFieldTitle();
    	String genre = view.getComboBoxGenre();
    	double Price = view.getComboBoxPriceNewMusicLive();
    	String Type = view.getComboBoxTypeMusicLive();
    	String Singer = view.getTextFieldSinger();
    	
    
        
        MusicLive musiclive = new MusicLive (yearOfRelease, title, genre, Price, Type, Singer);
        
      
        if(e.getActionCommand().equals("Register")){
        	
        	Database db = new Database();
             
            boolean newmusicliveRegistered =  db.newmusiclive(musiclive);
            
            if(newmusicliveRegistered){
            		
            JOptionPane.showMessageDialog(null, "Submited");
             view.dispose();
             
            }
            
        }
 
    }
}
