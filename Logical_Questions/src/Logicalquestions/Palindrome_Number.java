package Logicalquestions;

import java.util.Scanner;

public class Palindrome_Number {
	public static void main(String[] args) {
		int r;
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to check :");
		int a=s.nextInt();//number to check
		int t=a;
		while(a!=0) {
			r=a%10;
			sum=(sum*10)+r;
			a=a/10;
		}
		if(t==sum)
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");		
		}
		}

	}
