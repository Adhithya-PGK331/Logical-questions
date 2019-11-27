package Logicalquestions;

import java.util.Scanner;

public class Armstrong_Number {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER TO CHECK");
		int a=s.nextInt();
		//System.out.printf("%d%d",a,b);
		int b=a;
		int c=a;
		double sum=0;
		int r;
		int count=0;
		while(c!=0)
		{
			count++;
			c=c/10;
		}
		while(a!=0)
		{
			r=a%10;//getting each digits of the number
			sum=sum+Math.pow(r,count);
			a=a/10;
		}
		System.out.println(sum);
		if(sum==b)
		{
			System.out.printf("Amstrong");
		}
		else
			{
			System.out.printf("Not Amstrong");
			}
					
		s.close();	
	}

}
