package Logicalquestions;

import java.util.Scanner;

public class Change_the_case_of_alphabet {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str=s.next();
		int l=str.length();
		char ch[]=str.toCharArray();
		int i=0;
		for(i=0;i<l;i++)
		{
		if(ch[i]>=65&&ch[i]<=90)
			ch[i]=(char) (ch[i]+32);

		else
			ch[i]=(char) (ch[i]-32);
		}
		System.out.println("Toggled string is : ");
		for(i=0;i<l;i++)
			System.out.print(ch[i]);
			}

		}
		