package entities;

public class Retangulo {
	
	public double width, height;
	
	
	public double area() {
		return width * height;
	}
	
	public double perimetro() {
		return 2 * (width + height);
	}
	
	public double diagonal() {
		return Math.sqrt(width * width + height * height);
	}
	
	
	/*	public String toString() {
		return "Area: " +
				String.format("%.2f%", area() +
				"Perímetro: " + 
				String.format("%.2f%", perimetro() +
				"Diagonal: " + 
				String.format("%.2f%" + diagonal());
	} */
	
}
	
	

