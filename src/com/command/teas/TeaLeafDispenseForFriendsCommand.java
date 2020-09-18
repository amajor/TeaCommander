package com.command.teas;

public class TeaLeafDispenseForFriendsCommand implements Command {
	TeaLeafDispenser dispenser;
	
	public TeaLeafDispenseForFriendsCommand(TeaLeafDispenser dispenser) {
		this.dispenser = dispenser;
	}
	
	public void execute() {
		System.out.println("Dispensing tea for 1 pot.");
		dispenser.dispenseForOnePot();
	}
}
