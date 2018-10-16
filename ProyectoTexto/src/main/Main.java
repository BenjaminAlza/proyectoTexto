package main;

import process.UserInteraction;
import io.InputOutputImplement;

public class Main {

	public static void main(String[] args) {
		
		    InputOutputImplement io = new InputOutputImplement();
	        UserInteraction userInteractive = new UserInteraction(io);
	        userInteractive.runUserInteraction();
	}
			
}
