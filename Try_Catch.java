
public class Try_Catch {
	public static void main(String[] args) {
		System.out.println("Exception Handling");
		System.out.println("100");
		System.out.println("200");
		System.out.println("300");
		
		try {
			System.out.println(400/0);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Hi");
		}
		
		finally {
			System.out.println("Finally Exception");
		}
		
		System.out.println("500");
		System.out.println("600");
	}
	

}
