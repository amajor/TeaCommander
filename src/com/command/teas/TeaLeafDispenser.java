package com.command.teas;

public class TeaLeafDispenser {
	String amount;
	
	public TeaLeafDispenser() {
		amount = "1 teaspoon";
	}
	
	public void setForOneCup() {
		amount = "1 teaspoon";
	}
	
	public void setForOnePot() {
		amount = "4 teaspoons";
	}
}
