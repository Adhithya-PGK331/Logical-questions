package Series_pattern_questions;

import java.util.Scanner;

public class Star3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		int i=0;int j=0;int a=n;int k=0;
		for(i=1;i<=n;i++)//row
		{
			for(j=1;j<a;j++) {//columns
					System.out.printf(" ");
			}
			for(k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
			a--;
		}
	}

}
