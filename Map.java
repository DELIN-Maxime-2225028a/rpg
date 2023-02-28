package rpg;

import java.util.Scanner;
import java.util.Random;

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
					else if(i+1>=0 && map1[i-1][j]=='x' || map1[i-1][j]=='X') { //if enemy x=enemy
						tmp=map1[i][j];
						map1[i][j]='.';
						map1[i-1][j]=tmp;
						fight();
						break;
					}
					else if(i+1>=0 && map1[i-1][j]=='B') { //if boss B=boss
						tmp=map1[i][j];
						map1[i][j]='.';
						map1[i-1][j]=tmp;
						bossFight();
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
					else if(i+1<nbRow && map1[i+1][j]=='x') { //if enemy x=enemy
						tmp=map1[i][j];
						map1[i][j]='.';
						map1[i+1][j]=tmp;
						fight();
						breaked = true;
						break;
					}
					else if(i+1<nbRow && map1[i+1][j]=='B') { //if boss B=boss
						tmp=map1[i][j];
						map1[i][j]='.';
						map1[i+1][j]=tmp;
						bossFight();
						breaked = true;
						break;
					}
					else if(i+1<nbRow && map1[i+1][j]=='K') { //if item K=item
						tmp=map1[i][j];
						map1[i][j]='.';
						map1[i+1][j]=tmp;
						breaked = true;
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
					else if(i+1>=0 && map1[i][j-1]=='x') { //if enemy x=enemy
						tmp=map1[i][j];
						map1[i][j]='.';
						map1[i][j-1]=tmp;
						fight();
						break;
					}
					else if(i+1>=0 && map1[i][j-1]=='B') { //if boss B=boss
						tmp=map1[i][j];
						map1[i][j]='.';
						map1[i][j-1]=tmp;
						bossFight();
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
					else if(j+1<nbRow && map1[i][j+1]=='x') { //if enemy x=enemy
						tmp=map1[i][j];
						map1[i][j]='.';
						map1[i][j+1]=tmp;
						fight();
						break;
					}
					else if(j+1<nbRow && map1[i][j+1]=='B') { //if boss B=boss
						tmp=map1[i][j];
						map1[i][j]='.';
						map1[i][j+1]=tmp;
						bossFight();
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


	Random random = new Random();
	Hero hero = new Hero();
	Enemy enemy = new Enemy();
	Boss boss = new Boss();
	

	public void fight() {
		boolean yourTurn = true;
		int yourHp = Hero.getHp();
		int damageTaken=0;
		int yourDefence = Hero.getDefence();
		int enemyHp = Enemy.getHp();
		int damageDealt=0;
		int enemyDefence = Enemy.getDefence();

		System.out.println(yourHp+", "+enemyHp);
		while(yourHp>0 && enemyHp>0) {
			if(yourTurn) {
				System.out.println("Your turn !");
				System.out.println("You : ");
				System.out.println("Level : "+Hero.getLvl()+"\nHealth : "+yourHp+"/"+Hero.getMaxHp()+"\nAttack : "+Hero.getAttack()+"\nDefence : "+Hero.getDefence()+"\nSpeed : "+Hero.getSpeed());
				System.out.println("\n\nYour opponent : ");
				System.out.println("Health : "+enemyHp+"/"+Enemy.getMaxHp());
				System.out.println("\n\nChoose your action : \na : Attack\ne : Defend");

				System.out.println();
				Scanner scan1 = new Scanner(System.in);
				char Action = scan1.next().charAt(0);
				switch(Action) {
				case 'a' : 
					damageDealt=Hero.getAttack()-enemyDefence;
					enemyHp=enemyHp-(Hero.getAttack()-enemyDefence);
					System.out.println("You are attacking ! You dealt "+damageDealt+" damage !");
					break;
				case 'e' :
					yourDefence=yourDefence*2;
					System.out.println("You are preparing to parry enemy next attack !");
					break;
				}
				enemyDefence=Enemy.getDefence();
				yourTurn=false;
			}
			else {
				System.out.println("Enemy turn !");
				int randomAction = random.nextInt(2);
				if(randomAction==0) {
					damageTaken=Enemy.getAttack()-yourDefence;
					yourHp=yourHp-(Enemy.getAttack()-yourDefence);
					System.out.println("Enemy is attacking you ! You lost "+damageTaken+" health !");
				}
				else if(randomAction==1) {
					enemyDefence=enemyDefence*2;
					System.out.println("Enemy is preparing to parry your next attack !");
				}
				yourDefence=Hero.getDefence();
				yourTurn=true;
			}
		}
		if(enemyHp==0) {
			System.out.println("You defeated the enemy and reached level "+Hero.getLvl()+" !");
			Hero.setLvl(Hero.getLvl()+1);
		}
	}
	
	
	public void bossFight() {
		boolean yourTurn = false;
		int yourHp = Hero.getHp();
		int damageTaken=0;
		int yourDefence = Hero.getDefence();
		int bossHp = Boss.getHp();
		int damageDealt=0;
		int bossDefence = Boss.getDefence();

		while(yourHp>0 && bossHp>0) {
			if(yourTurn) {
				System.out.println("Your turn !");
				System.out.println("You : ");
				System.out.println("Level : "+Hero.getLvl()+"\nHealth : "+yourHp+"/"+Hero.getMaxHp()+"\nAttack : "+Hero.getAttack()+"\nDefence : "+Hero.getDefence()+"\nSpeed : "+Hero.getSpeed());
				System.out.println("\n\nYour opponent : ");
				System.out.println("Health : "+bossHp+"/"+Boss.getMaxHp());
				System.out.println("\n\nChoose your action : \na : Attack\ne : Defend");

				System.out.println();
				Scanner scan1 = new Scanner(System.in);
				char Action = scan1.next().charAt(0);
				switch(Action) {
				case 'a' : 
					damageDealt=Hero.getAttack()-bossDefence;
					bossHp=bossHp-(Hero.getAttack()-bossDefence);
					System.out.println("You are attacking ! You dealt "+damageDealt+" damage !");
					break;
				case 'e' :
					yourDefence=yourDefence*2;
					System.out.println("You are preparing to parry boss next attack !");
					break;
				}
				bossDefence=Boss.getDefence();
				yourTurn=false;
			}
			else {
				System.out.println("Boss turn !");
				int randomAction = random.nextInt(2);
				if(randomAction==0) {
					damageTaken=Boss.getAttack()-yourDefence;
					yourHp=yourHp-(Boss.getAttack()-yourDefence);
					System.out.println("Enemy is attacking you ! You lost "+damageTaken+" health !");
				}
				else if(randomAction==1) {
					bossDefence=bossDefence*2;
					System.out.println("Enemy is preparing to parry your next attack !");
				}
				yourDefence=Hero.getDefence();
				yourTurn=true;
			}
		}
		if(bossHp==0) {
			System.out.println("You have triumphed over the maze, congratulations !");
		}
	}
}
