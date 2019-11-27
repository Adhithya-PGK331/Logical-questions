package Series_pattern_questions;

import java.util.Scanner;

public class Pattern0111120222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n value : ");
		int i=0;int j=0;
		int n=s.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==j)//diagonal elements are 0
				{
					System.out.print("0 ");
				}
				else//other j positions are i+1;ie first i is 1  
				{// so print 1+1=2 in first j position
					System.out.print(i+1+" ");
				}
			}
			System.out.println();
		}
	}

}
