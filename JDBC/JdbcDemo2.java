import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo2 {
	public static void main(String[] args)  throws SQLException{
		Connection con = null;
		try{
			con = DBConnection.getDBConnection();
			Statement stmt = con.createStatement();
			int count = stmt.executeUpdate("insert into employee values(1002,'hari',20000);");
			System.out.println(count);
		}finally{
			con.close();
		}
	}
}
