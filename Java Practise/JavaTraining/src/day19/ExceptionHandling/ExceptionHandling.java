package day19.ExceptionHandling;

public class ExceptionHandling {
	public static void main(String args[]) {
		System.out.println("Program Starts from here ..");
		int i=10;
		int j=i/0;
		System.out.println("res: "+j);
		int[] empIds=new int[3];
		empIds[3]=101;
		String str=null;
		System.out.println(str.length());
		String s="abc";
		int num=Integer.parseInt(s);
		System.out.println("num:"+num);
		System.out.println("Program ends here.........");
	}
}
