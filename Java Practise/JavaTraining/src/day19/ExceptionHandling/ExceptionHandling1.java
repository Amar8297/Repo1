package day19.ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling1 {
	public static void main(String args[]) {
		System.out.println("Programs Starts from here");
		int i,j,k;
		Scanner scn=new Scanner(System.in);
		try {
			System.out.println("Enter First num1: ");
			i=scn.nextInt();
			System.out.println("Enter first num2: ");
			j=scn.nextInt();
		}
		catch(ArithmeticException obj){
			System.out.println("Exception Handled: "+obj);
		}
		System.out.println("Program Ends here");
	}
	}


