package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Admin extends User {
	Connection connn = conn.connDb();
	Statement st= null;
	ResultSet rs= null;
	PreparedStatement preparedStatement = null;
	
	private int id;
	private String admin_name;
	private String admin_password;
	public Admin() {}
	
	public ArrayList<User> getUserList() throws SQLException{
	ArrayList<User> list = new ArrayList<>();
		User obj;
		try {
			st = connn.createStatement();
			rs= st.executeQuery("SELECT * FROM customer ");
			while(rs.next()) {
				obj= new User(rs.getInt("id_customer"),rs.getString("name"),rs.getString("lastname"),rs.getString("password"),rs.getString("email"),rs.getString("dateofbirth"),rs.getString("identitynumber"));
				list.add(obj);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}finally {
			st.close();
			rs.close();
			
			
		}
		return list;
	
	}
	
	public Admin(int id, String admin_name, String admin_password) {
		super();
		this.id = id;
		this.admin_name = admin_name;
		this.admin_password = admin_password;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getAdmin_password() {
		return admin_password;
	}
	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}
	
}
