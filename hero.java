package rpg;

public class Hero {
	
	private int xp;
	private int hp;
	private int attack;
	private int defence;
	private int speed;

	public Hero() {
		xp = 0;
		hp = 100;
		attack = 10;
		defence = 10;
		speed = 10;
	}
	
	
	public int getXp() {
		return xp;
	}


	public void setXp(int xp) {
		this.xp = xp;
	}


	public int getHp() {
		return hp;
	}

	
	public void setHp(int hp) {
		this.hp = hp;
	}

	
	public int getAttack() {
		return attack;
	}

	
	public void setAttack(int attack) {
		this.attack = attack;
	}

	
	public int getDefence() {
		return defence;
	}

	
	public void setDefence(int defence) {
		this.defence = defence;
	}

	
	public int getSpeed() {
		return speed;
	}

	
	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public String toString() {
		return "Health : "+hp+"\nAttack : "+attack+"\nDefence : "+defence+"\nSpeed : "+speed+"\nExperience : "+xp;
	}
	
	

}
