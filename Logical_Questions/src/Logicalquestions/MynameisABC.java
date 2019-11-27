package Logicalquestions;

import java.util.Scanner;

public class MynameisABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first string :");
		String str=s.nextLine();
		System.out.println("Enter the second string :");
		String str1=s.nextLine();
		int i=2;
		int b=str.length();//string length
		System.out.println("String length\n"+b);
		//String length 
		System.out.println("Character at "+i+"th position is \n"+str.charAt(i));
		//Character at "+i+"th position
		System.out.println("Substrings\n"+str.substring(2,5));
		//The substrings
		System.out.println("The string starts with \"the\" is \n"+str.startsWith("the"));
		//The string starts with \"the\"System.out.println("The index of \"is\" is :\n"+str.indexOf("is"));
		System.out.println("String concatination\n"+str.concat(str1));
		//String concatination of str1 & str2
		System.out.println("String Replacement is \n"+str1.replace("t", "T"));
		//String after replacement
		String arr[]=str.split(" ");
		int j=0;
		System.out.println("String split  is ");
		for(j=0;j<arr.length;j++) {System.out.println(arr[j]);}
		//After string split
		System.out.println("Equality\n"+str.equals(str1));
		//Equality between str and str1
		System.out.println("Uppercase of str is ");
		System.out.println(str.toUpperCase());
		System.out.println("Lowercase of str1 is ");
		System.out.println(str1.toLowerCase());

	}

}
