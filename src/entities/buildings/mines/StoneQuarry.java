package entities.buildings.mines;

import config.EntityID;

public class StoneQuarry extends Mine {

	public StoneQuarry(String id) {
		super(EntityID.stoneQuarry + id, 3, 3);
	}

	@Override
	public void update() {
		
	}

}
