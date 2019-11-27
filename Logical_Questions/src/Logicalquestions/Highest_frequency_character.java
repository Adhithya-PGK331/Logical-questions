package Logicalquestions;

import java.util.Scanner;

public class Highest_frequency_character {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=0;int j=0;int l;int count=0;int max=0;
		System.out.println("Enter the string : ");
		String str=s.next();
		l=str.length();char ch=0;
		for(i=0;i<l;i++) {
			count=0;
			for(j=i+1;j<l;j++){
			if(str.charAt(i)==str.charAt(j))
			{
				count++;
			}
			}
		if(max<count) {
			max=count;
			ch=str.charAt(i);
		}
	}
		System.out.println("Character with highest frequency is : "+ch);
		}
	
	}

