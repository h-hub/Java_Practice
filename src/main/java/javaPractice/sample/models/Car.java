package javaPractice.sample.models;

public class Car {
    
    private int year;
    private Engine engine;
    
    public Car(int year, Engine engine) {
	this.year = year;
	this.engine = engine;
    }
    
    //created a copy constructor
    //to match the new requirments, we can modify the constructor like this
    public Car(Car other) {
	year = other.year;

	//to match the new requirments, we can modify the constructor like this
	//for each new engine we have to change this code
	//this is not closed for midification
	//car is depending on engine and turbo engine (Tight coupling)
	//low cohesion : it is making other objects as well
	if( other.engine instanceof TurboEngine) {
	    engine = new TurboEngine((TurboEngine) (other.engine));
	} else {
	    engine = new Engine(other.engine);
	}
	
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    
    public String toString() {
	return year + " " + engine;
    }

}
