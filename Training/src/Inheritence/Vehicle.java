package Inheritence;
class MotorCycle
{
  void fun()
  {
	  System.out.println("Hello I am a motorcycle, I am a cycle with an engine.");
  }
  
}
class Cycle extends MotorCycle
{
	 
    void fun()
    {
      super.fun();
	  System.out.println("My ancestor is a cycle who is a vehicle with pedals:"); 
    }
    
}

public class Vehicle
{
	public static void main(String[] args) 
	{
		Cycle c=new Cycle();
		c.fun();
		

	}

}

