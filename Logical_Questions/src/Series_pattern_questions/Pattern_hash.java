package Series_pattern_questions;

import java.util.Scanner;

public class Pattern_hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

        // Get the number of n from the user
        System.out.println("Enter the number :");
        int n = s.nextInt();
       int i=0;int j=0;int a=n,c=0,b=n;
       for (i = 1;i<=n;i++)
       {c=0;
           for (j = 1; j<=(2*n)+1; j++)
           {
        	   if((c<i) && (j==a+1) || (c<i) && (j==b+1)) {
               System.out.print("* ");
               c++;
        	   }
        	   else {
        		   System.out.print("# ");
        	   }
           }
           System.out.println();
    	   b++;a--; 
       }
	}
}
   