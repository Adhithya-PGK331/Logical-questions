package Logicalquestions;

import java.util.Scanner;

public class Nthfibonacci {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int a=0,b=1,c=0,i=0;
System.out.println("Enter the number :");
int n=s.nextInt();//fibonacci no to print
int arr[]=new int[n];
while(i<=n-3)
{
	c=a+b;
	arr[i]=c;
	a=b;
	b=c;
	i++;}
System.out.println("nth fibonacci number is : "+arr[n-3]);
	}

}
