package day19.ExceptionHandling;

public class ExceptionHandling13 {
	public static void main(String[] args) {
		System.out.println("Program Starts ");
		try {
			setSleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			checkNumber(-5);
		} catch (UserDefinedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		System.out.println("Hello Geeks");
	
	}
	static void setSleep(long time) throws InterruptedException{
		Thread.sleep(time);
		}
	static void checkNumber(int num )throws UserDefinedException{
		if(num<0) {
			throw new UserDefinedException("Number is less than zero");
		}else {
			System.out.println("num: "+num);
		}
	}
}
