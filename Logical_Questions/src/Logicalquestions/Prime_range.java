package Logicalquestions;

import java.util.Scanner;

public class Prime_range {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE LOWER BOUND");
		int a=s.nextInt();
		System.out.println("ENTER THE UPPER BOUND");
		int b=s.nextInt();
		int i,j,flag=0;
		for(i=a;i<=b;i++)
		{
			if(i==2)
				flag=0;
			else
			{
			for(j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
				else
					flag=0;
			}
			}
			if(flag==0)
			System.out.printf("%d\n",i);
			}
		}
	}
