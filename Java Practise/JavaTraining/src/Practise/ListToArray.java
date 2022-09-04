package Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {
	public static void main(String[] args) {
		List<String> list =new ArrayList<>();
		list.add("mango");
		list.add("apple");
		list.add("grapes");
		list.add("Banana");
		String[] array=list.toArray(new String[list.size()]);
		System.out.println("Printing Array :"+Arrays.toString(array));
		System.out.println("Printing list:"+list);
	}
}
