package Logicalquestions;

import java.util.Scanner;

public class Perfect_square {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Please enter an integer : ");
        int number = s.nextInt();
         //number inputing
        int sqrt = (int) Math.sqrt(number);
        if(sqrt*sqrt == number) {//finding if square of square root = the inputted number
            System.out.println(number+" is a perfect square number!");
        }else {
            System.out.println(number+" is not  a perfect square number!");
        }
         
	}

}
