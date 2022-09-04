package day19.ExceptionHandling;

public class BoxingOperation {
	public static void main(String args[]) {
		int age=20;
		System.out.println("Age:"+age);;
		Integer Obj=45;
		Obj=new Integer(45);
		System.out.println("Obj: "+Obj);
		Integer intObj1=new Integer(age);
		System.out.println("intObj1 :"+intObj1);
		Integer intObj2=new Integer(50);
		System.out.println("intObj2: "+intObj2);
		Integer intObj3=new Integer(25);
		System.out.println("intObj3 :"+intObj3);
		
		char c1='z';
		Character xyz=c1;
		Character cObj=new Character(c1);
		Character cObj2=new Character(xyz);
		System.out.println(cObj2);
		
	}

}
