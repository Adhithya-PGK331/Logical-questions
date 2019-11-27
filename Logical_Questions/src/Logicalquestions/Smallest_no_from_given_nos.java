package Logicalquestions;

import java.util.Scanner;

public class Smallest_no_from_given_nos {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	 System.out.println("Enter the no of rows :");
     int m =s.nextInt();//rows
     System.out.println("Enter the no of columns :");
    int n =s.nextInt();//columns
    int arr[][]=new int[m][n];
   int i,j,min=1000;
   System.out.println("Enter the array elements :");
   for(i=0;i<m;i++)//reading array elements
       {
        for(j=0;j<n;j++)
           {
               arr[i][j]=s.nextInt();
            }
        }
   
        for(i=0;i<m;i++)
       {
        for(j=0;j<n;j++)
           {
              if( arr[i][j]<min)
              {
                  min=arr[i][j];//storing minimum element of a[i][j] to min
              }
            }
        }
        System.out.printf("The minimum element in the array is %d",min);	}
}
