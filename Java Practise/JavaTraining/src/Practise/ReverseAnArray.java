package Practise;

public class ReverseAnArray {
	public static void main(String[] args) {
		int [] arr=new int[] {1,2,3};
		int [] arr1=new int[] {4,5};
		System.out.println("Original arrays");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(""+arr[i]);
		}System.out.println("ORiginal arrays of arr2");
		for(int i=0;i<arr.length;i++) {
			System.out.println(" "+arr[i]);
		}System.out.println();
		System.out.println("Arrays in reverse order");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}for(int i=arr1.length-1;i>=0;i--) {
			System.out.print(arr1[i]+" ");
		}
	}
}
