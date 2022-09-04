package Practise;


class Animal{
	Animal(){
		System.out.println("Hi i am cons of class A");
	}
	class Dog extends Animal{
		Dog(){	
			
		}
	}
}
public class InheritancePractise {
	public static void main(String[] args) {
		Dog d1=new Animal();
		
	}
}
