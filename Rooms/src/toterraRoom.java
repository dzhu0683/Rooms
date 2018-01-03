
public class toterraRoom extends Room
{
Runner cla = new Runner();
	
	public toterraRoom(int x, int y) 
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
		System.out.println("You encounter Toterra");
		System.out.println("Torterra uses earthquake");
		System.out.println("It has no effect because you can fly!");
		System.out.println("You use flamethrower!");
		System.out.print("It's Super Effective!");
		System.out.println("Toterra Faints");
		System.out.println("You leveled up!");
		System.out.println("You are level " + occupant.addLevel());
	}

}
