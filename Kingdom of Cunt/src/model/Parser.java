/**
 * 
 */
package model;

import java.util.Scanner;

/**
 * @author JACWALKE
 *
 */
public class Parser {
	private CommandWords commands;
	private Scanner reader;

	public Parser(){
		commands = new CommandWords();
		reader = new Scanner(System.in);
	}

	public Command getCommand(){
		String inputLine;
		String word1 = null;
		String word2 = null;

		System.out.println("> ");

		inputLine = reader.nextLine();

		Scanner tokenizer = new Scanner(inputLine);
		if(tokenizer.hasNext()){
			word1 = tokenizer.next();
			if(tokenizer.hasNext()){
				word2 = tokenizer.next();
			}
		}

		if(commands.isCommand(word1)){
			return new Command(word1, word2);
		}
		else{
			return new Command(word1, word2);
		}
	}

	public void showAllCommands(){
		commands.printCommands();
	}
}
