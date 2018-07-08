package _02_gotta_catchem_all;

public class ExceptionMethods {
	
	
	public double divide(double a, double b) throws IllegalArgumentException{
	double banana = a/b;
	if (b == 0.0) {
		throw new IllegalArgumentException();
	}
	return banana;
	}
}
