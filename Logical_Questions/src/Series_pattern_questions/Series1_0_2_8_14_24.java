package Series_pattern_questions;

import java.util.Scanner;

public class Series1_0_2_8_14_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit : ");
	      int n=s.nextInt();
	      int a=0;
			int i=1;
	      while(i<=n)
	      {
	        if(i%2!=0)//if odd position then (i*i) -1
	        {
	           a=((i*i)-1);
	   		 }      
	        else{	  //if even position then (i*i) -2
	          a=((i*i)-2);
	        }
	        System.out.printf(a+" ");
			i++;
	        
	      }// fill your code
		}
	}