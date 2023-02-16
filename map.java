package rpg;

public class map {
	public static int[][] map1 = new int[15][15];
	
	public map(){
		for(int i=0;i<map1.length;++i) {
			for(int j=0;j<map1.length;++j) {
				map1[i][j]=0;
			}
		}
		map1[14][0]=2;
		map1[12][0]=3;
		map1[13][0]=5;
		map1[14][2]=1;
	}

	
	public static void showMap() {
		for(int i=0;i<map1.length;++i) {
			System.out.print('|');
			for(int j=0;j<map1.length-1;++j) {
				System.out.print("\t");
				if(map1[i][j]==0) { //case vide
					System.out.print('-');
				}
				else if(map1[i][j]==1) { //obstacle
					System.out.print('#');
				}
				else if(map1[i][j]==2) { //héros
					System.out.print('+');
				}
				else if(map1[i][j]==3) { //ennemi
					System.out.print('x');
				}
				else if(map1[i][j]==4) { //boss
					System.out.print('X');
				}
				else if(map1[i][j]==5) { //item
					System.out.print('°');
				}
			}
			System.out.print("\t");
			System.out.println('|');
		}
		System.out.println();
	}
}
