package red.robots;

import java.util.HashMap;

public class ShipTree {
	private CorePart core;
	private static int PartID =0;
	private HashMap<Integer, Part> partsMap;
	
	public ShipTree(String shipName){
		core = new CorePart(PartID++);
		partsMap = new HashMap<Integer, Part>();
		partsMap.put(core.getID(), core);
	}
	
	
}
