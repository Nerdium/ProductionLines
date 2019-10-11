package main;

import engine.entities.buildings.mines.StoneQuarry;
import engine.map.terrain.Map;

public class Main {

	public static void main(String[] args) {
		StoneQuarry sq = new StoneQuarry("Test");
		Map map = new Map();
		
		map.generateMap();
		System.out.println("Test: \"" + map.buildingAtPos(2, 2) + "\"");
		
	}

}
