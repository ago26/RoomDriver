
import java.util.Scanner;

public class RoomDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Room room = new Room ();
		System.out.println(room);
		Room room2 = new Room ("yellow ", "hard wood flooring ", 1 );
		System.out.println(room2.toString());
		Room room3 = new Room ("purple ", "tiled flooring ", 0 );
		System.out.println(room3.toString());
		Room room4 = new Room ("white ", "carpet flooring ", 3 );
		System.out.println(room4.toString());
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println(" Please provide the color of the room...");
		String color = keyboard.next();
		room.setColor(color);
		System.out.println(color);

	}

}

