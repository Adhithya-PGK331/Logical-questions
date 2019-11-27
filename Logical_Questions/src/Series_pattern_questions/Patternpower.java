package Series_pattern_questions;

import java.util.Scanner;

public class Patternpower {
	public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String s = sc.next();
        int length = s.length();
        char[] a = s.toCharArray();
        for (int i = 0; i < length; i++) 
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print(a[j]+" ");
            }
            System.out.println();
        }
        for (int i = length-1; i >= 0; i--) 
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print(a[j]+" ");
            }
            System.out.println();
        }
    }
}