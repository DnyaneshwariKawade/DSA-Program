package main;

public class PalidromString {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="MOM";
		StringBuilder sb=new StringBuilder(str);
		System.out.println(str.equals(sb.reverse().toString()));
	}

}
