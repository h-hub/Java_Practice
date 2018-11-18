package javaPractice.sample.models.betterWay;

public class TurboEngine extends Engine{

    public TurboEngine() {
	super();
    }

    public TurboEngine(Engine engine) {
	super(engine);
    }

    @Override
    public Engine copy() {
	return new TurboEngine();
    }
    
    
}
