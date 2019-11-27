package Logicalquestions;

import java.util.Scanner;

public class Replace_Occurrences_a_with_dollar {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		System.out.println("Enter the string");
		String str=s.nextLine();
		int l=str.length();int i=0;char c;
		char st[] = str.toCharArray(); 
		for(i=0;i<l;i++) {
			if(st[i]=='a')
			{
				st[i]='$';
			}
		}
		for(i=0;i<l;i++) {
			System.out.print(st[i]);
		}
		
	}

}
