package Logicalquestions;

import java.util.Scanner;

public class Reverse_string_recursion {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string to reverse : ");
		String str = s.next(); 
        StringReverse st = new StringReverse(); 
        st.reverse(str);
	}

}
class StringReverse 
{ 
    /* Function to print reverse of the passed string */
    void reverse(String str) 
    { 
        if ((str==null)||(str.length() <= 1)) 
           System.out.println(str); 
        else
        { 
            System.out.print(str.charAt(str.length()-1)); 
            reverse(str.substring(0,str.length()-1)); 
        } 
    } 
}