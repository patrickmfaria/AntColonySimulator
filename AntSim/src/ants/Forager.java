package ants;
import ants.Ant.Type;


public class Forager extends Ant {

	public Forager() {
		this.type = Ant.Type.Forager;
		this.id = ++idCounter;
	}

	@Override
	protected void next() {
		// TODO Auto-generated method stub

	}

}
