package main;

import engine.map.Map;
import entities.buildings.mines.StoneQuarry;

public class Main {

	public static void main(String[] args) {
		StoneQuarry sq = new StoneQuarry("Test");
		Map map = new Map();
		
		map.generateMap();
		map.placeEntity(sq.getId(), 0, 0, 3, 3);
		System.out.println("Test: \"" + map.idAtPos(2, 2) + "\"");
		
	}

}
