package com.command.teas;

public class TeaLeafDispenser {
	String amount;
	
	public TeaLeafDispenser() {
		amount = "1 teaspoon";
	}
	
	public void dispenseForOneCup() {
		amount = "1 teaspoon";
	}
	
	public void dispenseForOnePot() {
		amount = "4 teaspoons";
	}
}
