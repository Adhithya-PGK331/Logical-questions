package Logicalquestions;

import java.util.Scanner;

public class Palindrome_String {
	public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the string :");
	String a=s.next();int l=a.length();String rev = null;int i;
	String b = null;
	for(i=0;i<l;i++)
      {//reading character by character
          b=b+a.charAt(i);
     }
	
	for(i=l-1; i>=0; i--)//finding the reverse and storing to rev
		{rev=rev+a.charAt(i);}
	 
		if(b.equals(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
}
}
