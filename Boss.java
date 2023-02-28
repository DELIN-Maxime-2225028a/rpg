package rpg;

public class Boss {

  
	private static int hp;
	private static int maxHp;
	private static int attack;
	private static int defence;
	private static int speed;

  
	public Boss() {
		hp = 60;
		maxHp = 60;
		attack = 12;
		defence = 6;
		speed = 11;
	}


	public static int getHp() {
		return hp;
	}


	public static void setHp(int hp) {
		Boss.hp = hp;
	}


	public static int getMaxHp() {
		return maxHp;
	}


	public static void setMaxHp(int maxHp) {
		Boss.maxHp = maxHp;
	}


	public static int getAttack() {
		return attack;
	}


	public static void setAttack(int attack) {
		Boss.attack = attack;
	}


	public static int getDefence() {
		return defence;
	}


	public static void setDefence(int defence) {
		Boss.defence = defence;
	}


	public static int getSpeed() {
		return speed;
	}


	public static void setSpeed(int speed) {
		Boss.speed = speed;
	}


	public static void info() {
		System.out.println("Health : "+hp+"/"+maxHp);
	}


	public String toString() {
		return "Health : "+hp+"/"+maxHp;
	}
}
