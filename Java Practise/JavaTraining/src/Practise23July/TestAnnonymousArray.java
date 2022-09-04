//Java Program to demonstrate the way of passing an anonymous array  
//to method.  
package Practise23July;

public class TestAnnonymousArray {
	static void printArray(int arr[]) {
		for (int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
	public static void main(String args[]) {
		printArray(new int []{10,20,30,40});
	}

}
