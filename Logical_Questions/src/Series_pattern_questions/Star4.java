package Series_pattern_questions;

import java.util.Scanner;

public class Star4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		int i=0;int j=0;int k=0;
		for(i=0;i<n;i++)//row allocation
		{
			for(j=n-i;j>1;j--) {//column allocation
					System.out.print(" ");
			}//space allocation
			for(k=0;k<=i;k++) {
				System.out.print("* ");
		}//star printing
			System.out.println();//printing to next line
		}
	}

}
