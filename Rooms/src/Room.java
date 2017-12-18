
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
		public board (Room [][] rooms)
		{
			this.rooms = rooms;
		}
		public board(int size)
		{
			this.rooms = new Room [size] [size];
		}
	}
	
	public Room()
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

	public void print() {
		// TODO Auto-generated method stub
		
	}
	
}
