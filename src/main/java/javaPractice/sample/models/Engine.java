package javaPractice.sample.models;

public class Engine {
    
    public Engine() {}
    
    public Engine(Engine engine) {}

    public String toString() {
	return getClass().getName() + " : " + hashCode();
    }
}
