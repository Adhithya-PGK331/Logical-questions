package Series_pattern_questions;

import java.util.Scanner;

public class Star9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		char n=s.next().charAt(0);
		int b=(int)n;
		int i=1;int j=1;
		if(n=='s' || n=='S') {
			for(i=1;i<=b;i++) {
				for(j=1;j<=i;j++) {
					if(j==i+1)
					{
						System.out.print("*");
					}
					
				}
				System.out.println();
			}
			
		}
		
		
	}
}