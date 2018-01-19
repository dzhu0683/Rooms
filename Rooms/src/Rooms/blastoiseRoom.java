package Rooms;
import Board.Person;
import Board.Runner;

public class blastoiseRoom extends Room
{
	Runner cla = new Runner();
	
	public blastoiseRoom(int x, int y) 
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
		System.out.println("Torterra uses left Storm");
		occupant.loseHealth(60);
		if(occupant.getHealth() > 0)
		{
			System.out.println("You take damage!");
			System.out.println("You use flamethrower!");
			System.out.print("It's Super Effective!");
			System.out.println("Toterra Faints");
			System.out.println("You leveled up!");
			occupant.addLevel();
			System.out.println("You are level " + occupant.getLevel());
		}
	}

}
