package Logicalquestions;

import java.util.Scanner;

public class ABCQuestion {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		int i;
		String string=s.nextLine();
		//splitting the string
		String array[]=string.split(" ");
		for(i=0;i<array.length;i++)
		{
			if(i%2==0)//checking for even position elements
				{
					System.out.print(array[i]);
					System.out.print(" ");}
			else
				{//converting array to string and storing
					String str=array[i];
					for(int k=str.length()-1;k>=0;k--)//string reversing
					System.out.print(str.charAt(k));
					System.out.print(" ");
				}
		}
	}
}
