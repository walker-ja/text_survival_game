/**
 * 
 */
package model;

/**
 * @author JACWALKE
 *
 */
public class CommandWords {
	private static final String[] validCommands = {
			"go", "quit", "help"
	};

	public CommandWords(){

	}

	public void printCommands(){
		for(String command : validCommands){
			System.out.println(command + " ");
		}
		System.out.println();
	}

	public boolean isCommand(String aString){
		for(int i = 0; i < validCommands.length; i++){
			if(validCommands[i].equals(aString))
				return true;
		}
		return false;
	}
}
