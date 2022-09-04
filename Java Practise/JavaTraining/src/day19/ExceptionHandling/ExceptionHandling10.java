package day19.ExceptionHandling;

public class ExceptionHandling10 {
	public static void validAge(int age) {
		if(age<18) {
			throw new ArithmeticException("Person is not eligible to vote");
		}else {
			System.out.println("Person is Eligible to vote!!!");
		}
	}
	public static void main(String args[]) {
	try {
		validAge(13);
		
	}catch(ArithmeticException e){
		System.out.println("Exception Handled ");
		System.out.println(e);
	}
	System.out.println("Rest of code..........");
	}

}
