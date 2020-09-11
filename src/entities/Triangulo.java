package entities;

public class Triangulo {
	
	public double a;
	public double b;
	public double c;
	
	public double area() {	// FUN��O
		double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

}
