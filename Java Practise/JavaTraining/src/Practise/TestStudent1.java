package Practise;
class Student12{
	int rollno;
	String name;
	void insertRecord(int r,String n) {
		rollno=r;
		name=n;
	
	}void displayInformation(){
		System.out.println(rollno+" "+name);
	}
}

public class TestStudent1 {
	public static void main(String[] args) {
		Student12 s1=new Student12();
		s1.insertRecord(302,"Amar");
		
		Student12 s2=new Student12();
		
		s2.insertRecord(304, "Lokesh");
		s1.displayInformation();
		s2.displayInformation();
	}

}
