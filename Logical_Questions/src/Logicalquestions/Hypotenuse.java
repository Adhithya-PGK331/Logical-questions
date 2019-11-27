package Logicalquestions;

import java.util.Scanner;

public class Hypotenuse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the side1 measurement");
		int side1=s.nextInt();
		System.out.println("Enter the side2 measurement");
		int side2=s.nextInt();
        double h = Math.sqrt((side1 * side1) + (side2 * side2)); 
        System.out.println("Hypotenuse of the triangle : "+h);
	}

}
