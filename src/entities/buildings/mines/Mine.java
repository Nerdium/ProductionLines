package entities.buildings.mines;

import entities.buildings.Building;

public abstract class Mine extends Building {
	
	public Mine(String id) {
		super(id);
	}

	public abstract void update();
}
