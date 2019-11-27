package Series_pattern_questions;

import java.util.Scanner;

public class Star7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=s.nextInt();
		int i=0;int j=0;int c=0;
		for(i=1;i<=n;i++)
		{c=0;
			for(j=1;j<=2*i;j++)
			{
				System.out.print("*");
				c++;
			if(c==i) {
				System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
