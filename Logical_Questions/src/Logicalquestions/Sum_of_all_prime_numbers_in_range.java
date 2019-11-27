package Logicalquestions;

import java.util.Scanner;

public class Sum_of_all_prime_numbers_in_range {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE LOWER BOUND");
		int a=s.nextInt();
		System.out.println("ENTER THE UPPER BOUND");
		int b=s.nextInt();
		int i,j,flag=0;int sum=0;
		for(i=a;i<=b;i++)//checking if no is within the limit
		{
			if(i==2)
				flag=0;
			else
			{//condition for prime
			for(j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
				else
					flag=0;
				
			}}
			if(flag==0) {
			sum=sum+i;}//prime sum
			

		}
		System.out.println("Sum is : "+sum);
		}}
