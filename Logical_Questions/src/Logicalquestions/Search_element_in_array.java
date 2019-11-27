package Logicalquestions;

import java.util.Scanner;

public class Search_element_in_array {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	     System.out.println("Enter the size of array :");
		int n=s.nextInt();//array size
	      int i;int f=0;
	      int[]arr=new int[n];
	      System.out.println("Enter the elements of array :");
	      for (i=0;i<n;i++)//array elements
			{
				arr[i]=s.nextInt();			
			}
	      System.out.println("Enter the element to search :");
	      int a=s.nextInt();//search element
	      
		for(i=0;i<n;i++)
			{
			if (a==arr[i])//if search element is present in the array
			{
				f=1;
			}
			}
	      if(f==1)
	      {
	        System.out.printf(a+" is present in the array");
	      }
	      else{
	         System.out.printf(a+" is not present in the array");
	      }
	    }
	}