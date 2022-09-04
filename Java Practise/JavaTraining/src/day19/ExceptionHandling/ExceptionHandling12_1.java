package day19.ExceptionHandling;
class UserDefinedException extends Exception{
	public UserDefinedException(String str) {
	super (str);
	}
}
public class ExceptionHandling12_1 {
	public static void validateAge(int age) throws UserDefinedException {
		if(age<18) {
			throw new UserDefinedException("Person is not eligible to vote");
		}else {
			System.out.println("Person is eligible to vote!!!!");
		}
	}
	public static void main(String agrs[]) {
		System.out.println("I am main of ExceptionHandlin12_1");
		try {
			validateAge(13);
			
		}catch(UserDefinedException e) {
			System.out.println(e);
		}
		System.out.println("rest of code ");
	}

}
