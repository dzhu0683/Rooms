
public class partyMember extends Room
{
	public partyMember(int x, int y) 
	{
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void enterRoom(Person x) 
	{
		// TODO Auto-generated method stub
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("This Pokemon would like to join your party.");
		Runner.gameOff();
	}
}
