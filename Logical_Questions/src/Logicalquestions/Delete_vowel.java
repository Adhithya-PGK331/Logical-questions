package Logicalquestions;

import java.util.Scanner;

public class Delete_vowel {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string to delete vowels : ");
		String str=s.nextLine();int i=0;
		char ch=str.charAt(i);
		String str1=str.replaceAll("[AEIOUaeiou]", "");
		System.out.println("New string is : "+str1);
	}

}
