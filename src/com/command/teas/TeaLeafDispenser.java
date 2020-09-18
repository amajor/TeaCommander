package com.command.teas;

public class TeaLeafDispenser {
	String amount;
	String type;
	
	public TeaLeafDispenser() {
		amount = "1 teaspoon";
		type = "English Breakfast";
	}
	
	public void dispenseForOneCup() {
		amount = "1 teaspoon";
	}
	
	public void dispenseForOnePot() {
		amount = "4 teaspoons";
	}
	
	public void chooseBlackTea() {
		type = "English Breakfast";
	}
	
	public void chooseGreenTea() {
		type = "Green Tea";
	}
}
