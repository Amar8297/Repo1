package Practise;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {
	public static void main(String[] args) {
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("Amar");
		lhs.add("Pooja");
		lhs.add("Priyanka");
		lhs.add("Lokesh");
		System.out.println("The Hash set is"+lhs);
		System.out.println(lhs.remove("Pooja"));
		System.out.println("After removing the hashset list is "+lhs);
		System.out.println(lhs.remove("for"));
		}
}
