package Logicalquestions;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    int i, flag = 0;int c=0;
	    System.out.println("Enter a positive integer: ");
	    int n=s.nextInt();
	    for(i = 2; i <= n; i++)
	    {
	        // condition for non-prime number
	        if(n%i == 0)
	        {
	        	c++;
	           
	        }
	    }
	        if (c == 1)
	        	 System.out.printf("%d is a prime number.", n);
	        else
	        	 System.out.printf("%d is not a prime number.", n);
	    }
	    
	
}
