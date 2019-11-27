package Series_pattern_questions;

import java.util.Scanner;

public class Patterncccccc {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

        // Get the number of n from the user
        System.out.println("Enter the number :");
        int n = s.nextInt();
       int i=0;int j=0;int a=n,c=0,b=n;int k=0;
       for(i=0;i<n;i++)
       {
    	   
           for(j=0;j<n;j++)
           {
        	   if(i==0) {
        	  System.out.print("c");
        	   }
        	   else if(i==n-1)
        	   {
        		   System.out.print("k");
        	   }
        	   else if(j==0 || j==n-1)
        	   {
        	   System.out.print("s");
        	   }
        	   else
        	   {
        	   System.out.print("*");
        	   }
           }
          System.out.println();
       }
        
       }
	}

   