package com.codingdojo.classes;

public class Samurai extends Human {
	
	public static int count=0;
	
	public Samurai(){
		count++;
	}
	
	
	public void setHealth() {
		super.setHealth(200);
	}
	
	public void  deathBlow(Human target) {
		
		target.setHealth(0);
		this.health=(this.health/2);
		
			
		
	}
	
	public void meditate() {
		this.setHealth();
		
	}
	
	public static int howMany() {
	
		
		
		return count;
		
		
		
	}
	

}
