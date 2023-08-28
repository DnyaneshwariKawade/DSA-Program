package test.thread;

public class FactorialTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int result=1;
//		for(int i=1;i<=5;i++) {
//			result=result*i;
//		}
//		System.out.println(result);
		
		System.out.println(fact(5));
	}
	
	public static int fact(int n) {
		if(n==1) {
			return n;
		}
		return n*fact(n-1);
	}

}
