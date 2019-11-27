package Logicalquestions;

import java.util.Scanner;

public class Duplicate_array_elements {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of array elements");
		int n=s.nextInt();
		int i=0;int a[]=new int[n];int j=0;int c=0;int flag=0;
		System.out.println("Enter the array elements");
		for(i=0;i<n;i++) {
			a[i]=s.nextInt();
		}//reading array
		for (i = 0; i < n; i++) 
		{ 
		    for (j = 0; j < i; j++) 
		    if (a[i] == a[j]) //finding if the elements are same
		    	System.out.print( a[i] + " ");
		    else {
		    	flag=1;
		    }
			
		}
	}	
}
