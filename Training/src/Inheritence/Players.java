package Inheritence;
class Sports
{
    String getName()
    {
        return "Generic Sports";
    }
    void getNumberOfTeamMembers()
    {
        System.out.println( "Each team has n players in " + getName() );
    }
}
class Soccer extends Sports
{
	 @Override
    String getName()
    {   
        return "Soccer Class";
    }
    void getNumberOfTeamMembers()
    {
        System.out.println( "Each team has 11 players in " + getName() );
    }
}
public class Players 
{
	public static void main(String[] args)
	{
		Sports obj=new Sports();
		System.out.println(obj.getName());
		obj.getNumberOfTeamMembers();
		Soccer s=new Soccer();
		System.out.println(s.getName());
		s.getNumberOfTeamMembers();
	}

}

