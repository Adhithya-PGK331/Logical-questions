package Logicalquestions;

import java.util.Scanner;

public class Fibonacci_Series_up_to_the_n_term {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int a=0;
		int b=1;
		System.out.println("ENTER THE 'n' VALUE");
		int n=s.nextInt();//limit
		System.out.printf(a+" "+b+" ");
		//printing first  0 and 1
		for (int i=0;i<n-2;i++)
		{
			int c=a+b;//third=second+first
			System.out.print(c+" ");
			a=b;//first=second
			b=c;//second=third
		}
		s.close();}

}
