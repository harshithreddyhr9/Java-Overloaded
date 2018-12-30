package day2;

public class ExceptionExample {
	int n=-100;
	public static void main(String[] args) {
		System.out.println("begin");
		
		ExceptionExample e = new ExceptionExample();
		try{
		e.test();
			/*
			
			System.out.println("hello");
			double d = n/0;
			System.out.println(d);
			System.out.println("bye");*/
		}
		catch(Exception e1){
			System.out.println(e1+" main");
			//System.out.println(e.getMessage());
			//e.printStackTrace();
			//System.out.println("i catch");
		}
		System.out.println("end");
	}
public void test()throws InvalidNumberException {
		System.out.println("test begins");
		if(n<0){
			throw new InvalidNumberException("invalid");
		}else{
			System.out.println(n);
		}
		//String s= null;
		/*try{
			int length = s.length();
		}
		catch(NullPointerException e) {
			System.out.println(e+"test");
		}*/
		//int length = s.length();
	}
}
