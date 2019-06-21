package Inheritence;
class Arithmetic
{
	
int sum=0;
String f="Arithmetic";
int add(int a,int b)
{
sum=a+b;
return sum;
}
}
public class Adder extends Arithmetic
{
String returnString()
{
return f;
}

	public static void main(String args[]) {

Adder a=new Adder();
System.out.println(a.add(23,76));
System.out.println(a.returnString());
}
}
