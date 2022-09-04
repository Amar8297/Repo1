package day19.ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling2 {
	public static void main(String[] args) {
		System.out.println("Program Starts From Here");
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter array size");
		int size=scn.nextInt();
		int[]empIds=new int[size];
		try {
			System.out.println("You are inside try block");
			System.out.println(empIds[3]);
			System.out.println("try block ends here ");
		}
		catch(Throwable e) {
			System.out.println("Catch block starts from here.....");
			System.out.println("Exception handled......... "+e);
			System.out.println("Catch Block Ends Here");
		}
		System.out.println("Programs Ends here.....");
		}

}
