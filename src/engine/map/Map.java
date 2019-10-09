package engine.map;

import config.MapConfig;

public class Map {
	private String[][] mapData = new String[MapConfig.width][MapConfig.height];
	
	public void generateMap() {
		for(int i = 0; i < MapConfig.height; i++) {
			for(int j = 0; j < MapConfig.width; j++) {
				mapData[j][i] = "";
			}
		}
	}
	
	public String idAtPos(int x, int y) {
		return mapData[y][x];
	}
	
	public void placeEntity(String id, int x, int y, int sizeX, int sizeY) {
		for(int i = 0; i < sizeY; i++) {
			for(int j = 0; j < sizeX; j++) {
				mapData[y+i][x+j] = id;
			}
		}
	}
}
