package Series_pattern_questions;
import java.util.Scanner;
public class Series6 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the number : ");
int n=s.nextInt();
int arr[]=new int[n];
int i=0,ss=0;int a=0;
	for(i=0;i<n;i++)
	{	if(i%2==0)
			{	arr[i]=a;	}
		else{	ss=a/2;a=a+2;
				arr[i]=ss;
			}
	}	
	System.out.print(arr[n-1]+" ");
	}
}