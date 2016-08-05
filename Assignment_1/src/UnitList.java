import java.util.HashSet;
import java.util.Set;

public class UnitList {
	
	private Set<Unit> unitList;
	
	public void main( String[] args ) {
		unitList = new HashSet<Unit>();
		unitList.add( new Unit( "Sam", UnitType.DogHandler) );
		unitList.add( new Unit( "Beth", UnitType.Officer) );
	}
	
}
