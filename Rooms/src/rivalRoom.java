import java.util.Scanner;
public class rivalRoom extends Room
{
	public rivalRoom(int x, int y) 
	{
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	private static boolean battle = true;
	
	@Override
	public void enterRoom(Person x) 
	{
		// TODO Auto-generated method stub
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("You discover your rival Shiftry doing something suspicious");
		System.out.println("Before you can get a better look at what he's doing, Shiftry discovers you and attacks you!");
		
		while (battle)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Shiftry is charging his Hyper Beam");
			System.out.println("What do you do?");
			System.out.println("1. Attack!   2. Block!");
			System.out.println("3. Run!");
			int A = sc.nextInt();
			switch (A) 
			{
				case 1:
					System.out.println("You use Flamethrower!");
					System.out.println("Your rival Shiftry has fainted!");
					System.out.println("You have fulfilled the request!");
					System.out.println("You return to town triumphantly");
					battle = false;
					break;
				case 2:
					System.out.println("You use protect!");
					if(Math.random() < 0.5)
					{
						System.out.println("Shiftry's attack does not damage");
					}
					else
					{
						System.out.println("But it failed");
					}
					break;
			}
			Runner.gameOff();
		}
		
	}	
}

