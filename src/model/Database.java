package model;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {
	
    String dbServer = "jdbc:mysql://52.50.23.197:3306";
    String user = "jean";
    String password = "pass1234!";
    Connection conn = null;
    Statement stmt = null;
    
    // Constructor. This guy is starting the DB connection and 
    // putting everything in the variables declared above
    public Database(){
        
        try{
            // Get a connection to the database
            conn = DriverManager.getConnection(dbServer, user, password) ;

            // Get a statement from the connection
            stmt = (Statement) conn.createStatement() ;

        }
        catch( SQLException se ){
            System.out.println( "SQL Exception:" ) ;

            // Loop through the SQL Exceptions
            while( se != null ){
                System.out.println( "State  : " + se.getSQLState()  ) ;
                System.out.println( "Message: " + se.getMessage()   ) ;
                System.out.println( "Error  : " + se.getErrorCode() ) ;

                se = se.getNextException() ;
            }
        }
        catch( Exception e ){
                System.out.println( e ) ;
        }
        
    }


public boolean newcustomer (Customer newcustomerRegistered){
    
    // Variable to define if the login is successful
    boolean newcustomer = false;
    try{
        // Building the query
        String query = "INSERT INTO Customer (cust_id, First_name, Last_name, cust_email, Tel, Membership, Card_number  ) VALUES ('" + newcustomerRegistered.gettextFieldFirstName() + "','" + newcustomerRegistered.gettextFieldLastName() + "','" + newcustomerRegistered.gettextFieldEmail() +"','" + newcustomerRegistered.getFormattedTextFieldTelephone() +"','" + newcustomerRegistered.getcomboBoxMembership() +"','" + newcustomerRegistered.getFormattedTextFieldCardNumber() +"');";

        // Sending the query to the database
        ResultSet rs = ((java.sql.Statement) stmt).executeQuery(query) ;


        // If there is an entry in the database that satisfies
        // the username and password, then the login is successful
        // otherwise it fails
        newcustomer = rs.next();

        // Close the result set, statement and the connection
        rs.close() ;

        // Calling the method in charge of closing the connections
       closings();
        
    }
    catch( SQLException se ){
        System.out.println( "SQL Exception:" ) ;

        // Loop through the SQL Exceptions
        while( se != null ){
            System.out.println( "State  : " + se.getSQLState()  ) ;
            System.out.println( "Message: " + se.getMessage()   ) ;
            System.out.println( "Error  : " + se.getErrorCode() ) ;

            se = se.getNextException() ;
        }
    }
    catch( Exception e ){
            System.out.println( e ) ;
    }

    // Retuning the login status
    return newcustomer;
}
 
// This method is only in charge of saving a new user into the the DB


// Separeating closing statements for better code structure
private void closings(){
    try {            
        ((java.sql.Statement) stmt).close();
        conn.close();
    }
    catch (SQLException ex) {
        Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
    }
}




public boolean newliveconcert (LiveConcert newliveconcertRegistered){
    
    // Variable to define if the login is successful
    boolean newliveconcert = false;
    try{
        // Building the query
        String query = "INSERT INTO LiveConcert (LiveConcert_id, Title, Genre, YearOfRelease, Band, Rent, Type, Price, DataRented, DataReturn ) VALUES ('" + newliveconcertRegistered.gettextFieldTitle() + "','" + newliveconcertRegistered.getComboBoxGenre() + "','" + newliveconcertRegistered.getFormattedTextFieldYearOfRelease() +"','" + newliveconcertRegistered.gettextFieldBand() +"','" + newliveconcertRegistered.getcomboBoxTypeLiveConcert() +"','" + newliveconcertRegistered.getcomboBoxLiveConcertPrice() +"');";

        // Sending the query to the database
        ResultSet rs = ((java.sql.Statement) stmt).executeQuery(query) ;


        // If there is an entry in the database that satisfies
        // the username and password, then the login is successful
        // otherwise it fails
        newliveconcert = rs.next();

        // Close the result set, statement and the connection
        rs.close() ;

        // Calling the method in charge of closing the connections
       closings2();
        
    }
    catch( SQLException se ){
        System.out.println( "SQL Exception:" ) ;

        // Loop through the SQL Exceptions
        while( se != null ){
            System.out.println( "State  : " + se.getSQLState()  ) ;
            System.out.println( "Message: " + se.getMessage()   ) ;
            System.out.println( "Error  : " + se.getErrorCode() ) ;

            se = se.getNextException() ;
        }
    }
    catch( Exception e ){
            System.out.println( e ) ;
    }

    // Retuning the login status
    return newliveconcert;
}
 
// This method is only in charge of saving a new user into the the DB


// Separeating closing statements for better code structure
private void closings2(){
    try {            
        ((java.sql.Statement) stmt).close();
        conn.close();
    }
    catch (SQLException ex) {
        Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
    }
}


public boolean newmovie (Movie newmovieRegistered){
    
    // Variable to define if the login is successful
    boolean newmovie = false;
    try{
        // Building the query
        String query = "INSERT INTO Movie (Movie_id, Title, Genre, YearOfRelease, Director, Rent, Type, Price, DateRented, DateReturn  ) VALUES ('" + newmovieRegistered.gettextFieldTitle() + "','" + newmovieRegistered.getComboBoxGenre() + "','" + newmovieRegistered.getFormattedTextFieldYearOfRelease() +"','" + newmovieRegistered.gettextFieldDirector() +"','" + newmovieRegistered.getcomboBoxTypeMovie() +"','" + newmovieRegistered.getcomboBoxPriceNewMovie() +"');";

        // Sending the query to the database
        ResultSet rs = ((java.sql.Statement) stmt).executeQuery(query) ;


        // If there is an entry in the database that satisfies
        // the username and password, then the login is successful
        // otherwise it fails
        newmovie = rs.next();

        // Close the result set, statement and the connection
        rs.close() ;

        // Calling the method in charge of closing the connections
       closings3();
        
    }
    catch( SQLException se ){
        System.out.println( "SQL Exception:" ) ;

        // Loop through the SQL Exceptions
        while( se != null ){
            System.out.println( "State  : " + se.getSQLState()  ) ;
            System.out.println( "Message: " + se.getMessage()   ) ;
            System.out.println( "Error  : " + se.getErrorCode() ) ;

            se = se.getNextException() ;
        }
    }
    catch( Exception e ){
            System.out.println( e ) ;
    }

    // Retuning the login status
    return newmovie;
}
 
// This method is only in charge of saving a new user into the the DB


// Separeating closing statements for better code structure
private void closings3(){
    try {            
        ((java.sql.Statement) stmt).close();
        conn.close();
    }
    catch (SQLException ex) {
        Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
    }
}


public boolean newmusiclive (MusicLive newmusicliveRegistered){
    
    // Variable to define if the login is successful
    boolean newmusiclive = false;
    try{
        // Building the query
        String query = "INSERT INTO MusicLive (Music_id, Title, Genre, YearOfRelease, Singer, Rent, Type, Price, DateRented, DateReturn  ) VALUES ('" + newmusicliveRegistered.gettextFieldTitle() + "','" + newmusicliveRegistered.getComboBoxGenre() + "','" + newmusicliveRegistered.getFormattedTextFieldYearOfRelease() +"','" + newmusicliveRegistered.gettextFieldSinger() +"','" + newmusicliveRegistered.getcomboBoxTypeMusicLive() +"','" + newmusicliveRegistered.getcomboBoxPriceNewMusicLive() +"');";

        // Sending the query to the database
        ResultSet rs = ((java.sql.Statement) stmt).executeQuery(query) ;


        // If there is an entry in the database that satisfies
        // the username and password, then the login is successful
        // otherwise it fails
        newmusiclive = rs.next();

        // Close the result set, statement and the connection
        rs.close() ;

        // Calling the method in charge of closing the connections
       closings4();
        
    }
    catch( SQLException se ){
        System.out.println( "SQL Exception:" ) ;

        // Loop through the SQL Exceptions
        while( se != null ){
            System.out.println( "State  : " + se.getSQLState()  ) ;
            System.out.println( "Message: " + se.getMessage()   ) ;
            System.out.println( "Error  : " + se.getErrorCode() ) ;

            se = se.getNextException() ;
        }
    }
    catch( Exception e ){
            System.out.println( e ) ;
    }

    // Retuning the login status
    return newmusiclive;
}
 
// This method is only in charge of saving a new user into the the DB


// Separeating closing statements for better code structure
private void closings4(){
    try {            
        ((java.sql.Statement) stmt).close();
        conn.close();
    }
    catch (SQLException ex) {
        Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
    }
}


public boolean newtvbox (MusicLive newtvboxRegistered){
    
    // Variable to define if the login is successful
    boolean newtvbox = false;
    try{
        // Building the query
        String query = "INSERT INTO MusicLive (TVBox_id, Title, Genre, YearOfRelease, Season, NumberOfDisco, Rent, Type, Price, DateRented, DateReturn  ) VALUES ('" + newtvboxRegistered.gettextFieldTitle() + "','" + newtvboxRegistered.getComboBoxGenre() + "','" + newtvboxRegistered.getFormattedTextFieldYearOfRelease() +"','" + newtvboxRegistered.getcomboBoxSeasonNewTVBox() +"','" + newtvboxRegistered.getcomboBoxNumberOfDisco() +"','" + newtvboxRegistered.getcomboBoxTypeTVBox() +"','" + newtvboxRegistered.getcomboBoxPriceNewTVBox() +"');";

        // Sending the query to the database
        ResultSet rs = ((java.sql.Statement) stmt).executeQuery(query) ;


        // If there is an entry in the database that satisfies
        // the username and password, then the login is successful
        // otherwise it fails
        newtvbox = rs.next();

        // Close the result set, statement and the connection
        rs.close() ;

        // Calling the method in charge of closing the connections
       closings5();
        
    }
    catch( SQLException se ){
        System.out.println( "SQL Exception:" ) ;

        // Loop through the SQL Exceptions
        while( se != null ){
            System.out.println( "State  : " + se.getSQLState()  ) ;
            System.out.println( "Message: " + se.getMessage()   ) ;
            System.out.println( "Error  : " + se.getErrorCode() ) ;

            se = se.getNextException() ;
        }
    }
    catch( Exception e ){
            System.out.println( e ) ;
    }

    // Retuning the login status
    return newtvbox;
}
 
// This method is only in charge of saving a new user into the the DB


// Separeating closing statements for better code structure
private void closings5(){
    try {            
        ((java.sql.Statement) stmt).close();
        conn.close();
    }
    catch (SQLException ex) {
        Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
    }
}
}
