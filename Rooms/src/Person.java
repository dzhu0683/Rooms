
public class Person {
	String firstName;
	String familyName;
	int xLoc, yLoc;
	private int health = 200;
	private int level = 1;
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void loseHealth(int damage)
	{
		this.health = this.health - damage;
	}
	
	public void restoreHealth()
	{
		this.health = 200;
	}
	
	public int addLevel()
	{
		return this.level + 1;
	}
	
	public int getxLoc() 
	{
		return xLoc;
	}

	public void setxLoc(int xLoc) 
	{
		this.xLoc = xLoc;
	}

	public int getyLoc() 
	{
		return yLoc;
	}

	public void setyLoc(int yLoc) 
	{
		this.yLoc = yLoc;
	}

	public Person (String firstName, String familyName, int xLoc, int yLoc)
	{
		this.firstName = firstName;
		this.familyName = familyName;
		this.xLoc = xLoc;
		this.yLoc = yLoc;
	}


}
