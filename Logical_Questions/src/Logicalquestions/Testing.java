package Logicalquestions;
import java.util.Scanner;
public class Testing {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String name1=s.nextLine();
		String name2=s.nextLine();
		name1 = name1.toLowerCase();
        name2 = name2.toLowerCase();
        StringBuilder sb1 = new StringBuilder(name1);// converting to string builder
        StringBuilder sb2 = new StringBuilder(name2);
        int m=sb1.length();
        int n=sb2.length();
        for(int i=0; i<m;i++)
        {
            for(int j=0; j<n;j++)
            {
                if(sb1.charAt(i) == sb2.charAt(j))
                {
                    sb1.replace(i, i+1, "0"); // replacing matching characters into "0"
                    sb2.replace(j,j+1,"0");
                }
            }
        }
        System.out.println(sb1);
        System.out.println(sb2);
        int x1=0;
        int y1=0;
        String s1="";char fres=0;
        String s2="";String f= "flames";
        s1 = sb1.toString();
        s2 = sb2.toString();
            for(int i=0;i<s1.length();i++){ //length of string to remove 0 and find the length
                if(s1.charAt(i)!='0'){
                    System.out.print(" "+s1.charAt(i));
                    x1++;
                 }
            }
            System.out.println();
            System.out.println("Boy name: "+x1);
    
            for(int i=0;i<s2.length();i++){
            if(s2.charAt(i)!='0'){
                System.out.print(" "+s2.charAt(i));
                y1++;
                
                }
            } char cha=0;
            System.out.println();
            System.out.println("Girl name: "+y1);
           int countv=x1+y1;int k=0;
          while(f!=null) {
        	  for(k=0;k<countv;k++) {
        		  if(k==countv) {
        			  cha=f.charAt(k);
        			  cha=0;
        		  }
        		  k=0;
        	  }
        	  fres=f.charAt(k);
          }
          
          switch(fres)
          {
              case 'f':
                  System.out.println("Friends");
                  break;
              case 'l':
                  System.out.println("Love");
                  break;
              case 'a':
                  System.out.println("Affection");
                  break;
              case 'm':
                  System.out.println("Marriage");
                  break;
              case 'e':
                  System.out.println("Enemies");
                  break;
              case 's':
                  System.out.println("Sibling");
                  break;
                  
          }
		}
	}