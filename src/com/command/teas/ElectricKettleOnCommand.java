package com.command.teas;

public class ElectricKettleOnCommand implements Command {
	ElectricKettle kettle;
	
	public ElectricKettleOnCommand(ElectricKettle kettle) {
		this.kettle = kettle;
	}
	
	public void execute() {
		kettle.turnOn();
		kettle.setBlackTeaTemp();
	}
}
