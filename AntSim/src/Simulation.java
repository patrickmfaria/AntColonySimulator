import ants.Ant;
import java.util.*;


public class Simulation {
	private AntSimGUI gui;
	private Colony colony;

	public Simulation(int colonyHeight, int colonyWidth) {
		this.gui = new AntSimGUI();
		this.colony = new Colony(colonyHeight, colonyWidth);
	}

	public void initSim()
	{
		gui.initGUI(colony.getCv());

		ColonyNode start = new ColonyNode("13, 13");
		start.addAnt(Ant.Type.Queen);
		for (int i = 0; i < 10; i++)
		{
			start.addAnt(Ant.Type.Soldier);
		}
		for (int i = 0; i < 50; i++)
		{
			start.addAnt(Ant.Type.Forager);
		}
		for (int i = 0; i < 4; i++)
		{
			start.addAnt(Ant.Type.Scout);
		}
		
		start.addFood(1000);
		colony.addColonyNode(start, 13, 13);
		
		for (int i = -1; i <= 1; i++)
		{
			for (int j = -1; j <= 1; j++)
			{
				if (i == 0 && j == 0)
					continue;
				colony.addColonyNode(new ColonyNode(
						Integer.toString(13+i) + ", " + Integer.toString(13+j)), 13+i, 13+j);
			}
		}
	}
	
	public void AddAnts()
	{
		Random r = new Random();
		ColonyNode start = new ColonyNode("13, 13");
		
		//if()
		for(int i = 0; i < 100; i++)
		{
			int rand = r.nextInt(100);
			if(rand >= 50)
			{
				start.addAnt(Ant.Type.Forager);
			}
			
			if(rand <= 25)
			{
				start.addAnt(Ant.Type.Scout);
			}
			
			if(rand >= 100)
			{
				start.addAnt(Ant.Type.Soldier);
			}
		}
	}
	
	public void AddBala()
	{
		Random r = new Random();
		ColonyNode start = new ColonyNode("27, 27");
		
		for(int i = 0; i < 100; i++)
		{
			int rand = r.nextInt(100);
			if(rand <= 3)
			{
				start.addAnt(Ant.Type.Bala);
			}
		}
	}
}
