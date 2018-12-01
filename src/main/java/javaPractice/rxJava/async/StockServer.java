package javaPractice.rxJava.async;

import java.io.IOException;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import javaPractice.rxJava.StockFetcher;
import javaPractice.rxJava.StockInfo;

public class StockServer {
    
    public static Observable<StockInfo> getFeeed(List<String> symbols){
	
	return Observable.create(event -> processRequest(event, symbols));
	
    }

    private static void processRequest(ObservableEmitter<StockInfo> event, List<String> symbols) throws IOException {

	System.out.println("Processing ... ");
	
	while(true) {	    
	    symbols.stream()
        	    .map(StockFetcher::fetch)
        	    .forEach(event::onNext);
	}
	
//	int count = 0;
//	while(count++ < 3) {	    
//	    symbols.stream()
//        	    .map(StockFetcher::fetch)
//        	    .forEach(event::onNext);
//	}
//	
//	event.onComplete();
//	event.onNext(new StockInfo("EMPTY STOCK",0.0));

    }

}