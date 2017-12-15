
public class Room 
{
	Person occupant;
	int xLoc,yLoc;
	
	public Room(int x, int y)
	{
		xLoc = x;
		yLoc = y;
	}
	
	public class board
	{
		private Room [][] rooms;
		public Board (Rooms [][] rooms)
		{
			this.rooms = rooms
		}
		public Board(int size)
		{
			this.rooms = new Rooms [size] [size];
		}
	}
	
	public printBoard()
	{
		for(Room[] i : rooms)
		{
			for(Room j : i)
			{
				System.out.print(j);
			}
		}
	}
	
	public void enterRoom(Person x)
	{
		System.out.println("You enter a plain old room");
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
	}
	
	public void leaveRoom(Person x)
	{
		occupant = null;
	}
	
}
