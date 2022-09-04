package Practise;


import java.util.LinkedList;
import java.util.List;

class Student1 {
	int id;
	String author,publisher,name;
	int quantity;
	Student1(int id,String author,String publisher,String name,int quantity){
		this.id=id;
		this.author=author;
		this.publisher=publisher;
		this.name=name;
		this.quantity=quantity;
		
	}
}
public class LinkedList2 {
	public static void main(String[] args) {
	List<Student1> list=new LinkedList<Student1>();
	Student1 b1=new Student1(101,"Let us C","Yashwant Kanetkar","BPB",8);  
	 Student1 b2=new Student1(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
	 Student1 b3=new Student1(103,"Operating System","Galvin","Wiley",6);  
	   list.add(b1);  
	    list.add(b2);  
	    list.add(b3);  
	 for(Student1 st:list) {
		 System.out.println(st.id+" "+st.name+" "+st.author+" "+st.publisher+" "+st.quantity);  
	 }
	}
}
