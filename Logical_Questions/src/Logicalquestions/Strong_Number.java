package Logicalquestions;

import java.util.Scanner;

public class Strong_Number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the  number");
		int n=s.nextInt();//145
		int t=n;int r;int f;int sum=0;
		while(n!=0)
		{
			f=1;
			r=n%10;//getting each digit and finding factorial
			for(int i=1;i<=r;i++)
			{
				f=f*i;			
			}
			sum=sum+f;
			n=n/10;
		}
			if(sum==t)//if factorial sum = the inputed number then it is strong
			{
				System.out.printf("Strong");
			}
			else
				{
				System.out.printf("Not strong");
				}
			s.close();			
		}
		
		
	}

