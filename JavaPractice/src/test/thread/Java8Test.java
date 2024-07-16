package test.thread;

import java.util.function.Function;

public class Java8Test {

	public static void main(String[] args) {
		System.out.println("Test");
		
		Function<Integer, Integer> f=i->i*i;
		System.out.println(f.apply(10));
		
		A a=()->System.out.println("test");
		a.m1();
		
		B b=n-> n*n;
		System.out.println(b.sqr(5));



	}

}

interface A {
	public void m1();
}


interface B {
	public int sqr(int n);
}

