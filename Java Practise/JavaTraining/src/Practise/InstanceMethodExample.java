package Practise;

public class InstanceMethodExample {
	public static void main(String[] args) {
		InstanceMethodExample obj=new InstanceMethodExample();
		System.out.println("the sum is "+obj.add(12,14));
	}
	int s;
	public int add(int a,int b) {
		s=a+b;
		return s;
	}
}
