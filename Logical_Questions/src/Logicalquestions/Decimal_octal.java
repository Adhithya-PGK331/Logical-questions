package Logicalquestions;

import java.util.Scanner;

public class Decimal_octal {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("No to convert");
		int n=s.nextInt();
		 int[] octalNum = new int[100]; 
		  
	        // counter for octal number array 
	        int i = 0; 
	        while (n != 0)  
	        { 
	            // storing remainder in octal array 
	            octalNum[i] = n % 8; 
	            n = n / 8; 
	            i++; 
	        } 
	        System.out.println("Octal number is :");
	        // Printing octal number array in reverse order 
	        for (int j = i - 1; j >= 0; j--) 
	            System.out.print(octalNum[j]);
	    } 
	}


