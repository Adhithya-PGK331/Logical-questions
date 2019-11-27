package Logicalquestions;

import java.util.Scanner;

public class Binary_octal_conversion {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
 	    System.out.println("\nEnter the number :");
 	    int binaryNumber=s.nextInt();//reading binary no to convert
 	   double octalNumber = 0;//to corresponding octal
	int i = 0;
	double decimalNumber = 0;
       while(binaryNumber != 0)
       {//binary to decimal conversion
           decimalNumber = decimalNumber+((binaryNumber % 10) * Math.pow(2, i));
           i++;
           binaryNumber = binaryNumber / 10;
       }
       i = 1;
       while (decimalNumber != 0)
       {//decimal to octal conversion
           octalNumber =octalNumber+( (decimalNumber % 8) * i);
           decimalNumber =decimalNumber / 8;
           i=i*10;
       }
	    System.out.println("Octal Value is : " + octalNumber);
	}

}
