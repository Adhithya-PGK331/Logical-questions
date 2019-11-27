package Logicalquestions;

import java.util.Scanner;

public class program_to_count_vowel_consonant_digit_whitespace {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int vcount=0;int i=0;int ccount=0;int dcount=0;int scount=0;int wcount=0;
		System.out.println("Enter the string : ");
		String str=s.nextLine();
		for(i=0;i<str.length();i++) {
			if(str.charAt(i)>='a' && str.charAt(i)<='z') {
		if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' )
		    vcount++;
		else
			ccount++;}
			else if(str.charAt(i)>='0' && str.charAt(i)<='9'){
				dcount++;
			}
			else if(str.charAt(i)==' ') {
				wcount++;
			}
			else {
				scount++;
			}
		//condition for vowels
			}
		System.out.println("No of vowels in this string : "+vcount);
		System.out.println("No of consonants in this string : "+ccount);
		System.out.println("No of digits in this string : "+dcount);
		System.out.println("No of symbols in this string : "+scount);
		System.out.println("No of white spaces in this string : "+wcount);
	}

}
