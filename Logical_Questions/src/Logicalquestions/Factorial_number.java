package Logicalquestions;

import java.util.Scanner;

public class Factorial_number {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int f=1;
		System.out.println("Enter the 'n' value");
		int n=s.nextInt();
		//limit up to which factorial is to be calculated
		for(int i=1;i<=n;i++)
		{
			f=f*i;
			
		}
		System.out.println("Factorial of the number is : "+f); 
		s.close();	
	}

}
