//Java Program to return an array from the method   
package Practise23July;
//creating method which returns an array
public class TestReturnArray {
	static int[] get() {
	return new int[]{10,30,40,50,60};
	}
	public static void main(String args[]) {
		int arr[]=get();
		for(int i=1;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		}

}
