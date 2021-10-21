package com.codingdojo.MainApp;
import com.codingdojo.classes.*;




public class HumanTest {
	
	public static void main (String args[]) {
		
	
	
	
	Human person1 = new Human();
    Human person2 = new Human();
    Wizard wizard1= new Wizard();
    Ninja ninja1= new Ninja();
    Samurai samurai1= new Samurai();
    Samurai samurai2= new Samurai();
    
    
    person1.attackHuman(person2);
    wizard1.attackHuman(person1);
    wizard1.heal(person2);
    ninja1.steal(wizard1);
    samurai1.deathBlow(person1);
    ninja1.runAway();
    samurai1.meditate();
    int howmany=Samurai.howMany();
    
    System.out.println(howmany);
    
    
    
    
    
    
    
    

	}

}
