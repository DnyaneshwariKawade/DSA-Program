package test.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintJob[] jobs= {
				new PrintJob("Kiran"),
				new PrintJob("Raghav"),
				new PrintJob("Radhika"),
				new PrintJob("Dnyanu"),
				new PrintJob("Santosh"),
				new PrintJob("Swaraj"),
		};
		
		ExecutorService service=Executors.newFixedThreadPool(4); 
		
		for(PrintJob job:jobs) {
			service.submit(job);
		}
		service.shutdown();
	}

}

class PrintJob implements Runnable {

	String name;
	PrintJob(String name) {
		this.name=name;
	}
	
	@Override
	public void run() {
		
		System.out.println(this.name+" Job started by "+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.name+" Job Completed by "+Thread.currentThread().getName());
	}
	
}
