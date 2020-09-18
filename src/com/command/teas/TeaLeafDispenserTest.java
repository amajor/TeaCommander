package com.command.teas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TeaLeafDispenserTest extends TeaLeafDispenser {
	TeaLeafDispenser dispenser = new TeaLeafDispenser();

	@Test
	void testInitialize() {
		// Test initial measured amount
		System.out.println("\n--- Test initial settings");
		assertEquals("1 teaspoon", dispenser.amount);
	}

	@Test
	void testSetAmounts() {
		// Test dispensing for a tea pot
		System.out.println("\n--- Test dispensing for a tea pot");
		dispenser.dispenseForOnePot();
		assertEquals("4 teaspoons", dispenser.amount);
		
		// Test dispensing for a tea pot
		System.out.println("\n--- Test dispensing for one cup");
		dispenser.dispenseForOneCup();
		assertEquals("1 teaspoon", dispenser.amount);

	}
}
