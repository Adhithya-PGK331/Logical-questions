package Series_pattern_questions;

import java.util.Scanner;

public class Robberyquestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of houses : ");
		int n=s.nextInt();
		int money[]=new int[n];int sum=0;
		int i,j=0;
		System.out.println("Enter the money in each in house : ");
		for(i=0;i<n;i++)
		{
			money[i]=s.nextInt();
		}
		int[] dp = new int[money.length + 1]; 
        dp[0] = 0;
        dp[1] = money[0];
        for (i = 2; i <= money.length; i++) {
            if ((dp[i - 1]) > (dp[i - 2] + money[i - 1])) {
                dp[i] = dp[i - 1];
            } else {
                dp[i] = dp[i - 2] + money[i - 1];
            }
        }
       sum=dp[money.length];
		System.out.println(sum);
	}
}