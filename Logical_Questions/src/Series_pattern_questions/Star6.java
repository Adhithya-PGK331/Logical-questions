package Series_pattern_questions;
import java.util.Scanner;
public class Star6 {
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the number:");
			int rows=s.nextInt();
			int i, j;
		    int stars, spaces;
		    stars = 1;
		    spaces = rows - 1;
		    for(i=1; i<rows*2; i++) /* Iterate through rows */
		    {
		        for(j=1; j<=spaces; j++)/* Print spaces */
		        	System.out.print(" ");/* Print stars */
		        for(j=1; j<stars*2; j++)
		        	System.out.print("*"); /* Move to next line */
				System.out.println();//printing to next line
		        if(i<rows)
		        {
		            spaces--;
		            stars++;
		        }
		        else
		        {
		            spaces++;
		            stars--;
		        }
		}
	}
}