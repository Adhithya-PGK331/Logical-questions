package Logicalquestions;

import java.util.Scanner;

public class Inserting_element_in_any_position_in_array {
	public static void main(String args[])
	   {Scanner s=new Scanner(System.in);
	   System.out.println("Enter the array size : ");
	     int n=s.nextInt();//size
	     int a[]=new int [n];
	    int i=0;int j=0;int b=0;
	    System.out.println("Enter the array elements : ");
	     for(i=0;i<n;i++)//elements
	   {	a[i]=s.nextInt(); 	
	   }
	     System.out.println("Enter the position to which the element is to be inserted : ");
	   int pos=s.nextInt();//position
	   System.out.println("Enter the element to insert : ");
	    b=s.nextInt();//element
	    for(i=0;i<pos-1;i++)
	      {
	        System.out.print(a[i]+"\n");//printing up to position
	      }
	  System.out.print(b+"\n");//inserting element
	      for(i=pos-1;i<n;i++)
	      {
	        System.out.print(a[i]+"\n");//printing from position
	      } 
	 }
	 }