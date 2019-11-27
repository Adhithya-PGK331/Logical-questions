package Series_pattern_questions;

import java.util.Scanner;

public class Star8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any odd number");
		int n=s.nextInt();
		int i=0;int j=0;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++)
			{
				if(i==j || j==n-1-i)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}

}
