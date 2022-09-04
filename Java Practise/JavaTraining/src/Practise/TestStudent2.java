package Practise;
class Rectangle{
	int length;
	int breadth;
	
	void AreaOfRectangle(int l,int b) {
		length=l;
		breadth=b;
		
	}void displayArea() {
			System.out.println("Area of rectangle is"+length* breadth);
		}
	}

public class TestStudent2 {
	public static void main(String[] args) {
		Rectangle r1 =new Rectangle(),r2=new Rectangle();
		r1.AreaOfRectangle(25,30);
		r2.AreaOfRectangle(50, 75);
		r1.displayArea();
		r2.displayArea();
	}
}
