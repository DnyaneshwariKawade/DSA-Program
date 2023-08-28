package test.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTest {

	public static void main(String[] args) {

		ExecutorService service = Executors.newSingleThreadExecutor();
		service.execute(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("new created thread ::"+i);
				}
			}
		});
		
	}

}
