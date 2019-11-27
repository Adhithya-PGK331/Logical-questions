package Logicalquestions;

import java.util.Scanner;

public class Simple_interest {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter the amount :");
int p=s.nextInt();//principal amount
System.out.println("Enter the no of years :");
int n=s.nextInt();//no of years
System.out.println("Enter the rate of interest :");
int r=s.nextInt();//rate of interest
System.out.println("Simple interest :"+(p*n*r/100));
//simple interest=(p*n*r/100)
	}

}
