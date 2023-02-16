package rpg;

public class goblin {
	
	private int hp;
	private int baseAttack;
	private int baseDefense;
	private int baseSpeed;

	public void Entity(int x, int y, int hp, int baseAttack, int baseDefense, int baseSpeed) {
		super();
		this.hp = hp;
		this.baseAttack = baseAttack;
		this.baseDefense = baseDefense;
		this.baseSpeed = baseSpeed;
	}

	public int getHP() {
		return hp;
	}

	public void setHP(int hp) {
		this.hp = hp;
	}

	public int getBaseAttack() {
		return baseAttack;
	}

	public void setBaseAttack(int baseAttack) {
		this.baseAttack = baseAttack;
	}

	public int getBaseDefense() {
		return baseDefense;
	}

	public void setBaseDefense(int baseDefense) {
		this.baseDefense = baseDefense;
	}

	public int getBaseSpeed() {
		return baseSpeed;
	}

	public void setBaseSpeed(int baseSpeed) {
		this.baseSpeed = baseSpeed;
	}

}
