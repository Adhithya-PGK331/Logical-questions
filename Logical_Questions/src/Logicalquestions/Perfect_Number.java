package Logicalquestions;

import java.util.Scanner;

public class Perfect_Number {

	public static void main(String[] args) {
		int i, Number, Sum = 0 ;
		Scanner sc = new Scanner(System.in);		
		System.out.println("\n Enter any Number: ");
		Number = sc.nextInt();//6 is perfect

		for(i = 1 ; i < Number ; i++) {
			if(Number % i == 0)  {//6%1=0;6%2=0;6%3=0
				Sum = Sum + i;//sum=sum+1+2+3=6
			}
		}
		if (Sum == Number) {//sum=6 && number=6
			System.out.format("\n% d is a Perfect Number", Number);
		}//so 6 is perfect
		else {
			System.out.format("\n% d is NOT a Perfect Number", Number);
		}	}

}
