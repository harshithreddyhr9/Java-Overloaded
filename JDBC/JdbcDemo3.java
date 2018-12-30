import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

//example for using dbconnection class to use in methods to add and update data in database directly
public class JdbcDemo3 {
	public static void main(String[] args) {
		JdbcDemo3 obj = new JdbcDemo3();
		try {
			// obj.addEmployee(105,"mahesh",200000);
			// obj.getEmployee(105);
			// obj.updateSalary(105);
			// obj.getAllEmployees();
			ArrayList<Employee> a = obj.getAllEmployees11();
			for (Employee e : a) {
				System.out.println(e.empid + " " + e.empname + " " + e.salary);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void addEmployee(int empid, String empname, int salary) throws SQLException {
		Connection con = null;
		try {
			con = DBConnection.getDBConnection();
			Statement stmt = con.createStatement();
			int count = stmt
					.executeUpdate("insert into employee values(" + empid + ",'" + empname + "'," + salary + ");");
			System.out.println(count);
		} finally {
			con.close();
		}
	}

	public void updateSalary(int empid) throws SQLException {
		Connection con = null;
		try {
			con = DBConnection.getDBConnection();
			Statement stmt = con.createStatement();
			int count = stmt.executeUpdate("update employee set salary = 10000 where employeeid=" + empid + ";");
			System.out.println(count);
		} finally {
			con.close();
		}

	}

	public void getEmployee(int empid) throws SQLException {
		Connection con = null;
		try {
			con = DBConnection.getDBConnection();
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery("select * from employee where employeeid=" + empid + ";");
			if (res.next()) {
				System.out.println(res.getInt(1) + " " + res.getString(2) + " " + res.getInt(3));
			} else {
				System.out.println("no such record");
			}

			// System.out.println(count);
		} finally {
			con.close();
		}

	}

	public void getAllEmployees() throws SQLException {
		Connection con = null;
		try {
			con = DBConnection.getDBConnection();
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery("select * from employee;");
			int i = 0;
			while (res.next()) {
				i = i + 1;
				System.out.println(res.getInt(1) + " " + res.getString(2) + " " + res.getInt(3));
			}
			if (i == 0) {
				System.out.println("no records found");
			}
			// System.out.println(count);
		} finally {
			con.close();
		}
	}

	public ArrayList<Employee> getAllEmployees11() throws SQLException {
		Connection con = null;
		ArrayList<Employee> e = new ArrayList<Employee>();
		try {
			con = DBConnection.getDBConnection();
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery("select * from employee;");
			// Employee emp = new Employee();
			int i = 0;
			while (res.next()) {
				i = i + 1;
				// here we have to create a object inside to store the objects
				// in array list
				Employee emp = new Employee();
				int empid = res.getInt(1);
				emp.setEmpid(empid);
				String name = res.getString(2);
				emp.setEmpname(name);
				int sal = res.getInt(3);
				emp.setSalary(sal);
				e.add(emp);
				// e.add("+res.getInt(1)+","+res.getString(2)+","+res.getInt(3)+");
			}
			if (i == 0) {
				System.out.println("no records found");
			}
			// System.out.println(count);
		} finally {
			con.close();
		}
		return e;
	}
}
