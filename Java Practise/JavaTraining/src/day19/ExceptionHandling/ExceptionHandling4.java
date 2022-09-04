package day19.ExceptionHandling;
public class ExceptionHandling4 {
	public static void main(String args[]) {
		try {
			int a[]=new int[5];
			a[5]=30;
		}catch(ArrayIndexOutOfBoundsException e	) {
			System.out.println("ArrayIndexOutOfBound Exception occurs");
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException occurs");
		}catch(Exception e){
			System.out.println("Parent exception occurs here");
		}try {
			int a[]=new int[5];
			a[2]=20;
			a[3]=10;
			a[4]=a[2]/a[3];
			a[5]=a[4]/0;
			
		}catch(ArrayIndexOutOfBoundsException e	) {
			System.out.println("ArrayIndexOutOfBound Exception occurs");
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException occurs");
		}catch(Exception e){
			System.out.println("Parent exception occurs here");
	}
		System.out.println("rest of code");
	}
}
