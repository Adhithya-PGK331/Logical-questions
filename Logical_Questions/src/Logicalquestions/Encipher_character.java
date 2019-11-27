package Logicalquestions;

import java.util.Scanner;

public class Encipher_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the character to encrypt : ");
		char a=s.next().charAt(0);
		System.out.println("Enter the input to encrypt the character : ");
		int b=s.nextInt();
		int c=(int)a;//encryption by conversion of char to int
		int d=c+b;
		System.out.println("Ciphered character : ");
		System.out.println((char)d);
		    }
		}