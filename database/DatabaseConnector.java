package database;

import java.sql.*;
import com.mysql.jdbc.Driver;

public class DatabaseConnector {

	public static Connection getDatabase() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms1", "root", "");
				if(con!=null)
				{
					System.out.println("Success");
				}
			return con;
		} catch (Exception e) {
			System.out.println("error in db creation");
			System.out.println(e);
		}

		return null;
	}

}