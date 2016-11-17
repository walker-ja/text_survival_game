/**
 * 
 */
package model;

import java.util.Random;

/**
 * @author JACWALKE
 *
 */
public class NPC {
	private String type;
	private static final double APPEARANCE_PROB = 0.7;
	private static Random rand = new Random();
	
	private NPC(String type){
		this.type = type;
	}
	
	public static NPC buildNPC(){
		NPC oldMan;
		oldMan = new NPC("Old Man");
		double rand1 = rand.nextDouble();
		
		if(rand1 < APPEARANCE_PROB){
			return oldMan;
		}
		else{
			return null;
		}
	}

}
