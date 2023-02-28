package rpg;

import java.util.Scanner;

public class main {
	public static void main(String[] Args) {
		Map map1 = new Map();
		
		
		//Map generation
		
		for(int i=0;i<15;++i)
			map1.place(i, 0, '#');
		for(int i=1;i<15;++i)
			map1.place(0, i, '#');
		for(int i=1;i<15;++i)
			map1.place(i, 14, '#');
		for(int i=1;i<14;++i)
			map1.place(14, i, '#');
		map1.place(13, 2, '#');
		map1.place(13, 7, '#');
		map1.place(13, 9, '#');
		map1.place(13, 13, '#');
		map1.place(12, 2, '#');
		map1.place(12, 3, '#');
		map1.place(12, 4, '#');
		map1.place(12, 5, '#');
		map1.place(12, 11, '#');
		map1.place(12, 13, '#');
		map1.place(11, 5, '#');
		map1.place(11, 6, '#');
		map1.place(11, 8, '#');
		map1.place(11, 10, '#');
		map1.place(11, 11, '#');
		map1.place(11, 13, '#');
		map1.place(10, 1, '#');
		map1.place(10, 3, '#');
		map1.place(10, 5, '#');
		map1.place(10, 8, '#');
		map1.place(10, 11, '#');
		map1.place(9, 12, '#');
		map1.place(9, 11, '#');
		map1.place(9, 10, '#');
		map1.place(9, 9, '#');
		map1.place(9, 8, '#');
		map1.place(9, 7, '#');
		map1.place(9, 3, '#');
		map1.place(8, 3, '#');
		map1.place(8, 2, '#');
		map1.place(8, 4, '#');
		map1.place(8, 5, '#');
		map1.place(8, 6, '#');
		map1.place(8, 7, '#');
		map1.place(8, 8, '#');
		map1.place(8, 12, '#');
		map1.place(7, 8, '#');
		map1.place(7, 7, '#');
		map1.place(7, 10, '#');
		map1.place(6, 8, '#');
		map1.place(6, 2, '#');
		map1.place(6, 3, '#');
		map1.place(6, 4, '#');
		map1.place(6, 5, '#');
		map1.place(6, 7, '#');
		map1.place(6, 10, '#');
		map1.place(6, 11, '#');
		map1.place(6, 12, '#');
		map1.place(5, 7, '#');
		map1.place(5, 2, '#');
		map1.place(5, 5, '#');
		map1.place(5, 6, '#');
		map1.place(5, 11, '#');
		map1.place(4, 7, '#');
		map1.place(4, 2, '#');
		map1.place(4, 3, '#');
		map1.place(4, 9, '#');
		map1.place(4, 11, '#');
		map1.place(4, 12, '#');
		map1.place(4, 13, '#');
		map1.place(3, 3, '#');
		map1.place(3, 4, '#');
		map1.place(3, 5, '#');
		map1.place(3, 7, '#');
		map1.place(3, 9, '#');
		map1.place(2, 12, '#');
		map1.place(2, 11, '#');
		map1.place(2, 10, '#');
		map1.place(2, 9, '#');
		map1.place(2, 7, '#');
		map1.place(2, 5, '#');
		map1.place(2, 1, '#');
		map1.place(1, 12, '#');
		map1.place(1, 7, '#');
		map1.place(1, 1, '#');

		map1.place(13,1,'O'); //Hero
		map1.place(1, 13, 'B');//Boss
		map1.place(1, 10, 'x');
		map1.place(5, 4, 'x');//Basic enemies
		map1.place(13, 4, 'x');
		map1.place(1, 11, 'K');
		map1.place(5, 3, 'K');//Random item
		map1.place(13, 3, 'K');

		
		map1.showMap();
		while(map1.endGame()==false) {
			
			System.out.println();
			Scanner scan1 = new Scanner(System.in);
			char key = scan1.next().charAt(0);
			switch(key) {
			case 'z':
				map1.clearScreen();
				map1.moveUpward();
				map1.showMap();
				break;

			case 'q':
				map1.clearScreen();
				map1.moveLeftward();
				map1.showMap();
				break;

			case 's':
				map1.clearScreen();
				map1.moveDownward();
				map1.showMap();
				break;

			case 'd':
				map1.clearScreen();
				map1.moveRightward();
				map1.showMap();
				break;
			}
		}
	}
}
