package javaPractice.rxJava.async;

import java.util.Arrays;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;
import javaPractice.rxJava.StockInfo;

public class ObservablesRun {

    public static void main(String[] args) throws InterruptedException {

	List<String> symbols = Arrays.asList("GOOG", "AAPL", "MSFT", "INTC");

	Observable<StockInfo> feed = StockServer.getFeeed(symbols);
	
	feed.subscribeOn(Schedulers.io()).subscribe(System.out::println);
	
	Thread.sleep(10000);

	System.out.println("Got observable");
    }

}
