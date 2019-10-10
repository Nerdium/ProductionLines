package engine;

import java.util.ArrayList;
import entities.Entity;

public class EntityController {
	private ArrayList<Entity> entities = new ArrayList<Entity>();
	
	public void addEntity(Entity entity) {
		entities.add(entity);
	}
	
	public void update() {
		entities.forEach(entity -> entity.update());
	}
}
