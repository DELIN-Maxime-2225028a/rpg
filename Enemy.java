package rpg;

public class Enemy {
	
  
	private static int hp;
	private static int maxHp;
	private static int attack;
	private static int defence;
	private static int speed;
  
  
	public Enemy() {
		hp = 25;
		maxHp = 25;
		attack = 8;
		defence = 5;
		speed = 5;
	}


	public static int getHp() {
		return hp;
	}

	
	public static void setHp(int hp) {
		Enemy.hp = hp;
	}
	
	
	public static int getMaxHp() {
		return maxHp;
	}


	public static void setMaxHp(int maxHp) {
		Enemy.maxHp = maxHp;
	}


	public static int getAttack() {
		return attack;
	}

	
	public static void setAttack(int attack) {
		Enemy.attack = attack;
	}

	
	public static int getDefence() {
		return defence;
	}

	
	public static void setDefence(int defence) {
		Enemy.defence = defence;
	}

	
	public static int getSpeed() {
		return speed;
	}

	
	public static void setSpeed(int speed) {
		Enemy.speed = speed;
	}

	
	public String toString() {
		return "Health : "+hp+"/"+maxHp;
	}
}
