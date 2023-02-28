package rpg;

public class Hero {
	
  
	public static int lvl;
	private static int hp;
	private static int maxHp;
	private static int attack;
	private static int defence;
	private static int speed;

  
	public Hero() {
		lvl = 1;
		hp = 50;
		maxHp = 50;
		attack = 11+1*lvl;
		defence = 2+1*lvl;
		speed = 10;
	}
	
	
	public static int getLvl() {
		return lvl;
	}


	public static void setLvl(int lvl) {
		Hero.lvl = lvl;
	}


	public static int getHp() {
		return hp;
	}

	
	public static void setHp(int hp) {
		Hero.hp = hp;
	}

	
	public static int getMaxHp() {
		return maxHp;
	}


	public static void setMaxHp(int maxHp) {
		Hero.maxHp = maxHp;
	}


	public static int getAttack() {
		return attack;
	}

	
	public static void setAttack(int attack) {
		Hero.attack = attack;
	}

	
	public static int getDefence() {
		return defence;
	}

	
	public static void setDefence(int defence) {
		Hero.defence = defence;
	}

	
	public static int getSpeed() {
		return speed;
	}

	
	public static void setSpeed(int speed) {
		Hero.speed = speed;
	}

	
	public String toString() {
		return "Level : "+lvl+"\nHealth : "+hp+"/"+maxHp+"\nAttack : "+attack+"\nDefence : "+defence+"\nSpeed : "+speed;
	}
}
