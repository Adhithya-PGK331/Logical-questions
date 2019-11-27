package Logicalquestions;

import java.util.Scanner;

public class Leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the  year");
		
		int year=s.nextInt();
		
		
		if((year%4==0)&&((year%100!=0)||(year%400==0)))
		{//leap year comes in once in 4 years
					System.out.println("Yes, leap year");
		}
		else
		{
					System.out.println("No, not a leap year");
		}
		
		s.close();
	}
}