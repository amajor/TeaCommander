package com.command.teas;

public class ElectricKettleOffCommand implements Command {
	ElectricKettle kettle;
	
	public ElectricKettleOffCommand(ElectricKettle kettle) {
		this.kettle = kettle;
	}
	
	public void execute() {
		kettle.turnOff();
	}
}
