
public class kecleonRoom extends Room
{
	Runner cla = new Runner();
	
	public kecleonRoom(int x, int y) 
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
		System.out.println("You encounter Kecleon");
		System.out.println("Kecleon uses shadow claw");
		System.out.println("A Critical Hit!");
		occupant.loseHealth(60);
		System.out.println("You take damage!");
		System.out.println("In your rage you punch Kecleon ");
		System.out.println("Kecleon Faints");
		System.out.println("You leveled up!");
		System.out.println("You are level " + occupant.addLevel);
	}
}
