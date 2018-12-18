package ants;

public abstract class Ant {
	protected static int idCounter = 0;
	
	private static final int TURNS_PER_DAY = 10; 
	protected static final int MAX_QUEEN_AGE = TURNS_PER_DAY * (20 * 365);
	protected static final int DEFAULT_AGE = TURNS_PER_DAY * 365;
	
	protected Type type;
	protected int id;
	protected int maxAge;
	protected int currentAge;
	
	protected abstract void next();
	
	public enum Type {
		Queen, Forager, Scout, Soldier, Bala
	}
}
