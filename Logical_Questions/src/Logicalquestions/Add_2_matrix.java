package Logicalquestions;

import java.util.Scanner;

public class Add_2_matrix {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of rows : ");
      int m=s.nextInt();//no of rows
      System.out.println("Enter the no of columns : ");
      int n=s.nextInt();//no of columns
      int[][] a = new int[m][n];//first array
      int b[][]=new int[m][n];//second array
      int max=0;
      int[][] sum=new int[m][n];//array to store sum
      System.out.println("Enter the first array elements : ");
       for (int i= 0; i< m;i++) {//reading first array elements
        for(int j= 0; j<n;j++) {
           a[i][j]=s.nextInt();
        }
     }
       System.out.println("Enter the second array elements : ");
       for (int i= 0; i< m;i++) {//reading second array elements
           for(int j= 0; j<n;j++) {
              b[i][j]=s.nextInt();
           }
        }
       
        for (int i=0;i<m;i++) { //finding array sum
            for (int j=0;j<n;j++) { 
                sum[i][j]=b[i][j]+a[i][j];
            }
		}
        System.out.println("Matrix sum is : ");
        for (int i=0;i<m;i++) { //printing sum array
            for (int j=0;j<n;j++) { 
            	System.out.printf(" "+sum[i][j]);            }
            System.out.println();
		}
       
    }
}