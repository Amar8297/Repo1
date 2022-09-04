package day18.predefinedclasses.stringclasses;
class Singleton{
	private Singleton() {
		s="Hello I am string part of Singleton Class";
	}
	private static Singleton single_instance = new Singleton();
	public String s;
	public static Singleton getInstanceOfSingleton() {
		return single_instance;
		
	}
}
public class SingletonClass {
	public static void main(String args[]) {
	Singleton x=Singleton.getInstanceOfSingleton();
	System.out.println("String of x is :"+x.s);
	Singleton y=Singleton.getInstanceOfSingleton();
	System.out.println("String of y is:"+y.s);
	Singleton z=Singleton.getInstanceOfSingleton();
	System.out.println("String of z is :"+x.s);
	x.s=(x.s).toUpperCase();
	System.out.println("String of x is:"+x.s);
	System.out.println("String of y is:"+y.s);
	System.out.println("String of z is:"+z.s);
	x.s=(x.s).toLowerCase();
	System.out.println("String of x is:"+x.s);
	System.out.println("String of y is:"+y.s);
	System.out.println("String of z is:"+z.s);
	
	}

}
