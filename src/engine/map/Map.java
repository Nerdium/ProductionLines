package engine.map;

import config.MapConfig;
import engine.entities.buildings.mines.ResourceType;
import engine.map.terrain.Terrain;

public class Map {
	private String[][] buildingMap = new String[MapConfig.height][MapConfig.width];
	private Terrain[][] terrainMap = new Terrain[MapConfig.height][MapConfig.width];
	
	public void generateMap() {
		for(int i = 0; i < MapConfig.height; i++) {
			for(int j = 0; j < MapConfig.width; j++) {
				buildingMap[i][j] = "";
				
			}
		}
	}

	public String buildingAtPos(int x, int y) {
		return buildingMap[y][x];
	}
	
	public void placeBuilding(String id, int x, int y, int sizeX, int sizeY) {
		for(int i = 0; i < sizeY; i++) {
			for(int j = 0; j < sizeX; j++) {
				buildingMap[y + i][x + j] = id;
			}
		}
	}
	
	public boolean placeBuilding(String id, int x, int y, int sizeX, int sizeY, ResourceType type) {
		for(int i = 0; i < sizeY; i++) {
			for(int j = 0; j < sizeX; j++) {
				if(terrainMap[y + i][x + j].isResource() && terrainMap[y + i][x + j].getType() == type) {
					buildingMap[y + i][x + j] = id;
				}
			}
		}
		return true;
	}
	
}
