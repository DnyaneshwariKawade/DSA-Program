package test.thread;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
	
	
	public static double test(List<? extends Number> num) {
		double d = 0;
		for (Number n : num) {
			d += n.doubleValue();
		}
		return d;
	}

	public static void main(String[] args) throws InterruptedException {
		
		List<Double> list = Arrays.asList(1.2, 2.3);
		System.out.println(test(list));
		
//		PC pc = new PC();
//
//		Thread t1 = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				try {
//					pc.produce();
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//		});
//
//		Thread t2 = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				try {
//					pc.consume();
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//
//			}
//		});
//
//		t1.start();
//		t2.start();
//
//		t1.join();
//		t2.join();

	}
}

// class PC {
//	 
//    // Create a list shared by producer and consumer
//    // Size of list is 2.
//    LinkedList<Integer> list = new LinkedList<>();
//    int capacity = 2;
//
//    // Function called by producer thread
//    public void produce() throws InterruptedException
//    {
//        int value = 0;
//        while (true) {
//            synchronized (this)
//            {
//                // producer thread waits while list
//                // is full
//                while (list.size() == capacity)
//                    wait();
//
//                System.out.println("Producer produced-"
//                                   + value);
//
//                // to insert the jobs in the list
//                list.add(value++);
//
//                // notifies the consumer thread that
//                // now it can start consuming
//                notify();
//
//                // makes the working of program easier
//                // to  understand
//                Thread.sleep(1000);
//            }
//        }
//    }
//
//    // Function called by consumer thread
//    public void consume() throws InterruptedException
//    {
//        while (true) {
//            synchronized (this)
//            {
//                // consumer thread waits while list
//                // is empty
//                while (list.size() == 0)
//                    wait();
//
//                // to retrieve the first job in the list
//                int val = list.removeFirst();
//
//                System.out.println("Consumer consumed-"
//                                   + val);
//
//                // Wake up producer thread
//                notify();
//
//                // and sleep
//                Thread.sleep(1000);
//            }
//        }
//    }
//}


class PC {
	LinkedList<Integer> list = new LinkedList<>();
	int capacity = 2;
	int value = 0;

	public void produce() throws InterruptedException {
		int val = 0;
		while (true) {
			synchronized (this) {
				while (capacity == list.size()) {
					wait();
				}
				System.out.println("Producer produce " + val);
				list.add(val++);
				notify();
				Thread.sleep(1000);
			}
		}
	}

	public void consume() throws InterruptedException {
		while (true) {
			synchronized (this) {

				while (list.size() == 0) {
					wait();
				}

				int num = list.removeFirst();
				System.out.println("Consumer consumed:: " + num);
				notify();
				Thread.sleep(1000);
			}
		}
	}
}
