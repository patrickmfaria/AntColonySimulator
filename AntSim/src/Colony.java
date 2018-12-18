
public class Colony {
	private ColonyView cv;
	private ColonyNode colonyNodes[][];
	
	public ColonyView getCv() {
		return cv;
	}

	public void setCv(ColonyView cv) {
		this.cv = cv;
	}
	
	public Colony(int colonyHeight, int colonyWidth) {
		this.cv = new ColonyView(colonyHeight, colonyWidth);
		this.colonyNodes = new ColonyNode[colonyWidth][colonyHeight];
	}
	
	public void addColonyNode(ColonyNode node, int x, int y) {
		colonyNodes[x][y] = node;
		cv.addColonyNodeView(node.getCnv(), x, y);
	}
}
