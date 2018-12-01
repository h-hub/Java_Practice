package javaPractice.rxJava;

public class StockInfo {
    public final String ticker;
    public final double eprice;
    
    public StockInfo(String ticker, double eprice) {
	super();
	this.ticker = ticker;
	this.eprice = eprice;
    }

    @Override
    public String toString() {
	return "StockInfo [ticker=" + ticker + ", eprice=" + eprice + "]";
    }

}
