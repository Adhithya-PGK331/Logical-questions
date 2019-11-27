package Series_pattern_questions;

import java.util.Scanner;

public class Series5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit");
	      int l=s.nextInt();
	      int i=0;
	      float ss=(float).5;
	      for(i=1;i<=l;i++)
	      {
	    	  System.out.printf("%.1f", ss);
	    	  System.out.print(" ");
	    	  ss=ss*3;
	      }
	}
}
