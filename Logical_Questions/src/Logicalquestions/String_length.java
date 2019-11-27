package Logicalquestions;

import java.util.Scanner;

public class String_length {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i = 0;
		System.out.println("Enter the string :");
		String str=s.next();//reading the array
	      for(char c:str.toCharArray()) {
	        i++;//finding the string length without using length() function
	     }
		
	      System.out.println("Length of the given string :"+i);
	}
}