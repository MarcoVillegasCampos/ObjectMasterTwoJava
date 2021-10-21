package com.codingdojo.classes;

public class Wizard extends Human {
	
	public void setHealth() {
		super.setHealth(300);
		
		
	}
	
	public void setIntelligence() {
		super.setIntelligence(8);
	}
	
	public void heal(Human toBeHealed) {
		
		toBeHealed.health+=this.intelligence;
		
		
		
	}
	
	public void fireball(Human target) {
		target.health-=(this.intelligence*3);
		
		
		
	}
	

}
