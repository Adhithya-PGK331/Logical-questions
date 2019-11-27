package Logicalquestions;

import java.util.Scanner;

public class Replace_the_sub_string {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first string");
		String str=s.nextLine();
		System.out.println("Enter substring to be replaced");
		String str2=s.nextLine();
		System.out.println("Enter substring to replace with");
		String str3=s.nextLine();
		String str4 = str.replace(str2, str3);
		System.out.printf(str4);
	}

}
