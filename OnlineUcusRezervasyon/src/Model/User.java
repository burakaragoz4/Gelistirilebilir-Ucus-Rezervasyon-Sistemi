package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Service.DataBaseConnection;

public class User {
	DataBaseConnection conn = new DataBaseConnection();
	Connection con = conn.connDb();
	Statement st= null;
	ResultSet rs= null;
	PreparedStatement preparedStatement = null;
	
	private int id;
	private String name;
	private String lastName;
	private String password;
	private String dateofbirth;
	private String eMail;
	private String identitynumber;
	
	public User() {}
	
	
	public boolean addUser(int id ,String name ,String lastName,String identitynumber,String password,String dateofbirth,String eMail) throws SQLException {
			
		Connection con = conn.connDb();
		Statement st= null;
		ResultSet rs= null;
		String query = "INSERT INTO customer"+ "(name,lastname,identitynumber,password,dateofbirth,email) VALUES" + "(?,?,?,?,?,?)";
		boolean key = false;
		
		try {
			st = con.createStatement();
			preparedStatement = con.prepareStatement(query);
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, lastName);
			preparedStatement.setString(3, identitynumber);
			preparedStatement.setString(4, password);
			preparedStatement.setString(5, dateofbirth);
			preparedStatement.setString(6,eMail);
			preparedStatement.executeUpdate();
			/*
			preparedStatement  veri yapýsýna deðer atarken kullandýðýmýz bir method  */
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(key)
			return true;
		
		else 
			return false;
		
	}

	public User(int id,String name, String lastName, String password, String dateofbirth, String eMail,
			String identitynumber) {
		super();
		this.id=id;
		this.name = name;
		this.lastName = lastName;
		this.password = password;
		this.dateofbirth = dateofbirth;
		this.eMail = eMail;
		this.identitynumber = identitynumber;
	}

	public int getId() {
		
		return id;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getIdentitynumber() {
		return identitynumber;
	}

	public void setIdentitynumber(String identitynumber) {
		this.identitynumber = identitynumber;
	}

	
		
	

}
