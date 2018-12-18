import java.awt.Component;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import ants.Ant;

/**
 *	class SimulationEvent
 *
 *	represents an event that can occur in the simulation
 */
public class SimulationEvent extends EventObject
{
	
	/************
	 *	constants
	 ***********/
	
	// types of events
	
	// set up simulation for normal run
	public final static int NORMAL_SETUP_EVENT = 0;
	
	// set up simulation for testing queen ant
	public final static int QUEEN_TEST_EVENT = 1;
	
	// set up simulation for testing scout ant
	public final static int SCOUT_TEST_EVENT = 2;
	
	// set up simulation for testing forager ant
	public final static int FORAGER_TEST_EVENT = 3;
	
	// set up simulation for testing soldier ant
	public final static int SOLDIER_TEST_EVENT = 4;
	
	// run simulation continuously
	public final static int RUN_EVENT = 5;
	
	// run simulation one turn at a time
	public final static int STEP_EVENT = 6;
	
	
	/*************
	 *	attributes
	 ************/
	
	// type of event
	private int eventType;

	
	
	/***************
	 *	constructors
	 **************/
	
	/**
	 *	create a new SimulationEvent
	 *
	 *	@param	source		Object on which event occurred
	 *	@param	eventType	type of event
	 */
	public SimulationEvent(Object source, int eventType)
	{
		super(source);
		this.eventType = eventType;
	}
	
	
	/**********
	 *	methods
	 *********/
	
	/**
	 *	return the type of event this is
	 *
	 *	@return	a valid SimulationEvent type
	 */
	public int getEventType()
	{
		return eventType;
	}
	
	/**
	 * 
	 */
	
	
	public void simulationEventOccurred(SimulationEvent simEvent)
	{
		
		if (simEvent.getEventType() == SimulationEvent.NORMAL_SETUP_EVENT)
		{
			//set up simulation to initialize back to start
			/*gui.initGUI(colony.getCv());

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
			}*/
		}
	
		/*else if (simEvent.getEventType() == SimulationEvent.QUEEN_TEST_EVENT)
		{
			//set up simulation so only the queen shows
			//Simulation sim = new Simulation(27, 27);
			//sim.Queen();
		}
	
		else if (simEvent.getEventType() == SimulationEvent.SCOUT_TEST_EVENT)
		{
			// set up simulation for testing the scout ant
		}

		else if (simEvent.getEventType() == SimulationEvent.FORAGER_TEST_EVENT)
		{
			// set up simulation for testing the forager ant
		}
	
		else if (simEvent.getEventType() == SimulationEvent.SOLDIER_TEST_EVENT)
		{
			// set up simulation for testing the soldier ant
		}*/
	
		else if (simEvent.getEventType() == SimulationEvent.RUN_EVENT)
		{
			
		}
	
		else if (simEvent.getEventType() == SimulationEvent.STEP_EVENT)
		{
			// run the next turn of the simulation
			
		}
	
		else
		{
			// invalid event occurred - probably will never happen
		}
	}
}