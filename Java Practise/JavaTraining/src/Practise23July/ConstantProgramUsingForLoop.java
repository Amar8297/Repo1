package Practise23July;
import java.util.*;
public class ConstantProgramUsingForLoop {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		System.out.print("\n Enter Character: ");
		char c=(inp.next().charAt(0));
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			System.out.println("Its a Vowel"+c);
		}else {
			System.out.println("Its not a Vowel");
			
		}
		}
}
 