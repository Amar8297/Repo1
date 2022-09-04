package day18.predefinedclasses.stringclasses;

class SingleObject{
	SingleObject() {
		System.out.println("Sampleton class cons");
	}
	public static SingleObject singleObj=new SingleObject();
	public static SingleObject getSampletonObject() {
		return singleObj;
	}
	public void display() {
		System.out.println("I am display()");
	}
	}
public class Demo {
	public static void main(String args[]) {
		SingleObject s1=SingleObject.getSampletonObject();
		s1.display();
		
	}

}
