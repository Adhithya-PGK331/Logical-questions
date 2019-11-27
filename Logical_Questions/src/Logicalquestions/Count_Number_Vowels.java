package Logicalquestions;

import java.util.Scanner;

public class Count_Number_Vowels {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int count=0;int i=0;
System.out.println("Enter the string : ");
String str=s.nextLine();
for(i=0;i<str.length();i++) {
if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' )
    count++;
//condition for vowels
	}
System.out.println("No of vowels in this string : "+count);
	}

}
