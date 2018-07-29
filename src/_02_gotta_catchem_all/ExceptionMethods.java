package _02_gotta_catchem_all;

import java.util.Stack;

public class ExceptionMethods {
	
	
	public double divide(double a, double b) throws IllegalArgumentException{
	double banana = a/b;
	if (b == 0.0) {
		throw new IllegalArgumentException();
	}
	return banana;
	}
	
	public String reverseString(String a) {
		Stack<Character> reversed = new Stack<Character>();
		String end = "";
		for (int i = 0; i < a.length(); i++) {
		reversed.add(a.charAt(i));
		}
		for (int i = 0; i < a.length(); i++) {
		end += reversed.pop();
		}
		System.out.println(end);
		if(a == "") {
		throw new IllegalStateException();
		}
		
		return end;
		
		
	}
}
