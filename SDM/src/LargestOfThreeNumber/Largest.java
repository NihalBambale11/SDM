package LargestOfThreeNumber;

import java.util.Scanner;

public class Largest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the 3 Numbers");
		int a  = scan.nextInt();
		int b  = scan.nextInt();
		int c  = scan.nextInt();
		
		if(a > b && a > c) {
			System.out.println("The Largest number is A : "+a);
		}
		else if(b > a && b > c) {
			System.out.println("The Largest number is B : "+b);
		}
		else {
			System.out.println("The Largest number is C : "+c);
		}
		
	
	}
}
