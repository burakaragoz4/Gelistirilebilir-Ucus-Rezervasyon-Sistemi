package Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


	public class DataBaseConnection {

		Connection c = null;
		
		String url ="jdbc:mysql://localhost:1907/onlinerezervasyonsistemi";
		public Connection connDb() {
			try {
				
			this.c=DriverManager.getConnection(url,"root","09180918Burak");
		
		}catch (SQLException e) {
			e.printStackTrace();
		}
			return c;
		}
		
	}
