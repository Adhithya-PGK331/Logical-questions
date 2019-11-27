package Series_pattern_questions;

import java.util.Scanner;

public class Patternabbcccdddd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the limit : ");
int n=s.nextInt();
int i=0;int j=0;
for(i=1;i<=n;i++) {
	for(j=1;j<=i;j++)
	{
		System.out.printf("%c", i+64);
	}
	System.out.println();
}
	}

}
