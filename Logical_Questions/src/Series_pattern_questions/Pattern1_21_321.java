package Series_pattern_questions;

import java.util.Scanner;

public class Pattern1_21_321 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=s.nextInt();
		int i=0;int j=0;int a=n;int k1=0;int m=1;int l=0;
		for(i=1;i<=n;i++) {l=i;m=1;
			for(j=1;j<=i;j++)
			{
				if(m==1) {
				
			for(k1=1;k1<a;k1++)
			{	
				System.out.print(" ");
			}m=0;
				}
		System.out.printf("%d ",l);l--;
			}
		
			System.out.println();a--;
		}
	}

}
