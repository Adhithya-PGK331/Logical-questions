package Series_pattern_questions;

import java.util.Scanner;

public class Series4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit");
	      int n=s.nextInt();
	      int a=1; int i=0;
	     int b=4;
	      while(i<n)
	      {
	      	 b=b+(i*i);
	         System.out.printf(b+" ");
	         
	        i++;
	      }
		}
	}