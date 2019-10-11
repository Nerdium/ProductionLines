package engine.map.terrain;

import engine.entities.Entity;
import engine.entities.buildings.mines.ResourceType;

public abstract class Terrain extends Entity {
	protected boolean isResource = false;
	
	public Terrain(String id) {
		super(id);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	public boolean isResource() {
		return false;
	}

	public abstract ResourceType getType();

}
