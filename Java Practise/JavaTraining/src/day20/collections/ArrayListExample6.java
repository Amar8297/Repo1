package day20.collections;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.List;
//import javax.swing.plaf.synth.SynthSeparatorUI;
public class ArrayListExample6 {
	public static void main(String[] args) {
		ArrayList<Integer> l2=new ArrayList<Integer>();
		l2.add(12);
		l2.add(10);
		l2.add(2);
		l2.add(15);
		l2.add(18);
		System.out.println("Size: "+l2.size());
		System.out.println("Elements of collection"+12);
		Collections.sort(l2);
		System.out.println("After sorting elements of collections :"+l2);
		Collections.reverse(l2);
		System.out.println("Reversing sorted elements :"+l2);
	}

}
