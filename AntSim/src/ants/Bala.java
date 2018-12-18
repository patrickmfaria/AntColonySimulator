package ants;
import ants.Ant.Type;


public class Bala extends Ant {

	public Bala() {
		this.type = Ant.Type.Soldier;
		this.id = ++idCounter;
	}

	@Override
	protected void next() {
		// TODO Auto-generated method stub

	}

}
