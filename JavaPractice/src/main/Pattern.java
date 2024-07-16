package main;

public class Pattern {
	
	public static void solution() {
		int start=0;
		for(int i=0;i<5;i++) {
			
			if(i%2==0) {
				start=0;
			} else {
				start =1;
			}
			for(int j=0;j<=i;j++) {
				
				System.out.print(start+" ");
				start=1-start;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		solution();
		for (int i = 1; i <= 10; i++) {
			boolean isOdd=false;
			if (i % 2 == 0) {
				System.out.print(0 + " ");
			} else {
				isOdd = true;
				System.out.print(1 + " ");
			}
			for (int j = 1; j < i; j++) {
				
				if(isOdd) {
					if (j % 2 == 0) {
						System.out.print(1 + " ");
					} else {
						System.out.print(0 + " ");
					}
				}else {
					if (j % 2 == 0) {
						System.out.print(0 + " ");
					} else {
						System.out.print(1 + " ");
					}
				}
				
				
			}
			System.out.println();
		}
	}

}
