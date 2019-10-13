package engine.entities.buildings.mines;

import config.EntityID;

public class StoneQuarry extends Mine {

	public StoneQuarry(String id) {
		super(EntityID.stoneQuarry + id, 3, 3);
		this.resourceType = ResourceType.STONE;
	}

	@Override
	public void update() {
		
	}

	@Override
	public void build() {
		
		
	}

}
