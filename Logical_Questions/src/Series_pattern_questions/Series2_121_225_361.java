package Series_pattern_questions;

import java.util.Scanner;

public class Series2_121_225_361 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit");
	      int n=s.nextInt();
	      int a=11; int i=1;
	     int b=4;
	      while(i<=n)
	      {
	      	 b=a*a;
	         System.out.printf(b+" ");
	         a=a+4;

	       
	        //a=a+b;
	        i++;
	      }
		}
	}