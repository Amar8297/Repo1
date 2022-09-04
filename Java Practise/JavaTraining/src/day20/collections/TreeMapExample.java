package day20.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		Map m1=new TreeMap();
		m1.put("key1", "admin");
		m1.put("key2", "admin");
		m1.put("key3", "admin123");
		m1.put("key0", "admin");
		System.out.println("Map elements are :"+m1);
		System.out.println("Map elements are:"+m1.size());
	}
}
