package Logicalquestions;

import java.util.Scanner;

public class Temperature_c_fahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter Celcius temperature : ");
int n=s.nextInt();
int result=0;
result=(int) ((n * 9 / 5) + 32); //Celcius to Fahrenheit conversion
System.out.println("Result is  : "+result);
}

}
