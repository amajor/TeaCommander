package com.command.teas;

public class ElectricKettle {
	boolean on;
	int temperature;
	
	public ElectricKettle() { }
	
	public void turnOn() {
		on = true;
	}
	
	public void turnOff() {
		on = false;
	}
	
	public void setTemperature(int temperature) {
		if (on) {
			System.out.println("Heating electric kettle to " + temperature + "F");
			this.temperature = temperature;
		}
	}
	
	public void setBlackTeaTemp() {
		setTemperature(212);
	}
	
	public void setGreenTeaTemp() {
		setTemperature(165);
	}
}
