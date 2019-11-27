package Logicalquestions;

import java.util.Scanner;

public class LCM_of_two_numbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int num1=s.nextInt();//72
		System.out.println("Enter the second number : ");
		int num2=s.nextInt();//120
		int lcm=(num1>num2)?num1:num2;//finding largest using ternary operator
		int i,max=0;
		for(i=lcm;i<=(num1*num2);i++)
		{
			if(i%num1==0 && i%num2==0)
			{//if i is the max no which divides both num1 and num2
				max=i;//then store i to max
				break;//360
			}
		}
		System.out.printf("LCM of the numbers is %d",max);
		
}}