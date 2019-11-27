package Logicalquestions;

import java.util.Scanner;

public class Maximum_element {

    public static void main(String args[])
    {
     Scanner s=new Scanner (System.in);
    System.out.println("Enter the no of rows :");
     int m =s.nextInt();//rows
     System.out.println("Enter the no of columns :");
    int n =s.nextInt();//columns
    int arr[][]=new int[m][n];
   int i,j,max=0;
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
              if( arr[i][j]>max)
              {
                  max=arr[i][j];//storing maximum element of a[i][j] to max
              }
            }
        }
        System.out.printf("The maximum element in the array is %d",max);
    }
    
}