package Logicalquestions;

import java.util.Scanner;

public class Unique_array {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter the no of array elements");
int n=s.nextInt();
int i=0;int a[]=new int[n];int j=0;int c=0;
System.out.println("Enter the array elements");
for(i=0;i<n;i++) {
	a[i]=s.nextInt();
}
//array reading
for (i = 0; i < n; i++) 
{ 
    for (j = 0; j < i; j++)
    {
    	
    if (a[i] == a[j]) //If array elements are same then break
        break; 
    }
    
    if (i == j) 
    System.out.print( a[i] + " ");
}
	
}
}
