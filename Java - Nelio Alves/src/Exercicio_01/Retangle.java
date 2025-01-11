package Exercicio_01;

public class Retangle {

	private double Width;
	private double Height;
	
	public double Area() {
		return (Height*Width);
	}
	public double Perimeter() {
		return 2*(Height+Width);
	}
	public double Diagonal() {
		return Math.sqrt(Width*Width + Height*Height);
		
	}
	public double getWidth() {
		return Width;
	}
	public void setWidth(double width) {
		Width = width;
	}
	public double getHeight() {
		return Height;
	}
	public void setHeight(double height) {
		Height = height;
	}
	
}
