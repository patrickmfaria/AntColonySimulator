package ants;
import ants.Ant.Type;


public class Scout extends Ant {

	public Scout() {
		this.type = Ant.Type.Scout;
		this.id = ++idCounter;
	}

	@Override
	protected void next() {
		// TODO Auto-generated method stub

	}

}
