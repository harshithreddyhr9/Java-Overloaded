import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
	public static void main(String[] args) {
		Connection con = null; // import java.sql.connection for connection
								// interface
		try {
			// step1 load driver into the memory, for that we use Class.forName to
			// explicitly load a class into memory
			Class.forName("com.mysql.jdbc.Driver");
			// step 2. establish connection to db first create a reference for
			// connection interface and call drivermanager.getConnection and 
			//path is "jdbc:mysql://localhost/databasename"
			con = DriverManager.getConnection("jdbc:mysql://localhost/jdbcDemo", "root", "root");
			// step 3. process sql statement
			Statement stmt = con.createStatement();
			ResultSet r = null;
			r = stmt.executeQuery("select * from employee;");
			//we use r.next() to check it has next data or not and r.getDatatype(index) where index starts from 1 or getDatatype("+variablename+");  
			while(r.next()){
				System.out.println(r.getInt("employeeid")+" "+r.getString("employeename")+" "+r.getInt("salary"));
				//or
				System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getInt(3));
			}
			//int count = stmt.executeUpdate("insert into employee values (1001,'mark',10000);");
			//System.out.println(count);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			// always close connection after the program if there are any
			// exceptions
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
