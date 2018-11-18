package javaPractice.design.openClosePrinciple;

import javaPractice.sample.models.Car;
import javaPractice.sample.models.Engine;
import javaPractice.sample.models.TurboEngine;

public class UglyWay {
    
    public static void main(String[] args) {
	
	Car car1 = new Car(2018, new Engine());
	System.out.println(car1);
	
	//we need a copy of car1
	Car car2 = new Car(car1);
	System.out.println(car2);
	
	//bcz of the new requirment of the project, we have to add new "TurboEngine"
	//This won't work with the existing copy contructor
	Car car3 = new Car(2018, new TurboEngine());
	System.out.println(car3);
	
	//we need a copy of car1
	Car car4 = new Car(car3);
	System.out.println(car4);
	
	
    }

}
