package Logicalquestions;

import java.util.Scanner;

public class Missingalphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String st1=s.nextLine();
		int l=st1.length();
		boolean f=false;char c=0;String st=st1.toLowerCase();
		if( c < 'a' && c>'z') {
			f=false;
			c++;
		}
		for(int i=0;i<l;i++)
		{
			if(st.charAt(i)==c) {
				f=true;
				break;
			}
		}
		if(f==false) {
			System.out.println(c);
		}
	}

}
