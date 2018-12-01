package javaPractice.thread.future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FactorialTask implements Callable<Integer> {
    int number;

    public FactorialTask(int i) {
	number = i;
    }

    public Integer call() {
	int fact = 1;

	for (int count = number; count > 1; count--) {
	    fact = fact * count;
	}

	return fact;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {

	ExecutorService executorService = Executors.newFixedThreadPool(10);

	FactorialTask task = new FactorialTask(5);
	Future<Integer> future = executorService.submit(task);
	System.out.println(future.get());

    }
}
