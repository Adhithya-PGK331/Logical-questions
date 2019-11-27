package Logicalquestions;

import java.util.Scanner;

public class Remove_duplicates_from_sorted_array {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int n=s.nextInt();
		System.out.println("Enter the array elements : ");
		int i=0;int j=0;int a[]=new int[n];int t=0;
		for(i=0;i<n;i++) {
				a[i]=s.nextInt();
		}
		for(i=0;i<n-1;i++) {
			for(j=0;j<n-1-i;j++) {
				if(a[j]>a[j+1]) {
					t=a[j];//bubble sorting
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		for (i = 0; i < n; i++) 
		{ 
		    for (j = 0; j < i; j++) 
		    if (a[i] == a[j]) //If array elements are same then break
		        break; 
		    if (i == j) 
		    System.out.print( a[i] + " ");
			}
	}
}
