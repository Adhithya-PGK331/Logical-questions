package Logicalquestions;

import java.util.Scanner;

public class Circumference_of_circle {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter the radius of the circle in metre:");
int r=s.nextInt();//radius
float pm=(float) (2*3.14*r);//circumference of a circle is 2*pi*r
System.out.println("Circumference of the circle is : "+pm+" metre");
	}

}
