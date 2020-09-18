package com.command.teas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestElectricKettle {
	ElectricKettle kettle = new ElectricKettle();

	@Test
	void testInitialize() {
		// Test setting temperature by input
		System.out.println("\n--- Test initial settings");
		assertEquals(0, kettle.temperature);
		assertEquals(false, kettle.on);
	}
	
	@Test
	void testTempWhenOff() {
		// Test setting temperature when kettle is off
		System.out.println("\n--- Test setting temp when kettle is off");
		assertEquals(false, kettle.on);
		kettle.setTemperature(100);
		assertEquals(0, kettle.temperature);
	}
	
	@Test
	void testSetTemps() {
		// Test turning on
		System.out.println("\n--- Test turnOn()");
		kettle.turnOn();
		assertEquals(true, kettle.on);
		
		// Test setting temperature by input
		System.out.println("\n--- Test setting temp by input (100)");
		kettle.setTemperature(100);
		assertEquals(100, kettle.temperature);

		// Test setting temperature for black tea
		System.out.println("\n--- Test setting temp for Black Tea (212)");
		kettle.setBlackTeaTemp();
		assertEquals(212, kettle.temperature);
		
		// Test setting temperature for green tea
		System.out.println("\n--- Test setting temp for Green Tea (165)");
		kettle.setGreenTeaTemp();
		assertEquals(165, kettle.temperature);
		
		// Test turning of
		System.out.println("\n--- Test turnOn()");
		kettle.turnOff();
		assertEquals(false, kettle.on);
	}
}
