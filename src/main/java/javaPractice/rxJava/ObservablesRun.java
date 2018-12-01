package javaPractice.rxJava;

import java.util.Arrays;
import java.util.List;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.observers.SubscriberCompletableObserver;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.subscribers.DefaultSubscriber;

public class ObservablesRun {

    public static void main(String[] args) {

	List<String> symbols = Arrays.asList("GOOG", "AAPL", "MSFT", "INTC");

	Observable<StockInfo> feed = StockServer.getFeeed(symbols);

//	feed.subscribe(System.out::println);

//	feed.subscribe(new Consumer<StockInfo>() {
//
//	    @Override
//	    public void accept(StockInfo t) throws Exception {
//		System.out.println(t);
//	    }
//
//	});

	Disposable subscribe = feed.subscribeWith(new DisposableObserver<StockInfo>() {

	    int count = 0;

	    @Override
	    public void onNext(StockInfo t) {
		System.out.println(t);

		count++;
		if (count == 10) {
		    dispose();
		}
	    }

	    @Override
	    public void onError(Throwable e) {
		System.out.println("ERROR");

	    }

	    @Override
	    public void onComplete() {
		System.out.println("DONE");

	    }

	});

	System.out.println("Got observable");
    }

}
