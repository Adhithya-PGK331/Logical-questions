package Series_pattern_questions;

import java.util.Scanner;

public class Patternabcdefghij {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit : ");
		int n=s.nextInt();
		int i=0;int j=0;char num=1;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++)
			{	char d=(char)(num+64);
				System.out.print(d);
				num++;
			}
			System.out.println();
		}
			}

		}