package Board;
import Rooms.Room;

public class Board {


    private Room[][] townMap;
 


    public Board(Room[][] townMap)
    {
        this.townMap = townMap;
    }

    public void printMap()
    {
      	
        for(Room[] row :townMap)
        {
 
            for (Room room : row)
            {
            	if(room.occupant!=null)
            	{
            		System.out.print("[ X ]");
            	}
            	else
            	{
            	System.out.print("[   ]");
            	}
            }
            System.out.println();
        }
    }
 
    
    public Room[][] getTownMap() {
        return townMap;
    }

    public void setTownMap(Room[][] townMap) {
    	 this.townMap = townMap;
    }
}
