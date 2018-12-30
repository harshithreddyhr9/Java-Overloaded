import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementDemo {
	public static void main(String[] args) {
		try{
			PreparedStatementDemo pd = new PreparedStatementDemo();
			pd.prepared();
			pd.getEmployee(1001);
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	public void prepared()throws SQLException{
		Connection con = null;
		try{
			con = DBConnection.getDBConnection();
			con.setAutoCommit(false);
			PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?);");
			pstmt.setInt(1, 1232);
			//pstmt.setString(2, "luffy");
			pstmt.setInt(3, 50000);
			int count = pstmt.executeUpdate();
			con.commit();
			System.out.println(count);
		}catch(SQLException e){
			con.rollback();
			System.out.println("hahaha not inserted i am rollbacking");
		}    finally{		
			con.close();
		}
	}
	public void getEmployee(int empid) throws SQLException{
		Connection con = null;
		try{
			con = DBConnection.getDBConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from employee where employeeid=?;");
			pstmt.setInt(1, empid);
			ResultSet r = pstmt.executeQuery();
			if (r.next()) {
				System.out.println(r.getInt("employeeid") + " " + r.getString(2) + " " + r.getInt(3));
			} else {
				System.out.println("no such record");
			}
		}finally{
			con.close();
		}
	}

}
