package com.command.teas;

public class TeaLeafDispenseForOneCommand implements Command {
	TeaLeafDispenser dispenser;
	
	public TeaLeafDispenseForOneCommand(TeaLeafDispenser dispenser) {
		this.dispenser = dispenser;
	}
	
	public void execute() {
		System.out.println("Dispensing tea for 1 cup.");
		dispenser.dispenseForOneCup();
	}
}
