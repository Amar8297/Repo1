package Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {
	public static void main(String[] args) {
		String[] array= {"Priyanka","Pooja ","Automation","Vidya"};
		System.out.println(Arrays.toString(array));
		List<String> l1=new ArrayList<>();
		for(String str:l1) {
			l1.add(str);
			System.out.println("Printing List"+l1);
		}
	}
}
