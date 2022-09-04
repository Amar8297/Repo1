package day18.predefinedclasses.stringclasses;
class Demo1223{
	private Demo1223() {
		System.out.println("I am zero-param");
	}
	private static Demo1223 d1=new Demo1223();
	String name ="Pune";
	static Demo1223 getInstance() {
		return d1;
		
	}
	void print() {
		System.out.println("I am print () of Singleton");
	}
}
public class SingletonClass2 {
	public static void main(String args[]) {
		Demo1223 xyz=Demo1223.getInstance();
		xyz.print();
		System.out.println(xyz.name);
		xyz.name="Banglore";
		System.out.println(xyz.name);
		Demo1223 d2=Demo1223.getInstance();
		System.out.println("d2 ref:"+d2.name);
	}

}
