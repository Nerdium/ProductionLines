package engine.entities.buildings;

import engine.entities.Entity;

public abstract class Building extends Entity {
	private int sizeX, sizeY;
	
	public Building(String id, int sizeX, int sizeY) {
		super(id);
		this.sizeX = sizeX;
		this.sizeY = sizeY;
	}
	
	public abstract void build();
	
	public int getSizeX() {
		return this.sizeX;
	}
	
	public int getSizeY() {
		return this.sizeY;
	}
	
}
