package com.command.teas;

public class TeaLeafDispenseForFriendsCommand implements Command {
	TeaLeafDispenser dispenser;
	ElectricKettle kettle;
	
	public TeaLeafDispenseForFriendsCommand(TeaLeafDispenser dispenser, ElectricKettle kettle) {
		this.dispenser = dispenser;
		this.kettle = kettle;
	}
	
	public void execute() {
		System.out.println("Choosing green tea.");
		dispenser.chooseGreenTea();

		// Set temperature for green tea
		kettle.setGreenTeaTemp();

		System.out.println("Dispensing tea for 1 pot.");
		dispenser.dispenseForOnePot();
	}
}
