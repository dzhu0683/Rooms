
public class rivalRoom extends Room
{
	public rivalRoom(int x, int y) 
	{
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	
	private static boolean rivalBattle = true;
	
	@Override
	public void enterRoom(Person x) 
	{
		// TODO Auto-generated method stub
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("You are challenged by your rival Shiftry to battle.");
		
		while (rivalBattle)
		{
			System.out.println("Shiftry is charging his Hyper Beam");
		}
		
	}	
}

