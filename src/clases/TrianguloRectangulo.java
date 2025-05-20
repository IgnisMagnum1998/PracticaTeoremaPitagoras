package clases;

public class TrianguloRectangulo {
	double a;
	double b;
	double c;
	public TrianguloRectangulo() {
		this.a = 1;
		this.b = 1;
		this.c= (a+b)*Math.sqrt(2);
	}
	public TrianguloRectangulo(double a, double b) {

		try {
			this.a = a;
			this.b = b;
			this.c= (this.a+this.b)*Math.sqrt(2);
			
			if(this.a<=0||this.b<=0)
				throw new IllegalArgumentException("Los catetos no pueden ser menor o iguales a 0");
			
		}catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
	}
	public double area() {
		double area;
		area=(this.a*this.b)/2;
		return area;
	}
	public double hipotenusa() {
		double hipotenusa;
		hipotenusa= (this.a+this.b)*Math.sqrt(2);
		return hipotenusa;
	}
	public double perimetro() {
		double hip=hipotenusa();
		double perimetro;
		perimetro=this.a+this.b+hip;
		return perimetro;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	
	@Override
	public String toString () {
		String mensaje="";
		mensaje+="Cateto 1: "+this.a+" Cateto 2: "+this.b+" Hipotenusa: "+this.c;
		return mensaje;
	}
}
