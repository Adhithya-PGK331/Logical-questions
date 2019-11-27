package Logicalquestions;
import java.util.Scanner;
public class String_sort {
	public static void main(String[] args) {
		int n;
        String t="";
        Scanner s= new Scanner(System.in);
        System.out.print("Enter number of strings:");
        n = s.nextInt();int i = 0;int j=0;
        String st[] = new String[n];        
        //Enter the strings
        System.out.println("Enter the Strings one by one:");
        for(i = 0; i < n; i++)
        {
            st[i] = s.next();
        }
        //Sorting the strings
        for (i = 0; i < n; i++) 
        {
            for (j = i + 1; j < n; j++) { 
                if (st[i].compareTo(st[j])>0) 
                {
                    t = st[i];
                    st[i] = st[j];
                    st[j] = t;
                }
            }
        }
        //Displaying the strings after sorting
        System.out.print("Strings in Sorted Order:\n");
        for (i = 0; i <= n-1 ; i++) 
        {
            System.out.println(st[i]);
        }
    }
}