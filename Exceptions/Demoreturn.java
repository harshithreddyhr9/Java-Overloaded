package day2;

public class Demoreturn {
	public static void main(String[] args) {
		int i =100;
		try{
			System.out.println("1");
			int result = i/0;
		}catch(Exception e){
			System.out.println(e);
			System.exit(0);;
		}finally {
			System.out.println("2");
		}
	}
}
