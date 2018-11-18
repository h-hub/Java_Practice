package javaPractice.sample.models.betterWay;

public class Engine {
    
    public Engine() {}
    
    //make this protective
    protected Engine(Engine engine) {}
    
    //this methods violate dry principal since every engine has to have this
    //solution : reflection
    public Engine copy() {
	
	//solution is to use reflection here to make a copy
	//get the contructor on runtime and create the object
	
	return new Engine();
    }

    public String toString() {
	return getClass().getName() + " : " + hashCode();
    }
}
