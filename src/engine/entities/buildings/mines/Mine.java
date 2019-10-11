package engine.entities.buildings.mines;

import engine.entities.buildings.Building;

public abstract class Mine extends Building {
	private boolean active;
	
	public Mine(String id, int sizeX, int sizeY) {
		super(id, sizeX, sizeX);
	}

}
