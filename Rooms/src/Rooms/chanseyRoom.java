package Rooms;
import java.util.Scanner;

import Board.Person;
import Board.Runner;

public class chanseyRoom extends Room
{
	Runner cla = new Runner();
	
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
			System.out.println("You encountered Chansey.");
			System.out.println("You are low on health, would you like to heal");
			System.out.println("1. Yes   2. No");
			int A = sc.nextInt();
			switch (A)
			{
				case 1:
					System.out.println("Chansey heals you to full health");
					occupant.restoreHealth();
				default:
					break;
			}
			break;
		}
		
	}
	public void printRoom()
	{
		System.out.print("[ C ]");
	}
}
