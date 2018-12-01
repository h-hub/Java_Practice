package javaPractice.rxJava;

import java.io.IOException;
import java.math.BigDecimal;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class StockFetcher {

    public static StockInfo fetch(String symbol) {
	Stock stock;
	BigDecimal price = BigDecimal.ZERO;
	try {
	    stock = YahooFinance.get(symbol);
	    price = stock.getQuote(true).getPrice();

	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

	return new StockInfo(symbol, price.doubleValue());

    }
}
