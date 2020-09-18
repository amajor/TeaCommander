package com.command.teas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TeaControlTest extends TeaControl {
	TeaControl control = new TeaControl();
	
	ElectricKettle kettle = new ElectricKettle();
	ElectricKettleOnCommand kettleOnCommand = new ElectricKettleOnCommand(kettle);
	ElectricKettleOffCommand kettleOffCommand = new ElectricKettleOffCommand(kettle);
	
	TeaLeafDispenser dispenser = new TeaLeafDispenser();
	TeaLeafDispenseForOneCommand dispenseForOne = new TeaLeafDispenseForOneCommand(dispenser);
	TeaLeafDispenseForFriendsCommand dispenseForFriends = new TeaLeafDispenseForFriendsCommand(dispenser, kettle);

	@BeforeEach
	void initialize() {
		control.setCommand(0, kettleOnCommand, kettleOffCommand);
		control.setCommand(1, dispenseForOne, dispenseForFriends);
		
		System.out.println(control);
	}
	
	@Test
	void testTeaControlForOne() {
		System.out.println("=== Making Black Tea for One! ===");

		// Make tea for me!
		control.onButtonWasPushed(0);
		assertEquals(kettle.on, true);
		assertEquals(kettle.temperature, 212);
		
		control.onButtonWasPushed(1);
		assertEquals(dispenser.type, "English Breakfast");
		assertEquals(dispenser.amount, "1 teaspoon");
		
		control.offButtonWasPushed(0);
		assertEquals(kettle.on, false);
	}
	
	@Test
	void testTeaControlForFriends() {
		System.out.println("=== Making Green Tea for Friends! ===");

		// Make tea for friends!
		control.onButtonWasPushed(0);
		assertEquals(kettle.on, true);
		
		control.offButtonWasPushed(1);
		assertEquals(kettle.temperature, 165);
		assertEquals(dispenser.type, "Green Tea");
		assertEquals(dispenser.amount, "4 teaspoons");
		
		control.offButtonWasPushed(0);
		assertEquals(kettle.on, false);
	}

}
