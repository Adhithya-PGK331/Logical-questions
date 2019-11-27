package Logicalquestions;

import java.util.Scanner;

public class Subset_of_size_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size=s.nextInt();
		int array[]=new int[size];
		System.out.println("Enter the array elements : ");
		int i,j,k;
		for(i=0;i<size;i++)
		{
			array[i]=s.nextInt();
		}
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				for(k=j+1;k<size;k++)
				{
				System.out.printf("(%d,%d,%d)\n",array[i],array[j],array[k]);	
				}
			}
		}
	}

}

