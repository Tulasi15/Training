package Inheritence;

	interface  AdvancedArithmetic
	{
		 int divisor_sum(int n);	
	}
	 class MyCalculator implements AdvancedArithmetic 
	{
		 
		public int divisor_sum(int num)
		{
			int s=num;
			for(int i=1;i<num;i++)
			{
				if(num%i!=0)continue;
				s=s+i;
		    }
			return s;
		    	
		
		}
	    public static void main(String[] args)
		{
			MyCalculator m=new MyCalculator();
			int sum=m.divisor_sum(6);
			System.out.println("I implemented: AdvancedArithmetic");
			System.out.print(sum);
		}
	}


