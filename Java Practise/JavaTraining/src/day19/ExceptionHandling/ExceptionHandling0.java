package day19.ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling0 {
	public static void main(String[] args) {
		System.out.println("Program starts here");
		int i,j,k;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter first num1: ");
		i=scn.nextInt();
		System.out.println("Enter second num2: ");
		j=scn.nextInt();
		k=i/j;
		System.out.println("res: "+k);
		System.out.println("Programs Ends here......");
	}

}
