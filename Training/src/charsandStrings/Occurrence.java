package charsandStrings;

import java.util.*;
public class Occurrence {
	public static void main(String args[]) {
 
                String str="AAABB";
                int count=0;
                Scanner s=new Scanner(System.in);
                System.out.println("enter a character:");
                char ch=s.next().charAt(0); 
                for(int i=0;i<str.length();i++)
                {
                        if(str.charAt(i)==ch)
                	count++;
                }
                System.out.println("the occurence of"+ch+"is"+count);
                                
}
}
