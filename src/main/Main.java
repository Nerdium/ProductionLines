package main;

import engine.entities.buildings.mines.StoneQuarry;
import engine.map.Map;

public class Main {

	public static void main(String[] args) {
		StoneQuarry sq = new StoneQuarry("Test");
		Map map = new Map();
		
		map.generateMap();
		map.placeBuilding(sq.getId(), 0, 0, sq.getSizeX(), sq.getSizeY());
		System.out.println("Test: \"" + map.buildingAtPos(2, 2) + "\"");
		
	}

}
