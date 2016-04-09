package tp_Login.modelo;

import java.sql.*;

public class Query extends Connector{

	public boolean Authentication(String user,String pass) throws SQLException{
		Statement st = myConn.createStatement();
		ResultSet results = null;
		String Sql = "select * from USERS";
		results = st.executeQuery(Sql);
		
		while(results.next())
		{
			if(user.equals(results.getString("idUser")) && pass.equals(results.getString("password")))
				return true;
		}
		return false;
	}
	public static void main(String[] args) throws SQLException {
		Query con = new Query();
		System.out.println(con.Authentication("u55001", "001"));
		
	}
}
