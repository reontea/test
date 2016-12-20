package study;

import java.util.ArrayList;

public class test3 {
	
	public test3() {
		ArrayList<AAA> c = null;
		
		System.out.println(c == null);
//		System.out.println(c.size() == 0);
//		System.out.println(c.isEmpty());
		
		c = new ArrayList<AAA>();
		System.out.println(c.size() == 0);
		System.out.println(c.isEmpty());		
	}
	
	public static void main(String[] args) {
		test3 a = new test3();
	}
}

class AAA {
	
}