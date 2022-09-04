package day19.ExceptionHandling;

public class ExceptionHandling11 {
	public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("Person is not eligible to vote");
			
		}else {
			System.out.println("Person is eligible to vote!!!");
		}
	}
	public static void main(String[] args) {
		System.out.println("Program Starts....");
		validate(13);
		System.out.println("rest of the code");
	}
}
