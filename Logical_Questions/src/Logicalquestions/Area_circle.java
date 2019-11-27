package Logicalquestions;

import java.util.Scanner;

public class Area_circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the radius of the circle in metre:");
		
		int r=s.nextInt();//radius inputing
		
		float pm=(float) (3.14*r*r);//area of a circle is pi*r*r
		
		System.out.println("Area of the circle is : "+pm);
			}
}