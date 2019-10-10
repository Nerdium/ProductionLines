package engine.map;

import config.MapConfig;
import entities.terrain.Terrain;

public class Map {
	private String[][] buildingMap = new String[MapConfig.width][MapConfig.height];
	private Terrain[][] terrainMap = new Terrain[MapConfig.width][MapConfig.height];
	
	public void generateMap() {
		for(int i = 0; i < MapConfig.height; i++) {
			for(int j = 0; j < MapConfig.width; j++) {
				buildingMap[j][i] = "";
			}
		}
	}
	
	public String buildingAtPos(int x, int y) {
		return buildingMap[y][x];
	}
	
	public Terrain terrainAtPos(int x, int y) {
		return terrainMap[y][x];
	}
	
	
	public void placeEntity(String id, int x, int y, int sizeX, int sizeY) {
		for(int i = 0; i < sizeY; i++) {
			for(int j = 0; j < sizeX; j++) {
				buildingMap[y+i][x+j] = id;
			}
		}
	}
}
