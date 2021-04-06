abstract class Pokemon {
	
	protected static int attackCount;
	
	private int health;
	public final String type;
	
	protected Pokemon(int health, String type) {
		this.health = health;
		this.type = type;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void takeDamage(int damage, String type) {
		if (type.equals(this.type)) damage *= 0.5;
		health -= damage;
	}
	
	public abstract void attack();
}
