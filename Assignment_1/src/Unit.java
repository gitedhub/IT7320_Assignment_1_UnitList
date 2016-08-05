
public class Unit {
	
	private String name;
	private boolean occupied;
	private UnitType type;
	
	Unit(String name, UnitType type){
		this.name = name;
		this.type = type;
		this.occupied = false;
	}
	
	public boolean isOccupied() {
		return occupied;
	}
	public void setOccupied( boolean b ) {
		occupied = b;
	}
}
