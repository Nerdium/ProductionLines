package engine.map.terrain.deposits;

import engine.entities.buildings.mines.ResourceType;
import engine.map.terrain.Terrain;

public abstract class Deposit extends Terrain {
	protected ResourceType resourceType;
	
	public Deposit(String id) {
		super(id);
		this.isResource = true;
	}
	
	@Override
	public boolean isResource() {
		return true;
	}
	
}
