package javaPractice.design.openClosePrinciple;

import javaPractice.sample.models.betterWay.Car;
import javaPractice.sample.models.betterWay.TurboEngine;

public class BetterWay {
    
public static void main(String[] args) {
	
	//solution
    	//we can add more and more engines which extends engine class
	Car car3 = new Car(2018, new TurboEngine());
	System.out.println(car3);
	
	//we need a copy of car3
	Car car4 = new Car(car3);
	System.out.println(car4);
	
	//This code is extensible for adding new engines, but not for adding two engines.
	
	
    }

}
