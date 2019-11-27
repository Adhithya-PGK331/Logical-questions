package Series_pattern_questions;

import java.util.Scanner;

public class Series3_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit value : ");
	      int n=s.nextInt();
	      int a=1;
	     double b=2.0;
	     double c=1;
	     System.out.printf(a+" "+b+" ");
	     int i=3;
	      while(i<=n)
		{	if(i%2==1)
	    {	c=c*3.0;
	     	System.out.printf(c+" ");
	    }
	     else{
	       b=b*3.0;
	       System.out.printf(b+" ");
	     }
	        
			 i++;
	      }
		}
	}