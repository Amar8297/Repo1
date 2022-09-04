package day20.collections;

import java.util.Vector;

public class VectorCapacity {
	public static void main(String[] args) {
		Vector<String> vcTr=new Vector<String>();
		System.out.println("Default,Vector Capacity :"+vcTr.capacity());
		System.out.println("Vector size:"+vcTr.size());
		vcTr.setSize(2);
		System.out.println("Vector size:"+vcTr.size());
		System.out.println("Vector elements :"+vcTr);
		vcTr.addElement("Sunday");
		vcTr.addElement("Monday");
		System.out.println("after addition, vector elements :"+vcTr);
		System.out.println("after add,Vector Size :"+vcTr.size());
		vcTr.addElement("Wednesday");
		System.out.println("after addElements ,Vector Size :"+vcTr.size());
		System.out.println("Vector Capacity :"+vcTr.capacity());
	}

}
