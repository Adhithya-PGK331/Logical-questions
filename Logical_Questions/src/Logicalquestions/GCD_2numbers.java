package Logicalquestions;

import java.util.Scanner;

public class GCD_2numbers {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the numbers:");
	int a=s.nextInt();//30
	int b=s.nextInt();//45
	int min=0;int gcd=0;
	min=(a<b)?a:b;//minimum among two numbers using ternary operator
	for(int i=min;i>0;i--)
		{
		if((a%i==0)&&(b%i==0))//if divisible by both the numbers
		{
			gcd=i;//15
			break;
		}
		}
	System.out.println("GCD OF THE NUMBERS IS:"+gcd);}

}
