package model;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFormattedTextField;

import com.mysql.cj.xdevapi.Result;

import view.NewCustomer;
import view.TitlesAvailable;

public class Database {

	String dbServer = "jdbc:mysql://52.50.23.197:3306/jean";
	String user = "jean";
	String password = "Pass1234!";
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs;

	// Constructor. is starting the DB connection and
	// putting everything in the variables declared above
	public Database() {

		try {

			// Get a connection to the database
			conn = DriverManager.getConnection(dbServer, user, password);

			// Get a statement from the connection
			stmt = (Statement) conn.createStatement();

		} catch (SQLException se) {
			System.out.println("SQL Exception:");

			// Loop through the SQL Exceptions
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());

				se = se.getNextException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public boolean newcustomer(Customer newcustomerRegistered) {

		// Variable to define if the login is successful
		boolean newcustomer = false;
		
		try {
			// Building the query
			String query = "INSERT INTO Customer (First_name, Last_name, cust_email, Tel, Membership, Card_number  )"
					+ "VALUES ('" + newcustomerRegistered.getFirstname() + "','" + newcustomerRegistered.getLastname()
					+ "','" + newcustomerRegistered.getEmail() + "','" + newcustomerRegistered.getTel() + "','"
					+ newcustomerRegistered.getMembership() + "','" + newcustomerRegistered.getCardNumber() + "');";

			// Sending the query to the database
		stmt.executeUpdate(query);
		newcustomer= true;
		

		} catch (SQLException se) {
			System.out.println("SQL Exception:");

			// Loop through the SQL Exceptions
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());

				se = se.getNextException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// Retuning the login status
		return newcustomer;
	}

	public boolean newemployee(Employee newEmployeeRegistered) {

		// Variable to define if the login is successful
		boolean newemployee = false;
		try {
			// Building the query
			String query = "INSERT INTO employee (Employee_username, Employee_password)" + "VALUES ('"
					+ newEmployeeRegistered.getUsername() + "','" + newEmployeeRegistered.getPassword() + "');";

			// Sending the query to the database
			newemployee = stmt.execute(query);

		} catch (SQLException se) {
			System.out.println("SQL Exception:");

			// Loop through the SQL Exceptions
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());

				se = se.getNextException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// Retuning the login status
		return newemployee;
	}

	// This method is only in charge of saving a new user into the the DB
	public void newcustomerCard(Customer newcustomerRegistered) {

		// Variable to define if the login is successful

		int cust_id = 0;
		int points = 0;
		boolean newCardID = false;

		ResultSet rs;

		String query = "SELECT cust_id from Customer WHERE cust_email = '" + newcustomerRegistered.getEmail() + "'";
		try {

			rs = stmt.executeQuery(query);

			while (rs.next()) {
				cust_id = rs.getInt("cust_id");
			}
		} catch (Exception e) {

		}

		try {
			// Building the query
			query = "INSERT INTO LoyaltyCard (Points, cust_id )" + "VALUES ('" + points + "','" + cust_id + "');";

			// Sending the query to the database
			newCardID = stmt.execute(query);

		} catch (SQLException se) {
			System.out.println("SQL Exception:");

			// Loop through the SQL Exceptions
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());

				se = se.getNextException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	// This method is only in charge of saving a new user into the the DB
	public boolean newliveconcert(LiveConcert newliveconcertRegistered) {

		// Variable to define if the login is successful
		boolean newliveconcert = false;
		boolean Rent = false;
		try {

			// Building the query
			String query = "INSERT INTO LiveConcert (Title, Genre, YearOfRelease, Band,Rent, Type, Price ) VALUES "
					+ "('" + newliveconcertRegistered.getTitle() + "','" + newliveconcertRegistered.getGenre() + "','"
					+ newliveconcertRegistered.getYearOfRelease() + "','" + newliveconcertRegistered.getBand() + "','"
					+ Rent + "','" + newliveconcertRegistered.getType() + "','" + newliveconcertRegistered.getPrice()
					+ "');";

			// Sending the query to the database
			stmt.execute(query);
			newliveconcert = true;
			
		} catch (Exception e) {
			System.out.println(e);
		}

		// Retuning the login status
		return newliveconcert;
	}

	// This method is only in charge of saving a new user into the the DB

	public boolean newmovie(Movie newmovieRegistered) {

		// Variable to define if the login is successful

		boolean newmovie = false;
		boolean Rent = false;
		try {
			// Building the query
			String query = "INSERT INTO Movie (Title, Genre, YearOfRelease, Director, Rent, Type, Price   )"
					+ "VALUES ('" + newmovieRegistered.getTitle() + "','" + newmovieRegistered.getGenre() + "','"
					+ newmovieRegistered.getYearOfRelease() + "','" + newmovieRegistered.getDirector() + "','" + Rent
					+ "','" + newmovieRegistered.getType() + "','" + newmovieRegistered.getPrice() + "');";

			// Sending the query to the database
			newmovie = ((java.sql.Statement) stmt).execute(query);

		} catch (SQLException se) {
			System.out.println("SQL Exception:");

			// Loop through the SQL Exceptions
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());

				se = se.getNextException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// Retuning the login status
		return newmovie;
	}

	// This method is only in charge of saving a new user into the the DB

	// Separeating closing statements for better code structure

	public boolean newmusiclive(MusicLive newmusicliveRegistered) {

		// Variable to define if the login is successful
		boolean newmusiclive = false;
		boolean Rent = false;
		try {
			// Building the query
			String query = "INSERT INTO MusicLive (Title, Genre, YearOfRelease, Singer, Rent, Type, Price ) VALUES"
					+ " ('" + newmusicliveRegistered.getTitle() + "','" + newmusicliveRegistered.getGenre() + "','"
					+ newmusicliveRegistered.getYearOfRelease() + "','" + newmusicliveRegistered.getSinger() + "','"
					+ Rent + "','" + newmusicliveRegistered.getType() + "','" + newmusicliveRegistered.getPrice()
					+ "');";

			// Sending the query to the database
			newmusiclive = ((java.sql.Statement) stmt).execute(query);

		} catch (SQLException se) {
			System.out.println("SQL Exception:");

			// Loop through the SQL Exceptions
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());

				se = se.getNextException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// Retuning the login status
		return newmusiclive;
	}

	// This method is only in charge of saving a new user into the the DB

	// Separeating closing statements for better code structure

	public boolean newtvbox(TVBox newtvboxRegistered) {

		// Variable to define if the login is successful
		boolean newtvbox = false;
		boolean Rent = false;
		try {
			// Building the query
			String query = "INSERT INTO TVBox (Title, Genre, YearOfRelease, Season, NumberOfDisco, Rent, Type, Price ) VALUES"
					+ " ('" + newtvboxRegistered.getTitle() + "','" + newtvboxRegistered.getGenre() + "','"
					+ newtvboxRegistered.getYearOfRelease() + "','" + newtvboxRegistered.getSeason() + "','"
					+ newtvboxRegistered.getNumberOfDisco() + "','" + Rent + "','" + newtvboxRegistered.getType()
					+ "','" + newtvboxRegistered.getPrice() + "');";

			// Sending the query to the database
			newtvbox = ((java.sql.Statement) stmt).execute(query);

		} catch (SQLException se) {
			System.out.println("SQL Exception:");

			// Loop through the SQL Exceptions
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());

				se = se.getNextException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// Retuning the login status
		return newtvbox;
	}

	// This method is only in charge of saving a new user into the the DB

	public String[][] titleavailablemovie() {

		String[][] data = null;

		try {

			String dbServer = "jdbc:mysql://52.50.23.197:3306/jean";
			String user = "jean";
			String password = "Pass1234!";
			Connection conn = null;
			Statement stmt = null;

			String query1 = " SELECT Title, Director, Type FROM Movie WHERE Rent= '" + false + "'";
			// Get a connection to the database
			conn = DriverManager.getConnection(dbServer, user, password);

			// Get a statement from the connection
			stmt = conn.createStatement();

			// Execute the query
			ResultSet rs1 = stmt.executeQuery(query1);
			// ResultSet rs2 = stmt.executeQuery(query2) ;

			// Instantiating the array
			data = new String[100][10];
			// Creating a counter to keep track of the
			// row we're on
			int row = 0;

			// Loop through the result set
			while (rs1.next()) {

				// And then, adding the data to an array
				// data[row][0] = rs1.getString("Movie_id");
				data[row][0] = rs1.getString("Title");
				data[row][1] = rs1.getString("Director");
				data[row][2] = rs1.getString("Type");

				// go the the next row
				row++;
			}

			// Close the result set, statement and the connection
			rs1.close();
			// rs2.close() ;
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			System.out.println("SQL Exception:");

			// Loop through the SQL Exceptions
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());

				se = se.getNextException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// Retuning the array of data
		return data;
	}

	public String[][] titRentedmovie() {

		String[][] data = null;

		try {

			String dbServer = "jdbc:mysql://52.50.23.197:3306/jean";
			String user = "jean";
			String password = "Pass1234!";
			Connection conn = null;
			Statement stmt = null;

			String query1 = " SELECT Title, Director, Type FROM Movie WHERE Rent= '" + true + "'";

			// Get a connection to the database
			conn = DriverManager.getConnection(dbServer, user, password);

			// Get a statement from the connection
			stmt = conn.createStatement();

			// Execute the query
			ResultSet rs1 = stmt.executeQuery(query1);
			// ResultSet rs2 = stmt.executeQuery(query2) ;

			// Instantiating the array
			data = new String[100][10];
			// Creating a counter to keep track of the
			// row we're on
			int row = 0;

			// Loop through the result set
			while (rs1.next()) {

				// And then, adding the data to an array
				// data[row][0] = rs1.getString("Movie_id");
				data[row][0] = rs1.getString("Title");
				data[row][1] = rs1.getString("Director");
				data[row][2] = rs1.getString("Type");

				// go the the next row
				row++;
			}

			// Close the result set, statement and the connection
			rs1.close();
			// rs2.close() ;
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			System.out.println("SQL Exception:");

			// Loop through the SQL Exceptions
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());

				se = se.getNextException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// Retuning the array of data
		return data;
	}

	// This method is only in charge of get data from database to print the
	// table

	public String[][] titleavailablemusiclive() {

		String[][] data = null;

		try {

			String dbServer = "jdbc:mysql://52.50.23.197:3306/jean";
			String user = "jean";
			String password = "Pass1234!";
			Connection conn = null;
			Statement stmt = null;

			String query1 = " SELECT Title, Singer, Type FROM MusicLive WHERE Rent= '" + false + "'";

			// Get a connection to the database
			conn = DriverManager.getConnection(dbServer, user, password);

			// Get a statement from the connection
			stmt = conn.createStatement();

			// Execute the query
			ResultSet rs1 = stmt.executeQuery(query1);
			// ResultSet rs2 = stmt.executeQuery(query2) ;

			// Instantiating the array
			data = new String[100][10];
			// Creating a counter to keep track of the
			// row we're on
			int row = 0;

			// Loop through the result set
			while (rs1.next()) {

				// And then, adding the data to an array
				// data[row][0] = rs1.getString("Movie_id");
				data[row][0] = rs1.getString("Title");
				data[row][1] = rs1.getString("Singer");
				data[row][2] = rs1.getString("Type");

				// go the the next row
				row++;
			}

			// Close the result set, statement and the connection
			rs1.close();
			// rs2.close() ;
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			System.out.println("SQL Exception:");

			// Loop through the SQL Exceptions
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());

				se = se.getNextException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// Retuning the array of data
		return data;
	}

	public String[][] titleRentedmusiclive() {

		String[][] data = null;

		try {

			String dbServer = "jdbc:mysql://52.50.23.197:3306/jean";
			String user = "jean";
			String password = "Pass1234!";
			Connection conn = null;
			Statement stmt = null;

			String query1 = " SELECT Title, Singer, Type FROM MusicLive WHERE Rent= '" + true + "'";

			// Get a connection to the database
			conn = DriverManager.getConnection(dbServer, user, password);

			// Get a statement from the connection
			stmt = conn.createStatement();

			// Execute the query
			ResultSet rs1 = stmt.executeQuery(query1);
			// ResultSet rs2 = stmt.executeQuery(query2) ;

			// Instantiating the array
			data = new String[100][10];
			// Creating a counter to keep track of the
			// row we're on
			int row = 0;

			// Loop through the result set
			while (rs1.next()) {

				// And then, adding the data to an array
				// data[row][0] = rs1.getString("Movie_id");
				data[row][0] = rs1.getString("Title");
				data[row][1] = rs1.getString("Singer");
				data[row][2] = rs1.getString("Type");

				// go the the next row
				row++;
			}

			// Close the result set, statement and the connection
			rs1.close();
			// rs2.close() ;
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			System.out.println("SQL Exception:");

			// Loop through the SQL Exceptions
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());

				se = se.getNextException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// Retuning the array of data
		return data;
	}

	// This method is only in charge of get data from database to print the
	// table

	public String[][] titleavailableliveconcert() {

		String[][] data = null;

		try {

			String dbServer = "jdbc:mysql://52.50.23.197:3306/jean";
			String user = "jean";
			String password = "Pass1234!";
			Connection conn = null;
			Statement stmt = null;

			String query1 = " SELECT Title, Band, Type FROM LiveConcert WHERE Rent= '" + false + "'";

			// Get a connection to the database
			conn = DriverManager.getConnection(dbServer, user, password);

			// Get a statement from the connection
			stmt = conn.createStatement();

			// Execute the query
			ResultSet rs1 = stmt.executeQuery(query1);
			// ResultSet rs2 = stmt.executeQuery(query2) ;

			// Instantiating the array
			data = new String[100][10];
			// Creating a counter to keep track of the
			// row we're on
			int row = 0;

			// Loop through the result set
			while (rs1.next()) {

				// And then, adding the data to an array
				// data[row][0] = rs1.getString("Movie_id");
				data[row][0] = rs1.getString("Title");
				data[row][1] = rs1.getString("Band");
				data[row][2] = rs1.getString("Type");

				// go the the next row
				row++;
			}

			// Close the result set, statement and the connection
			rs1.close();
			// rs2.close() ;
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			System.out.println("SQL Exception:");

			// Loop through the SQL Exceptions
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());

				se = se.getNextException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// Retuning the array of data
		return data;
	}

	public String[][] titleRentedliveconcert() {

		String[][] data = null;

		try {

			String dbServer = "jdbc:mysql://52.50.23.197:3306/jean";
			String user = "jean";
			String password = "Pass1234!";
			Connection conn = null;
			Statement stmt = null;

			String query1 = " SELECT Title, Band, Type FROM LiveConcert WHERE Rent= '" + true + "'";

			// Get a connection to the database
			conn = DriverManager.getConnection(dbServer, user, password);

			// Get a statement from the connection
			stmt = conn.createStatement();

			// Execute the query
			ResultSet rs1 = stmt.executeQuery(query1);
			// ResultSet rs2 = stmt.executeQuery(query2) ;

			// Instantiating the array
			data = new String[100][10];
			// Creating a counter to keep track of the
			// row we're on
			int row = 0;

			// Loop through the result set
			while (rs1.next()) {

				// And then, adding the data to an array
				// data[row][0] = rs1.getString("Movie_id");
				data[row][0] = rs1.getString("Title");
				data[row][1] = rs1.getString("Band");
				data[row][2] = rs1.getString("Type");

				// go the the next row
				row++;
			}

			// Close the result set, statement and the connection
			rs1.close();
			// rs2.close() ;
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			System.out.println("SQL Exception:");

			// Loop through the SQL Exceptions
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());

				se = se.getNextException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// Retuning the array of data
		return data;
	}

	// This method is only in charge of get data from database to print the
	// table

	public String[][] titleavailabletvbox() {

		String[][] data = null;

		try {

			String dbServer = "jdbc:mysql://52.50.23.197:3306/jean";
			String user = "jean";
			String password = "Pass1234!";
			Connection conn = null;
			Statement stmt = null;

			String query1 = " SELECT Title, NumberOfDisco,Season, Type FROM TVBox WHERE Rent= '" + false + "'";

			// String query2 = "SELECT Movie_id, Title, Director, Type FROM
			// Movie; ";

			// Get a connection to the database
			conn = DriverManager.getConnection(dbServer, user, password);

			// Get a statement from the connection
			stmt = conn.createStatement();

			// Execute the query
			ResultSet rs1 = stmt.executeQuery(query1);
			// ResultSet rs2 = stmt.executeQuery(query2) ;

			// Instantiating the array
			data = new String[100][10];
			// Creating a counter to keep track of the
			// row we're on
			int row = 0;

			// Loop through the result set
			while (rs1.next()) {

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
			rs1.close();
			// rs2.close() ;
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			System.out.println("SQL Exception:");

			// Loop through the SQL Exceptions
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());

				se = se.getNextException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// Retuning the array of data
		return data;
	}

	public String[][] titleRentedtvbox() {

		String[][] data = null;

		try {

			String dbServer = "jdbc:mysql://52.50.23.197:3306/jean";
			String user = "jean";
			String password = "Pass1234!";
			Connection conn = null;
			Statement stmt = null;

			String query1 = " SELECT Title, NumberOfDisco,Season, Type FROM TVBox WHERE Rent= '" + true + "'";

			// Get a connection to the database
			conn = DriverManager.getConnection(dbServer, user, password);

			// Get a statement from the connection
			stmt = conn.createStatement();

			// Execute the query
			ResultSet rs1 = stmt.executeQuery(query1);
			// ResultSet rs2 = stmt.executeQuery(query2) ;

			// Instantiating the array
			data = new String[100][10];
			// Creating a counter to keep track of the
			// row we're on
			int row = 0;

			// Loop through the result set
			while (rs1.next()) {

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
			rs1.close();
			// rs2.close() ;
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			System.out.println("SQL Exception:");

			// Loop through the SQL Exceptions
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());

				se = se.getNextException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// Retuning the array of data
		return data;
	}

	public String[][] rentTVBox() {

		String[][] data = null;

		try {

			String dbServer = "jdbc:mysql://52.50.23.197:3306/jean";
			String user = "jean";
			String password = "Pass1234!";
			Connection conn = null;
			Statement stmt = null;

			String query1 = " SELECT Title, NumberOfDisco,Season, Type, Price FROM TVBox WHERE Rent=False";

			// Get a connection to the database
			conn = DriverManager.getConnection(dbServer, user, password);

			// Get a statement from the connection
			stmt = conn.createStatement();

			// Execute the query
			ResultSet rs1 = stmt.executeQuery(query1);
			// ResultSet rs2 = stmt.executeQuery(query2) ;

			// Instantiating the array
			data = new String[100][10];
			// Creating a counter to keep track of the
			// row we're on
			int row = 0;

			// Loop through the result set
			while (rs1.next()) {

				// And then, adding the data to an array
				// data[row][0] = rs1.getString("Movie_id");
				data[row][0] = rs1.getString("Title");
				data[row][1] = rs1.getString("NumberOfDisco");
				data[row][2] = rs1.getString("Season");
				data[row][3] = rs1.getString("Type");
				data[row][4] = rs1.getString("Price");
				// go the the next row
				row++;
			}

			// Close the result set, statement and the connection
			rs1.close();
			// rs2.close() ;
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			System.out.println("SQL Exception:");

			// Loop through the SQL Exceptions
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());

				se = se.getNextException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// Retuning the array of data
		return data;
	}

	// This method is only in charge of get data from database to print the
	// table

	public String[][] rentTVBoxCustomer() {

		String[][] data = null;

		try {

			String dbServer = "jdbc:mysql://52.50.23.197:3306/jean";
			String user = "jean";
			String password = "Pass1234!";
			Connection conn = null;
			Statement stmt = null;

			String membership = "";
			membership = "(TV) Box Set";

			String membership2 = "";
			membership2 = "(PR) Premium";

			String query1 = "SELECT First_name, Last_name,cust_email,Tel, Membership FROM Customer WHERE Membership = '"
					+ membership + "'OR Membership= '" + membership2 + "'";

			// String query2 = "SELECT Movie_id, Title, Director, Type FROM
			// Movie; ";

			// Get a connection to the database
			conn = DriverManager.getConnection(dbServer, user, password);

			// Get a statement from the connection
			stmt = conn.createStatement();

			// Execute the query
			ResultSet rs1 = stmt.executeQuery(query1);
			// ResultSet rs2 = stmt.executeQuery(query2) ;

			// Instantiating the array
			data = new String[100][10];
			// Creating a counter to keep track of the
			// row we're on
			int row = 0;

			// Loop through the result set
			while (rs1.next()) {

				// And then, adding the data to an array
				// data[row][0] = rs1.getString("Movie_id");
				data[row][0] = rs1.getString("First_name");
				data[row][1] = rs1.getString("Last_name");
				data[row][2] = rs1.getString("cust_email");
				data[row][3] = rs1.getString("Tel");
				data[row][4] = rs1.getString("Membership");

				// go the the next row
				row++;
			}

			// Close the result set, statement and the connection
			rs1.close();
			// rs2.close() ;
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			System.out.println("SQL Exception:");

			// Loop through the SQL Exceptions
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());

				se = se.getNextException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// Retuning the array of data
		return data;
	}

	public String[][] rentMusicLive() {

		String[][] data = null;

		try {

			String dbServer = "jdbc:mysql://52.50.23.197:3306/jean";
			String user = "jean";
			String password = "Pass1234!";
			Connection conn = null;
			Statement stmt = null;

			String query1 = " SELECT Title, Singer, Type, Price FROM MusicLive WHERE Rent=False";

			// String query2 = "SELECT Movie_id, Title, Director, Type FROM
			// Movie; ";

			// Get a connection to the database
			conn = DriverManager.getConnection(dbServer, user, password);

			// Get a statement from the connection
			stmt = conn.createStatement();

			// Execute the query
			ResultSet rs1 = stmt.executeQuery(query1);
			// ResultSet rs2 = stmt.executeQuery(query2) ;

			// Instantiating the array
			data = new String[100][10];
			// Creating a counter to keep track of the
			// row we're on
			int row = 0;

			// Loop through the result set
			while (rs1.next()) {

				// And then, adding the data to an array
				// data[row][0] = rs1.getString("Movie_id");
				data[row][0] = rs1.getString("Title");
				data[row][1] = rs1.getString("Singer");
				data[row][2] = rs1.getString("Type");
				data[row][3] = rs1.getString("Price");

				// go the the next row
				row++;
			}

			// Close the result set, statement and the connection
			rs1.close();
			// rs2.close() ;
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			System.out.println("SQL Exception:");

			// Loop through the SQL Exceptions
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());

				se = se.getNextException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// Retuning the array of data
		return data;
	}

	public String[][] rentMusicLiveCustomer() {

		String[][] data = null;

		try {

			String dbServer = "jdbc:mysql://52.50.23.197:3306/jean";
			String user = "jean";
			String password = "Pass1234!";
			Connection conn = null;
			Statement stmt = null;

			String membership = "";
			membership = "(ML) Music Live & Live Concert Videos";

			String membership2 = "";
			membership2 = "(PR) Premium";

			String query1 = "SELECT First_name, Last_name,cust_email,Tel, Membership FROM Customer WHERE Membership = '"
					+ membership + "'OR Membership= '" + membership2 + "'";

			// String query2 = "SELECT Movie_id, Title, Director, Type FROM
			// Movie; ";

			// Get a connection to the database
			conn = DriverManager.getConnection(dbServer, user, password);

			// Get a statement from the connection
			stmt = conn.createStatement();

			// Execute the query
			ResultSet rs1 = stmt.executeQuery(query1);
			// ResultSet rs2 = stmt.executeQuery(query2) ;

			// Instantiating the array
			data = new String[100][10];
			// Creating a counter to keep track of the
			// row we're on
			int row = 0;

			// Loop through the result set
			while (rs1.next()) {

				// And then, adding the data to an array
				// data[row][0] = rs1.getString("Movie_id");
				data[row][0] = rs1.getString("First_name");
				data[row][1] = rs1.getString("Last_name");
				data[row][2] = rs1.getString("cust_email");
				data[row][3] = rs1.getString("Tel");
				data[row][4] = rs1.getString("Membership");

				// go the the next row
				row++;
			}

			// Close the result set, statement and the connection
			rs1.close();
			// rs2.close() ;
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			System.out.println("SQL Exception:");

			// Loop through the SQL Exceptions
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());

				se = se.getNextException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// Retuning the array of data
		return data;
	}

	public String[][] rentMovie() {

		String[][] data = null;

		try {

			String dbServer = "jdbc:mysql://52.50.23.197:3306/jean";
			String user = "jean";
			String password = "Pass1234!";
			Connection conn = null;
			Statement stmt = null;

			String query1 = " SELECT Title, Director, Type, Price FROM Movie WHERE Rent=False";

			// String query2 = "SELECT Movie_id, Title, Director, Type FROM
			// Movie; ";

			// Get a connection to the database
			conn = DriverManager.getConnection(dbServer, user, password);

			// Get a statement from the connection
			stmt = conn.createStatement();

			// Execute the query
			ResultSet rs1 = stmt.executeQuery(query1);
			// ResultSet rs2 = stmt.executeQuery(query2) ;

			// Instantiating the array
			data = new String[100][10];
			// Creating a counter to keep track of the
			// row we're on
			int row = 0;

			// Loop through the result set
			while (rs1.next()) {

				// And then, adding the data to an array
				// data[row][0] = rs1.getString("Movie_id");
				data[row][0] = rs1.getString("Title");
				data[row][1] = rs1.getString("Director");
				data[row][2] = rs1.getString("Type");
				data[row][3] = rs1.getString("Price");
				// go the the next row
				row++;
			}

			// Close the result set, statement and the connection
			rs1.close();
			// rs2.close() ;
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			System.out.println("SQL Exception:");

			// Loop through the SQL Exceptions
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());

				se = se.getNextException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// Retuning the array of data
		return data;
	}

	// This method is only in charge of get data from database to print the
	// table

	public String[][] rentMovieCustomer() {

		String[][] data = null;

		try {

			String dbServer = "jdbc:mysql://52.50.23.197:3306/jean";
			String user = "jean";
			String password = "Pass1234!";
			Connection conn = null;
			Statement stmt = null;

			String membership = "";
			membership = "(VL) Movie";

			String membership2 = "";
			membership2 = "(PR) Premium";

			String query1 = "SELECT First_name, Last_name,cust_email,Tel, Membership FROM Customer WHERE Membership = '"
					+ membership + "'OR Membership= '" + membership2 + "'";

			// String query2 = "SELECT Movie_id, Title, Director, Type FROM
			// Movie; ";

			// Get a connection to the database
			conn = DriverManager.getConnection(dbServer, user, password);

			// Get a statement from the connection
			stmt = conn.createStatement();

			// Execute the query
			ResultSet rs1 = stmt.executeQuery(query1);
			// ResultSet rs2 = stmt.executeQuery(query2) ;

			// Instantiating the array
			data = new String[100][10];
			// Creating a counter to keep track of the
			// row we're on
			int row = 0;

			// Loop through the result set
			while (rs1.next()) {

				// And then, adding the data to an array
				// data[row][0] = rs1.getString("Movie_id");
				data[row][0] = rs1.getString("First_name");
				data[row][1] = rs1.getString("Last_name");
				data[row][2] = rs1.getString("cust_email");
				data[row][3] = rs1.getString("Tel");
				data[row][4] = rs1.getString("Membership");

				// go the the next row
				row++;
			}

			// Close the result set, statement and the connection
			rs1.close();
			// rs2.close() ;
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			System.out.println("SQL Exception:");

			// Loop through the SQL Exceptions
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());

				se = se.getNextException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// Retuning the array of data
		return data;
	}

	public String[][] rentLiveConcert() {

		String[][] data = null;

		try {

			String dbServer = "jdbc:mysql://52.50.23.197:3306/jean";
			String user = "jean";
			String password = "Pass1234!";
			Connection conn = null;
			Statement stmt = null;

			String query1 = " SELECT  LiveConcert_id, Title, Band, Type, Price FROM LiveConcert WHERE Rent=False ";

			// String query2 = "SELECT Movie_id, Title, Director, Type FROM
			// Movie; ";

			// Get a connection to the database
			conn = DriverManager.getConnection(dbServer, user, password);

			// Get a statement from the connection
			stmt = conn.createStatement();

			// Execute the query
			ResultSet rs1 = stmt.executeQuery(query1);
			// ResultSet rs2 = stmt.executeQuery(query2) ;

			// Instantiating the array
			data = new String[100][10];
			// Creating a counter to keep track of the
			// row we're on
			int row = 0;

			// Loop through the result set
			while (rs1.next()) {

				// And then, adding the data to an array
				data[row][0] = rs1.getString("LiveConcert_id");
				data[row][1] = rs1.getString("Title");
				data[row][2] = rs1.getString("Band");
				data[row][3] = rs1.getString("Type");
				data[row][4] = rs1.getString("Price");

				// go the the next row
				row++;
			}

			// Close the result set, statement and the connection
			rs1.close();
			// rs2.close() ;
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			System.out.println("SQL Exception:");

			// Loop through the SQL Exceptions
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());

				se = se.getNextException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// Retuning the array of data
		return data;
	}

	// This method is only in charge of get data from database to print the
	// table

	public String[][] rentLiveConcertCustomer() {

		String[][] data = null;

		try {

			String dbServer = "jdbc:mysql://52.50.23.197:3306/jean";
			String user = "jean";
			String password = "Pass1234!";
			Connection conn = null;
			Statement stmt = null;

			String membership = "";
			membership = "(ML) Music Live & Live Concert Videos";

			String membership2 = "";
			membership2 = "(PR) Premium";

			String query1 = "SELECT cust_id, First_name, Last_name,cust_email,Tel, Membership FROM Customer WHERE Membership ='"
					+ membership + "'OR Membership= '" + membership2 + "'";
			// String query2 = "SELECT Movie_id, Title, Director, Type FROM
			// Movie; ";

			// Get a connection to the database
			conn = DriverManager.getConnection(dbServer, user, password);

			// Get a statement from the connection
			stmt = conn.createStatement();

			// Execute the query
			ResultSet rs1 = stmt.executeQuery(query1);
			// ResultSet rs2 = stmt.executeQuery(query2) ;

			// Instantiating the array
			data = new String[100][10];
			// Creating a counter to keep track of the
			// row we're on
			int row = 0;

			// Loop through the result set
			while (rs1.next()) {

				// And then, adding the data to an array
				// data[row][0] = rs1.getString("Movie_id");
				data[row][0] = rs1.getString("cust_id");
				data[row][1] = rs1.getString("First_name");
				data[row][2] = rs1.getString("Last_name");
				data[row][3] = rs1.getString("cust_email");
				data[row][4] = rs1.getString("Tel");
				data[row][5] = rs1.getString("Membership");

				// go the the next row
				row++;
			}

			// Close the result set, statement and the connection
			rs1.close();
			// rs2.close() ;
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			System.out.println("SQL Exception:");

			// Loop through the SQL Exceptions
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());

				se = se.getNextException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// Retuning the array of data
		return data;

	}

	public boolean selectedLiveConcertCustomer(String selectedID, String customerChoosed,
			String formattedTextFieldRentedDate, String formattedTextFieldReturnDateMovie) {

		boolean customer = false;
		try {
			// Building the query
			String query = "INSERT INTO Rented (cust_id, LiveConcert_id, DataRented, DataReturn) " + "VALUES ('"
					+ customerChoosed + "','" + selectedID + "', '" + formattedTextFieldRentedDate + "', '"
					+ formattedTextFieldReturnDateMovie + "');";

			// Sending the query to the database
			customer = ((java.sql.Statement) stmt).execute(query);

		} catch (SQLException se) {
			System.out.println("SQL Exception:");

			// Loop through the SQL Exceptions
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());

				se = se.getNextException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// Retuning the login status
		return customer;
	}

	public String[][] searchLiveConcert(String st) {

		String[][] data = null;

		try {

			String dbServer = "jdbc:mysql://52.50.23.197:3306/jean";
			String user = "jean";
			String password = "Pass1234!";
			Connection conn = null;
			Statement stmt = null;

			String query1 = " SELECT LiveConcert_id, Title, Band, Type, Price FROM LiveConcert WHERE Title LIKE '%" + st
					+ "%' AND Rent= '" + false + "' ";

			// Get a connection to the database
			conn = DriverManager.getConnection(dbServer, user, password);

			// Get a statement from the connection
			stmt = conn.createStatement();

			// Execute the query
			ResultSet rs1 = stmt.executeQuery(query1);
			// ResultSet rs2 = stmt.executeQuery(query2) ;

			// Instantiating the array
			data = new String[100][10];
			// Creating a counter to keep track of the
			// row we're on
			int row = 0;

			// Loop through the result set
			while (rs1.next()) {

				// And then, adding the data to an array
				// data[row][0] = rs1.getString("Movie_id");
				data[row][0] = rs1.getString("LiveConcert_id");
				data[row][1] = rs1.getString("Title");
				data[row][2] = rs1.getString("Band");
				data[row][3] = rs1.getString("Type");
				data[row][4] = rs1.getString("Price");

				// go the the next row
				row++;
			}

			// Close the result set, statement and the connection
			rs1.close();
			// rs2.close() ;
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			System.out.println("SQL Exception:");

			// Loop through the SQL Exceptions
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());

				se = se.getNextException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// Retuning the array of data
		return data;

	}

	public String[][] searchtLiveConcertCustomer(String st2) {

		String[][] data = null;

		try {

			String dbServer = "jdbc:mysql://52.50.23.197:3306/jean";
			String user = "jean";
			String password = "Pass1234!";
			Connection conn = null;
			Statement stmt = null;

			// TitlesAvailable available = new TitlesAvailable();

			///
			// String selectitem = available.getComboBox();
			String membership = "";
			membership = "(ML) Music Live & Live Concert Videos";

			String membership2 = "";
			membership2 = "(PR) Premium";

			String query1 = "SELECT cust_id, First_name, Last_name,cust_email,Tel, Membership FROM Customer WHERE First_name LIKE '%"
					+ st2 + "%' AND Membership= '" + membership + "'OR Membership= '" + membership2 + "'";
			// String query2 = "SELECT Movie_id, Title, Director, Type FROM
			// Movie; ";

			// Get a connection to the database
			conn = DriverManager.getConnection(dbServer, user, password);

			// Get a statement from the connection
			stmt = conn.createStatement();

			// Execute the query
			ResultSet rs1 = stmt.executeQuery(query1);
			// ResultSet rs2 = stmt.executeQuery(query2) ;

			// Instantiating the array
			data = new String[100][10];
			// Creating a counter to keep track of the
			// row we're on
			int row = 0;

			// Loop through the result set
			while (rs1.next()) {

				// And then, adding the data to an array
				// data[row][0] = rs1.getString("Movie_id");
				data[row][0] = rs1.getString("cust_id");
				data[row][1] = rs1.getString("First_name");
				data[row][2] = rs1.getString("Last_name");
				data[row][3] = rs1.getString("cust_email");
				data[row][4] = rs1.getString("Tel");
				data[row][5] = rs1.getString("Membership");

				// go the the next row
				row++;
			}

			// Close the result set, statement and the connection
			rs1.close();
			// rs2.close() ;
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			System.out.println("SQL Exception:");

			// Loop through the SQL Exceptions
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());

				se = se.getNextException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// Retuning the array of data
		return data;

	}

	public String[][] searchMovie(String st) {

		String[][] data = null;

		try {

			String dbServer = "jdbc:mysql://52.50.23.197:3306/jean";
			String user = "jean";
			String password = "Pass1234!";
			Connection conn = null;
			Statement stmt = null;

			String query1 = " SELECT Movie_id ,Title, Director, Type, Price FROM Movie WHERE Title LIKE '%" + st
					+ "%' AND Rent= '" + false + "' ";

			// String query2 = "SELECT Movie_id, Title, Director, Type FROM
			// Movie; ";

			// Get a connection to the database
			conn = DriverManager.getConnection(dbServer, user, password);

			// Get a statement from the connection
			stmt = conn.createStatement();

			// Execute the query
			ResultSet rs1 = stmt.executeQuery(query1);
			// ResultSet rs2 = stmt.executeQuery(query2) ;

			// Instantiating the array
			data = new String[100][10];
			// Creating a counter to keep track of the
			// row we're on
			int row = 0;

			// Loop through the result set
			while (rs1.next()) {

				// And then, adding the data to an array
				// data[row][0] = rs1.getString("Movie_id");
				data[row][0] = rs1.getString("Movie_id");
				data[row][1] = rs1.getString("Title");
				data[row][2] = rs1.getString("Director");
				data[row][3] = rs1.getString("Type");
				data[row][4] = rs1.getString("Price");

				// go the the next row
				row++;
			}

			// Close the result set, statement and the connection
			rs1.close();
			// rs2.close() ;
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			System.out.println("SQL Exception:");

			// Loop through the SQL Exceptions
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());

				se = se.getNextException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// Retuning the array of data
		return data;

	}

	public boolean selectedMovieCustomer(String selectedID, String customerChoosed, String formattedTextFieldRentedDate,
			String formattedTextFieldReturnDateMovie) {

		boolean customer = false;
		try {
			// Building the query
			String query = "INSERT INTO Rented (cust_id, Movie_id, DataRented, DataReturn) " + "VALUES ('"
					+ customerChoosed + "','" + selectedID + "', '" + formattedTextFieldRentedDate + "', '"
					+ formattedTextFieldReturnDateMovie + "');";

			// Sending the query to the database
			customer = ((java.sql.Statement) stmt).execute(query);

		} catch (SQLException se) {
			System.out.println("SQL Exception:");

			// Loop through the SQL Exceptions
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());

				se = se.getNextException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// Retuning the login status
		return customer;
	}

	public String[][] searchMovieCustomer(String st2) {

		String[][] data = null;

		try {

			String dbServer = "jdbc:mysql://52.50.23.197:3306/jean";
			String user = "jean";
			String password = "Pass1234!";
			Connection conn = null;
			Statement stmt = null;

			String membership = "";
			membership = "(VL) Movie";

			String membership2 = "";
			membership2 = "(PR) Premium";

			String query1 = "SELECT cust_id, First_name, Last_name,cust_email,Tel, Membership FROM Customer WHERE First_name LIKE '%"
					+ st2 + "%' AND Membership= '" + membership + "'OR Membership= '" + membership2 + "'";

			// Get a connection to the database
			conn = DriverManager.getConnection(dbServer, user, password);

			// Get a statement from the connection
			stmt = conn.createStatement();

			// Execute the query
			ResultSet rs1 = stmt.executeQuery(query1);
			// ResultSet rs2 = stmt.executeQuery(query2) ;

			// Instantiating the array
			data = new String[100][10];
			// Creating a counter to keep track of the
			// row we're on
			int row = 0;

			// Loop through the result set
			while (rs1.next()) {

				// And then, adding the data to an array
				// data[row][0] = rs1.getString("Movie_id");
				data[row][0] = rs1.getString("cust_id");
				data[row][1] = rs1.getString("First_name");
				data[row][2] = rs1.getString("Last_name");
				data[row][3] = rs1.getString("cust_email");
				data[row][4] = rs1.getString("Tel");
				data[row][5] = rs1.getString("Membership");

				// go the the next row
				row++;
			}

			// Close the result set, statement and the connection
			rs1.close();
			// rs2.close() ;
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			System.out.println("SQL Exception:");

			// Loop through the SQL Exceptions
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());

				se = se.getNextException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// Retuning the array of data
		return data;

	}

	public boolean selectedMusicliveCustomer(String selectedID, String customerChoosed,
			String formattedTextFieldRentedDateMusicLive, String FormattedTextFieldReturnDateMusicLive) {

		boolean customer = false;
		try {
			// Building the query
			String query = "INSERT INTO Rented (cust_id, Music_id, DataRented, DataReturn) " + "VALUES ('"
					+ customerChoosed + "','" + selectedID + "', '" + formattedTextFieldRentedDateMusicLive + "', '"
					+ FormattedTextFieldReturnDateMusicLive + "');";

			// Sending the query to the database
			customer = ((java.sql.Statement) stmt).execute(query);

		} catch (SQLException se) {
			System.out.println("SQL Exception:");

			// Loop through the SQL Exceptions
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());

				se = se.getNextException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// Retuning the login status
		return customer;
	}

	public String[][] searchMusicLive(String st) {

		String[][] data = null;

		try {

			String dbServer = "jdbc:mysql://52.50.23.197:3306/jean";
			String user = "jean";
			String password = "Pass1234!";
			Connection conn = null;
			Statement stmt = null;

			String query1 = " SELECT Music_id, Title, Singer, Type, Price FROM MusicLive WHERE Title LIKE  '%" + st
					+ "%' AND Rent= '" + false + "' ";

			// String query2 = "SELECT Movie_id, Title, Director, Type FROM
			// Movie; ";

			// Get a connection to the database
			conn = DriverManager.getConnection(dbServer, user, password);

			// Get a statement from the connection
			stmt = conn.createStatement();

			// Execute the query
			ResultSet rs1 = stmt.executeQuery(query1);
			// ResultSet rs2 = stmt.executeQuery(query2) ;

			// Instantiating the array
			data = new String[100][10];
			// Creating a counter to keep track of the
			// row we're on
			int row = 0;

			// Loop through the result set
			while (rs1.next()) {

				// And then, adding the data to an array
				// data[row][0] = rs1.getString("Movie_id");
				data[row][0] = rs1.getString("Music_id");
				data[row][1] = rs1.getString("Title");
				data[row][2] = rs1.getString("Singer");
				data[row][3] = rs1.getString("Type");
				data[row][4] = rs1.getString("Price");

				// go the the next row
				row++;
			}

			// Close the result set, statement and the connection
			rs1.close();
			// rs2.close() ;
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			System.out.println("SQL Exception:");

			// Loop through the SQL Exceptions
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());

				se = se.getNextException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// Retuning the array of data
		return data;

	}

	public String[][] searchMusicliveCustomer(String st2) {

		String[][] data = null;

		try {

			String dbServer = "jdbc:mysql://52.50.23.197:3306/jean";
			String user = "jean";
			String password = "Pass1234!";
			Connection conn = null;
			Statement stmt = null;

			// TitlesAvailable available = new TitlesAvailable();

			///
			// String selectitem = available.getComboBox();
			String membership = "";
			membership = "(ML) Music Live & Live Concert Videos";
			String membership2 = "";
			membership2 = "(PR) Premium";

			String query1 = "SELECT cust_id, First_name, Last_name,cust_email,Tel, Membership FROM Customer WHERE First_name LIKE '%"
					+ st2 + "%' AND Membership= '" + membership + "'OR Membership= '" + membership2 + "'";
			// String query2 = "SELECT Movie_id, Title, Director, Type FROM
			// Movie; ";

			// Get a connection to the database
			conn = DriverManager.getConnection(dbServer, user, password);

			// Get a statement from the connection
			stmt = conn.createStatement();

			// Execute the query
			ResultSet rs1 = stmt.executeQuery(query1);
			// ResultSet rs2 = stmt.executeQuery(query2) ;

			// Instantiating the array
			data = new String[100][10];
			// Creating a counter to keep track of the
			// row we're on
			int row = 0;

			// Loop through the result set
			while (rs1.next()) {

				// And then, adding the data to an array
				// data[row][0] = rs1.getString("Movie_id");
				data[row][0] = rs1.getString("cust_id");
				data[row][1] = rs1.getString("First_name");
				data[row][2] = rs1.getString("Last_name");
				data[row][3] = rs1.getString("cust_email");
				data[row][4] = rs1.getString("Tel");
				data[row][5] = rs1.getString("Membership");

				// go the the next row
				row++;
			}

			// Close the result set, statement and the connection
			rs1.close();
			// rs2.close() ;
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			System.out.println("SQL Exception:");

			// Loop through the SQL Exceptions
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());

				se = se.getNextException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// Retuning the array of data
		return data;

	}

	public boolean selectedTVBoxCustomer(String selectedID, String customerChoosed, String formattedTextFieldRentedDate,
			String formattedTextFieldReturnDateMovie) {

		boolean customer = false;
		try {
			// Building the query
			String query = "INSERT INTO Rented (cust_id, TVBox_id, DataRented, DataReturn) " + "VALUES ('"
					+ customerChoosed + "','" + selectedID + "', '" + formattedTextFieldRentedDate + "', '"
					+ formattedTextFieldReturnDateMovie + "');";

			// Sending the query to the database
			customer = ((java.sql.Statement) stmt).execute(query);

		} catch (SQLException se) {
			System.out.println("SQL Exception:");

			// Loop through the SQL Exceptions
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());

				se = se.getNextException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// Retuning the login status
		return customer;
	}

	public String[][] searchTVBox(String st) {

		String[][] data = null;

		try {

			String dbServer = "jdbc:mysql://52.50.23.197:3306/jean";
			String user = "jean";
			String password = "Pass1234!";
			Connection conn = null;
			Statement stmt = null;

			String query1 = " SELECT TVBox_id, Title, YearOfRelease, Season, Type, Price FROM TVBox WHERE Title LIKE '%"
					+ st + "%' AND Rent= '" + false + "' ";

			// String query2 = "SELECT Movie_id, Title, Director, Type FROM
			// Movie; ";

			// Get a connection to the database
			conn = DriverManager.getConnection(dbServer, user, password);

			// Get a statement from the connection
			stmt = conn.createStatement();

			// Execute the query
			ResultSet rs1 = stmt.executeQuery(query1);
			// ResultSet rs2 = stmt.executeQuery(query2) ;

			// Instantiating the array
			data = new String[100][10];
			// Creating a counter to keep track of the
			// row we're on
			int row = 0;

			// Loop through the result set
			while (rs1.next()) {

				// And then, adding the data to an array
				// data[row][0] = rs1.getString("Movie_id");
				data[row][0] = rs1.getString("TVBox_id");
				data[row][1] = rs1.getString("Title");
				data[row][2] = rs1.getString("YearOfRelease");
				data[row][3] = rs1.getString("Season");
				data[row][4] = rs1.getString("Type");
				data[row][5] = rs1.getString("Price");
				// go the the next row
				row++;
			}

			// Close the result set, statement and the connection
			rs1.close();
			// rs2.close() ;
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			System.out.println("SQL Exception:");

			// Loop through the SQL Exceptions
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());

				se = se.getNextException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// Retuning the array of data
		return data;

	}

	public String[][] searchTVBoxCustomer(String st2) {

		String[][] data = null;

		try {

			String dbServer = "jdbc:mysql://52.50.23.197:3306/jean";
			String user = "jean";
			String password = "Pass1234!";
			Connection conn = null;
			Statement stmt = null;

			// TitlesAvailable available = new TitlesAvailable();

			///
			// String selectitem = available.getComboBox();
			String membership = "";
			membership = "(TV) Box Set";
			String membership2 = "";
			membership2 = "(PR) Premium";

			String query1 = "SELECT cust_id, First_name, Last_name,cust_email,Tel, Membership FROM Customer WHERE First_name LIKE '%"
					+ st2 + "%' AND Membership= '" + membership + "'OR Membership= '" + membership2 + "'";
			// String query2 = "SELECT Movie_id, Title, Director, Type FROM
			// Movie; ";

			// Get a connection to the database
			conn = DriverManager.getConnection(dbServer, user, password);

			// Get a statement from the connection
			stmt = conn.createStatement();

			// Execute the query
			ResultSet rs1 = stmt.executeQuery(query1);
			// ResultSet rs2 = stmt.executeQuery(query2) ;

			// Instantiating the array
			data = new String[100][10];
			// Creating a counter to keep track of the
			// row we're on
			int row = 0;

			// Loop through the result set
			while (rs1.next()) {

				// And then, adding the data to an array
				// data[row][0] = rs1.getString("Movie_id");
				data[row][0] = rs1.getString("cust_id");
				data[row][1] = rs1.getString("First_name");
				data[row][2] = rs1.getString("Last_name");
				data[row][3] = rs1.getString("cust_email");
				data[row][4] = rs1.getString("Tel");
				data[row][5] = rs1.getString("Membership");

				// go the the next row
				row++;
			}

			// Close the result set, statement and the connection
			rs1.close();
			// rs2.close() ;
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			System.out.println("SQL Exception:");

			// Loop through the SQL Exceptions
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());

				se = se.getNextException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// Retuning the array of data
		return data;

	}

	public boolean updatetableliveconcert(String selectedID) {

		boolean updateliveconcert = false;
		try {
			// Building the query
			String query = "UPDATE LiveConcert SET Rent = '" + true + "'  WHERE LiveConcert_id = '" + selectedID + "'";

			// Sending the query to the database
			updateliveconcert = ((java.sql.Statement) stmt).execute(query);

		} catch (SQLException se) {
			System.out.println("SQL Exception:");

			// Loop through the SQL Exceptions
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());

				se = se.getNextException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// Retuning the login status
		return updateliveconcert;
	}

	public boolean updatetableMovie(String selectedID) {

		boolean updateliveconcert = false;
		try {
			// Building the query
			String query = "UPDATE Movie SET Rent = '" + true + "'  WHERE Movie_id = '" + selectedID + "'";

			// Sending the query to the database
			updateliveconcert = ((java.sql.Statement) stmt).execute(query);

		} catch (SQLException se) {
			System.out.println("SQL Exception:");

			// Loop through the SQL Exceptions
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());

				se = se.getNextException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// Retuning the login status
		return updateliveconcert;
	}

	public boolean updatetableMusicLive(String selectedID) {

		boolean updateliveconcert = false;
		try {
			// Building the query
			String query = "UPDATE MusicLive SET Rent = '" + true + "'  WHERE Music_id = '" + selectedID + "'";

			// Sending the query to the database
			updateliveconcert = ((java.sql.Statement) stmt).execute(query);

		} catch (SQLException se) {
			System.out.println("SQL Exception:");

			// Loop through the SQL Exceptions
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());

				se = se.getNextException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// Retuning the login status
		return updateliveconcert;
	}

	public boolean updatetableTVBox(String selectedID) {

		boolean updateliveconcert = false;
		try {
			// Building the query
			String query = "UPDATE TVBox SET Rent = '" + true + "'  WHERE TVBox_id = '" + selectedID + "'";

			// Sending the query to the database
			updateliveconcert = ((java.sql.Statement) stmt).execute(query);

		} catch (SQLException se) {
			System.out.println("SQL Exception:");

			// Loop through the SQL Exceptions
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());

				se = se.getNextException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// Retuning the login status
		return updateliveconcert;
	}

	public int getCustomerIO(String email) throws SQLException {

		int cust_id = 0;

		String dbServer = "jdbc:mysql://52.50.23.197:3306/jean";
		String user = "jean";
		String password = "Pass1234!";
		Connection conn = null;
		Statement stmt = null;

		String query = "SELECT cust_id FROM Customer WHERE cust_email = '" + email + "'";
		conn = DriverManager.getConnection(dbServer, user, password);

		// Get a statement from the connection
		stmt = conn.createStatement();

		// Execute the query
		ResultSet rs = stmt.executeQuery(query);

		try {

			while (rs.next()) {
				cust_id = rs.getInt("cust_id");

			}
		} catch (Exception e) {

		}

		return cust_id;

	}

	public String[][] cardPoints(int cust_id, String email) throws SQLException {

		String[][] data = null;

		String dbServer = "jdbc:mysql://52.50.23.197:3306/jean";
		String user = "jean";
		String password = "Pass1234!";
		Connection conn = null;

		String query1 = "SELECT  * FROM LoyaltyCard  WHERE cust_id= '" + cust_id + "'";

		conn = DriverManager.getConnection(dbServer, user, password);

		// Execute the query
		ResultSet rs1 = stmt.executeQuery(query1);
		// ResultSet rs2 = stmt.executeQuery(query2) ;

		// Instantiating the array
		data = new String[100][10];
		// Creating a counter to keep track of the
		// row we're on
		int row = 0;

		// Loop through the result set
		while (rs1.next()) {

			// And then, adding the data to an array
			// data[row][0] = rs1.getString("Movie_id");
			data[row][0] = rs1.getString("cust_id");
			data[row][1] = email;
			data[row][2] = rs1.getString("LoyaltyCard_id");
			data[row][3] = rs1.getString("Points");

			// go the the next row
			row++;
		}

		// Close the result set, statement and the connection
		rs1.close();
		// rs2.close() ;
		stmt.close();
		conn.close();

		// Retuning the array of data
		return data;

	}

	public boolean updatePoints(String customerChoosed, MembershipCard mCard, int newPoints) {

		int oldPoints = mCard.getPoints();
		int sumOfPoints = oldPoints + newPoints;

		boolean updatecustomerpoints = false;
		try {
			// Building the query
			String query = "UPDATE LoyaltyCard SET Points = '" + sumOfPoints + "'  WHERE cust_id = '" + customerChoosed
					+ "'";

			// Sending the query to the database
			updatecustomerpoints = ((java.sql.Statement) stmt).execute(query);

		} catch (SQLException se) {
			System.out.println("SQL Exception:");

			// Loop through the SQL Exceptions
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());

				se = se.getNextException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// Retuning the login status
		return updatecustomerpoints;
	}

	public MembershipCard getMembershipPoints(String customerChoosed) {

		int cardID = 0;
		int cardPoints = 0;

		try {
			// Building the query
			String query = "Select * FROM LoyaltyCard WHERE cust_id = '" + customerChoosed + "'";

			conn = DriverManager.getConnection(dbServer, user, password);

			// Get a statement from the connection
			stmt = conn.createStatement();

			// Execute the query
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				cardID = rs.getInt("LoyaltyCard_id");
				cardPoints = rs.getInt("Points");

			}
		} catch (Exception e) {

		}
		MembershipCard mCard = new MembershipCard(cardPoints, cardID);

		return mCard;

	}

	public boolean Login(Employee EmployeeLogged) {

		// Variable to define if the login is successful
		boolean login = false;
		try {
			// Building the query
			String query = "SELECT Employee_username, Employee_password FROM employee WHERE Employee_username = '"
					+ EmployeeLogged.getUsername() + "' AND Employee_password = '" + EmployeeLogged.getPassword()
					+ "';";

			// Sending the query to the database
			ResultSet rs = stmt.executeQuery(query);

			// If there is an entry in the database that satisfies
			// the username and password, then the login is successful
			// otherwise it fails
			login = rs.next();

			// Close the result set, statement and the connection
			rs.close();

			// Calling the method in charge of closing the connections
			closings();

		} catch (SQLException se) {
			System.out.println("SQL Exception:");

			// Loop through the SQL Exceptions
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());

				se = se.getNextException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// Retuning the login status
		return login;
	}

	// This method is only in charge of saving a new user into the the DB

	// Separeating closing statements for better code structure
	private void closings() {
		try {
			stmt.close();
			conn.close();
		} catch (SQLException ex) {
			Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public String[][] searchcustomerupdate(String st) {
		String[][] data = null;

		try {

			String dbServer = "jdbc:mysql://52.50.23.197:3306/jean";
			String user = "jean";
			String password = "Pass1234!";
			Connection conn = null;
			Statement stmt = null;

			String query1 = "SELECT * FROM Customer WHERE cust_email ='" + st + "'";

			// Get a connection to the database
			conn = DriverManager.getConnection(dbServer, user, password);

			// Get a statement from the connection
			stmt = conn.createStatement();

			// Execute the query
			ResultSet rs1 = stmt.executeQuery(query1);
			// ResultSet rs2 = stmt.executeQuery(query2) ;

			// Instantiating the array
			data = new String[100][10];
			// Creating a counter to keep track of the
			// row we're on
			int row = 0;

			// Loop through the result set
			while (rs1.next()) {

				// And then, adding the data to an array
				// data[row][0] = rs1.getString("Movie_id");
				data[row][0] = rs1.getString("cust_id");
				data[row][1] = rs1.getString("First_name");
				data[row][2] = rs1.getString("Last_name");
				data[row][3] = rs1.getString("cust_email");
				data[row][4] = rs1.getString("Tel");
				data[row][5] = rs1.getString("Membership");
				data[row][6] = rs1.getString("Card_number");

				// go the the next row
				row++;
			}

			// Close the result set, statement and the connection
			rs1.close();
			// rs2.close() ;
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			System.out.println("SQL Exception:");

			// Loop through the SQL Exceptions
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());

				se = se.getNextException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// Retuning the array of data
		return data;

	}

	public boolean updatecustomerdetails(String selectedID, String textFieldFirstName, String textFieldLastName,
			String textFieldEmail, String TextFieldTelephone, String TextFieldCardNumber, String comboBoxMembership) {

		boolean customer = false;
		try {
			// Building the query
			String query = "UPDATE Customer   SET  First_name = '" + textFieldFirstName + "', Last_name = '"
					+ textFieldLastName + "', cust_email=  '" + textFieldEmail + "',Tel= '" + TextFieldTelephone
					+ "', Membership = '" + comboBoxMembership + "',Card_number = '" + TextFieldCardNumber + "'"
					+ "WHERE cust_id='" + selectedID + "'";

			// Sending the query to the database
			customer = ((java.sql.Statement) stmt).execute(query);

		} catch (SQLException se) {
			System.out.println("SQL Exception:");

			// Loop through the SQL Exceptions
			while (se != null) {
				System.out.println("State  : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error  : " + se.getErrorCode());

				se = se.getNextException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return customer;
		// TODO Auto-generated method stub

	}

}
