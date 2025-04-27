package interview25march;

import java.util.concurrent.Callable;

public class Task implements Callable<String> {
	
	String taskName;
	
	public Task(String task){
		this.taskName = task;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		System.out.println("Submitted : " + taskName);
		return this.taskName;
	}

}
