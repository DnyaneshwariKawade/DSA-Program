package java8;

public class SingletonTest {
	
	public static SingletonTest obj= null;
	
	private SingletonTest() {
		
	}
	
	public static SingletonTest getSingleObject() {
		synchronized (obj) {
			if(obj == null) {
				obj =new SingletonTest();
			}
		}
		return obj;
	}

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		a=a+b; //30
		b=a-b; //
		a=a-b;
	}
}
