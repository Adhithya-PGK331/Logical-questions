package Logicalquestions;

import java.util.Scanner;

public class Greatest_among_three_numbers {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter the first number");
int n1=s.nextInt();
System.out.println("Enter the second number");
int n2=s.nextInt();
System.out.println("Enter the third number");
int n3=s.nextInt();
if(n1 > n2 && n1 > n3 )//if a is large a>b && a>c
{
	System.out.println(n1+" is large");
	}
	
else if(n2 > n1 && n2 > n3 )//if b is large b>a && b>c
	{
		System.out.println(n2+" is large");
		}

else if(n3 > n2 && n3 > n1 )//if c is large c>b && c>a
	{
		System.out.println(n3+" is large");
		}
	}
}