package day19.ExceptionHandling;

public class ExceptionHandling7 {
	public static void main(String[] args) {
		System.out.println("Programs Starts here.....");
		try {
			int data=25/0;
			System.out.println(data);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception handled");
		}finally {
			System.out.println("finally block is Executed here");
		}
		System.out.println("rest of code ..........");
	}

}
