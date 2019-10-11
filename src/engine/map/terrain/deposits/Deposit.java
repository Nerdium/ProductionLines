package engine.map.terrain.deposits;

import engine.map.terrain.Terrain;

enum DepositType {
	STONE;
}

public abstract class Deposit extends Terrain {
	
	public Deposit(String id) {
		super(id);
		
	}

}
