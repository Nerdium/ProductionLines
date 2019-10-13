package engine.entities.buildings.buildingTypes;

import items.Item;

public interface HasInventory {
	
	void createInventory(int size);
	Item[] getInventory();
	
}
