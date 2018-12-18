package ants;
import ants.Ant.Type;


public class Soldier extends Ant {

	public Soldier() {
		this.type = Ant.Type.Soldier;
		this.id = ++idCounter;
	}

	@Override
	protected void next() {
		// TODO Auto-generated method stub

	}

}
