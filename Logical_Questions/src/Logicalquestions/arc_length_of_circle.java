package Logicalquestions;

import java.util.Scanner;

public class arc_length_of_circle {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Radius of the circle :");//radius inputing
float rad=s.nextFloat();
System.out.println("Angle  :");//input the angle
int angle=s.nextInt();float pi=22/7;
double arc=(double) ((pi*2*rad*(angle/360.0)));//finding the arc length
System.out.println("Arc length of a circle is: "+arc);
	}

}
