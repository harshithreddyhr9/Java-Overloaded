package day2;

public class Employee {
	public String toString(){
		return "Employee object";
	}
	public boolean equals(Object obj){
		return true;
	}
	/*public int hashCode(){
		return 11;
	}*/
	public static void main(String[] args) {
	Employee e = new Employee();

	// Every object has a hash code
	Employee e2 = e;//new Employee();
	System.out.println(e2.hashCode());
	System.out.println(e2);
	System.out.println(e.hashCode());
	System.out.println(e);
	System.out.println(e2==e);
	if(e2.equals(e))
		 System.out.println(true);
	else System.out.println(false);
	}
}
