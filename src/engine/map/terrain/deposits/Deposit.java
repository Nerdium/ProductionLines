package engine.map.terrain.deposits;

import engine.entities.buildings.mines.ResourceType;
import engine.map.terrain.Terrain;

public abstract class Deposit extends Terrain {
	protected ResourceType resourceType;
	private int resourcesLeft;
	
	public Deposit(String id, int resourcesLeft) {
		super(id);
		this.isResource = true;
		this.resourcesLeft = resourcesLeft;
	}
	
	@Override
	public boolean isResource() {
		return true;
	}
	
	public int getResourcesLeft() {	
		return this.resourcesLeft;
	}
}
