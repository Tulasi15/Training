package Inheritence;


	import java.util.Scanner;
	public class DecimalToBinary {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	          int n;
	          int a[]=new int[1000];
	          Scanner s=new Scanner(System.in);
	          System.out.println("Enter a decimal:");
	          n=s.nextInt();
	          s.close();
	          int i=0;
	          while(n>0)
	          {
	        	  a[i]=n%2;
	        	  n=n/2;
	        	  i=i+1;
	          }
	          for(int j =i-1;j>=0;j--)
	          {
	              System.out.print(a[j]);
	          }
	          
		}

	}




