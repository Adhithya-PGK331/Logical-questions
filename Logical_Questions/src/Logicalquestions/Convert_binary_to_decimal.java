package Logicalquestions;

import java.util.Scanner;

public class Convert_binary_to_decimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a binary number");
	    int n=sc.nextInt();
	    int num = n; 
        int decimal = 0; 
        int b = 1; 
  
        int temp = num; 
        while (temp > 0) { 
        	
          int digit = temp % 10;//getting the last digit of a number 
            
            temp = temp / 10; 
  
            decimal += digit * b;// 
  
            b = b * 2; 
        }
        System.out.println("Decimal number is : "+decimal);
	}

}
