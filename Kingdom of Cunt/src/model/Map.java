package model;
/**
 * @author JACWALKE
 *
 */

import java.util.HashMap;
import java.util.Set;

public class Map {
	private String description;
	HashMap<String, Map> exits;
	private NPC npc;

	public Map(String description){
		this.description = description;
		exits = new HashMap<String, Map>();
	}

	public void setExits(String direction, Map neighbour){
		exits.put(direction, neighbour);
	}

	public Map getExit(String direction){
		return exits.get(direction);
	}

	public String getDescription(){
		return description;
	}

	public String getExitsString(){
		String exitString = "";
		Set<String> directions = exits.keySet();
		for(String d : directions){
			exitString += d;
		}
		return exitString;
	}

	public String getLongDescription(){
		String longDescription = "You are " + description + ". \n Your exits are: "
				+ getExitsString();
		return longDescription;
	}

	public boolean hasNPC(){
		if (npc != null){
			return true;
		}
		else{
			return false;
		}
	}
	
	public NPC getNPC(){
		return npc;
	}
	
	public void setNPC( NPC npc){
		this.npc = npc;
	}
	
}




