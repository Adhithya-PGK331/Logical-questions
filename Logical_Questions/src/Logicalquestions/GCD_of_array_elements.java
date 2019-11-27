package Logicalquestions;

import java.util.Scanner;

public class GCD_of_array_elements {

	public static void main(String[] args) {
		 int a, b;
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter the no of array elements : ");
		 int n=s.nextInt();//no of elements in the array
	      int[] arr = new int[n];
	      int i=0;
			 System.out.println("Enter the array elements : ");
	      for(i=0;i<n;i++) {//enter the elements
	    	  arr[i]=s.nextInt();
	      }
	      int size = arr.length;
	      int result = arr[0];
	      i = 1;
	      while(i<size)
	      {
	         if(arr[i]%result==0)
	         {
	            i++;
	         } else {
	            result = arr[i]%result;
	            i++;
	         }
	      }
	      System.out.println("GCD is "+result);
	}

}
