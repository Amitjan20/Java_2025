package interview25march;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecDemo {

	public static void main(String[] args) throws InterruptedException {
		
		
		ExecutorService service = Executors.newFixedThreadPool(10);
		List<Future<String>> futures = new ArrayList<Future<String>>(); 
		for(int i=0;i<100;i++){
			 Future<String> future = service.submit(new Task(i+""));
			futures.add(future);
		}
		
		System.out.println(futures.size());
		futures.forEach(future -> {
			try {
				System.out.println("Got task :" +future.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		service.awaitTermination(6000, TimeUnit.MILLISECONDS);
		service.shutdown();
	}

}
