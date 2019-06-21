package Create10objects;

public class Box1                                           
	
	{
	private float length,breadth,height,area=0;
	private String colour;
	public void displayLength()
	{
	System.out.println("The Length of Box is:"+length);
	}
	public void displayBreadth()
	{
	System.out.println("The Breadth of Box is:"+breadth);
	}
	public void displayHeight()
	{
	System.out.println("The Height of Box is:"+height);
	}
	public float Area()
	{
	area=length*breadth;
	return area;
	}
	public static void main(String args[])
	{
	Box1 B1=new Box1();
	B1.length=5.5f;
	B1.breadth=7.9f;
	B1.height=3.4f;
	B1.colour="white";
	B1.displayLength();
	B1.displayBreadth();
	B1.displayHeight();
	System.out.println("The Area of box is:"+B1.Area());
	}
	}

