package Series_pattern_questions;

import java.util.Scanner;

public class Patternaababcabcd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit : ");
		int n=s.nextInt();
		int i=0;int j=0;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++)
			{
				System.out.printf("%c", j+64);
			}
			System.out.println();
		}
			}

		}
