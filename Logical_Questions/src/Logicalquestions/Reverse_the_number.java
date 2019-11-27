package Logicalquestions;

import java.util.Scanner;

public class Reverse_the_number {

	public static void main(String[] args) {
		int r;
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to reverse :");
		int a=s.nextInt();
		int t=a;
		while(a!=0) {
			r=a%10;//remainder -last digit
			sum=(sum*10)+r;//sum
			a=a/10;//number/10
		}
	System.out.println("Reverse of the number is    :\n"+sum);
}
}