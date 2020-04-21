package model;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mysql.cj.xdevapi.Result;

import view.TitlesAvailable;

public class Database {
	
	
    String dbServer = "jdbc:mysql://52.50.23.197:3306/jean";
    String user = "jean";
    String password = "Pass1234!";
    Connection conn = null;
    Statement stmt = null;
    
    // Constructor. This guy is starting the DB connection and 
    // putting everything in the variables declared above
    public Database(){
        
        try{
        	//Class.forName("com.mysql.jdbc.Driver").newInstance();
        	
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
        String query = "INSERT INTO Customer (First_name, Last_name, cust_email, Tel, Membership, Card_number  )" + "VALUES ('" + newcustomerRegistered.getFirstname() + "','" + newcustomerRegistered.getLastname() + "','" + newcustomerRegistered.getEmail() +"','" + newcustomerRegistered.getTel() +"','" + newcustomerRegistered.getMembership() +"','" + newcustomerRegistered.getCardNumber() +"');";

        // Sending the query to the database
        newcustomer = ((java.sql.Statement) stmt).execute(query) ;

        // If there is an entry in the database that satisfies
        // the username and password, then the login is successful
        // otherwise it fails
        //newcustomer = rs.next();

        // Close the result set, s  closings() ;

    
        
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
    return newcustomer	;
}
 
// This method is only in charge of saving a new user into the the DB


public boolean newliveconcert (LiveConcert newliveconcertRegistered){
    
    // Variable to define if the login is successful
    boolean newliveconcert = false;
    boolean Rent = false;
    try{
        // Building the query
        String query = "INSERT INTO LiveConcert (Title, Genre, YearOfRelease, Band,Rent, Type, Price ) VALUES "
        		+ "('" + newliveconcertRegistered.getTitle() +
        		"','" + newliveconcertRegistered.getGenre() +
        		"','" + newliveconcertRegistered.getYearOfRelease() + 
        		"','" + newliveconcertRegistered.getBand() + 
        		"','" + Rent + 
        		"','" + newliveconcertRegistered.getType() + 
        		"','" + newliveconcertRegistered.getPrice() +"');";

        // Sending the query to the database
        newliveconcert = ((java.sql.Statement) stmt).execute(query) ;


    
        
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


public boolean newmovie (Movie newmovieRegistered){
    
    // Variable to define if the login is successful
	
    boolean newmovie = false;
    boolean Rent =  false;
    try{
        // Building the query
        String query = "INSERT INTO Movie (Title, Genre, YearOfRelease, Director, Rent, Type, Price   )" 
        + "VALUES ('" + newmovieRegistered.getTitle() +
        "','" + newmovieRegistered.getGenre() + 
        "','" + newmovieRegistered.getYearOfRelease() + 
        "','" + newmovieRegistered.getDirector() + 
        "','" + Rent +"','" + newmovieRegistered.getType()+ 
        "','" + newmovieRegistered.getPrice() +"');";

        // Sending the query to the database
        newmovie = ((java.sql.Statement) stmt).execute(query) ;





        
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


public boolean newmusiclive (MusicLive newmusicliveRegistered){
	

    
    // Variable to define if the login is successful
    boolean newmusiclive = false;
    boolean Rent = false;
    try{
        // Building the query
        String query = "INSERT INTO MusicLive (Title, Genre, YearOfRelease, Singer, Rent, Type, Price ) VALUES"
        		+ " ('" + newmusicliveRegistered.getTitle() +
        		"','" + newmusicliveRegistered.getGenre() + 
        		"','" + newmusicliveRegistered.getYearOfRelease() + 
        		"','" + newmusicliveRegistered.getSinger() + 
        		"','" + Rent + 
        		"','" + newmusicliveRegistered.getType() + 
        		"','" + newmusicliveRegistered.getPrice() +"');";

        // Sending the query to the database
        newmusiclive= ((java.sql.Statement) stmt).execute(query) ;


    
        
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


public boolean newtvbox (TVBox newtvboxRegistered){
    
    // Variable to define if the login is successful
    boolean newtvbox = false;
    boolean Rent = false;
    try{
        // Building the query
        String query = "INSERT INTO TVBox (Title, Genre, YearOfRelease, Season, NumberOfDisco, Rent, Type, Price ) VALUES"
        		+ " ('" + newtvboxRegistered.getTitle() +
        		"','" + newtvboxRegistered.getGenre() + 
        		"','" + newtvboxRegistered.getYearOfRelease() + 
        		"','" + newtvboxRegistered.getSeason() + 
        		"','" + newtvboxRegistered.getNumberOfDisco() + 
        		"','" + Rent + 
        		"','" + newtvboxRegistered.getType() + 
        		"','" + newtvboxRegistered.getPrice() +"');";

        // Sending the query to the database
        newtvbox= ((java.sql.Statement) stmt).execute(query) ;



        
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


public String[][] titleavailablemovie () {

	
    String[][] data = null;
    
    
    
            try{
          
            String dbServer = "jdbc:mysql://52.50.23.197:3306/jean";
            String user = "jean";
            String password = "Pass1234!";
            Connection conn = null;
            Statement stmt = null;
            
           // TitlesAvailable available = new TitlesAvailable();
            
           ///
            //String selectitem = available.getComboBox();
            
            
            String query1 = " SELECT Title, Director, Type FROM Movie"; 

           // String query2 = "SELECT Movie_id, Title, Director, Type FROM Movie; ";

            // Get a connection to the database
            conn = DriverManager.getConnection(dbServer, user, password) ;

            // Get a statement from the connection
            stmt = conn.createStatement() ;

            // Execute the query
            ResultSet rs1 = stmt.executeQuery(query1) ;
         //   ResultSet rs2 = stmt.executeQuery(query2) ;
	
            // Instantiating the array
            data = new String[100][10];
            // Creating a counter to keep track of the 
            // row we're on
            int row = 0;
	
            // Loop through the result set
            while(rs1.next()) {
                        
                // And then, adding the data to an array
               // data[row][0] = rs1.getString("Movie_id");
                data[row][0] = rs1.getString("Title");    
                data[row][1] = rs1.getString("Director");
                data[row][2] = rs1.getString("Type");
                
                // go the the next row
                row++;
            }
            
   
            

            // Close the result set, statement and the connection
            rs1.close() ;
           // rs2.close() ;
            stmt.close() ;
            conn.close() ;
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
        
        // Retuning the array of data
        return data;
}

//This method is only in charge of get data from database to print the table
  

public String[][] titleavailablemusiclive () {
	
	 String[][] data = null;
	    
	    
	    
     try{
   
     String dbServer = "jdbc:mysql://52.50.23.197:3306/jean";
     String user = "jean";
     String password = "Pass1234!";
     Connection conn = null;
     Statement stmt = null;
     
    // TitlesAvailable available = new TitlesAvailable();
     
    ///
     //String selectitem = available.getComboBox();
     
     
     String query1 = " SELECT Title, Singer, Type FROM MusicLive"; 

    // String query2 = "SELECT Movie_id, Title, Director, Type FROM Movie; ";

     // Get a connection to the database
     conn = DriverManager.getConnection(dbServer, user, password) ;

     // Get a statement from the connection
     stmt = conn.createStatement() ;

     // Execute the query
     ResultSet rs1 = stmt.executeQuery(query1) ;
  //   ResultSet rs2 = stmt.executeQuery(query2) ;

     // Instantiating the array
     data = new String[100][10];
     // Creating a counter to keep track of the 
     // row we're on
     int row = 0;

     // Loop through the result set
     while(rs1.next()) {
                 
         // And then, adding the data to an array
        // data[row][0] = rs1.getString("Movie_id");
         data[row][0] = rs1.getString("Title");    
         data[row][1] = rs1.getString("Singer");
         data[row][2] = rs1.getString("Type");
         
         // go the the next row
         row++;
     }
     

     

     // Close the result set, statement and the connection
     rs1.close() ;
    // rs2.close() ;
     stmt.close() ;
     conn.close() ;
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
 
 // Retuning the array of data
 return data;
}

//This method is only in charge of get data from database to print the table

public String[][] titleavailableliveconcert() {
	
	 String[][] data = null;
	    
	    
	    
    try{
  
    String dbServer = "jdbc:mysql://52.50.23.197:3306/jean";
    String user = "jean";
    String password = "Pass1234!";
    Connection conn = null;
    Statement stmt = null;
    
   // TitlesAvailable available = new TitlesAvailable();
    
   ///
    //String selectitem = available.getComboBox();
    
    
    String query1 = " SELECT Title, Band, Type FROM LiveConcert"; 

   // String query2 = "SELECT Movie_id, Title, Director, Type FROM Movie; ";

    // Get a connection to the database
    conn = DriverManager.getConnection(dbServer, user, password) ;

    // Get a statement from the connection
    stmt = conn.createStatement() ;

    // Execute the query
    ResultSet rs1 = stmt.executeQuery(query1) ;
 //   ResultSet rs2 = stmt.executeQuery(query2) ;

    // Instantiating the array
    data = new String[100][10];
    // Creating a counter to keep track of the 
    // row we're on
    int row = 0;

    // Loop through the result set
    while(rs1.next()) {
                
        // And then, adding the data to an array
       // data[row][0] = rs1.getString("Movie_id");
        data[row][0] = rs1.getString("Title");    
        data[row][1] = rs1.getString("Band");
        data[row][2] = rs1.getString("Type");
        
        // go the the next row
        row++;
    }
    

    

    // Close the result set, statement and the connection
    rs1.close() ;
   // rs2.close() ;
    stmt.close() ;
    conn.close() ;
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

// Retuning the array of data
return data;
}

//This method is only in charge of get data from database to print the table
	
public String[][] titleavailabletvbox() {
	
	 String[][] data = null;
	    
	    
	    
   try{
 
   String dbServer = "jdbc:mysql://52.50.23.197:3306/jean";
   String user = "jean";
   String password = "Pass1234!";
   Connection conn = null;
   Statement stmt = null;
   
  // TitlesAvailable available = new TitlesAvailable();
   
  ///
   //String selectitem = available.getComboBox();
   
   
   String query1 = " SELECT Title, NumberOfDisco,Season, Type FROM TVBox"; 

  // String query2 = "SELECT Movie_id, Title, Director, Type FROM Movie; ";

   // Get a connection to the database
   conn = DriverManager.getConnection(dbServer, user, password) ;

   // Get a statement from the connection
   stmt = conn.createStatement() ;

   // Execute the query
   ResultSet rs1 = stmt.executeQuery(query1) ;
//   ResultSet rs2 = stmt.executeQuery(query2) ;

   // Instantiating the array
   data = new String[100][10];
   // Creating a counter to keep track of the 
   // row we're on
   int row = 0;

   // Loop through the result set
   while(rs1.next()) {
               
       // And then, adding the data to an array
      // data[row][0] = rs1.getString("Movie_id");
       data[row][0] = rs1.getString("Title");    
       data[row][1] = rs1.getString("NumberOfDisco");
       data[row][2] = rs1.getString("Season");
       data[row][3] = rs1.getString("Type");
       
       // go the the next row
       row++;
   }
   

   

   // Close the result set, statement and the connection
   rs1.close() ;
  // rs2.close() ;
   stmt.close() ;
   conn.close() ;
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

//Retuning the array of data
return data;
}

//This method is only in charge of get data from database to print the table	
}



