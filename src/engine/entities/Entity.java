package engine.entities;

public abstract class Entity {
	private String id;
	
	public Entity(String id) {
		this.id = id;
	}
	
	public abstract void update();
	
	public String getId() {
		return this.id;
	}
}
