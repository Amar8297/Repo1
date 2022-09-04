package day19.ExceptionHandling;

public class WrapperClass {
	public static void main(String args[]) {
		int a=20;
		Integer k=new Integer(a);
		Integer l=new Integer(20);
		Integer j=a;
		System.out.println("a: "+a+"\nk: "+k+"\n1: "+1+"\nj: "+j);
		Integer a1=new Integer(25);
		int i1=a1.intValue();
		System.out.println("a1: "+a1+"\nil:"+i1);
		
		System.out.println("a1==i1: "+(a1==i1));
		System.out.println("a1.equals(i1) : "+a1.equals(i1));
		
	}

}
