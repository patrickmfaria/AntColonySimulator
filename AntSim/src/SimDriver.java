
public class SimDriver {
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				Simulation sim = new Simulation(27, 27);
				sim.initSim();
			}
		});
	}
}
