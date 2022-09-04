package Practise;

import java.util.*;  
class Student{
	int rollno;
	String name ;
	int age;
	Student(int rollno,String name,int age){
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
}
class ArrayList4{  
	public static void main(String[] args) {
		//Creating user-defined class objects  
		Student s1=new Student(101,"Priyanka",25);
		Student s2=new Student(102,"lokesh",24);
		Student s3=new Student(103,"Pranay",21);
		Student s4=new Student(104,"Pooja",21);
		ArrayList<Student> list =new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		//Iterator itr=list.iterator();
	/*	while(itr.hasNext()) {
			Student st=(Student)itr.next();
			System.out.println(st.rollno+""+st.name+""+st.age);
		}*/
		for(Student b:list)
			System.out.println(b.rollno+""+b.name+""+b.age);
	}
}  