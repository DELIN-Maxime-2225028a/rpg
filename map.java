package rpg;

public class Map {

	private int nbRow;
	private int nbCol;
	private char[][] map1;


	public Map() {
		nbRow = 15;
		nbCol = 15;
		map1 = new char[nbRow][nbCol];
		for(int i=0;i<nbRow;++i) {
			for(int j=0;j<nbCol;++j) {
				map1[i][j]='.';
			}
		}
	}
	
	
	public int getNbRow() {
		return nbRow;
	}


	public void setNbRow(int nbRow) {
		this.nbRow = nbRow;
	}


	public char getCell(int row, int col) {
		return map1[row][col];
	}


	public void showMap() {
		System.out.println();
		for(int i=0;i<nbRow;++i) {
			for(int j=0;j<nbCol;++j) {
				System.out.print(" | " + map1[i][j]);
			}
			System.out.println(" | ");
		}
		System.out.println();
	}


	public void place(int row, int col, char type) {
		if(row<0||row>nbRow||col<0||col>nbCol) {
			System.out.println("Placement error (outside the borders)");
			return;
		}
		if(map1[row][col]=='.') {
			map1[row][col]=type;
		}
		else
			System.out.println("Placement error (cell is not empty)");
	}


	public boolean checkBoss() {
		boolean status = true;
		for(int i=0;i<nbRow;++i) {
			for(int j=0;j<nbCol;++j) {
				if(map1[i][j]=='X')
					status = true;
				else
					status = false;
			}
		}
		return status;
	}
	
	
	public boolean endGame() {
		boolean status = false;
		/*if(checkBoss()==false)
			status=true;*/
		return status;
	}


	public static void clearScreen() {
		for (int i = 0; i < 200; ++i) System.out.println(); 
	}

	public void moveUpward() {
		char tmp;
		for(int i=0;i<nbRow;++i) {
			for(int j=0;j<nbCol;++j) {
				if(map1[i][j]=='O') {
					if(i-1>=0 && map1[i-1][j]=='.') { //if empty cell
						tmp=map1[i][j];
						map1[i][j]='.';
						map1[i-1][j]=tmp;
						break;
					}
					else if(i+1>=0 && map1[i-1][j]=='x' || map1[i-1][j]=='X') { //if enemy x=enemy, X=boss
						tmp=map1[i][j];
						map1[i][j]='.';
						map1[i-1][j]=tmp;
						break;
					}
					else if(i+1>=0 && map1[i-1][j]=='K') { //if item K=item
						tmp=map1[i][j];
						map1[i][j]='.';
						map1[i-1][j]=tmp;
						break;
					}
				}
			}
		}
	}



	public void moveDownward() {
		char tmp;
		boolean breaked = false;
		for(int i=0;i<nbRow;++i) {
			for(int j=0;j<nbCol;++j) {
				if(map1[i][j]=='O') {
					if(i+1<nbRow && map1[i+1][j]=='.') { //if empty cell
						tmp=map1[i][j];
						map1[i][j]='.';
						map1[i+1][j]=tmp;
						breaked = true;
						break;
					}
					else if(i+1<nbRow && map1[i+1][j]=='x' || map1[i+1][j]=='X') { //if enemy x=enemy, X=boss
						tmp=map1[i][j];
						map1[i][j]='.';
						map1[i+1][j]=tmp;
						break;
					}
					else if(i+1<nbRow && map1[i+1][j]=='K') { //if item K=item
						tmp=map1[i][j];
						map1[i][j]='.';
						map1[i+1][j]=tmp;
						break;
					}
				}
			}
			if(breaked) {
				break;
			}
		}
	}



	public void moveLeftward() {
		char tmp;
		for(int i=0;i<nbRow;++i) {
			for(int j=0;j<nbCol;++j) {
				if(map1[i][j]=='O') {
					if(i-1>=0 && map1[i][j-1]=='.') { //if empty cell
						tmp=map1[i][j];
						map1[i][j]='.';
						map1[i][j-1]=tmp;
						break;
					}
					else if(i+1>=0 && map1[i][j-1]=='x' || map1[i][j-1]=='X') { //if enemy x=enemy, X=boss
						tmp=map1[i][j];
						map1[i][j]='.';
						map1[i][j-1]=tmp;
						break;
					}
					else if(i+1>=0 && map1[i][j-1]=='K') { //if item K=item
						tmp=map1[i][j];
						map1[i][j]='.';
						map1[i][j-1]=tmp;
						break;
					}
				}
			}
		}
	}


	public void moveRightward() {
		char tmp;
		for(int i=0;i<nbRow;++i) {
			for(int j=0;j<nbCol;++j) {
				if(map1[i][j]=='O') {
					if(j+1<nbRow && map1[i][j+1]=='.') { //if empty cell
						tmp=map1[i][j];
						map1[i][j]='.';
						map1[i][j+1]=tmp;
						break;
					}
					else if(j+1<nbRow && map1[i][j+1]=='x' || map1[i][j+1]=='X') { //if enemy x=enemy, X=boss
						tmp=map1[i][j];
						map1[i][j]='.';
						map1[i][j+1]=tmp;
						break;
					}
					else if(j+1<nbRow && map1[i][j+1]=='K') { //if item K=item
						tmp=map1[i][j];
						map1[i][j]='.';
						map1[i][j+1]=tmp;
						break;
					}
				}
			}
		}
	}
}
