package Series_pattern_questions;

import java.util.Scanner;

public class Pattern1_12_123_1236_123612 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=s.nextInt();
		int i=0;int j=0;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++)
			{	
				System.out.print(j+" ");
				
			}
			
			System.out.println();
		}
	}

}
