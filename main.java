package rpg;

import java.util.Scanner;

public class main {
	public static void main(String[] Args) {
		Map map1 = new Map();
		map1.place(12,2,'O');

		//map1.moveUpward();
		//map1.moveDownward();
		//map1.moveLeftward();
		//map1.moveRightward();

		Scanner scan1 = new Scanner(System.in);
		char key = scan1.next().charAt(0);
		switch(key) {
		case 'z':map1.moveUpward();
			break;
		case 'q':map1.moveLeftward();
			break;
		case 's':map1.moveDownward();
			break;
		case 'd':map1.moveRightward();
			break;
		}
		
		map1.showMap();
	}
}
