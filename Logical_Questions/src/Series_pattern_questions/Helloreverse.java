package Series_pattern_questions;

import java.util.Scanner;

public class Helloreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Type your code here
		  Scanner s=new Scanner(System.in);
		  System.out.println("Enter the string :");
		  String str=s.nextLine();
		  int i=1;int j=0;
		  char ch[]=new char[str.length()];
		  for(i=0;i<str.length();i++)
		  { 
			  ch[i]=str.charAt(i);
		  }
		  for(i=str.length();i>=0;i--)
		  {
		 
			  for(j=0;j<i;j++)
		 {
			  System.out.print(ch[j]+" ");
		  }
		  System.out.println();
		  }
		 
	  }
	}