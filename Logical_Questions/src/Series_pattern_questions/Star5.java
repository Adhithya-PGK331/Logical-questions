package Series_pattern_questions;

import java.util.Scanner;

public class Star5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number : ");
        int n = s.nextInt();
 int i=0;int j=0;int k=0;
        for (i = 1; i <= n; i++) 
        {
            for (j =n; j>=i; j--) 
            {
                System.out.print(" ");
            }
           
            for (k = 1; k <= 2 * i - 1; k++) 
            {
                System.out.print("*");                
            }
            System.out.println("");
        }
        
        for (i = n-1; i >=1; i--) 
        {
            for (j =n; j>=i; j--) 
            {
                System.out.print(" ");
            }
           
            for (k = 1; k <= 2 * i - 1; k++) 
            {
                System.out.print("*");                
            }
            System.out.println("");
        }
	}
}
        