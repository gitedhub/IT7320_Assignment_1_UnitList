
public class Unit {
	
	private String name;
	private boolean occupied;
	
	Unit(String name){
		this.name = name;
		this.occupied = false;
	}
	
	public boolean isOccupied() {
		return occupied;
	}
	public void setOccupied( boolean b ) {
		occupied = b;
	}
}
