package engine.map;

import config.EntityID;
import config.MapConfig;
import engine.entities.buildings.Building;
import engine.entities.buildings.mines.Mine;
import engine.entities.buildings.mines.ResourceType;
import engine.map.terrain.Terrain;
import engine.map.terrain.deposits.Deposit;
import engine.map.terrain.deposits.StoneDeposit;

public class Map {
	private String[][] buildingMap = new String[MapConfig.height][MapConfig.width];
	private Terrain[][] terrainMap = new Terrain[MapConfig.height][MapConfig.width];
	
	public void generateMap() {
		for(int i = 0; i < MapConfig.height; i++) {
			for(int j = 0; j < MapConfig.width; j++) {
				buildingMap[i][j] = "";
				terrainMap[i][j] = new StoneDeposit(EntityID.stoneDeposit + (i * MapConfig.width + j), 100);
				//TODO add terrain gen
			}
		}
	}

	public String buildingAtPos(int x, int y) {
		return buildingMap[y][x];
	}
	
	public void placeBuilding(Building building, int x, int y) {
		for(int i = 0; i < building.getSizeY(); i++) {
			for(int j = 0; j < building.getSizeX(); j++) {
				buildingMap[y + i][x + j] = building.getId();
			}
		}
	}
	//For buildings that collect resources and need to be placed on certain terrain
	public boolean placeMine(Mine mine, int x, int y, ResourceType type) {
		int resourcesOnMap = 0;
		for(int i = 0; i < mine.getSizeY(); i++) {
			for(int j = 0; j < mine.getSizeX(); j++) {
				if(terrainMap[y + i][x + j].isResource() && terrainMap[y + i][x + j].getType() == type) {
					buildingMap[y + i][x + j] = mine.getId();
					resourcesOnMap += ((Deposit)(terrainMap[y + i][x + j])).getResourcesLeft();
				} else {
					return false;
				}
			}
		}
		mine.setResourcesLeft(resourcesOnMap);
		return true;
	}
	
}
