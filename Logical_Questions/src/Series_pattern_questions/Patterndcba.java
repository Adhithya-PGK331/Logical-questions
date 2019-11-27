package Series_pattern_questions;

import java.util.Scanner;

public class Patterndcba {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit : ");
		int n=s.nextInt();
		int i=0;int j=0;
		for(i=n-1;i>=0;i--) {
			for(j=i;j>=0;j--)
			{	System.out.printf("%c",j+65);
			}
			
			System.out.println();
		
				}
			}

		}