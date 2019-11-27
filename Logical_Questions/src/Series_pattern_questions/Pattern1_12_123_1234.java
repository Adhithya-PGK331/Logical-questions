package Series_pattern_questions;

import java.util.Scanner;

public class Pattern1_12_123_1234 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

        // Get the number of n from the user
        System.out.println("Enter the number :");

        int n = s.nextInt();
       
       int i=0;int j=0;
        for (i = 0; i <= n; i++)
        {
            for (j = 1; j <= n; j++)
            {
            	if(j<=i) {
                System.out.print(j);}
            	else {
            		System.out.print(" ");
            	}
            }
           
           
            for (j=n;j>=1;j--)
            {
            	if(j<=i) {
                System.out.print(j);
                }
            	
            }
            		System.out.println();
            	
            
        s.close();
    }
	}

}