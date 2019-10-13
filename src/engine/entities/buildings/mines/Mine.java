package engine.entities.buildings.mines;

import engine.entities.buildings.Building;

public abstract class Mine extends Building {
	protected ResourceType resourceType;
	protected int resourcesLeft;
	
	public Mine(String id, int sizeX, int sizeY) {
		super(id, sizeX, sizeX);
	}
	
	public ResourceType getResource() {
		return this.resourceType;
	}
	
	public void setResourcesLeft(int resourcesLeft) {
		this.resourcesLeft = resourcesLeft;
	}

}
