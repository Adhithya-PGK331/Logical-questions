package Series_pattern_questions;

import java.util.Scanner;

public class Star2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		int i=0;int j=0;
		for(i=n;i>=0;i--)//row
		{
			for(j=0;j<i;j++) {//column
					System.out.print("*");
			}//star printing
			System.out.println();
		}
	}

}