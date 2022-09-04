package day20.collections;

public class GC {
	public static void main(String[] agrs) {
		GC g1=new GC();
		System.out.println("Object representation of GC "+g1);
		System.out.println("Address of GC :"+g1.hashCode());
		g1=null;
		System.gc();
		System.out.println("Hi,I am finalize method");
	}

}
