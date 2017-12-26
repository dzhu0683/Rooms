import java.util.Scanner;

public class chanseyRoom extends Room
{
	public chanseyRoom(int x, int y) 
	{
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	
	private static boolean heal = true;
	
	@Override
	public void enterRoom(Person x) 
	{
		// TODO Auto-generated method stub
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		while(heal)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("You are low on health, would you like to heal");
			System.out.println("1. Yes   2. No");
			int A = sc.nextInt();
			switch (A)
			{
				case 1:
					System.out.print("Chansey heals you to full health");
				default:
					break;
			}
			break;
		}
		
	}
}
