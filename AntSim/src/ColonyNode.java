import java.util.ArrayList;

import ants.Ant;
import ants.Bala;
import ants.Forager;
import ants.Queen;
import ants.Scout;
import ants.Soldier;


public class ColonyNode {
	private ColonyNodeView cnv;
	private ArrayList<Ant> ants;
	private int soldierCount;
	private int foragerCount;
	private int scoutCount;
	private int balaCount;
	private int foodUnits;
	private int pheramoneUnits;

	public ColonyNodeView getCnv() {
		return cnv;
	}

	public void setCnv(ColonyNodeView cnv) {
		this.cnv = cnv;
	}

	public ColonyNode(String id) {
		this.cnv = new ColonyNodeView();
		this.ants = new ArrayList<Ant>();

		this.soldierCount = 0;
		cnv.setSoldierCount(0);
		this.foragerCount = 0;
		cnv.setForagerCount(0);
		this.scoutCount = 0;
		cnv.setScoutCount(0);
		this.balaCount = 0;
		cnv.setBalaCount(0);
		
		this.pheramoneUnits = 0;
		cnv.setPheromoneLevel(0);
		this.foodUnits = 0;
		cnv.setFoodAmount(0);

		this.cnv.setID(id);
	}

	public void addAnt(Ant.Type type) {
		switch(type) {
		case Queen:
			ants.add(new Queen());
			cnv.setQueen(true);
			cnv.showQueenIcon();
			break;
		case Soldier:
			ants.add(new Soldier());
			cnv.setSoldierCount(++soldierCount);
			cnv.showSoldierIcon();
			break;
		case Forager:
			ants.add(new Forager());
			cnv.setForagerCount(++foragerCount);
			cnv.showForagerIcon();
			break;
		case Scout:
			ants.add(new Scout());
			cnv.setScoutCount(++scoutCount);
			cnv.showScoutIcon();
			break;
		case Bala:
			ants.add(new Bala());
			cnv.setBalaCount(++balaCount);
			cnv.showBalaIcon();
			break;
		default:
			break;
		}

		cnv.showNode();
	}
	
	public void addFood(int units) {
		foodUnits += units;
		cnv.setFoodAmount(foodUnits);
	}
	
	public void addPheramone(int units) {
		pheramoneUnits += units;
		cnv.setPheromoneLevel(pheramoneUnits);
	}
}
