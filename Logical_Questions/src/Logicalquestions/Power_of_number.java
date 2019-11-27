package Logicalquestions;

import java.util.Scanner;

public class Power_of_number {
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the no and power to calculate : ");
      int X=s.nextInt();//number to calculate power
      int N=s.nextInt();//power 
      System.out.println("Power of the no is : ");
     System.out.println(Math.pow(X,(N)));//finding the power
    }
}