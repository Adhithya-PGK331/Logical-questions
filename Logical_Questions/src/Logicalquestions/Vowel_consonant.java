package Logicalquestions;

import java.util.Scanner;

public class Vowel_consonant {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the character to check : ");
		 char ch = s.next().charAt(0);
	        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
	            System.out.println(ch + " is vowel");//condition for vowels
	        else
	            System.out.println(ch + " is consonant");

	}

}
