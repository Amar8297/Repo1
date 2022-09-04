//Java Program to illustrate the use of multidimensional array  
package Practise23July;
//declaring and initializing 2D array 
public class Array3 {
	
	public static void main(String args[])
	//printing 2D array  
	{
		int arr[][]= {{1,2,3},{2,4,5},{4,4,5}};
			for (int i=0;i<arr.length;i++){
				for(int j=0;j<arr.length;j++) {
					System.out.print(arr[i][j]+" ");
			}
				System.out.println();
	}
	}
}
