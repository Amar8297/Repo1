package day20.collections;

import java.util.ArrayList;

class Book{
	int id;
	String name,author,publisher;
	int quantity;
	public Book(int id,String name,String author,String publisher,int quantity) {
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
}
public class ArrayListExample5 {
	public static void main(String[] args) {
	ArrayList<Book> list=new ArrayList<Book>();
		Book b1=new Book(101,"Mobile Computing","Vinay Kumar","SinghalK Nath & Sons, Meerut",4);
		Book b2=new Book(102,"Data Structure Using C","Sharad Kumar Verma","Thakur Publications Lucknow",12);
		Book b3=new Book(103,"Computer Networks","Saurabh Singhal","Thakur Publications ",15);
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(new Book(104, "Let us Code it", "xyz", "pqr", 5));
		System.out.println("List of book class elements :"+list);
		System.out.println(list.get(0).name);
		System.out.println(list.get(3).name);
		System.out.println(list.get(3).author);
		//traversing list 
		for(Book b:list) {
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
	}

}
