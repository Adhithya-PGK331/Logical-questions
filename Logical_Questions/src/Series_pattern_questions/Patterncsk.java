package Series_pattern_questions;

import java.util.Scanner;

public class Patterncsk {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        // Get the number of n from the user
        System.out.println("Enter the number :");
        int n = s.nextInt();
        System.out.println("Enter the string :");
        String str= s.next();
        int l=str.length();
       int i=0,j=0,k=0;
       for(i=0;i<n;i++)
       {
           for(j=0;j<l;j++)
           {char c=str.charAt(j);
           for(k=0;k<=i;k++) {
        	   System.out.print(c);
           }
           }
          System.out.println();
        
       }
	}
}
   