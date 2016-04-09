package tp_Login.modelo;

import java.sql.*;
//import com.mysql.jdbc.Connector;

public class Connector
{
    
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    public static final String HOST = "localhost";
    public static final String PORT = "3306";
    public static final String DATABASE = "tp_login";
    public static final String CLASSNAME = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://"+ HOST +":"+PORT+"/"+DATABASE;
    
	public java.sql.Connection myConn;
     
	public Connector() {
		try {
			// seteo la coneccion
			myConn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Error en la coneccion");
        }
	}
}