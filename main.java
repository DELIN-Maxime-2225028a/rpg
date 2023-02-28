package rpg;

import java.util.Scanner;

public class main {
	public static void main(String[] Args) {
		Map map1 = new Map();
		for(int i=0;i<15;++i)
			map1.place(i, 0, '#');
		for(int i=1;i<15;++i)
			map1.place(0, i, '#');
		for(int i=1;i<15;++i)
			map1.place(i, 14, '#');
		for(int i=1;i<14;++i)
			map1.place(14, i, '#');
		map1.place(12, 2, '#');
		map1.place(13, 2, '#');
		map1.place(10, 1, '#');
		map1.place(10, 3, '#');
		map1.place(9, 3, '#');
		map1.place(8, 3, '#');
		map1.place(8, 2, '#');
		map1.place(8, 4, '#');
		map1.place(8, 5, '#');
		map1.place(8, 6, '#');
		map1.place(8, 7, '#');
		map1.place(8, 8, '#');
		
		
		map1.place(13,1,'O');
		map1.place(1, 13, 'X');

		//map1.moveUpward();
		//map1.moveDownward();
		//map1.moveLeftward();
		//map1.moveRightward();

		while(map1.endGame()==false) {
			map1.showMap();
			System.out.println();
			Scanner scan1 = new Scanner(System.in);
			char key = scan1.next().charAt(0);
			switch(key) {
			case 'z':
				map1.moveUpward();
				break;

			case 'q':
				map1.moveLeftward();
				break;

			case 's':
				map1.moveDownward();
				break;

			case 'd':
				map1.moveRightward();
				break;
			}
			map1.clearScreen();
		}
	}
}
