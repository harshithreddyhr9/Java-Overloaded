import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
public static Connection getDBConnection(){
	Connection con = null;
	String driver = "com.mysql.jdbc.Driver";
	String uname = "root";
	String password = "root";
	String url = "jdbc:mysql://localhost/jdbcDemo";
	try{
		Class.forName(driver);
		con = DriverManager.getConnection(url,uname,password);
	}catch(ClassNotFoundException e){
		e.printStackTrace();
	}catch (SQLException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return con;
}
}
