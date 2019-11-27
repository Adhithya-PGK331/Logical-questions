package Logicalquestions;

import java.util.Scanner;

public class Second_largest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a > b && a > c)
	    { 
	        if(b > c)//if one no is greater than the other than
	        {//check if the other number is greater than the smallest number
	         // which is checked with the first number
	        	System.out.printf("The 2nd largest number is "+b);
	        }
	        else
	        {
	        	 System.out.printf("The 2nd largest number is "+ c);
	        }
	    }
	    else if(b > a && b > c)
	    {
	        if(a > c)
	        {
	        	 System.out.printf("The 2nd largest number is "+a);
	        }
	        else
	        {
	        	 System.out.printf("The 2nd largest number is "+c);
	        }
	    }

	    // c is the largest number of the three
	    else if(a > b)
	    {
	    	 System.out.printf("The 2nd largest number is "+ a);
	    }
	    else
	    {
	    	 System.out.printf("The 2nd largest number is "+ b);
	    }
	}

}

