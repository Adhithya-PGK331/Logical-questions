package Logicalquestions;

import java.util.Scanner;

public class Sum_of_digits {

	public static void main(String args[])
    {
        int r, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = s.nextInt();
        while(n > 0)
        {//finding the digits of a number
            r = n % 10;
            sum = sum + r;//finding the sum of the digits
            n = n / 10;
        }
        System.out.println("Sum of Digits : "+sum);
    }
}