package engine.entities.buildings.mines;

import java.util.ArrayList;

import engine.entities.buildings.Building;
import engine.entities.buildings.buildingTypes.HasInventory;
import engine.map.terrain.deposits.Deposit;
import items.Item;

public abstract class Mine extends Building implements HasInventory {
	protected ResourceType resourceType;
	protected int resourcesLeft;
	protected Deposit[] deposits;
	private Item[] inventory;
	
	public Mine(String id, int sizeX, int sizeY) {
		super(id, sizeX, sizeX);
	}
	
	public void setResources(ArrayList<Deposit> deposits) {
		deposits.forEach(deposit -> this.resourcesLeft += deposit.getResourcesLeft());
	}
	
	public ResourceType getResource() {
		return this.resourceType;
	}
	@Override
	public void createInventory(int size) {
		this.inventory = new Item[size];
	}
	
	@Override
	public Item[] getInventory() {
		return this.inventory;
	}
}
